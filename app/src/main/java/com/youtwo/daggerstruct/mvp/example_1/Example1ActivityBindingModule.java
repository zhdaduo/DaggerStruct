package com.youtwo.daggerstruct.mvp.example_1;

import android.app.Activity;
import com.youtwo.daggerstruct.common.BaseActivityModule;
import com.youtwo.daggerstruct.di.PerActivity;
import dagger.Binds;
import dagger.Module;

/**
 * Created by Bill on 2017/8/11.
 */
@Module(includes = BaseActivityModule.class)
public abstract class Example1ActivityBindingModule {

  @Binds
  @PerActivity
  abstract Activity activity(Example1Activity example1Activity);
}
