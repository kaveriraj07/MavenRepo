package com.TestNg.com;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNg_Ignore {
	
	@Test
	@Ignore
	public void aMethod() {
		System.out.println("A method");
	}
@Test(enabled=false)
		public void bMethod() {
			System.out.println("B method");

		}
@Test
public void cMethod() {
	System.out.println("c method");

}
@Test
public void dMethod() {
	System.out.println("D method");

}
}
