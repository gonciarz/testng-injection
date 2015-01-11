package test;

import org.testng.annotations.Test;

public class VariousTest {

	@Test(timeOut = 2000)
	public void testThisShouldPass() throws InterruptedException {
		Thread.sleep(1000);
	}

	@Test(timeOut = 1000, enabled=false)
	public void testThisShouldFail() {
		while (true);
	}

	@Test
	public void method1() {
		System.out.println("This is method 1");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = { "method1" })
	public void method2() {
		System.out.println("This is method 2");
	}


}