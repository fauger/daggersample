package daggersample.fauger.com.daggersample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {

    @Provides
    @Singleton
    public Service getService() {
        return new Service();
    }

}
