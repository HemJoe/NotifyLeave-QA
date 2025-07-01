package Baseclass;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class BaseClass {
	public static Actions actions;
    public static WebDriver driver;



    public static void url(WebDriver driver, String url) {
        driver.get(url);
    }

    public static void maximize(WebDriver driverstep) {
        driverstep.manage().window().maximize();
    }

    public static void minimize() {
        driver.manage().window().minimize();
    }

    public static void quit() {
        driver.quit();
    }

    public static void close() {
        driver.close();
    }

    public static void back() {
        driver.navigate().back();
    }

    public static void forward() {
        driver.navigate().forward();
    }

    public static void click(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void sendKeys(WebElement element, String inputValues) {
        element.sendKeys(inputValues);
    }

    public static void alertdismiss(){
        driver.switchTo().alert().dismiss();
    }
    public static void alertaccept(){
        driver.switchTo().alert().accept();
    }

//    public static void takeScreenshot(String location) throws IOException {
//        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File destination = new File(location);
//        FileUtils.copyFile(source, destination);
//    }

    public static void refresh() {
        driver.navigate().refresh();
    }

    public static void doubleClick(String id) {
        WebElement elementLocator = driver.findElement(By.id(id));
        actions.doubleClick(elementLocator).perform();
    }

    public static void switchToFrame(String iframe) {
        driver.switchTo().frame(iframe);
    }

    public static void scrollIntoView(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void jsClick(WebElement element) {
        JavascriptExecutor js= (JavascriptExecutor)driver;

        js.executeScript("arguments[0].click();", element);
    }

    public static void windowhandles(WebDriver driver){
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

}
