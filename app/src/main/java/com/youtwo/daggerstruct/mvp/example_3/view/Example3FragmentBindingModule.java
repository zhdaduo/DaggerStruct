package com.youtwo.daggerstruct.mvp.example_3.view;

import android.app.Fragment;
import com.youtwo.daggerstruct.common.view.BaseFragmentModule;
import com.youtwo.daggerstruct.di.PerFragment;
import dagger.Binds;
import dagger.Module;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/12.
 */
@Module(includes = BaseFragmentModule.class)
public abstract class Example3FragmentBindingModule {

  @Binds
  @Named(BaseFragmentModule.FRAGMENT)
  @PerFragment
  abstract Fragment fragment(Example3Fragment example3Fragment);
}
