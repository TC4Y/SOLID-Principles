package com.solid.feedback.repository;

import com.solid.feedback.entity.Feedback;

public interface FeedbackStorable {
    public String store(Feedback feedback);
}
