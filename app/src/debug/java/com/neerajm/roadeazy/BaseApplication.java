package com.neerajm.roadeazy;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by neerajm on 27/3/18.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree(){
            @Override
            protected String createStackElementTag(StackTraceElement element) {
                return super.createStackElementTag(element)+":"+element.getLineNumber();
            }
        });
    }
}
