package com.youtwo.daggerstruct.common.view;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import com.youtwo.daggerstruct.common.presenter.Presenter;
import javax.inject.Inject;

/**
 * Created by Bill on 2017/8/11.
 */

public abstract class BaseViewFragment <T extends Presenter> extends BaseFragment
    implements BaseView {

  @Inject
  protected T presenter;

  @Override
  public void onViewStateRestored(Bundle savedInstanceState) {
    super.onViewStateRestored(savedInstanceState);
    presenter.onStart(savedInstanceState);
  }

  @Override
  public void onResume() {
    super.onResume();
    presenter.onResume();
  }

  @Override
  public void onPause() {
    super.onPause();
    presenter.onPause();
  }

  @CallSuper
  @Override
  public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    presenter.onSaveInstanceState(outState);
  }

  @Override
  public void onDestroyView() {
    presenter.onEnd();
    super.onDestroyView();
  }
}
