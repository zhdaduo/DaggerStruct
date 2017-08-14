package com.youtwo.daggerstruct.mvp.example_4.view;

import android.app.Fragment;
import com.youtwo.daggerstruct.common.view.BaseFragmentModule;
import com.youtwo.daggerstruct.di.PerFragment;
import com.youtwo.daggerstruct.mvp.example_4.presenter.Example4FragmentPresenterModule;
import dagger.Binds;
import dagger.Module;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/12.
 */
@Module(includes = {
    BaseFragmentModule.class,
    Example4FragmentPresenterModule.class,
})
public abstract class Example4FragmentBindingModule {

  @Binds
  @Named(BaseFragmentModule.FRAGMENT)
  @PerFragment
  abstract Fragment fragment(Example4Fragment example4Fragment);

  @Binds
  @PerFragment
  abstract Example4FragmentView example4FragmentView(Example4Fragment example4Fragment);
}
