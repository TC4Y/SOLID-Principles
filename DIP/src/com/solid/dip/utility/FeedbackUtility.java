package com.solid.dip.utility;

import com.solid.dip.repository.MongoDbRepository;
import com.solid.dip.repository.MySqlRepository;
import com.solid.dip.repository.Repository;

import java.util.Scanner;

public class FeedbackUtility {
    Repository repository;

    public void saveFeedback(){
        Scanner sc = new Scanner(System.in);
        String feedbackMessage = "Very Good Product. Will recommend to everyone";

        System.out.println("Enter 1 to store in MySQL \n " +
                "Enter 2 to store in MongoDB\n");
        int choice = sc.nextInt();
        switch(choice) {
            case 1 :
                repository = new MySqlRepository();
                repository.store(feedbackMessage);
                break;
            case 2 :
                repository = new MongoDbRepository();
                repository.store(feedbackMessage);
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
