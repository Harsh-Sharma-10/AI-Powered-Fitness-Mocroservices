package aiservices.example.AiService.DTO;

import java.util.List;

public class RecommendationResponseDTO {
    private String id;
    private String activityId;
    private String userId;
    private String activityType;

    /// All the Recommendations should appeares in the form of Recommendations response
    private String recommendations;
    private List<String> improvements;
    private List<String> suggestions;
    private List<String> safety;
}
