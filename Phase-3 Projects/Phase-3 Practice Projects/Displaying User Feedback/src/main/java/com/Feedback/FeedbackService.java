package com.Feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService 
{

	@Autowired
	FeedbackRepository feedbackRepo;
	
	public Iterable<Feedback> GetAllFeedback() 
	{
		return feedbackRepo.findAll();
	}
	
	public Feedback addNewFeedback(Feedback fb) 
	{
		return feedbackRepo.save(fb);
	}
}
