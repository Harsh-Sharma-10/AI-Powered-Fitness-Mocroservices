package com.fitness_microservices.activityservices.Services;

import com.fitness_microservices.activityservices.ActivityDTO.ActivityRequest;
import com.fitness_microservices.activityservices.ActivityDTO.ActivityResponse;
import com.fitness_microservices.activityservices.Mapper.MapperClass;
import com.fitness_microservices.activityservices.Repository.ActivityRepo;
import com.fitness_microservices.activityservices.model.Activity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ActivityServices {
    
    private final ActivityRepo activityRepo;
    private final UserValidationService userValidationService;
    public ActivityServices( ActivityRepo  activityRepo,UserValidationService userValidationService) {  /// Replacable By
            this.activityRepo = activityRepo;                                                          /// @RequiredArgsConstructor
            this.userValidationService  =  userValidationService;
    }



    
    public ActivityResponse getActivitybyid(String activityId) {
        return activityRepo
                .findById(activityId)
                .map(MapperClass::activityresponse)
                .orElseThrow(()-> new RuntimeException("Activity with id " + activityId + " not found"));


    }

    public List<ActivityResponse> getActivities(){
           List<Activity> activityResponses = activityRepo.findAll();
           if(activityResponses.isEmpty()){
               throw new RuntimeException("No activities found");
           }

           return activityResponses
                   .stream()
                   .map(MapperClass::activityresponse)
                   .collect(Collectors.toList());
    }
    public ActivityResponse addActivity(ActivityRequest activityRequest){

        boolean isValiduser = userValidationService.validateUser(activityRequest.getUserId());
        if(!isValiduser){
            throw new RuntimeException("Invalid user : " + activityRequest.getUserId());
        }
        Activity activity = MapperClass.activityrequest(activityRequest);
        activityRepo.save(activity);
        return MapperClass.activityresponse(activity);

    }

    public List<ActivityResponse> getActivitiesByUserid(String userid){
         List<Activity> activities = activityRepo.findByUserId(userid);
         if(activities.isEmpty()) {
             throw new RuntimeException("No activities found for user with id : " + userid);
         }
          return  activities
                 .stream()
                 .map(MapperClass::activityresponse)
                 .collect(Collectors.toList());
    }


}
