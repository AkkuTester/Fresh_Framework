package roughWork;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selectables {
WebDriver driver;

	@Test
	public void selectAllItmes() throws InterruptedException {
	driver = new EdgeDriver();
	String url = "https://jqueryui.com/selectable/";
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	driver.get(url);
	
WebElement frame =	driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
	driver.switchTo().frame(frame);
	
	List<WebElement> allList = driver.findElements(By.xpath("//li[@class = 'ui-widget-content ui-selectee']"));
	System.out.println("size = " + allList.size());
	
	Actions action = new Actions(driver);
	
	//logic for selecting all the Selectables
	for(WebElement l : allList) {
		Thread.sleep(500);
		action.keyDown(Keys.CONTROL).perform();
		Thread.sleep(500);
		l.click();
		Thread.sleep(500);
		action.keyUp(Keys.CONTROL).perform();
	}
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	driver.close();
	}
}
