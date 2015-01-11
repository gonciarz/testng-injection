package test.guice.singleton;

public class SingletonImpl implements BaseSingleton {

    @Override
    public void doSomething() {
        System.out.println("Doing something");
    }

}
