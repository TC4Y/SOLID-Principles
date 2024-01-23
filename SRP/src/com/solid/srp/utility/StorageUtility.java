package com.solid.srp.utility;

import com.solid.srp.service.DataStorable;
import com.solid.srp.service.GoogleDriveStorageService;
import com.solid.srp.service.OneDriveStorageService;
import com.solid.srp.service.YoutubeStorageService;

import java.util.Scanner;

public class StorageUtility {

    public void store(){
        DataStorable dataStorable;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to store");
        String data = sc.nextLine();
        System.out.println("Enter 1 to store in Google Drive\n" +
                "Enter 2 to store in One Drive\n" +
                "Enter 3 to store in Youtube\n");
        int choice = sc.nextInt();

        switch (choice){
            case 1 :
                dataStorable = new GoogleDriveStorageService();
                dataStorable.upload(data);
                break;

            case 2 :
                dataStorable = new OneDriveStorageService();
                dataStorable.upload(data);
                break;

            case 3 :
                dataStorable = new YoutubeStorageService();
                dataStorable.upload(data);
                break;

            default:
                System.out.println("Wrong Choice");
        }
    }

}
