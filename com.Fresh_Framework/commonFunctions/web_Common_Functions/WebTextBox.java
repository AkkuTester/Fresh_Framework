package web_Common_Functions;

import org.openqa.selenium.WebElement;

public class WebTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static void sendInput(WebElement textBox, String input) {
		textBox.sendKeys(input);
	}
	
	public static void clearField(WebElement element) {
		element.clear();
	}
}
