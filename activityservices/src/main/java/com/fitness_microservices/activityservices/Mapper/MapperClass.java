package com.fitness_microservices.activityservices.Mapper;


import com.fitness_microservices.activityservices.ActivityDTO.ActivityRequest;
import com.fitness_microservices.activityservices.ActivityDTO.ActivityResponse;
import com.fitness_microservices.activityservices.Enums.ActivityType;
import com.fitness_microservices.activityservices.model.Activity;
import org.springframework.web.bind.annotation.Mapping;

import java.time.LocalDateTime;


public class MapperClass {
     public static ActivityResponse activityresponse(Activity  activity){

           ActivityResponse activityResponse = new ActivityResponse();
           activityResponse.setActivityId(activity.getActivityId());
           activityResponse.setUserId(activity.getUserId());
           activityResponse.setType(activity.getType());
           activityResponse.setStartTime(activity.getStartTime());
           activityResponse.setCalories(activity.getCalories());
           activityResponse.setDuration(activity.getDuration());
           activityResponse.setAdditionalMatrics(activity.getAdditionalMatrics());

           return activityResponse;

     }
     public static Activity  activityrequest(ActivityRequest  activityrequest){


        return Activity.builder()
                .userId(activityrequest.getUserId())
                .type(activityrequest.getActivityType())
                .duration(activityrequest.getDuration())
                .calories (activityrequest.getCalories())
                .startTime(LocalDateTime.now())
                .additionalMatrics(activityrequest.getAdditionalProperties())
                .build();
     }
}
