package com.example.wuguohao.mygithubclient.di.component;

import com.example.wuguohao.mygithubclient.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by wuguohao on 17/3/3.
 */
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
}
