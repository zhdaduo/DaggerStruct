package com.youtwo.daggerstruct.mvp.example_2.presenter;

import com.youtwo.daggerstruct.common.presenter.BasePresenter;
import com.youtwo.daggerstruct.di.PerActivity;
import com.youtwo.daggerstruct.mvp.example_2.view.Example2ActivityView;
import com.youtwo.daggerstruct.util.PerActivityUtil;
import com.youtwo.daggerstruct.util.SingletonUtil;
import javax.inject.Inject;

/**
 * Created by Bill on 2017/8/12.
 */
@PerActivity
final class Example2ActivityPresenterImpl extends BasePresenter<Example2ActivityView> implements Example2ActivityPresenter {

  private final SingletonUtil singletonUtil;
  private final PerActivityUtil perActivityUtil;

  @Inject
  Example2ActivityPresenterImpl(Example2ActivityView view, SingletonUtil singletonUtil,
      PerActivityUtil perActivityUtil) {
    super(view);
    this.singletonUtil = singletonUtil;
    this.perActivityUtil = perActivityUtil;
  }

  @Override
  public void onDoSomething() {
    String something = singletonUtil.doSomething();
    something += "\n" + perActivityUtil.doSomething();
    view.showSomething(something);
  }
}
