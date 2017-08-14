package com.youtwo.daggerstruct.mvp.example_5.fragment_a.view;

import android.app.Fragment;
import com.youtwo.daggerstruct.common.view.BaseFragmentModule;
import com.youtwo.daggerstruct.di.PerFragment;
import com.youtwo.daggerstruct.mvp.example_5.fragment_a.presenter.Example5AFragmentPresenterModule;
import dagger.Binds;
import dagger.Module;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/12.
 */
@Module(includes = {
    BaseFragmentModule.class,
    Example5AFragmentPresenterModule.class,
})
public abstract class Example5AFragmentBindingModule {

  @Binds
  @Named(BaseFragmentModule.FRAGMENT)
  @PerFragment
  abstract Fragment fragment(Example5AFragment example5AFragment);

  @Binds
  @PerFragment
  abstract Example5AFragmentView example5AFragmentView(Example5AFragment example5AFragment);
}
