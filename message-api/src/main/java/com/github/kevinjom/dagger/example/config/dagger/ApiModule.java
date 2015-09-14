package com.github.kevinjom.dagger.example.config.dagger;

import com.github.kevinjom.dagger.example.MessageApi;
import dagger.Module;

@Module(
        injects = {
                MessageApi.class
        },
        includes = {
                ServiceModule.class
        }
)
public class ApiModule {
}
