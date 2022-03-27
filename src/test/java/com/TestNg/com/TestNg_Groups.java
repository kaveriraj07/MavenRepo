package com.TestNg.com;

import org.testng.annotations.Test;

public class TestNg_Groups {
	
	
	@Test(groups = "smoketest1")
	public void aMethod() {
		System.out.println("A method");

	}
	
	@Test(groups = "smoketest2")
	public void bMethod() {
		System.out.println("B method");

	}
@Test(groups = {"smoketest1","smoketest2"})
	public void cMethod() {
		System.out.println("C method");

	}
	@Test(groups = "smoketest1")
	public void dMethod() {
		System.out.println("D method");

	}
}

