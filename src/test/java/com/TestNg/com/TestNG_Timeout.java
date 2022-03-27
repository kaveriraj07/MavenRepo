package com.TestNg.com;

import org.testng.annotations.Test;

public class TestNG_Timeout {
	
	@Test
	public void aMethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("A method");

	}
	@Test
private void bMethod() {
	System.out.println("B method");

}
}
