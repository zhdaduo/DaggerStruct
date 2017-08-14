package com.youtwo.daggerstruct.mvp.example_2;

import android.app.Activity;
import com.youtwo.daggerstruct.common.BaseActivityModule;
import com.youtwo.daggerstruct.di.PerActivity;
import com.youtwo.daggerstruct.mvp.example_2.presenter.Example2ActivityPresenterModule;
import com.youtwo.daggerstruct.mvp.example_2.view.Example2ActivityView;
import dagger.Binds;
import dagger.Module;

/**
 * Created by Bill on 2017/8/12.
 */
@Module(includes = {
    BaseActivityModule.class,
    Example2ActivityPresenterModule.class,
})
public abstract class Example2ActivityBindingModule {

  @Binds
  @PerActivity
  abstract Activity activity(Example2Activity example2Activity);

  @Binds
  @PerActivity
  abstract Example2ActivityView example2ActivityView(Example2Activity example2Activity);
}
