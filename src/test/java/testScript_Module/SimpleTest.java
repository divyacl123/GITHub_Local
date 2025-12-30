package testScript_Module;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class SimpleTest /*extends BaseClass*/ {
	
	@Test
	public void simple_m1() {
		System.out.println("---simple m1---");
	}

	@Test(groups = "regression")
	public void simple_m2() {
		System.out.println("---simple m2---");
	}
	
	@Test
	public void impact() {
		System.out.println("----regional impacted areas of simple----");
	}
}
