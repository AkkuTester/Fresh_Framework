package instagram_login_Actions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import instagram_login_locators.Selectable_Locators;

public class Selectable_Actions {
WebDriver driver;
Selectable_Locators selectableLocators ;

public Selectable_Actions(WebDriver driver) {
	this.driver = driver;
	selectableLocators = new Selectable_Locators(driver);
}

public void switchingIntoFrame() {
	driver.switchTo().frame(selectableLocators.switchToFrame());
}

public void clickItemsAtOnce(List<WebElement> element) throws InterruptedException {
	Actions action = new Actions(driver);
	
	for(WebElement J : element) {
		Thread.sleep(500);
		action.keyDown(Keys.CONTROL).perform();
		Thread.sleep(500);
		J.click();
		Thread.sleep(500);
		action.keyUp(Keys.CONTROL).perform();
	}
	
}

public void clickItemsOneByOne(List<WebElement> element) throws InterruptedException {
	
	for(WebElement J : element) {
		Thread.sleep(500);
		J.click();
	}
}
}
