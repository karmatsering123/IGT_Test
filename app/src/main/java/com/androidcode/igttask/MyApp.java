package com.androidcode.igttask;

import android.app.Application;

import com.androidcode.igttask.injection.components.APIComponents;
import com.androidcode.igttask.injection.components.DaggerAPIComponents;
import com.androidcode.igttask.injection.components.DaggerNetComponent;
import com.androidcode.igttask.injection.components.NetComponent;
import com.androidcode.igttask.injection.modules.APIModule;
import com.androidcode.igttask.injection.modules.AppModule;
import com.androidcode.igttask.injection.modules.NetModule;
import com.androidcode.igttask.utils.Constants;



public class MyApp extends Application {

    private NetComponent mNetComponent;
    private APIComponents mApiComponents;
    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .netModule(new NetModule(Constants.BASE_URL))
                .appModule(new AppModule(this))
                .build();

        mApiComponents = DaggerAPIComponents.builder()
                .netComponent(mNetComponent)
                .aPIModule(new APIModule())
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }

    public APIComponents getApiComponent() {
        return mApiComponents;
    }

}
