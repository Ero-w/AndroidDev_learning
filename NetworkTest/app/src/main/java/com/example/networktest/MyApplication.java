package com.example.networktest;

import android.app.Application;
import android.content.Context;

/**
 * Created by liushengjie on 2017/8/10.
 * 全局获取Context:
 * 1. MyApplication
 * 2. AndroidManifest.xml
 * 3. MyApplication.getContext()
 */



public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
