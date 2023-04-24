package instagram_login_Actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import instagram_login_locators.Sortable_Locators;

public class Sortable_Action {
WebDriver driver;
Sortable_Locators sortLocator;

public Sortable_Action(WebDriver driver) {
	this.driver = driver;
	sortLocator = new Sortable_Locators(driver);
}

public void switchIntoFrame() {
	driver.switchTo().frame(sortLocator.getFrame());
}

public void shiftDownOneByOne(List <WebElement> element, int xCord , int yCord) throws InterruptedException {
	Actions action = new Actions(driver);
	
	for(int i=1; i<element.size(); i++) {
		Thread.sleep(500);
		action.dragAndDropBy(sortLocator.getSrc(), xCord, yCord).perform();
		Thread.sleep(500);
	}
	
}
}
