package org.assert1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	@Test
	public void ts1() {
	System.out.println("1");

	}
	@Test
	private void ts2() {
	System.out.println("2");
	SoftAssert sa=new SoftAssert();
	sa.assertTrue(false);
	
	System.out.println("3");
	sa.assertAll();
	System.out.println("4");

	}
}
