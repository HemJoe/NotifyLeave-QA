package amazonProduct;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ProductOne {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		// Launch the amazon web page
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// search the product (Sony PlayStation5 )
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("Sony PlayStation5 Gaming Console (Slim)");
		driver.findElement(By.id("nav-search-submit-text")).click();
		
		// handle windows (second web page)
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(handles);
		
		
		WebElement element = driver.findElement(By.id("targetElement"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the element
        js.executeScript("arguments[0].scrollIntoView(true);", element);
//		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(1000);
//		driver.quit();
		
		
	}

}
