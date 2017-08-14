package com.youtwo.daggerstruct.common.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.youtwo.daggerstruct.common.view.BaseView;

/**
 * Created by Bill on 2017/8/11.
 */

public abstract class BasePresenter<T extends BaseView> implements Presenter {
  protected final T view;

  protected BasePresenter(T view) {
    this.view = view;
  }

  @Override
  public void onStart(@Nullable Bundle savedInstanceState) {
  }

  @Override
  public void onResume() {
  }

  @Override
  public void onPause() {
  }

  @Override
  public void onSaveInstanceState(Bundle outState) {
  }

  @Override
  public void onEnd() {
  }
}
