package com.rating.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name = "rating")
public class RatingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userId;

    private int score;

    private String comment;

    private LocalDateTime createdAt = LocalDateTime.now();

    
    
    
	public RatingModel(int id, String userId, int score, String comment, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.score = score;
		this.comment = comment;
		this.createdAt = createdAt;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}




	public int getScore() {
		return score;
	}




	public void setScore(int score) {
		this.score = score;
	}




	public String getComment() {
		return comment;
	}




	public void setComment(String comment) {
		this.comment = comment;
	}




	public LocalDateTime getCreatedAt() {
		return createdAt;
	}




	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}




	@Override
	public String toString() {
		return "RatingModel [id=" + id + ", userId=" + userId + ", score=" + score + ", comment=" + comment
				+ ", createdAt=" + createdAt + "]";
	}
    
    
}