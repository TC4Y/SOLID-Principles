package com.solid.lsp.entity;

public class NormalFeedback extends Feedback {

    private String feedbackMessage;
    private String imageUrl;
    private String audioUrl;
    private String videoUrl;

    public NormalFeedback(String feedbackId, String feedbackMessage, String imageUrl, String audioUrl, String videoUrl) {
        super(feedbackId);
        this.feedbackMessage = feedbackMessage;
        this.imageUrl = imageUrl;
        this.audioUrl = audioUrl;
        this.videoUrl = videoUrl;
    }

    public NormalFeedback(String feedbackMessage, String imageUrl, String audioUrl, String videoUrl) {
        super();
        this.feedbackMessage = feedbackMessage;
        this.imageUrl = imageUrl;
        this.audioUrl = audioUrl;
        this.videoUrl = videoUrl;
    }

    public NormalFeedback(String feedbackMessage){
        this.feedbackMessage = feedbackMessage;
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
