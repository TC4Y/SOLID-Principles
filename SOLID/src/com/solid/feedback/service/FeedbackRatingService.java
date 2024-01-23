package com.solid.feedback.service;

import com.solid.feedback.entity.Feedback;
import com.solid.feedback.entity.RatingFeedback;
import com.solid.feedback.repository.FeedbackStorable;

public class FeedbackRatingService implements FeedbackCreatable{

    FeedbackStorable feedbackStorable;

    public FeedbackRatingService(FeedbackStorable feedbackStorable){
        this.feedbackStorable = feedbackStorable;
    }

    @Override
    public String create(Feedback feedback) {
        RatingFeedback ratingFeedback = (RatingFeedback) feedback;
        System.out.println("Created New Rating Feedback");
        return this.feedbackStorable.store(ratingFeedback);
    }
}
