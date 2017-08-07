package com.example.rodoggx.mvpdagger2.data.component;

import com.example.rodoggx.mvpdagger2.data.module.AppModule;
import com.example.rodoggx.mvpdagger2.data.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by RodoggX on 8/6/2017.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    Retrofit retrofit();
}
