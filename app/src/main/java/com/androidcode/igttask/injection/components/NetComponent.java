package com.androidcode.igttask.injection.components;


import android.content.SharedPreferences;

import com.androidcode.igttask.injection.modules.AppModule;
import com.androidcode.igttask.injection.modules.NetModule;
import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Component;
import retrofit.RestAdapter;

@Singleton
@Component(modules={AppModule.class, NetModule.class})
public interface NetComponent {
    // downstream components need these exposed
    RestAdapter retrofit();
    OkHttpClient okHttpClient();
    SharedPreferences sharedPreferences();
}