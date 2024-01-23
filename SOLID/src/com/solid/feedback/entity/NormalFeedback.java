package com.solid.feedback.entity;

public class NormalFeedback extends Feedback{

    public String feedbackMessage;
    public String imageUrl;
    public String audioUrl;
    public String videoUrl;

    public NormalFeedback(String feedbackId, String feedbackMessage, String imageUrl, String audioUrl, String videoUrl) {
        this.feedbackId = feedbackId;
        this.feedbackMessage = feedbackMessage;
        this.imageUrl = imageUrl;
        this.audioUrl = audioUrl;
        this.videoUrl = videoUrl;
    }

    public NormalFeedback(String feedbackMessage, String imageUrl, String audioUrl, String videoUrl) {
        this.feedbackMessage = feedbackMessage;
        this.imageUrl = imageUrl;
        this.audioUrl = audioUrl;
        this.videoUrl = videoUrl;
    }

    public String getFeedbackMessage() {
        return feedbackMessage;
    }

    public void setFeedbackMessage(String feedbackMessage) {
        this.feedbackMessage = feedbackMessage;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
