package com.youtwo.daggerstruct.mvp.example_5.fragment_a.presenter;

import com.youtwo.daggerstruct.common.presenter.BasePresenter;
import com.youtwo.daggerstruct.di.PerFragment;
import com.youtwo.daggerstruct.mvp.example_5.fragment_a.view.Example5AFragmentView;
import com.youtwo.daggerstruct.util.PerActivityUtil;
import com.youtwo.daggerstruct.util.PerFragmentUtil;
import com.youtwo.daggerstruct.util.SingletonUtil;
import javax.inject.Inject;

/**
 * Created by Bill on 2017/8/12.
 */
@PerFragment
final class Example5AFragmentPresenterImpl extends BasePresenter<Example5AFragmentView> implements Example5AFragmentPresenter {

  private final SingletonUtil singletonUtil;
  private final PerActivityUtil perActivityUtil;
  private final PerFragmentUtil perFragmentUtil;

  @Inject
  Example5AFragmentPresenterImpl(Example5AFragmentView view, SingletonUtil singletonUtil,
      PerActivityUtil perActivityUtil, PerFragmentUtil perFragmentUtil) {
    super(view);
    this.singletonUtil = singletonUtil;
    this.perActivityUtil = perActivityUtil;
    this.perFragmentUtil = perFragmentUtil;
  }

  @Override
  public void onDoSomething() {
    String something = singletonUtil.doSomething();
    something += "\n" + perActivityUtil.doSomething();
    something += "\n" + perFragmentUtil.doSomething();
    view.showSomething(something);
  }
}
