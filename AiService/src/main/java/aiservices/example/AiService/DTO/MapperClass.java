package aiservices.example.AiService.DTO;

import aiservices.example.AiService.Model.Recommendation;

public class MapperClass {

    public static RecommendationResponseDTO toRecommendationResponseDTO(Recommendation recommendation) {
        RecommendationResponseDTO recommendationResponseDTO = new RecommendationResponseDTO();
        recommendationResponseDTO.setId(recommendation.getId());
        recommendationResponseDTO.setUserId(recommendation.getUserId());
        recommendationResponseDTO.setActivityId(recommendation.getActivityId());
        recommendationResponseDTO.setActivityType(recommendation.getActivityType());
        recommendationResponseDTO.setRecommendations(recommendation.getRecommendations());
        recommendationResponseDTO.setSuggestions(recommendation.getSuggestions());
        recommendationResponseDTO.setImprovements(recommendation.getImprovements());
        recommendationResponseDTO.setSafety(recommendation.getSafety());
        return recommendationResponseDTO;

    }
}
