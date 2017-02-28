package com.annasblackhat.dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Gideon on 28/02/2017.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();

}
