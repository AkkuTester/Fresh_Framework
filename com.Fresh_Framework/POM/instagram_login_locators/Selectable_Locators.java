package instagram_login_locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebWait;

public class Selectable_Locators {

WebDriver driver;
public Selectable_Locators(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//iframe[@class = 'demo-frame']")
private WebElement frame;

public WebElement switchToFrame() {
	if(WebWait.searchElement(driver, frame)!=null) {
		return frame;
	}else
		return null;
}

@FindBy(xpath = "//li[@class = 'ui-widget-content ui-selectee']")
private List<WebElement> selectablesList;

public List<WebElement> selectableItems() {
	if(WebWait.serchElements(driver, selectablesList)!=null) {
		return selectablesList;
	}else
		return null;
}


}
