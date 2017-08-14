package com.youtwo.daggerstruct.mvp.main.view;

import android.app.Fragment;
import com.youtwo.daggerstruct.common.view.BaseFragmentModule;
import com.youtwo.daggerstruct.di.PerFragment;
import dagger.Binds;
import dagger.Module;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/11.
 */
@Module(includes = BaseFragmentModule.class)
public abstract class MainFragmentBindingModule {

  @Binds
  @Named(BaseFragmentModule.FRAGMENT)
  @PerFragment
  abstract Fragment fragment(MainFragment mainFragment);
}
