package com.youtwo.daggerstruct.mvp.example_5.fragment_b.view;

import android.app.Fragment;
import com.youtwo.daggerstruct.common.view.BaseFragmentModule;
import com.youtwo.daggerstruct.di.PerFragment;
import com.youtwo.daggerstruct.mvp.example_5.fragment_b.presenter.Example5BFragmentPresenterModule;
import dagger.Binds;
import dagger.Module;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/12.
 */
@Module(includes = {
    BaseFragmentModule.class,
    Example5BFragmentPresenterModule.class,
})
public abstract class Example5BFragmentBindingModule {

  @Binds
  @Named(BaseFragmentModule.FRAGMENT)
  @PerFragment
  abstract Fragment fragment(Example5BFragment example5BFragment);

  @Binds
  @PerFragment
  abstract Example5BFragmentView example5BFragmentView(Example5BFragment example5BFragment);
}
