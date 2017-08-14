package com.youtwo.daggerstruct.common.view;


import android.app.Fragment;
import android.app.FragmentManager;
import com.youtwo.daggerstruct.di.PerFragment;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/11.
 */
@Module
public abstract class BaseFragmentModule {

  public static final String FRAGMENT = "BaseFragmentModule.fragment";

  static final String CHILD_FRAGMENT_MANAGER = "BaseFragmentModule.childFragmentManager";

  @Provides
  @Named(CHILD_FRAGMENT_MANAGER)
  @PerFragment
  static FragmentManager childFragmentManager(@Named(FRAGMENT) Fragment fragment) {
    return fragment.getChildFragmentManager();
  }
}
