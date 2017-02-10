package daggersample.fauger.com.daggersample;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    ComponentInjector mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = DaggerComponentInjector.builder().build();


    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    public ComponentInjector getComponent() {
        return mComponent;
    }
}
