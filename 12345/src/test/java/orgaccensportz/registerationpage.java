package orgaccensportz;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class registerationpage {
	WebDriver driver;
  @Test
  public void f() {
	  String parentid=driver.getWindowHandle();
	  System.out.println("hii");
	  System.out.println(parentid);
	  driver.findElement(By.id("firstname")).sendKeys("loki");
	  driver.findElement(By.id("mat-input-1")).sendKeys("r");
	  driver.findElement(By.id("Date")).sendKeys("12/12/2003");
	  driver.findElement(By.id("phonenumber")).sendKeys("1234567890");
	  driver.findElement(By.id("mat-input-4")).sendKeys("loki@gmail.com");
	  driver.findElement(By.id("mat-radio-2-input")).click();
	  driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span")).click();
	  driver.findElement(By.id("one")).click();
	  WebElement a1=driver.findElement(By.xpath("/html/body/app-root/app-main/app-form/div/form/mat-slider/input"));
	  Actions e1= new Actions(driver);
	  e1.dragAndDropBy(a1, 50, 0).build().perform();
	  driver.findElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span")).click();
	  driver.findElement(By.id("mat-option-6")).click();
	  driver.findElement(By.xpath("/html/body/app-root/app-main/app-form/div/form/input")).sendKeys("C:\\Users\\logesh.ravichandran\\Pictures\\Screenshots");
	  driver.findElement(By.id("mat-input-5")).sendKeys("chennai");
	  driver.findElement(By.id("mat-input-6")).sendKeys("600056");
	  WebElement w2 =driver.findElement(By.xpath("//*[@id=\"mat-mdc-checkbox-1-input\"]"));
	  Actions a2 =new Actions(driver);
	  a2.moveToElement(w2).doubleClick().build().perform();
	  driver.findElement(By.xpath("/html/body/app-root/app-main/app-form/div/form/button")).click();	  
	  
  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://lkmdemoaut.accenture.com/AccenSportz/#/webelements/form");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}
