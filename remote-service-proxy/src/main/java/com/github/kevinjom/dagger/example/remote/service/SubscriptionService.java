package com.github.kevinjom.dagger.example.remote.service;

public interface SubscriptionService {
    boolean subscribed(String consumerId, String messageType);
}
