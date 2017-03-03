package com.example.wuguohao.mygithubclient.model.http.api;

import com.example.wuguohao.mygithubclient.R;
import com.example.wuguohao.mygithubclient.app.MyApplication;

/**
 * Created by wuguohao on 17/3/3.
 */

public interface GithubApis
{
    // TODO: 17/3/3 为什么下面三个修饰符在接口作用域中是无效的
    public static final String HOST = MyApplication.getInstance().getString(R.string.github_api_host);
}
