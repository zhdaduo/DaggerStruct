package com.youtwo.daggerstruct.mvp.example_5;

import android.os.Bundle;
import com.youtwo.daggerstruct.R;
import com.youtwo.daggerstruct.common.BaseActivity;
import com.youtwo.daggerstruct.mvp.example_5.fragment_a.view.Example5AFragment;
import com.youtwo.daggerstruct.mvp.example_5.fragment_b.view.Example5BFragment;

public final class Example5Activity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_example5);
    if (savedInstanceState == null) {
      addFragment(R.id.fragment_a_container, new Example5AFragment());
      addFragment(R.id.fragment_b_container, new Example5BFragment());
    }
  }
}
