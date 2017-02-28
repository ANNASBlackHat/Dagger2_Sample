package com.annasblackhat.dagger;

import android.app.Application;

/**
 * Created by Gideon on 28/02/2017.
 */

public class MyApplication extends Application {

    DiComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDiComponent.builder().build();
    }

    public DiComponent getComponent(){
        return component;
    }

}
