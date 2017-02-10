package daggersample.fauger.com.daggersample;


import javax.inject.Singleton;

@Singleton
@dagger.Component(modules = {ServiceModule.class})
public interface ComponentInjector {

    Service getService();
    void inject(MainActivity activity);
}
