package com.github.kevinjom.dagger.example.service.impl;

import com.github.kevinjom.dagger.example.dao.impl.AppDao;
import com.github.kevinjom.dagger.example.service.AppAuthService;

import javax.inject.Inject;

public class AppAuthServiceImpl implements AppAuthService {
    private AppDao appDao;

    @Inject
    public AppAuthServiceImpl(AppDao appDao) {
        this.appDao = appDao;
    }

    public boolean isValidAppKey(String appKey) {
        return appDao.findByKey(appKey) != null;
    }
}
