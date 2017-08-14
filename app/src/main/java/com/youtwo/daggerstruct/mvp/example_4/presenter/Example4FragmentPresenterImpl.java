package com.youtwo.daggerstruct.mvp.example_4.presenter;

import com.youtwo.daggerstruct.common.presenter.BasePresenter;
import com.youtwo.daggerstruct.di.PerFragment;
import com.youtwo.daggerstruct.mvp.example_4.view.Example4FragmentView;
import com.youtwo.daggerstruct.util.PerActivityUtil;
import com.youtwo.daggerstruct.util.PerFragmentUtil;
import com.youtwo.daggerstruct.util.SingletonUtil;
import javax.inject.Inject;

/**
 * Created by Bill on 2017/8/12.
 */
@PerFragment
final class Example4FragmentPresenterImpl extends BasePresenter<Example4FragmentView> implements Example4FragmentPresenter {

  private final SingletonUtil singletonUtil;
  private final PerActivityUtil perActivityUtil;
  private final PerFragmentUtil perFragmentUtil;

  @Inject
  Example4FragmentPresenterImpl(Example4FragmentView view, SingletonUtil singletonUtil,
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
