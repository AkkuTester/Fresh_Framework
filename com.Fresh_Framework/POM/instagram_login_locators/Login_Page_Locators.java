package instagram_login_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebWait;

public class Login_Page_Locators {
	WebDriver driver = null;
	
	public Login_Page_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement username;
	public WebElement getUsername() { //explicit wait checked here
		if(WebWait.searchElement(driver, username)!=null) {
			return username;
		}
		else 
			return null;
	}
	
	@FindBy(name = "password")
	private WebElement password;
	
	public WebElement getPassword() {
		if(WebWait.searchElement(driver, password)!=null) {
			return password;
		}else
			return null;
	}
}
