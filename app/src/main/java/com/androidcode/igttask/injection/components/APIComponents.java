package com.androidcode.igttask.injection.components;

import com.androidcode.igttask.MainActivity;
import com.androidcode.igttask.injection.modules.APIModule;
import com.androidcode.igttask.injection.scope.UserScope;

import dagger.Component;




    @UserScope
    @Component(dependencies =NetComponent.class, modules = APIModule.class)
    public interface APIComponents {

    void inject(MainActivity activity);
}
