package org.accensportz;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucu_demo {

	WebDriver driver;

		@Given("To open the website")
		public void to_open_the_website() {
		   driver = new EdgeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://lkmdemoaut.accenture.com/AccenSportz/#/webelements/form");
		}

		@When("To enter the credentials")
		public void to_enter_the_credentials() throws InterruptedException {
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
			
		}

		@And("To click the Login button")
		public void to_click_the_login_button() {
			 driver.findElement(By.name("submitbutton")).click();
		}

		@Then("Successfully logged in")
		public void successfully_logged_in() {
			
			
		  WebElement Test=driver.findElement(By.id("okbutton"));
		  Assert.assertTrue(Test.isDisplayed());
		  System.out.println(Test.getText());
		   
		}
		
		
	

}
