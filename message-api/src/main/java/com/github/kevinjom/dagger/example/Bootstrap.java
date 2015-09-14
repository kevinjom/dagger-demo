package com.github.kevinjom.dagger.example;

import com.github.kevinjom.dagger.example.config.dagger.ApiModule;
import com.github.kevinjom.dagger.example.model.Message;
import dagger.ObjectGraph;

public class Bootstrap {
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
