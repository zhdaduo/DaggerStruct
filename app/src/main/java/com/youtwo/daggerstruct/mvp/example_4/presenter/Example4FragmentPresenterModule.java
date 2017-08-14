package com.youtwo.daggerstruct.mvp.example_4.presenter;

import com.youtwo.daggerstruct.di.PerFragment;
import dagger.Binds;
import dagger.Module;

/**
 * Created by Bill on 2017/8/12.
 */
@Module
public abstract class Example4FragmentPresenterModule {

  @Binds
  @PerFragment
  abstract Example4FragmentPresenter example4FragmentPresenter(Example4FragmentPresenterImpl example4FragmentPresenter);
}
