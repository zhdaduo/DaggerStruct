package com.youtwo.daggerstruct.mvp.example_2;

import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.youtwo.daggerstruct.R;
import com.youtwo.daggerstruct.common.BaseViewActivity;
import com.youtwo.daggerstruct.mvp.example_2.presenter.Example2ActivityPresenter;
import com.youtwo.daggerstruct.mvp.example_2.view.Example2ActivityView;

public final class Example2Activity extends BaseViewActivity<Example2ActivityPresenter> implements
    Example2ActivityView {

  @BindView(R.id.some_text)
  TextView someText;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_example2);
    viewUnbinder = ButterKnife.bind(this);
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
