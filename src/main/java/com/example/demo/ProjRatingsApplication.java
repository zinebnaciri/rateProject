package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ProjRatingsApplication {


    @Bean
   public RestTemplate getRestTemplate(){
       return new RestTemplate();
   }
  
   @Bean
   public WebClient webClient(){
       return  WebClient.builder().build();
   }
	public static void main(String[] args) {
		SpringApplication.run(ProjRatingsApplication.class, args);
	}

}
