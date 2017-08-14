package com.youtwo.daggerstruct.mvp.example_6.parent_fragment.presenter;

import com.youtwo.daggerstruct.di.PerFragment;
import dagger.Binds;
import dagger.Module;

/**
 * Created by Bill on 2017/8/12.
 */
@Module
public abstract class Example6ParentFragmentPresenterModule {

  @Binds
  @PerFragment
  abstract Example6ParentFragmentPresenter
  example3ParentPresenter(Example6ParentFragmentPresenterImpl example6ParentFragmentPresenter);
}
