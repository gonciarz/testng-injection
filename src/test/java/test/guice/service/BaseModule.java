package test.guice.service;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class BaseModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Service.class).toProvider(MyServiceProvider.class);
        bind(Session.class).to(MySessionImpl.class).in(Singleton.class);
    }
}
