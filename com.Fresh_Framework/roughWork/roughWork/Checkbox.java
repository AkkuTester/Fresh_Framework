package roughWork;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
	//	WebElement checkbox = driver.findElement(By.xpath("//label[@for='checkbox-3']"));
	//	singleCheckboxclick(checkbox);
	//	List<WebElement> multiCheck = driver.findElements(By.xpath("//label[@class='ui-checkboxradio-label ui-corner-all ui-button ui-widget']"));
	//	multiCheckboxclick(multiCheck);
		 WebElement e1= driver.findElement(By.xpath("//label[@for = 'checkbox-1']"));
		 WebElement e2= driver.findElement(By.xpath("//label[@for = 'checkbox-nested-1']"));
		 WebElement e3= driver.findElement(By.xpath("//label[@for = 'checkbox-nested-2']"));	 
		 List<WebElement> el = new ArrayList<>();
		 el.add(e1);
		 el.add(e2);
		 el.add(e3);
		 multiCheckboxclick(el);
	}
	public static void singleCheckboxclick(WebElement element) {
		element.click();
	}
	public static void multiCheckboxclick(List<WebElement> multiElements) {
		for(int i=0; i<multiElements.size(); i++) {
			multiElements.get(i).click();
		}
	}
	public static void allCheckboxclick(List<WebElement> allElements) {
		for(WebElement element : allElements) {
			element.click();
		}
	}
}
