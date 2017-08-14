package com.youtwo.daggerstruct.mvp.example_2.presenter;

import com.youtwo.daggerstruct.di.PerActivity;
import dagger.Binds;
import dagger.Module;

/**
 * Created by Bill on 2017/8/12.
 */
@Module
public abstract class Example2ActivityPresenterModule {

  @Binds
  @PerActivity
  abstract Example2ActivityPresenter example2ActivityPresenter(Example2ActivityPresenterImpl example2ActivityPresenter);
}
