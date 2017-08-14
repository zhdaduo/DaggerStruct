package com.youtwo.daggerstruct.mvp.example_6.child_fragment.presenter;

import com.youtwo.daggerstruct.di.PerChildFragment;
import dagger.Binds;
import dagger.Module;

/**
 * Created by Bill on 2017/8/12.
 */
@Module
public abstract class Example6ChildFragmentPresenterModule {

  @Binds
  @PerChildFragment
  abstract Example6ChildFragmentPresenter
  example6ChildFragmentPresenter(Example6ChildFragmentPresenterImpl example6ChildFragmentPresenter);
}
