package com.annasblackhat.dagger;

/**
 * Created by Gideon on 28/02/2017.
 */

public class NetworkApi {

    public boolean validateUser(String uname, String pswd){
        if(uname == null || uname.length() == 0){
            return false;
        }else{
            return true;
        }
    }

}
