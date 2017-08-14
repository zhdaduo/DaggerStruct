package com.youtwo.daggerstruct.common;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import com.youtwo.daggerstruct.di.PerActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

/**
 * Created by Bill on 2017/8/11.
 */
@Module
public abstract class BaseActivityModule {

  static final String ACTIVITY_FRAGMENT_MANAGER = "BaseActivityModule.activityFragmentManager";

  @Binds
  @PerActivity
  abstract Context activityContext(Activity activity);

  @Provides
  @Named(ACTIVITY_FRAGMENT_MANAGER)
  @PerActivity
  static FragmentManager activityFragmentManager(Activity activity) {
    return activity.getFragmentManager();
  }
}
