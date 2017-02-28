package com.annasblackhat.dagger2;

/**
 * Created by Gideon on 28/02/2017.
 */

public class Motor {
    private int rpm;

    public Motor() {
        this.rpm = 10;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
