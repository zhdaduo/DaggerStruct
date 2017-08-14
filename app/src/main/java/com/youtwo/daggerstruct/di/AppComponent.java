package com.youtwo.daggerstruct.di;

import com.youtwo.daggerstruct.AndroidApplication;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import javax.inject.Singleton;

/**
 * Created by Bill on 2017/8/11.
 */
@Singleton
@Component(modules = {
    AndroidInjectionModule.class,
    AndroidBindingModule.class,
})
interface AppComponent extends AndroidInjector<AndroidApplication> {

  @Component.Builder
  abstract class Builder extends AndroidInjector.Builder<AndroidApplication> {

  }
}
