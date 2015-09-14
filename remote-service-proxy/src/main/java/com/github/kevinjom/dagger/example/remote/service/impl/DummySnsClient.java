package com.github.kevinjom.dagger.example.remote.service.impl;

import com.github.kevinjom.dagger.example.remote.service.SnsClient;
import com.github.kevinjom.dagger.example.remote.service.util.Reporter;

public class DummySnsClient implements SnsClient {

    public boolean send(String payload) {
        Reporter.report(getClass().getSimpleName(), "message sent");
        return true;
    }
}
