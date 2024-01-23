package com.solid.feedback.service;

import com.solid.feedback.repository.FeedbackUploadable;

public class FeedbackVideoService implements FeedbackMultimediaCreatable {

    FeedbackUploadable feedbackUploadable;

    public FeedbackVideoService(FeedbackUploadable feedbackUploadable){
        this.feedbackUploadable = feedbackUploadable;
    }

    @Override
    public String createMultimediaFeedback(String multimedia) {
        String videoUrl = this.feedbackUploadable.upload(multimedia);
        System.out.println("Stored the Video: " + multimedia);
        return videoUrl;
    }
}
