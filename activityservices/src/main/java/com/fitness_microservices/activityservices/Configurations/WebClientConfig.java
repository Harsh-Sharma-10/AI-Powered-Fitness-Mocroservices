package com.fitness_microservices.activityservices.Configurations;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    @LoadBalanced
    public WebClient.Builder webClientBuilder(){
        return WebClient.builder();
    }

    @Bean     /// Communicate with the User-Service
    public WebClient userserviceWebClient(WebClient.Builder webClientBuilder){
        return webClientBuilder
                .baseUrl("http://User-Services")
                .build();
    }
}
