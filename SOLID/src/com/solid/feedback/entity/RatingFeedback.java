package com.solid.feedback.entity;

public class RatingFeedback extends Feedback{

    private int rating;

    public RatingFeedback(String feedbackId, int rating) {
        this.feedbackId = feedbackId;
        this.rating = rating;
    }

    public RatingFeedback(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
