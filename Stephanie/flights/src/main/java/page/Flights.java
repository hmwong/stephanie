package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flights {
	@FindBy(css = "div.OMOBOQD-w-c")
	public WebElement flightsHeader;
	
	public Flights(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
