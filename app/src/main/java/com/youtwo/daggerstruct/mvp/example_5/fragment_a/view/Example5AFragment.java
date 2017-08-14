package com.youtwo.daggerstruct.mvp.example_5.fragment_a.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.youtwo.daggerstruct.R;
import com.youtwo.daggerstruct.common.view.BaseViewFragment;
import com.youtwo.daggerstruct.mvp.example_5.fragment_a.presenter.Example5AFragmentPresenter;

/**
 * Created by Bill on 2017/8/12.
 */

public final class Example5AFragment extends BaseViewFragment<Example5AFragmentPresenter> implements Example5AFragmentView {

  @BindView(R.id.some_text)
  TextView someText;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.example5a, container, false);
  }

  @Override
  public void showSomething(String something) {
    someText.setText(something);
  }

  @OnClick(R.id.do_something)
  void onDoSomethingClicked() {
    presenter.onDoSomething();
  }
}
