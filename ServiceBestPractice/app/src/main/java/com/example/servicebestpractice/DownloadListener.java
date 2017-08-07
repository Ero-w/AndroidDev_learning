package com.example.servicebestpractice;

/**
 * Created by liushengjie on 2017/8/4.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
