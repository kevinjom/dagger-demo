package com.github.kevinjom.dagger.example.remote.service;

public interface SnsClient {
    boolean send(String payload);
}
