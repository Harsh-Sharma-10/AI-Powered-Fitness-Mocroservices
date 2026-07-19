package aiservices.example.AiService.DTO;


import com.mongodb.lang.NonNull;


public class RecommendationRequestDTO {

      @NonNull
      private String ActivityId;
      @NonNull
      private String UserId;
      @NonNull
      private String activityType;

}
