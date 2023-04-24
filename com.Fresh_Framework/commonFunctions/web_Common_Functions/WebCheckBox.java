package web_Common_Functions;

import java.util.List;

import org.openqa.selenium.WebElement;

public class WebCheckBox {

	//for single check box
	public static void singleCheckboxclick(WebElement element) {
		element.click();
	}
	
	//for multiple check boxes
	public static void multiCheckboxclick(List<WebElement> multiElements) {
		for(int i=0; i<multiElements.size(); i++) {
			multiElements.get(i).click();
		}
	}
	
	//for all check boxes
	public static void allCheckboxclick(List<WebElement> allElements) {
		for(WebElement element : allElements) {
			element.click();
		}
	}
}
