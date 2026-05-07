package com.rating.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rating.entity.RatingModel;

@Repository
public interface RatingRepository extends JpaRepository<RatingModel, Integer>{

	
}
