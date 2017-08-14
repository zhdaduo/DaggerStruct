package com.youtwo.daggerstruct.mvp.example_4;

import android.app.Activity;
import com.youtwo.daggerstruct.common.BaseActivityModule;
import com.youtwo.daggerstruct.di.PerActivity;
import com.youtwo.daggerstruct.di.PerFragment;
import com.youtwo.daggerstruct.mvp.example_4.view.Example4Fragment;
import com.youtwo.daggerstruct.mvp.example_4.view.Example4FragmentBindingModule;
import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Bill on 2017/8/12.
 */
@Module(includes = BaseActivityModule.class)
public abstract class Example4ActivityBindingModule {

  @Binds
  @PerActivity
  abstract Activity activity(Example4Activity example4Activity);

  @PerFragment
  @ContributesAndroidInjector(modules = Example4FragmentBindingModule.class)
  abstract Example4Fragment contributeExample4FragmentInjector();
}
