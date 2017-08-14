package com.youtwo.daggerstruct.navigation;

import android.content.Context;
import android.content.Intent;
import com.youtwo.daggerstruct.mvp.example_1.Example1Activity;
import com.youtwo.daggerstruct.mvp.example_2.Example2Activity;
import com.youtwo.daggerstruct.mvp.example_3.Example3Activity;
import com.youtwo.daggerstruct.mvp.example_4.Example4Activity;
import com.youtwo.daggerstruct.mvp.example_5.Example5Activity;
import com.youtwo.daggerstruct.mvp.example_6.Example6Activity;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Bill on 2017/8/11.
 */
@Singleton
public final class Navigator {

  @Inject
  Navigator() {
  }

  public void toExample1(Context context) {
    Intent intent = new Intent(context, Example1Activity.class);
    context.startActivity(intent);
  }

  public void toExample2(Context context) {
    Intent intent = new Intent(context, Example2Activity.class);
    context.startActivity(intent);
  }

  public void toExample3(Context context) {
    Intent intent = new Intent(context, Example3Activity.class);
    context.startActivity(intent);
  }

  public void toExample4(Context context) {
    Intent intent = new Intent(context, Example4Activity.class);
    context.startActivity(intent);
  }

  public void toExample5(Context context) {
    Intent intent = new Intent(context, Example5Activity.class);
    context.startActivity(intent);
  }

  public void toExample6(Context context) {
    Intent intent = new Intent(context, Example6Activity.class);
    context.startActivity(intent);
  }
}
