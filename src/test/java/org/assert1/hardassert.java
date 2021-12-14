package org.assert1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
@Test
public void ts1() {
System.out.println("1");

}
@Test
private void ts2() {
System.out.println("2");
Assert.assertTrue(false);
System.out.println("3");


}
}
