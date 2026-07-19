package aiservices.example.AiService.Services;


import aiservices.example.AiService.DTO.MapperClass;
import aiservices.example.AiService.DTO.RecommendationResponseDTO;
import aiservices.example.AiService.Model.Recommendation;
import aiservices.example.AiService.RecommandRepo.recommRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class recommServices {
        private final recommRepository recommendationRepository;

        public recommServices(recommRepository recommendationRepository) {
            this.recommendationRepository = recommendationRepository;
        }


    public List<RecommendationResponseDTO> findbyuserid(String userid) {
           List<Recommendation> recommendations =  recommendationRepository.findByUserId(userid);
           return recommendations
                   .stream()
                   .map(MapperClass :: toRecommendationResponseDTO)
                   .collect(Collectors.toList());
    }

    public RecommendationResponseDTO findByActivityId(String acticityid) {
        Recommendation recommendations =  recommendationRepository.findByActivityId(acticityid)
                .orElseThrow(() -> new RuntimeException("No Recommendation found for this ActivityId : " + acticityid));
          return MapperClass.toRecommendationResponseDTO(recommendations);

    }
}
