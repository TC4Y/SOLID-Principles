package com.solid.lsp.entity;

public class Feedback {

    private String feedbackId;

    public Feedback(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Feedback(){}

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

}
