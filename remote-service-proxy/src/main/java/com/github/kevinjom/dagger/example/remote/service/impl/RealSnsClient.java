package com.github.kevinjom.dagger.example.remote.service.impl;

import com.github.kevinjom.dagger.example.remote.service.SnsClient;
import com.github.kevinjom.dagger.example.remote.service.util.Reporter;

public class RealSnsClient implements SnsClient {

    public boolean send(String payload) {
        if (payload.length() < 500) {
            Reporter.report(getClass().getSimpleName(), "messsage sent: %s", payload);
            return true;
        }

        return false;
    }
}
