package org.accensportz;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class VitalBusinessfunctions {
	WebDriver driver;

  @Test (priority=0)
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/div/div/div[2]/ul/li[3]/a")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("/html/body/app-root/app-main/app-tickets/div/section/div/table/tr[2]/td[7]/button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("name")).sendKeys("Santhosh");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"next1\"]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.name("phonenumber")).sendKeys("99685643630");
	  Thread.sleep(1000);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://lkmdemoaut.accenture.com/AccenSportz/#/webelements/form");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}

