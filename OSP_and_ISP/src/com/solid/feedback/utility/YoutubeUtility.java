package com.solid.feedback.utility;

import com.solid.feedback.repository.FeedbackUploadable;

public class YoutubeUtility implements FeedbackUploadable {
    @Override
    public String upload(String filePath) {
        System.out.println("Uploaded to Youtube");
        return "youtube.com/file/aksdjfsdhf";
    }
}
