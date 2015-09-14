package com.github.kevinjom.dagger.example.model;

public class App {
    private String key;

    public App(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
