package initializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	public static WebDriver launchBrowserWith(String browserName) {
		WebDriver driver;
		switch (browserName.toLowerCase()) {
		case "edge":
			String edgePath = ".//Drivers/msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", edgePath);
			driver = new EdgeDriver();
			break;
			
		case "chrome":
			String chromePath = ".//Drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver = new ChromeDriver();
			
		default:
			String defaultPath = ".//Drivers/msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", defaultPath);
			driver = new EdgeDriver();
			break;
		}
		return driver;
	}
}
