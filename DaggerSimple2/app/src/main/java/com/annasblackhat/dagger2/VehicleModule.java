package com.annasblackhat.dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Gideon on 28/02/2017.
 */

@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor(){
        System.out.println("provideMotor....");
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        System.out.println("provideVehicle.....");
        return new Vehicle(new Motor());
    }
}
