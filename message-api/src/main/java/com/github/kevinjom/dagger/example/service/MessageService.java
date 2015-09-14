package com.github.kevinjom.dagger.example.service;

import com.github.kevinjom.dagger.example.model.Message;

public interface MessageService {
    boolean sendMessage(Message message);
}
