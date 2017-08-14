package com.youtwo.daggerstruct.util;

import android.app.Activity;
import com.youtwo.daggerstruct.di.PerActivity;
import javax.inject.Inject;

/**
 * Created by Bill on 2017/8/11.
 */
@PerActivity
public final class PerActivityUtil {

  private final Activity activity;

  @Inject
  public PerActivityUtil(Activity activity) {
    this.activity = activity;
  }

  public String doSomething() {
    return "PerActivityUtil: " + hashCode() + ", Activity: " + activity.hashCode();
  }
}
