package com.youtwo.daggerstruct.mvp.example_6;

import android.app.Activity;
import com.youtwo.daggerstruct.common.BaseActivityModule;
import com.youtwo.daggerstruct.di.PerActivity;
import com.youtwo.daggerstruct.di.PerFragment;
import com.youtwo.daggerstruct.mvp.example_6.parent_fragment.view.Example6ParentFragment;
import com.youtwo.daggerstruct.mvp.example_6.parent_fragment.view.Example6ParentFragmentBindingModule;
import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Bill on 2017/8/12.
 */
@Module(includes = BaseActivityModule.class)
public abstract class Example6ActivityBindingModule {

  @Binds
  @PerActivity
  abstract Activity activity(Example6Activity example6Activity);

  @PerFragment
  @ContributesAndroidInjector(modules = Example6ParentFragmentBindingModule.class)
  abstract Example6ParentFragment contributeExample6ParentFragmentInjector();
}
