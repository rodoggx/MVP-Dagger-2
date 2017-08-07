package com.example.rodoggx.mvpdagger2;

import android.app.Application;

import com.example.rodoggx.mvpdagger2.data.component.DaggerNetComponent;
import com.example.rodoggx.mvpdagger2.data.component.NetComponent;
import com.example.rodoggx.mvpdagger2.data.module.AppModule;
import com.example.rodoggx.mvpdagger2.data.module.NetModule;

/**
 * Created by RodoggX on 8/6/2017.
 */

public class App extends Application {
    private static NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public static NetComponent getNetComponent() {
        return mNetComponent;
    }
}