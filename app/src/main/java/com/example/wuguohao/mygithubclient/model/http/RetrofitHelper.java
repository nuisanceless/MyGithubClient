package com.example.wuguohao.mygithubclient.model.http;

import com.example.wuguohao.mygithubclient.model.http.api.GithubApis;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wuguohao on 17/3/3.
 */

public class RetrofitHelper
{
    private static OkHttpClient mOkHttpClient = null;

    private static GithubApis mGithubApiService = null;

    public RetrofitHelper () {
        init();
    }

    private void init () {
        initOkHttp();
        mGithubApiService = getGithubApiService(GithubApis.HOST);
    }

    private void initOkHttp () {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        //设置超时
        builder.connectTimeout(10, TimeUnit.SECONDS);
        builder.readTimeout(20, TimeUnit.SECONDS);
        builder.writeTimeout(20, TimeUnit.SECONDS);

        mOkHttpClient = builder.build();
    }

    //
    private GithubApis getGithubApiService (String baseUrl)
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(mOkHttpClient)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(GithubApis.class);
    }
}
