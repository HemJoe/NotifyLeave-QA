package org.accensportz;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void somkeGroup() {
	  System.out.println("Inside test create your team method");
	  System.out.println("Inside test registration method");
	  
  }
  @Test(enabled=false)
  public void sanityGroup() {
	  System.out.println("Inside test player selection method");
	  System.out.println("Inside test book tickets method");
}
}