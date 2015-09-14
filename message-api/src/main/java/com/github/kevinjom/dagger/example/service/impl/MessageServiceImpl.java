package com.github.kevinjom.dagger.example.service.impl;

import com.github.kevinjom.dagger.example.model.Message;
import com.github.kevinjom.dagger.example.remote.service.SnsClient;
import com.github.kevinjom.dagger.example.remote.service.SubscriptionService;
import com.github.kevinjom.dagger.example.remote.service.util.Reporter;
import com.github.kevinjom.dagger.example.service.MessageService;

import javax.inject.Inject;

public class MessageServiceImpl implements MessageService {
    private final SubscriptionService subscriptionService;
    private final SnsClient snsClient;

    @Inject
    public MessageServiceImpl(SubscriptionService subscriptionService, SnsClient snsClient) {
        this.subscriptionService = subscriptionService;
        this.snsClient = snsClient;
    }

    public boolean sendMessage(Message message) {
        boolean result = true;
        if (subscriptionService.subscribed(message.getConsumerId(), message.getType())) {
            result = snsClient.send(message.toString());
        } else {
            Reporter.report(getClass().getSimpleName(), "%s does not subscribe type %s",
                    message.getConsumerId(), message.getType());
            result = false;
        }

        return result;
    }
}
