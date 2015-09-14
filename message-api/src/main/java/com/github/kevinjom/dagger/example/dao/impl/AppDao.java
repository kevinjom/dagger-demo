package com.github.kevinjom.dagger.example.dao.impl;

import com.github.kevinjom.dagger.example.model.App;

public class AppDao {
    public App findByKey(String key) {
        if (key.endsWith("no")) {
            return null;
        }

        return new App(key);
    }
}
