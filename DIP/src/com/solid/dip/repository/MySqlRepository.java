package com.solid.dip.repository;

public class MySqlRepository implements Repository{
    @Override
    public void store(String data) {
        System.out.println("Stored in MySQL Database: " + data);
    }
}
