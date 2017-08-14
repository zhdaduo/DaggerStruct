package com.youtwo.daggerstruct.mvp.main;

import android.app.Activity;
import com.youtwo.daggerstruct.common.BaseActivityModule;
import com.youtwo.daggerstruct.di.PerActivity;
import com.youtwo.daggerstruct.di.PerFragment;
import com.youtwo.daggerstruct.mvp.main.view.MainFragment;
import com.youtwo.daggerstruct.mvp.main.view.MainFragmentBindingModule;
import com.youtwo.daggerstruct.mvp.main.view.MainFragmentListener;
import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Bill on 2017/8/11.
 */
@Module(includes = BaseActivityModule.class)
public abstract class MainActivityBindingModule {

  @Binds
  @PerActivity
  abstract Activity activity(MainActivity mainActivity);

  @Binds
  @PerActivity
  abstract MainFragmentListener mainFragmentListener(MainActivity mainActivity);

  @PerFragment
  @ContributesAndroidInjector(modules = MainFragmentBindingModule.class)
  abstract MainFragment contributeMainFragmentInjector();
}
