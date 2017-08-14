package com.youtwo.daggerstruct.common.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Bill on 2017/8/11.
 */

public interface Presenter {
  void onStart(@Nullable Bundle savedInstanceState);
  void onResume();
  void onPause();
  void onSaveInstanceState(Bundle outState);
  void onEnd();
}
