package com.youtwo.daggerstruct.mvp.example_5.fragment_b.presenter;

import com.youtwo.daggerstruct.common.presenter.BasePresenter;
import com.youtwo.daggerstruct.di.PerFragment;
import com.youtwo.daggerstruct.mvp.example_5.fragment_b.view.Example5BFragmentView;
import com.youtwo.daggerstruct.util.PerActivityUtil;
import com.youtwo.daggerstruct.util.PerFragmentUtil;
import com.youtwo.daggerstruct.util.SingletonUtil;
import javax.inject.Inject;

/**
 * Created by Bill on 2017/8/12.
 */
@PerFragment
final class Example5BFragmentPresenterImpl extends BasePresenter<Example5BFragmentView> implements Example5BFragmentPresenter {

  private final SingletonUtil singletonUtil;
  private final PerActivityUtil perActivityUtil;
  private final PerFragmentUtil perFragmentUtil;

  @Inject
  Example5BFragmentPresenterImpl(Example5BFragmentView view, SingletonUtil singletonUtil,
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
