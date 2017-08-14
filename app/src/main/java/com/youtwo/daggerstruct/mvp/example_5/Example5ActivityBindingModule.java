package com.youtwo.daggerstruct.mvp.example_5;

import android.app.Activity;
import com.youtwo.daggerstruct.common.BaseActivityModule;
import com.youtwo.daggerstruct.di.PerActivity;
import com.youtwo.daggerstruct.di.PerFragment;
import com.youtwo.daggerstruct.mvp.example_5.fragment_a.view.Example5AFragment;
import com.youtwo.daggerstruct.mvp.example_5.fragment_a.view.Example5AFragmentBindingModule;
import com.youtwo.daggerstruct.mvp.example_5.fragment_b.view.Example5BFragment;
import com.youtwo.daggerstruct.mvp.example_5.fragment_b.view.Example5BFragmentBindingModule;
import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Bill on 2017/8/12.
 */
@Module(includes = BaseActivityModule.class)
public abstract class Example5ActivityBindingModule {

  @Binds
  @PerActivity
  abstract Activity activity(Example5Activity example4Activity);

  @PerFragment
  @ContributesAndroidInjector(modules = Example5AFragmentBindingModule.class)
  abstract Example5AFragment contributeExample5AFragmentInjector();

  @PerFragment
  @ContributesAndroidInjector(modules = Example5BFragmentBindingModule.class)
  abstract Example5BFragment contributeExample5BFragmentInjector();
}
