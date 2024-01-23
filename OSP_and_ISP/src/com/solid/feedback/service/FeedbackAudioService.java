package com.solid.feedback.service;

import com.solid.feedback.repository.FeedbackUploadable;

public class FeedbackAudioService implements FeedbackMultimediaCreatable {

    FeedbackUploadable feedbackUploadable;

    public FeedbackAudioService(FeedbackUploadable feedbackUploadable){
        this.feedbackUploadable = feedbackUploadable;
    }

    @Override
    public String createMultimediaFeedback(String multimedia) {
        String audioUrl = this.feedbackUploadable.upload(multimedia);
        System.out.println("Stored the Audio: " + multimedia);
        return audioUrl;
    }
}
