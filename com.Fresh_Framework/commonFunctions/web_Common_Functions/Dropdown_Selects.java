package web_Common_Functions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selects {
/*
 * List<WebElement> allElement = select.getOptions();
 * .getOptions return the list of all the available options.
 */
	public static void selectAllOptions(List<WebElement> allElements) throws InterruptedException {
		for(WebElement singleEle : allElements) {
			Thread.sleep(1000);
			singleEle.click();
		}
	}
	/*
	 * can select directly using element
	 */
	public static void selectAllOptions(WebElement element) throws Exception {
		Select select = new Select(element);
		
		if(select.isMultiple()) {
			
		List<WebElement> allElements = select.getOptions();
		for(WebElement singleElement : allElements) {
			Thread.sleep(500);
			singleElement.click();
		}
			
		}else {
			throw new Exception("Error !!!. Multiple selection is not allowed");
		}
	}
}
