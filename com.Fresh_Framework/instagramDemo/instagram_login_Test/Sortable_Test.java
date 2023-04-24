package instagram_login_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import instagram_login_Actions.Sortable_Action;
import instagram_login_locators.Sortable_Locators;

public class Sortable_Test {
	WebDriver driver ;
	Sortable_Action sortAction;
	@BeforeMethod
	public void setUp() {
		driver = new EdgeDriver();
		sortAction = new Sortable_Action(driver);
	}
	
	@Test
	public void testSortable() throws InterruptedException {
		driver.get("https://jqueryui.com/sortable/");
		
		sortAction.switchIntoFrame();
		
		Sortable_Locators sLoc = new Sortable_Locators(driver);
		sortAction.shiftDownOneByOne(sLoc.getDestinations(), 11 , 48);
	}
}
