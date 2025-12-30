package testScript_Module;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class SampleTest extends BaseClass{
	
	@Test(groups = "smoke")
	public void sample_m1() {
		System.out.println("---sample m1---");
	}
	
	@Test(groups = "regression")
	public void sample_m2() {
		System.out.println("---sample m2---");
	}
	
	@Test
	public void impact() {
		System.out.println("----regional impacted areas od sample----");
	}

}
