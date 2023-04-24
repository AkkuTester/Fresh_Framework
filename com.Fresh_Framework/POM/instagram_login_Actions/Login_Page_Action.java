package instagram_login_Actions;

import org.openqa.selenium.WebDriver;

import instagram_login_locators.Login_Page_Locators;
import web_Common_Functions.WebTextBox;

public class Login_Page_Action {
	WebDriver driver = null;
	Login_Page_Locators loginlocators = null;
	
	public Login_Page_Action(WebDriver driver) {
		this.driver = driver;
		loginlocators = new Login_Page_Locators(driver);
	}
	
	public void sendUsername(String username) {
		WebTextBox.sendInput(loginlocators.getUsername(), username);
	}
	public void sendPassword(String pass) {
		WebTextBox.sendInput(loginlocators.getPassword(), pass);
	}
}
