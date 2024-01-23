package com.solid.feedback.utility;

import com.solid.feedback.entity.NormalFeedback;
import com.solid.feedback.repository.FeedbackUploadable;
import com.solid.feedback.repository.MongoDbFeedbackRepository;
import com.solid.feedback.service.*;

public class FeedbackUtility {

    FeedbackMultimediaCreatable feedbackStorable;

    public void sendFeedback(){
        String feedbackMessage = "";

        if (true){
            GoogleDriveUtility googleDriveUtility = new GoogleDriveUtility();
            feedbackStorable = new FeedbackImageService(googleDriveUtility);
        }
        String imageUrl = feedbackStorable.createMultimediaFeedback("goodImage.jpeg");
        if (true){
            OneDriveUtility oneDriveUtility = new OneDriveUtility();
            feedbackStorable = new FeedbackAudioService(oneDriveUtility);
        }
        String audioUrl = feedbackStorable.createMultimediaFeedback("goodAudio.jpeg");
        if (true){
            YoutubeUtility youtubeUtility = new YoutubeUtility();
            feedbackStorable = new FeedbackVideoService(youtubeUtility);
        }
        String videoUrl = feedbackStorable.createMultimediaFeedback("goodVideo.jpeg");

        NormalFeedback normalFeedback = new NormalFeedback(feedbackMessage, imageUrl, audioUrl, videoUrl);
        MongoDbFeedbackRepository mongoDbFeedbackRepository = new MongoDbFeedbackRepository();
        FeedbackService feedbackService = new FeedbackService(mongoDbFeedbackRepository);
        String feedbackId = feedbackService.create(normalFeedback);
        System.out.println("New Feedback Id: " + feedbackId);

    }
}
