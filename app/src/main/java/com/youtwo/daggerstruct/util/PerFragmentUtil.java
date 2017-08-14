package com.youtwo.daggerstruct.util;

import android.app.Fragment;
import com.youtwo.daggerstruct.common.view.BaseFragmentModule;
import com.youtwo.daggerstruct.di.PerFragment;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/11.
 */
@PerFragment
public final class PerFragmentUtil {

  private final Fragment fragment;

  @Inject
  public PerFragmentUtil(@Named(BaseFragmentModule.FRAGMENT)Fragment fragment) {
    this.fragment = fragment;
  }

  public String doSomething() {
    return "PerFragmentUtil: " + hashCode() + ", Fragment: " + fragment.hashCode();
  }
}
