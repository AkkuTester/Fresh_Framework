package instagram_login_Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dataRequired.LoginData;
import initializer.BaseClass;
import instagram_login_Actions.Login_Page_Action;

public class Login_Test {

WebDriver driver;
Login_Page_Action loginAction;

@BeforeClass
public void setupBrowser() {
	driver = BaseClass.launchBrowserWith("edge");
	 loginAction = new Login_Page_Action(driver);
	 driver.get("https://www.instagram.com/");
}

@Test
public void testLoginFeature() throws IOException {
	//String input = "testing";
	loginAction.sendUsername(LoginData.LoginUsername());
	Reporter.log("Username entered " + "<br>");
	
	loginAction.sendPassword(LoginData.loginPassword());
	Reporter.log("Password entered " + "<br>");
	
		
}
@Test (priority = 1, description = "just to test")
public void test() {
	Reporter.log("clicked on submit" + "<br>");
	Reporter.log("clicked on done" + "<br>");

}
}
