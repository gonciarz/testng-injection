package test.guice.singleton;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import test.annotations.Dependencies;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guice(modules = SingletonModule.class)
public class BaseTest {

    @BeforeClass
    public void setUp() {
        if (getClass().isAnnotationPresent(Dependencies.class)) {
            Dependencies dependencies = getClass().getAnnotation(Dependencies.class);
            checkBotsAreRunning(dependencies.bots());
        }
    }

    @BeforeMethod
    public void before(Method method) {
        if (method.isAnnotationPresent(Dependencies.class)) {
            Dependencies dependencies = method.getAnnotation(Dependencies.class);
            checkBotsAreRunning(dependencies.bots());
        }
    }

    private void checkBotsAreRunning(Dependencies.Bot[] bots) {
        Set<Dependencies.Bot> setBots = new HashSet<Dependencies.Bot>(Arrays.asList(bots));
        System.out.println("Checking: " + StringUtils.join(setBots, ", "));
    }

}
