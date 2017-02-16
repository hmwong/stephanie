package common;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Driver {
	public RemoteWebDriver driver;

	@BeforeMethod
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "../common/bin/chromedriver");
		System.setProperty("webdriver.gecko.driver", "../common/bin/geckodriver");

		driver = setUpWebDriver(DesiredCapabilities.chrome());
	}

	public RemoteWebDriver setUpWebDriver(DesiredCapabilities caps) {
		caps.setJavascriptEnabled(true);
		return new RemoteWebDriver(caps);
	}
	
	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}
}
