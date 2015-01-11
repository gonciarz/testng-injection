package test.guice.singleton;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;

public class SingletonModule implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bind(BaseSingleton.class).to(SingletonImpl.class).in(Singleton.class);
    }

}
