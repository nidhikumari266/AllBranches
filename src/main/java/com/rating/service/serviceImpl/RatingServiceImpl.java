package com.rating.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.entity.RatingModel;
import com.rating.repository.RatingRepository;
import com.rating.service.RatingService;




@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	
	@Override
	public RatingModel save(RatingModel ratingModel) {
	   return	ratingRepository.save(ratingModel);
	}


}
