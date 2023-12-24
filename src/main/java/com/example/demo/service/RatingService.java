package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.RatingDao;
import com.example.demo.entity.Appareil;
import com.example.demo.entity.Rating;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class RatingService {
    @Autowired
    RatingDao ratingDao;
    private final String baseUrl = "http://localhost:8080/";


   public Rating save(Rating rating) {
        Long appId = rating.getAppareil_id();
        this.ratingDao.save(rating);
       
        if (ratingDao.getAverageRatingByAppareil(appId) <= 2) {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.postForEntity(baseUrl + "appareil/switch?id=" + appId, null, Appareil.class);
        }else {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.postForEntity(baseUrl + "appareil/switch?id=" + appId, null, Appareil.class);
        }

        return rating;
    }

    public RatingDao getRatingDao() {
        return ratingDao;
    }

    public void setRatingDao(RatingDao ratingDao) {
        this.ratingDao = ratingDao;
    }

    public List<Rating> findAll() {
        return ratingDao.findAll();
    }

   

    public Optional<Rating> findById(Long aLong) {
        return ratingDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        ratingDao.deleteById(aLong);
    }
}
