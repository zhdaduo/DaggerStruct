package com.youtwo.daggerstruct.mvp.example_3;

import android.os.Bundle;
import com.youtwo.daggerstruct.R;
import com.youtwo.daggerstruct.common.BaseActivity;
import com.youtwo.daggerstruct.mvp.example_3.view.Example3Fragment;

public final class Example3Activity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_example3);
    if (savedInstanceState == null) {
      addFragment(R.id.fragment_container, new Example3Fragment());
    }
  }
}
