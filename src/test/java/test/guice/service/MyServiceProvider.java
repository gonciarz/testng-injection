package test.guice.service;

import com.google.inject.Provider;

public class MyServiceProvider implements Provider<Service> {

    @Override
    public Service get() {
        return new Service() {

            @Override
            public void serve(Session mySession) {
                System.out.println("Serving session with token('" + mySession.getToken() + "')...");
            }

        };
    }
}
