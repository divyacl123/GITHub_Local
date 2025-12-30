package testScript_Module;


import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class DemoTest extends BaseClass {

	@Test
	public void demo_m1() {
		System.out.println("---demo m1---");
	}
	
	@Test(groups = "smoke")
	public void demo_m2() {
		System.out.println("---demo m2---");
	}
	
}
