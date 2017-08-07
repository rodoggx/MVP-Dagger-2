package com.example.rodoggx.mvpdagger2.mainscreen;

import com.example.rodoggx.mvpdagger2.util.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by RodoggX on 8/6/2017.
 */

@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;


    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}
