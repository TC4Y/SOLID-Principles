package com.solid.dip.repository;

public class MongoDbRepository implements Repository{
    @Override
    public void store(String data) {
        System.out.println("Stored in MongoDB: " + data);
    }
}
