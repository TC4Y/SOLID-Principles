package com.solid.feedback.utility;

import com.solid.feedback.repository.FeedbackUploadable;

public class OneDriveUtility implements FeedbackUploadable {
    @Override
    public String upload(String filePath) {
        System.out.println("Uploaded to One Drive");
        return "onedrive.com/file/aksdjfsdhf";
    }
}
