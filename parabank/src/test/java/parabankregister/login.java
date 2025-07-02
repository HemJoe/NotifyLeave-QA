package parabankregister;






import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class login {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Santhosh");
	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("santhosh");
	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
}

}
