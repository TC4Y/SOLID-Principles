package com.solid.feedback.utility;

import com.solid.feedback.entity.Feedback;
import com.solid.feedback.repository.FeedbackUploadable;

public class GoogleDriveUtility implements FeedbackUploadable {
    @Override
    public String upload(String filePath) {
        System.out.println("Uploaded to Google Drive");
        return "googledrive.com/file/aksdjfsdhf";
    }
}
