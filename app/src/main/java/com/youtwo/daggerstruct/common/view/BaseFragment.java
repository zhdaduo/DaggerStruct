package com.youtwo.daggerstruct.common.view;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/11.
 */

public abstract class BaseFragment extends Fragment implements HasFragmentInjector {

  @Inject
  protected Context activityContext;

  @Inject
  @Named(BaseFragmentModule.CHILD_FRAGMENT_MANAGER)
  protected FragmentManager childFragmentManager;

  @Inject
  DispatchingAndroidInjector<Fragment> childFragmentInjector;

  @Nullable
  private Unbinder viewUnbinder;

  @Override
  public void onAttach(Activity activity) {
    AndroidInjection.inject(this);
    super.onAttach(activity);
  }

  @Override
  public void onViewStateRestored(Bundle savedInstanceState) {
    super.onViewStateRestored(savedInstanceState);
    View view = getView();
    if (view != null) {
      viewUnbinder = ButterKnife.bind(this, view);
    }
  }

  @Override
  public void onDestroyView() {
    if (viewUnbinder != null) {
      viewUnbinder.unbind();
    }
    super.onDestroyView();
  }

  @Override
  public final AndroidInjector<Fragment> fragmentInjector() {
    return childFragmentInjector;
  }

  protected final void addChildFragment(@IdRes int containerViewId, Fragment fragment) {
    childFragmentManager.beginTransaction()
        .add(containerViewId, fragment)
        .commit();
  }
}
