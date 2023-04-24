package instagram_login_locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebWait;

public class Sortable_Locators {
WebDriver driver;
public Sortable_Locators(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//li[text() = 'Item 1']")
private WebElement src;

public WebElement getSrc() {
	if(WebWait.searchElement(driver, src)!=null) {
		return src;
	}else
		return null;
}
@FindBy(xpath = "//li[@class = 'ui-state-default ui-sortable-handle']")
private List<WebElement> dest;

public List<WebElement> getDestinations() {
	if(WebWait.serchElements(driver, dest)!=null) {
		return dest;
	}else
		return null;
}
@FindBy(xpath = "//iframe[@class='demo-frame']")
private WebElement frame;

public WebElement getFrame() {
	if(WebWait.searchElement(driver, frame)!=null) {
		return frame;
	}else
		return null;
}
}
