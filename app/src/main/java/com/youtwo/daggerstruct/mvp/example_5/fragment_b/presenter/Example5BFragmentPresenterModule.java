package com.youtwo.daggerstruct.mvp.example_5.fragment_b.presenter;

import com.youtwo.daggerstruct.di.PerFragment;
import dagger.Binds;
import dagger.Module;

/**
 * Created by Bill on 2017/8/12.
 */
@Module
public abstract class Example5BFragmentPresenterModule {

  @Binds
  @PerFragment
  abstract Example5BFragmentPresenter example5BFragmentPresenter(Example5BFragmentPresenterImpl example5BFragmentPresenter);
}
