package com.youtwo.daggerstruct.mvp.example_6.parent_fragment.view;

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
import com.youtwo.daggerstruct.mvp.example_6.child_fragment.view.Example6ChildFragment;
import com.youtwo.daggerstruct.mvp.example_6.parent_fragment.presenter.Example6ParentFragmentPresenter;

/**
 * Created by Bill on 2017/8/12.
 */

public final class Example6ParentFragment extends BaseViewFragment<Example6ParentFragmentPresenter> implements Example6ParentFragmentView {


  @BindView(R.id.some_text)
  TextView someText;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.example_6_parent_fragment, container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    if (savedInstanceState == null) {
      addChildFragment(R.id.child_fragment_container, new Example6ChildFragment());
    }
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
