package parabankregister;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class registration {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new EdgeDriver();
		
		// Launch the parabank web page
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
		// Navigate to the registration page
        WebElement registerLink = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a"));
        if (registerLink.isDisplayed()) {
            registerLink.click();
        } else {
            System.out.println("Register not found");
            System.out.println("hello");
        }
        
        
		driver.findElement(By.id("customer.firstName")).sendKeys("Santhosh");
		driver.findElement(By.id("customer.lastName")).sendKeys("P N");
		driver.findElement(By.id("customer.address.street")).sendKeys("VALLUVAR SALAI,RAMAPURAM");
		driver.findElement(By.id("customer.address.city")).sendKeys("CHENNAI");
		driver.findElement(By.id("customer.address.state")).sendKeys("TAMIL NADU");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("600089");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("91638312");
		driver.findElement(By.id("customer.ssn")).sendKeys("91");
		
		driver.findElement(By.id("customer.username")).sendKeys("Santhosh");
	
		driver.findElement(By.id("customer.password")).sendKeys("santhosh");
		
		driver.findElement(By.id("repeatedPassword")).sendKeys("santhosh");
		Thread.sleep(2000);
	

		
		// Click the register button
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"));
        if (registerButton.isDisplayed()) {
            registerButton.click();
        } else {
            System.out.println("Register button not found!");
        }
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Santhosh");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("santhosh");
		
		//click login button 
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        if (loginButton.isDisplayed()) {
            loginButton.click();
        } else {
            System.out.println("Login button not found!");
        }
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File a= scrShot.getScreenshotAs(OutputType.FILE);
        File b= new File("./screenshot/img.png");
        FileHandler.copy(a, b);
        
        
       
	}


}
