package com.solid.lsp.service;

import com.solid.lsp.entity.Feedback;
import com.solid.lsp.entity.NormalFeedback;

public class NormalFeedbackService extends FeedbackService {
    @Override
    public void createFeedback(Feedback feedback) {
        NormalFeedback normalFeedback = (NormalFeedback) feedback;
        System.out.println("Created the feedback: " + normalFeedback.getFeedbackMessage());
    }
}
