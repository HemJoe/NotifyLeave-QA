package org.accensportz;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class priority {
  @Test(priority=0)
  public void f1() {
	  System.out.println("Inside test create your team method");
  }
  @Test(priority=1)
  public void f2() {
	  System.out.println("Inside test registration method");
  }
  @Test(priority=2)
  public void f3() {
	  System.out.println("Inside test player selection method");
  }
  @Test(priority=3)
  public void f4() {  
	  System.out.println("Inside test book tickets method");

  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
