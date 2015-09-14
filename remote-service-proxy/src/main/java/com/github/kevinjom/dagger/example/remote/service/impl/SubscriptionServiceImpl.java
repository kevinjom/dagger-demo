package com.github.kevinjom.dagger.example.remote.service.impl;

import com.github.kevinjom.dagger.example.remote.service.SubscriptionService;

public class SubscriptionServiceImpl implements SubscriptionService {
    public boolean subscribed(String consumerId, String messageType) {
        if (consumerId.length() < 10) {
            return true;
        }
        return false;
    }
}
