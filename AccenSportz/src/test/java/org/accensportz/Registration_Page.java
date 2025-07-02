package org.accensportz;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration_Page {
	WebDriver driver;
  @Test(priority=0)
  public void f() throws InterruptedException {
	  

	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/div/div/div[2]/ul/li[1]/a")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("firstname")).sendKeys("Virat");
	  Thread.sleep(1000);
	  driver.findElement(By.id("mat-input-1")).sendKeys("Kohli");
	  Thread.sleep(1000);
	  driver.findElement(By.id("Date")).sendKeys("05/11/1988");
	  Thread.sleep(1000);
	  driver.findElement(By.id("phonenumber")).sendKeys("9785476982");
	  Thread.sleep(1000);
	  driver.findElement(By.name("email")).sendKeys("viratkohli@email.com");
	  Thread.sleep(1000);
	  driver.findElement(By.id("mat-radio-2-input")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span")).click();
	  driver.findElement(By.id("one")).click();
	  Thread.sleep(1000);
	  WebElement drag = driver.findElement(By.xpath("/html/body/app-root/app-main/app-form/div/form/mat-slider/mat-slider-visual-thumb"));
	  Actions drop = new Actions(driver);
	  drop.dragAndDropBy(drag, 50, 0).perform();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span")).click();
	  driver.findElement(By.id("mat-option-4")).click();
	  Thread.sleep(1000);
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.TAB).perform();
	  Thread.sleep(1000);
	  WebElement file = driver.findElement(By.xpath("/html/body/app-root/app-main/app-form/div/form/input"));
	  file.sendKeys("C:\\Users\\santhosh.d.ganesan\\Pictures\\Screenshots");
	  Thread.sleep(1000);
	  driver.findElement(By.id("mat-input-5")).sendKeys("address");
	  Thread.sleep(1000);
	  driver.findElement(By.id("mat-input-6")).sendKeys("123456");
	  Thread.sleep(1000);
	  driver.findElement(By.id("mat-mdc-checkbox-1-input")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.name("submitbutton")).click();
	  
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://lkmdemoaut.accenture.com/AccenSportz/#/webelements/form");
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}
