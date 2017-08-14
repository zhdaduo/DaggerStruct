package com.youtwo.daggerstruct.mvp.example_6.child_fragment.presenter;

import com.youtwo.daggerstruct.common.presenter.BasePresenter;
import com.youtwo.daggerstruct.di.PerChildFragment;
import com.youtwo.daggerstruct.mvp.example_6.child_fragment.view.Example6ChildFragmentView;
import com.youtwo.daggerstruct.util.PerActivityUtil;
import com.youtwo.daggerstruct.util.PerChildFragmentUtil;
import com.youtwo.daggerstruct.util.PerFragmentUtil;
import com.youtwo.daggerstruct.util.SingletonUtil;
import javax.inject.Inject;

/**
 * Created by Bill on 2017/8/12.
 */
@PerChildFragment
final class Example6ChildFragmentPresenterImpl extends BasePresenter<Example6ChildFragmentView> implements Example6ChildFragmentPresenter {

  private final SingletonUtil singletonUtil;
  private final PerActivityUtil perActivityUtil;
  private final PerFragmentUtil perFragmentUtil;
  private final PerChildFragmentUtil perChildFragmentUtil;

  @Inject
  Example6ChildFragmentPresenterImpl(Example6ChildFragmentView view, SingletonUtil singletonUtil,
      PerActivityUtil perActivityUtil, PerFragmentUtil perFragmentUtil,
      PerChildFragmentUtil perChildFragmentUtil) {
    super(view);
    this.singletonUtil = singletonUtil;
    this.perActivityUtil = perActivityUtil;
    this.perFragmentUtil = perFragmentUtil;
    this.perChildFragmentUtil = perChildFragmentUtil;
  }

  @Override
  public void onDoSomething() {
    String something = singletonUtil.doSomething();
    something += "\n" + perActivityUtil.doSomething();
    something += "\n" + perFragmentUtil.doSomething();
    something += "\n" + perChildFragmentUtil.doSomething();
    view.showSomething(something);
  }
}
