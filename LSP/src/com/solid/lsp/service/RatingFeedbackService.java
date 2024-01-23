package com.solid.lsp.service;

import com.solid.lsp.entity.Feedback;
import com.solid.lsp.entity.RatingFeedback;

public class RatingFeedbackService extends FeedbackService {
    @Override
    public void createFeedback(Feedback feedback) {
        RatingFeedback ratingFeedback = (RatingFeedback) feedback;
        System.out.println("Created the rating: " + ratingFeedback.getRating());
    }
}
