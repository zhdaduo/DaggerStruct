package com.youtwo.daggerstruct.mvp.example_4;

import android.os.Bundle;
import com.youtwo.daggerstruct.R;
import com.youtwo.daggerstruct.common.BaseActivity;
import com.youtwo.daggerstruct.mvp.example_4.view.Example4Fragment;

public final class Example4Activity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_example4);
    if (savedInstanceState == null) {
      addFragment(R.id.fragment_container, new Example4Fragment());
    }
  }
}
