package com.youtwo.daggerstruct.mvp.example_6.parent_fragment.view;

import android.app.Fragment;
import com.youtwo.daggerstruct.common.view.BaseFragmentModule;
import com.youtwo.daggerstruct.di.PerChildFragment;
import com.youtwo.daggerstruct.di.PerFragment;
import com.youtwo.daggerstruct.mvp.example_6.child_fragment.view.Example6ChildFragment;
import com.youtwo.daggerstruct.mvp.example_6.child_fragment.view.Example6ChildFragmentBindingModule;
import com.youtwo.daggerstruct.mvp.example_6.parent_fragment.presenter.Example6ParentFragmentPresenterModule;
import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/12.
 */
@Module(includes = {
    BaseFragmentModule.class,
    Example6ParentFragmentPresenterModule.class,
})
public abstract class Example6ParentFragmentBindingModule {

  @PerChildFragment
  @ContributesAndroidInjector(modules = Example6ChildFragmentBindingModule.class)
  abstract Example6ChildFragment contributeExample6ChildFragmentInjector();

  @Binds
  @Named(BaseFragmentModule.FRAGMENT)
  @PerFragment
  abstract Fragment fragment(Example6ParentFragment example6ParentFragment);

  @Binds
  @PerFragment
  abstract Example6ParentFragmentView example6ParentFragmentView(Example6ParentFragment example6ParentFragment);
}
