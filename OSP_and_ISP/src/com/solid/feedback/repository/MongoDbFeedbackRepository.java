package com.solid.feedback.repository;

import com.solid.feedback.entity.Feedback;

public class MongoDbFeedbackRepository implements FeedbackStorable{
    @Override
    public String store(Feedback feedback) {
        System.out.println("Feedback stored in MongoDB");
        return "MONGOFEED123";
    }
}
