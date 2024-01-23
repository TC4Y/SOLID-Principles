package com.solid.feedback.service;

import com.solid.feedback.repository.FeedbackStorable;
import com.solid.feedback.repository.FeedbackUploadable;

public class FeedbackImageService implements FeedbackMultimediaCreatable {

    FeedbackUploadable feedbackUploadable;

    public FeedbackImageService(FeedbackUploadable feedbackUploadable){
        this.feedbackUploadable = feedbackUploadable;
    }

    @Override
    public String createMultimediaFeedback(String multimedia) {
        String imageUrl = this.feedbackUploadable.upload(multimedia);
        System.out.println("Stored the Image: " + multimedia);
        return imageUrl;
    }
}
