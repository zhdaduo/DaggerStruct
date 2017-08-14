package com.youtwo.daggerstruct.mvp.main;

import android.os.Bundle;
import com.youtwo.daggerstruct.R;
import com.youtwo.daggerstruct.common.BaseActivity;
import com.youtwo.daggerstruct.mvp.main.view.MainFragment;
import com.youtwo.daggerstruct.mvp.main.view.MainFragmentListener;

public final class MainActivity extends BaseActivity implements MainFragmentListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
      addFragment(R.id.fragment_container, new MainFragment());
    }
  }

  @Override
  public void onExample1Clicked() {
    navigator.toExample1(this);
  }

  @Override
  public void onExample2Clicked() {
    navigator.toExample2(this);
  }

  @Override
  public void onExample3Clicked() {
    navigator.toExample3(this);
  }

  @Override
  public void onExample4Clicked() {
    navigator.toExample4(this);
  }

  @Override
  public void onExample5Clicked() {
    navigator.toExample5(this);
  }

  @Override
  public void onExample6Clicked() {
    navigator.toExample6(this);
  }
}
