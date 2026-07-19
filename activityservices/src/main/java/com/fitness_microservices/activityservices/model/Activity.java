package com.fitness_microservices.activityservices.model;


import com.fitness_microservices.activityservices.Enums.ActivityType;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;



@Document(collection = "activitiy")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Activity {

     @Id
     private String activityId;
     private String userId;

     private ActivityType type;

     private Integer duration;
     private Integer calories;
     private LocalDateTime startTime;

     @Field("metrics")
     private Map<String,Object> additionalMatrics;

    @CreatedDate
    private Instant creationTime;

    @LastModifiedDate
    private Instant updateTime;
}
