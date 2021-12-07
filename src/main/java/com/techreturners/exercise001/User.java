package com.techreturners.exercise001;

public class User {
    private String username;
    private String operatingSystem;
    private String type;

    public User(String username, String operatingSystem, String type) {
        this.username = username;
        this.operatingSystem = operatingSystem;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getType() {
        return type;
    }
}