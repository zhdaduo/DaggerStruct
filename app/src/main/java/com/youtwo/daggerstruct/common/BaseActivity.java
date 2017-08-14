package com.youtwo.daggerstruct.common;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.youtwo.daggerstruct.navigation.Navigator;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/11.
 */

public abstract class BaseActivity extends Activity implements HasFragmentInjector {

  @Inject
  protected Navigator navigator;

  @Inject
  protected Context activityContext;

  @Inject
  @Named(BaseActivityModule.ACTIVITY_FRAGMENT_MANAGER)
  protected FragmentManager fragmentManager;

  @Inject
  DispatchingAndroidInjector<Fragment> fragmentInjector;

  @Nullable
  protected Unbinder viewUnbinder;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    AndroidInjection.inject(this);
    super.onCreate(savedInstanceState);
  }

  @Override
  protected void onDestroy() {
    if (viewUnbinder != null) {
      viewUnbinder.unbind();
    }
    super.onDestroy();
  }

  @Override
  public final AndroidInjector<Fragment> fragmentInjector() {
    return fragmentInjector;
  }

  protected final void addFragment(@IdRes int containerViewId, Fragment fragment) {
    fragmentManager.beginTransaction()
        .add(containerViewId, fragment)
        .commit();
  }
}
