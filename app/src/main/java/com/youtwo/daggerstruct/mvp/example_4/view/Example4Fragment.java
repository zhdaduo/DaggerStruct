package com.youtwo.daggerstruct.mvp.example_4.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.youtwo.daggerstruct.R;
import com.youtwo.daggerstruct.common.view.BaseViewFragment;
import com.youtwo.daggerstruct.mvp.example_4.presenter.Example4FragmentPresenter;

/**
 * Created by Bill on 2017/8/12.
 */

public final class Example4Fragment extends BaseViewFragment<Example4FragmentPresenter> implements Example4FragmentView {

  @BindView(R.id.some_text)
  TextView someText;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.example4_fragment, container, false);
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
