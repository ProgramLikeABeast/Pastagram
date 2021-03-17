package com.example.pastagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("TcnkgTHdEPPPLlQd4wdzafSLWf6UlL32q7yPCNah")
                .clientKey("i31gEUJ1hVYTkuB9yCY7C5h3sIPZRQgvzRYuQxiS")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
