package com.youtwo.daggerstruct.util;

import android.app.Application;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Bill on 2017/8/11.
 */
@Singleton
public final class SingletonUtil {

  private final Application application;

  @Inject
  public SingletonUtil(Application application) {
    this.application = application;
  }

  public String doSomething() {
    return "SingletonUtil: " + hashCode() + ", Application: " + application.hashCode();
  }
}
