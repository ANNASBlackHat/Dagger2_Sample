package com.annasblackhat.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Gideon on 28/02/2017.
 */

@Singleton
@Component(modules = {NetworkApiModule.class})

public interface DiComponent {
    void inject(MainActivity mainActivity);
}
