package com.youtwo.daggerstruct.mvp.example_3.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.youtwo.daggerstruct.R;
import com.youtwo.daggerstruct.common.view.BaseFragment;
import com.youtwo.daggerstruct.util.PerActivityUtil;
import com.youtwo.daggerstruct.util.PerFragmentUtil;
import com.youtwo.daggerstruct.util.SingletonUtil;
import javax.inject.Inject;

/**
 * Created by Bill on 2017/8/12.
 */

public final class Example3Fragment extends BaseFragment {

  @BindView(R.id.some_text)
  TextView someText;

  @Inject
  SingletonUtil singletonUtil;
  @Inject
  PerActivityUtil perActivityUtil;
  @Inject
  PerFragmentUtil perFragmentUtil;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.example3_fragment, container, false);
  }

  @OnClick(R.id.do_something)
  void onDoSomethingClicked() {
    String something = singletonUtil.doSomething();
    something += "\n" + perActivityUtil.doSomething();
    something += "\n" + perFragmentUtil.doSomething();
    someText.setText(something);
  }
}
