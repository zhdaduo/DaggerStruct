package com.youtwo.daggerstruct.mvp.example_3;

import android.app.Activity;
import com.youtwo.daggerstruct.common.BaseActivityModule;
import com.youtwo.daggerstruct.di.PerActivity;
import com.youtwo.daggerstruct.di.PerFragment;
import com.youtwo.daggerstruct.mvp.example_3.view.Example3Fragment;
import com.youtwo.daggerstruct.mvp.example_3.view.Example3FragmentBindingModule;
import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Bill on 2017/8/12.
 */
@Module(includes = BaseActivityModule.class)
public abstract class Example3ActivityBindingModule {

  @Binds
  @PerActivity
  abstract Activity activity(Example3Activity example3Activity);

  @PerFragment
  @ContributesAndroidInjector(modules = Example3FragmentBindingModule.class)
  abstract Example3Fragment contributeExample3FragmentInjector();
}
