package web_Common_Functions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebWait {
	/*
	 *  Useful locators finding page
	 */
	
	public static WebElement searchElement(WebDriver driver, WebElement element) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static WebElement clickEmenent(WebDriver driver, WebElement element) {
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static List<WebElement> serchElements(WebDriver driver, List<WebElement> element){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	return	wait.until(ExpectedConditions.visibilityOfAllElements(element));
		
	}
}