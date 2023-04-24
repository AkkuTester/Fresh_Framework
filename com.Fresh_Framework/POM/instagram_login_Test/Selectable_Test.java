package instagram_login_Test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import initializer.BaseClass;
import instagram_login_Actions.Selectable_Actions;
import instagram_login_locators.Selectable_Locators;

public class Selectable_Test {
WebDriver driver;
Selectable_Actions selectableActions ;

@BeforeMethod
public void setup(){
	driver = BaseClass.launchBrowserWith("edge");
	selectableActions = new Selectable_Actions(driver);
}

@Test(description = "selecting all the items at once")
public void selectAtOnce() throws InterruptedException {
	Selectable_Locators l = new Selectable_Locators(driver);
	driver.get("https://jqueryui.com/selectable/");
	Reporter.log("URL opened" + "<br>");
	//switching in the frame is required
	selectableActions.switchingIntoFrame();
	Reporter.log("switched into the frame" + "<br>");

	//select all the items at once
	
	selectableActions.clickItemsAtOnce(l.selectableItems());
	Reporter.log("Selected all the items at once" + "<br>");
}

@Test(description = "selecting items one by one")
public void selectOneByOne() throws InterruptedException {
	Selectable_Locators l = new Selectable_Locators(driver);
	driver.get("https://jqueryui.com/selectable/");
	
	selectableActions.switchingIntoFrame();
	
	selectableActions.clickItemsOneByOne(l.selectableItems());
}

@AfterMethod
public void shutdown() {
	driver.close();
}

}
