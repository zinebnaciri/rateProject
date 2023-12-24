package com.example.demo.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.entity.Appareil;
import com.example.demo.entity.Category;
import com.example.demo.entity.Rating;
import com.example.demo.service.RatingService;

import java.util.List;

@RestController
@RequestMapping("api/rating")
public class RatingController {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	RatingService ratingService;
	@Autowired
	WebClient webClient;
	String urlMSA1 = "http://localhost:5555/api/";
	
	@PostMapping("/rate")
    public ResponseEntity<Rating> rateApp(@RequestBody Rating rating) {
        Rating savedRating=this.ratingService.save(rating);
        return new ResponseEntity<>(savedRating, HttpStatus.CREATED);
    }

}
