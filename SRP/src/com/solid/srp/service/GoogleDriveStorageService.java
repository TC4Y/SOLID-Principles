package com.solid.srp.service;

public class GoogleDriveStorageService implements DataStorable{
    @Override
    public void upload(String data) {
        System.out.println("Uploaded to Google Drive: " + data);
    }
}
