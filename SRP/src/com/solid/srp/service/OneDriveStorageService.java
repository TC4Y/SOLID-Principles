package com.solid.srp.service;

public class OneDriveStorageService implements DataStorable{
    @Override
    public void upload(String data) {
        System.out.println("Uploaded to One Drive: " + data);
    }
}
