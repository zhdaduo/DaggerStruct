package com.youtwo.daggerstruct.util;

import android.app.Fragment;
import com.youtwo.daggerstruct.common.view.BaseChildFragmentModule;
import com.youtwo.daggerstruct.di.PerChildFragment;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/11.
 */
@PerChildFragment
public final class PerChildFragmentUtil {

  private final Fragment childFragment;

  @Inject
  PerChildFragmentUtil(@Named(BaseChildFragmentModule.CHILD_FRAGMENT) Fragment childFragment) {
    this.childFragment = childFragment;
  }

  public String doSomething() {
    return "PerChildFragmentUtil: " + hashCode()
        + ", child Fragment: " + childFragment.hashCode();
  }
}
