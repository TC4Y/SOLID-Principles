package com.solid.feedback.service;

import com.solid.feedback.entity.Feedback;
import com.solid.feedback.entity.NormalFeedback;
import com.solid.feedback.repository.FeedbackStorable;

public class FeedbackService implements FeedbackCreatable {

    FeedbackStorable feedbackStorable;

    public FeedbackService(FeedbackStorable feedbackStorable){
        this.feedbackStorable = feedbackStorable;
    }

    @Override
    public String create(Feedback feedback) {
        NormalFeedback normalFeedback = (NormalFeedback) feedback;
        System.out.println("Created New Feedback");
        return this.feedbackStorable.store(normalFeedback);
    }
}
