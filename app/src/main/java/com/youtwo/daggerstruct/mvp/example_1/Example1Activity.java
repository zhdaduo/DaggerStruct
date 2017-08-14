package com.youtwo.daggerstruct.mvp.example_1;

import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.youtwo.daggerstruct.R;
import com.youtwo.daggerstruct.common.BaseActivity;
import com.youtwo.daggerstruct.util.PerActivityUtil;
import com.youtwo.daggerstruct.util.SingletonUtil;
import javax.inject.Inject;

public final class Example1Activity extends BaseActivity {

  @BindView(R.id.some_text)
  TextView someText;

  @Inject
  SingletonUtil singletonUtil;
  @Inject
  PerActivityUtil perActivityUtil;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_example1);
    viewUnbinder = ButterKnife.bind(this);
  }

  @OnClick(R.id.do_something)
  void onDoSomethingClicked() {
    String something = singletonUtil.doSomething();
    something += "\n" + perActivityUtil.doSomething();
    someText.setText(something);
  }
}
