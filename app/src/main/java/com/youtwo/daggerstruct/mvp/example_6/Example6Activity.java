package com.youtwo.daggerstruct.mvp.example_6;

import android.os.Bundle;
import com.youtwo.daggerstruct.R;
import com.youtwo.daggerstruct.common.BaseActivity;
import com.youtwo.daggerstruct.mvp.example_6.parent_fragment.view.Example6ParentFragment;

public final class Example6Activity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_example6);
    if (savedInstanceState == null) {
      addFragment(R.id.parent_fragment_container, new Example6ParentFragment());
    }
  }
}
