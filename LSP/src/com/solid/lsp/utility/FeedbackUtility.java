package com.solid.lsp.utility;

import com.solid.lsp.entity.NormalFeedback;
import com.solid.lsp.entity.RatingFeedback;
import com.solid.lsp.service.FeedbackService;
import com.solid.lsp.service.NormalFeedbackService;
import com.solid.lsp.service.RatingFeedbackService;

import java.util.Scanner;

public class FeedbackUtility {

    public void sendFeedback(){
        FeedbackService feedbackService;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to submit normal feedback\n" +
                "Enter 2 to submit rating");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                System.out.println("Enter Feedback Message");
                String feedbackMessage = sc.next();
                NormalFeedback normalFeedback = new NormalFeedback(feedbackMessage);
                feedbackService = new NormalFeedbackService();
                feedbackService.createFeedback(normalFeedback);
                break;

            case 2 :
                System.out.println("Enter Rating");
                int rating = sc.nextInt();
                RatingFeedback ratingFeedback = new RatingFeedback(rating);
                feedbackService = new RatingFeedbackService();
                feedbackService.createFeedback(ratingFeedback);
                break;

            default :
                System.out.println("Wrong Choice");
        }
    }

}
