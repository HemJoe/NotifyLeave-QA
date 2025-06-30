package com.dominos.dominos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://pizzaonline.dominos.co.in/jfl-discovery-ui/en/web/home/66053?&src=sem_bing_brand&utm_source=bing&utm_medium=cpc&https://pizzaonline.dominos.co.in/=undefined&v=480751446");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[normalize-space()='SignIn']")).click();
//		
//		driver.findElement(By.id("userName")).sendKeys("userName");
//		driver.findElement(By.id("password")).sendKeys("password");
//		
//		driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

}