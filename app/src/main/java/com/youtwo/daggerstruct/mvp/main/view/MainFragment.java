package com.youtwo.daggerstruct.mvp.main.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.OnClick;
import com.youtwo.daggerstruct.R;
import com.youtwo.daggerstruct.common.view.BaseFragment;
import javax.inject.Inject;

/**
 * Created by Bill on 2017/8/11.
 */

public final class MainFragment extends BaseFragment {

  @Inject
  MainFragmentListener listener;

  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.main_fragment, container, false);
  }

  @OnClick(R.id.example_1)
  void onExample1Clicked() {
    listener.onExample1Clicked();
  }

  @OnClick(R.id.example_2)
  void onExample2Clicked() {
    listener.onExample2Clicked();
  }

  @OnClick(R.id.example_3)
  void onExample3Clicked() {
    listener.onExample3Clicked();
  }

  @OnClick(R.id.example_4)
  void onExample4Clicked() {
    listener.onExample4Clicked();
  }

  @OnClick(R.id.example_5)
  void onExample5Clicked() {
    listener.onExample5Clicked();
  }

  @OnClick(R.id.example_6)
  void onExample6Clicked() {
    listener.onExample6Clicked();
  }
}
