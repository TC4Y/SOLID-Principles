package com.solid.feedback.repository;

import com.solid.feedback.entity.Feedback;

public class MySqlFeedbackRepository implements FeedbackStorable{
    @Override
    public String store(Feedback feedback) {
        System.out.println("Feedback stored in MySQL");
        return "SQLFEED123";
    }
}
