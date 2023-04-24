package roughWork;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sortable1 {

//@Test
public void shiftingToDesiredLocation() throws InterruptedException {
WebDriver driver = new EdgeDriver();
	
	driver.get("https://jqueryui.com/sortable/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.switchTo().frame(0);
	
	WebElement item1 = driver.findElement(By.xpath("//li[text() = 'Item 1']"));
	System.out.println(item1.getText());
	System.out.println(item1.getLocation());
	
	WebElement item7 = driver.findElement(By.xpath("//li[text() = 'Item 7']"));
	System.out.println(item7.getText());
	System.out.println(item7.getLocation());
	
	Actions action = new Actions(driver);
	 Point p = item7.getLocation();
	 int x = p.getX(); int y = p.getY();
	 
	 Thread.sleep(3000);	 
	 action.dragAndDropBy(item1, x, y).perform();
}
//@Test
public void shiftingTillBottom() throws InterruptedException {
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.get("https://jqueryui.com/sortable/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.switchTo().frame(0);
	
List<WebElement> allItems =	driver.findElements(By.xpath("//li[@class = 'ui-state-default ui-sortable-handle']"));
	
	Actions action = new Actions(driver);
	
	WebElement source = driver.findElement(By.xpath("//li[text() = 'Item 1']"));
	int x; int y;
	for(int i=1; i<allItems.size(); i++) {
		
		//WebElement destination = driver.findElement(By.xpath("//li[text() = 'Item "+i+"']"));
		//System.out.println("location of Item "+i+" " + destination.getLocation());
	//Point loc = destination.getLocation();
	//x = loc.getX(); //y = loc.getY();
	//System.out.println("X = " + x + " Y = " + y);
	Thread.sleep(2000);
	
	action.dragAndDropBy(source, 11, 48).perform();
	Thread.sleep(500);
	if(i==3) {
	//	break;
	}
	}
}
}
