package com.example.wuguohao.mygithubclient.di.module;

import android.app.Application;

import com.example.wuguohao.mygithubclient.app.MyApplication;
import com.example.wuguohao.mygithubclient.model.http.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wuguohao on 17/3/2.
 */

@Module
public class AppModule
{
    private final MyApplication application;// TODO: 17/3/3 final 的好处？ 

    public AppModule (MyApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton // TODO: 17/3/3 作用
    public MyApplication provideApplication () {
        return application;
    }

    @Provides
    @Singleton
    public RetrofitHelper provideRetrofitHelper () {
        return new RetrofitHelper();
    }
}
