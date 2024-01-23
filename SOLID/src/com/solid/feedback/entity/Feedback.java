package com.solid.feedback.entity;

public abstract class Feedback {
    public String feedbackId;

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }
}
