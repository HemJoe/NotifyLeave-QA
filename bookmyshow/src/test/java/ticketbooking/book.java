package ticketbooking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class book {
	WebDriver driver;

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//IMG[@alt='CHEN']")).click();
		driver.findElement(By.id("1")).click();
		driver.findElement(By.xpath("//input")).sendKeys("goat");
//		sendKeys("goat");
		
		
	}

}
