package roughWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/checkboxradio/");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	WebElement radioButton = driver.findElement(By.xpath("//label[@for='radio-2']"));
	
	Thread.sleep(2000);
	radioClick(radioButton);
	
	}
	
	public static void radioClick(WebElement element) {
		element.click();
	}
}
