package aiservices.example.AiService.DTO;


import com.mongodb.lang.NonNull;
import lombok.Data;


@Data
public class RecommendationRequestDTO {

      @NonNull
      private String ActivityId;
      @NonNull
      private String UserId;
      @NonNull
      private String activityType;

}
