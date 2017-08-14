package com.youtwo.daggerstruct.mvp.example_6.child_fragment.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.youtwo.daggerstruct.R;
import com.youtwo.daggerstruct.common.view.BaseViewFragment;
import com.youtwo.daggerstruct.mvp.example_6.child_fragment.presenter.Example6ChildFragmentPresenter;

/**
 * Created by Bill on 2017/8/12.
 */

public final class Example6ChildFragment extends BaseViewFragment<Example6ChildFragmentPresenter> implements Example6ChildFragmentView {

  @BindView(R.id.some_text)
  TextView someText;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.example_6_child_fragment, container, false);
  }

  @Override
  public void showSomething(String something) {
    childFragmentManager.hashCode();
    someText.setText(something);
  }

  @OnClick(R.id.do_something)
  void onDoSomethingClicked() {
    presenter.onDoSomething();
  }
}
