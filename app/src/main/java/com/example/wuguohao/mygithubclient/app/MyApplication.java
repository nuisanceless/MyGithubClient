package com.example.wuguohao.mygithubclient.app;

import android.app.Application;

import com.example.wuguohao.mygithubclient.di.component.AppComponent;
import com.example.wuguohao.mygithubclient.di.component.DaggerAppComponent;
import com.example.wuguohao.mygithubclient.di.module.AppModule;

/**
 * Created by wuguohao on 17/3/2.
 */

public class MyApplication extends Application
{
    private static MyApplication mInstance;
    private static AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.mInstance = this;
    }

    public static synchronized MyApplication getInstance () {
        return mInstance;
    }

    public static AppComponent getAppComponent () {
        if (mAppComponent == null) {
            mAppComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(mInstance))
                    .build();
        }
        return mAppComponent;
    }
}
