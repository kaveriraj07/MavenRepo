package com.TestNg.com;

import org.testng.annotations.Test;

public class TestNG_Dependency {
	
	@Test(dependsOnGroups = "dMethod")
	public void aMethod() {
		System.out.println("A method");

	}
	@Test
public void bMethod() {
	System.out.println("B method");

}
	@Test(dependsOnGroups = "aMethod")
public void cMethod() {
	System.out.println("C method");
	

}
public void dMethod() {
	System.out.println("D method");

}
}
