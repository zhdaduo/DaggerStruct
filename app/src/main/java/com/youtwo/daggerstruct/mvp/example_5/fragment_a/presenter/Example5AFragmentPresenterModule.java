package com.youtwo.daggerstruct.mvp.example_5.fragment_a.presenter;

import com.youtwo.daggerstruct.di.PerFragment;
import dagger.Binds;
import dagger.Module;

/**
 * Created by Bill on 2017/8/12.
 */
@Module
public abstract class Example5AFragmentPresenterModule {

  @Binds
  @PerFragment
  abstract Example5AFragmentPresenter example5AFragmentPresenter(Example5AFragmentPresenterImpl example5AFragmentPresenter);
}
