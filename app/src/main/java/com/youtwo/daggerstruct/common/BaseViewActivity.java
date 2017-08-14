package com.youtwo.daggerstruct.common;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import com.youtwo.daggerstruct.common.presenter.Presenter;
import com.youtwo.daggerstruct.common.view.BaseView;
import javax.inject.Inject;

/**
 * Created by Bill on 2017/8/11.
 */

public abstract class BaseViewActivity<T extends Presenter> extends BaseActivity implements
    BaseView {

  @Inject
  protected T presenter;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
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
  protected void onDestroy() {
    presenter.onEnd();
    super.onDestroy();
  }
}
