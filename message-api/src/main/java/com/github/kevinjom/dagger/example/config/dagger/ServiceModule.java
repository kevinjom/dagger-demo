package com.github.kevinjom.dagger.example.config.dagger;

import com.github.kevinjom.dagger.example.dao.impl.AppDao;
import com.github.kevinjom.dagger.example.remote.service.SnsClient;
import com.github.kevinjom.dagger.example.remote.service.SubscriptionService;
import com.github.kevinjom.dagger.example.remote.service.impl.RealSnsClient;
import com.github.kevinjom.dagger.example.remote.service.impl.SubscriptionServiceImpl;
import com.github.kevinjom.dagger.example.service.AppAuthService;
import com.github.kevinjom.dagger.example.service.MessageService;
import com.github.kevinjom.dagger.example.service.impl.AppAuthServiceImpl;
import com.github.kevinjom.dagger.example.service.impl.MessageServiceImpl;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(library = true, complete = true
)
public class ServiceModule {
    @Provides
    @Singleton
    public SnsClient provideSnsClient() {
        return new RealSnsClient();
    }

    @Provides
    @Singleton
    public SubscriptionService provideSubscriptionService() {
        return new SubscriptionServiceImpl();
    }

    @Provides
    @Singleton
    public MessageService provideMessageService(SubscriptionService subscriptionService, SnsClient snsClient) {
        return new MessageServiceImpl(subscriptionService, snsClient);
    }

    @Provides
    @Singleton
    public AppAuthService provideAppAuthService(AppDao appDao) {
        return new AppAuthServiceImpl(appDao);
    }

    @Provides
    @Singleton
    public AppDao provideAppDao() {
        return new AppDao();
    }

}
