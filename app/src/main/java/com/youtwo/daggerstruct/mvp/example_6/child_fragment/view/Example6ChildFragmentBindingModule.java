package com.youtwo.daggerstruct.mvp.example_6.child_fragment.view;

import android.app.Fragment;
import com.youtwo.daggerstruct.common.view.BaseChildFragmentModule;
import com.youtwo.daggerstruct.di.PerChildFragment;
import com.youtwo.daggerstruct.mvp.example_6.child_fragment.presenter.Example6ChildFragmentPresenterModule;
import dagger.Binds;
import dagger.Module;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/12.
 */
@Module(includes = {
    BaseChildFragmentModule.class,
    Example6ChildFragmentPresenterModule.class,
})
public abstract class Example6ChildFragmentBindingModule {

  @Binds
  @Named(BaseChildFragmentModule.CHILD_FRAGMENT)
  @PerChildFragment
  abstract Fragment fragment(Example6ChildFragment example6ChildFragment);

  @Binds
  @PerChildFragment
  abstract Example6ChildFragmentView example6ChildFragmentView(Example6ChildFragment example6ChildFragment);
}
