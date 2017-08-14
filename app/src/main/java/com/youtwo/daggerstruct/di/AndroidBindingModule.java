package com.youtwo.daggerstruct.di;

import android.app.Application;
import com.youtwo.daggerstruct.AndroidApplication;
import com.youtwo.daggerstruct.mvp.example_1.Example1Activity;
import com.youtwo.daggerstruct.mvp.example_1.Example1ActivityBindingModule;
import com.youtwo.daggerstruct.mvp.example_2.Example2Activity;
import com.youtwo.daggerstruct.mvp.example_2.Example2ActivityBindingModule;
import com.youtwo.daggerstruct.mvp.example_3.Example3Activity;
import com.youtwo.daggerstruct.mvp.example_3.Example3ActivityBindingModule;
import com.youtwo.daggerstruct.mvp.example_4.Example4Activity;
import com.youtwo.daggerstruct.mvp.example_4.Example4ActivityBindingModule;
import com.youtwo.daggerstruct.mvp.example_5.Example5Activity;
import com.youtwo.daggerstruct.mvp.example_5.Example5ActivityBindingModule;
import com.youtwo.daggerstruct.mvp.example_6.Example6Activity;
import com.youtwo.daggerstruct.mvp.example_6.Example6ActivityBindingModule;
import com.youtwo.daggerstruct.mvp.main.MainActivity;
import com.youtwo.daggerstruct.mvp.main.MainActivityBindingModule;
import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import javax.inject.Singleton;

/**
 * Created by Bill on 2017/8/11.
 */
@Module
abstract class AndroidBindingModule {

  @Binds
  @Singleton
  abstract Application application(AndroidApplication androidApplication);

  @PerActivity
  @ContributesAndroidInjector(modules = MainActivityBindingModule.class)
  abstract MainActivity contributeMainActivityInjector();

  @PerActivity
  @ContributesAndroidInjector(modules = Example1ActivityBindingModule.class)
  abstract Example1Activity contributeExample1ActivityInjector();

  @PerActivity
  @ContributesAndroidInjector(modules = Example2ActivityBindingModule.class)
  abstract Example2Activity contributeExample2ActivityInjector();

  @PerActivity
  @ContributesAndroidInjector(modules = Example3ActivityBindingModule.class)
  abstract Example3Activity contributeExample3ActivityInjector();

  @PerActivity
  @ContributesAndroidInjector(modules = Example4ActivityBindingModule.class)
  abstract Example4Activity contributeExample4ActivityInjector();

  @PerActivity
  @ContributesAndroidInjector(modules = Example5ActivityBindingModule.class)
  abstract Example5Activity contributeExample5ActivityInjector();

  @PerActivity
  @ContributesAndroidInjector(modules = Example6ActivityBindingModule.class)
  abstract Example6Activity contributeExample6ActivityInjector();
}
