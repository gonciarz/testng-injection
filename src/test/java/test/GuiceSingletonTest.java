package test;

import com.google.inject.Inject;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.annotations.Dependencies;
import test.guice.singleton.BaseSingleton;
import test.guice.singleton.BaseTest;

import static test.annotations.Dependencies.Bot.*;

@Dependencies(bots = {abot, ebot})
public class GuiceSingletonTest extends BaseTest {

    @Inject
    BaseSingleton singleton;

    @Dependencies(bots = {mbot})
    @Test
    public void singletonShouldWork() {
        Assert.assertNotNull(singleton);
        singleton.doSomething();
    }
}
