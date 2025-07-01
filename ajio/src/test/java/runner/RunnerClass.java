package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\Desktop\\dominos\\src\\test\\dominos.feature",
glue = "", dryRun = false)
public class RunnerClass {

    public static WebDriver driver;
    @BeforeClass
    public static void chrome(){
        driver = new ChromeDriver();
    }

}
