package com.solid.lsp.entity;

public class RatingFeedback extends Feedback {

    private int rating;

    public RatingFeedback(String feedbackId, int rating){
        super(feedbackId);
        this.rating = rating;
    }

    public RatingFeedback(int rating) {
        super();
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
