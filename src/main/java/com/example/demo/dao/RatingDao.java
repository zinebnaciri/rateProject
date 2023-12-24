package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Rating;


@Repository
public interface RatingDao extends JpaRepository<Rating,Long> {
	@Query(value = "SELECT AVG(r.rate) FROM rating r WHERE r.appareil_id = ?1",nativeQuery = true)
    double getAverageRatingByAppareil(Long id);
}
