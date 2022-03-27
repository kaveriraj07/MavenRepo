package com.Testng.com;

import com.google.common.annotations.VisibleForTesting;

public class TestNG_Simple_Annotations {
	
	@VisibleForTesting
	public void setup() {
		System.out.println("Setting Browser");

	}
 public void browserLaunch() {
	System.out.println("LaunchBrowser");

}
}
