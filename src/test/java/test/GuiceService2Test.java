package test;

import com.google.inject.Inject;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import test.annotations.Dependencies;
import test.guice.service.BaseModule;
import test.guice.service.Service;
import test.guice.service.Session;

import static test.annotations.Dependencies.Bot.abot;
import static test.annotations.Dependencies.Bot.ebot;

@Dependencies(bots = {abot, ebot})
@Guice(modules = BaseModule.class)
public class GuiceService2Test {

    @Inject
    Session mySession;

    @Inject
    Service myService;

    @Test
    public void testService() {
        Assert.assertNotNull(myService);
        Assert.assertNotNull(mySession);
        myService.serve(mySession);
    }

}
