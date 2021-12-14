package org.deepan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Reruncls2 {
@Test
private void test() {
System.out.println("method 0");
}
	@Test
	private void test2() {
System.out.println("method 2");
	}
	
	@Test
	private void test3() {
		Assert.assertTrue(false);
System.out.println("method 3");
	}
	
}
