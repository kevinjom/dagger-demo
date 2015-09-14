package com.github.kevinjom.dagger.example;

import com.github.kevinjom.dagger.example.config.dagger.ApiModule;
import com.github.kevinjom.dagger.example.model.Message;
import com.github.kevinjom.dagger.example.service.AppAuthService;
import com.github.kevinjom.dagger.example.service.MessageService;
import dagger.ObjectGraph;

import javax.inject.Inject;

public class MessageApi {
    @Inject
    MessageService messageService;
    @Inject
    AppAuthService appAuthService;

    public boolean sendMessaeg(String apiKey, Message message) {
        //TOOD args validation

        if (appAuthService.isValidAppKey(apiKey)) {
            return messageService.sendMessage(message);
        }

        return false;
    }

    public static void main(String[] args) {
        ObjectGraph og = ObjectGraph.create(ApiModule.class);
        MessageApi messageApi = og.get(MessageApi.class);

        String key = "appkey3223";
        Message message = new Message();
        message.setConsumerId("kevinjom");
        message.setType("mt");
        message.setBody("hello dagger");

        System.out.println(messageApi.sendMessaeg(key, message));
    }
}

