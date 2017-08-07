package com.example.rodoggx.mvpdagger2.mainscreen;

import com.example.rodoggx.mvpdagger2.data.component.NetComponent;
import com.example.rodoggx.mvpdagger2.util.CustomScope;

import dagger.Component;

/**
 * Created by RodoggX on 8/6/2017.
 */

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}
