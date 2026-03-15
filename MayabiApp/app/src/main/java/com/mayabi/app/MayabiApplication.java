package com.mayabi.app;

import android.app.Application;
import android.webkit.WebView;

public class MayabiApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Enable WebView debugging in debug builds
        WebView.setWebContentsDebuggingEnabled(BuildConfig.DEBUG);
    }
}
