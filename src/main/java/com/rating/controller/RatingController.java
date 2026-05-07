package com.rating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.entity.RatingModel;
import com.rating.service.RatingService;

@RestController
@RequestMapping("/api/rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	  @PostMapping("/save")
	    public RatingModel saveRating(@RequestBody RatingModel ratingModel) {
		  System.out.println("REQUEST: " + ratingModel);
	        return ratingService.save(ratingModel);
	    }
	
}
