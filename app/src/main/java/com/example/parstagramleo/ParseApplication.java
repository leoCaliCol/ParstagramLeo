package com.example.parstagramleo;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MxURhAVrVEmlCVH4CCyRopNU0xOB8S53ylFaiiTf") // should correspond to Application Id env variable
                .clientKey("kdhoQfkUSMifAKHzbhftaUyqtm5bOrF0KJTptM37")  // should correspond to Client key env variable
                .server("https://parseapi.back4app.com").build());
    }
}
