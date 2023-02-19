package Utils;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Runner.TestRunner;

public class Common {
	
	WebDriver driver;
   	static Properties config;
	
	public void setDriver() {
		driver = TestRunner.getDriver();
		config = TestRunner.getConfig();
	}
	
	public void gotoPath(String path) {
		driver.navigate().to(path);
	}
	
	public void setFieldByXpath(String txt,String msg) {
		driver.findElement(By.xpath(txt)).sendKeys(msg);
	}
	
	public void clickElementByXpath(String txt) {
		driver.findElement(By.xpath(txt)).click();
	}
	
	public void closeDriver() {
		driver.quit();
	}
	
	public void waitFortheElement(String path) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(10))
	            .pollingEvery(Duration.ofSeconds(1))
	            .ignoring(NoSuchElementException.class);
		WebElement myElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
		myElement.click();
	}
	
    public static String getProperty(String txt) {
    	return config.getProperty(txt);
    }

}
