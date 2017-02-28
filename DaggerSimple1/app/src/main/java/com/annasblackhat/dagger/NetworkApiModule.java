package com.annasblackhat.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Gideon on 28/02/2017.
 */

@Module
public class NetworkApiModule {

    @Provides
    @Singleton
    public NetworkApi getNetworkApi(){
        return new NetworkApi();
    }

}
