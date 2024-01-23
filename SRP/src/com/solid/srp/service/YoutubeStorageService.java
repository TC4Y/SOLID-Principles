package com.solid.srp.service;

public class YoutubeStorageService implements DataStorable{
    @Override
    public void upload(String data) {
        System.out.println("Uploaded to Youtube: " + data);
    }
}
