package com.androidcode.igttask.injection.modules;


import com.androidcode.igttask.observables.IGameAPI;
import com.androidcode.igttask.injection.scope.UserScope;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

@Module
public class APIModule {


    @UserScope
    @Provides
    public IGameAPI providesItemsInterface(RestAdapter retrofit) {
        return retrofit.create(IGameAPI.class);
    }
}
