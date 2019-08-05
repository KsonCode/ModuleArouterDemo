package com.bwie.lib_core;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化
        ARouter.init(this);
    }
}
