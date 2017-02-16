package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flights {
	@FindBy(css = "div.OMOBOQD-w-c")
	public WebElement flightsHeader;
	
	@FindBy(css = "input.OMOBOQD-Jb-f")
	public WebElement fromCityInput;
	
	@FindBy(xpath = "//span[text() = 'One way']/parent::button")
	public WebElement oneWayButton;
	
	public Flights(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setFromCityInput(String fromCity){
		fromCityInput.click();
		fromCityInput.clear();
		fromCityInput.sendKeys(fromCity);
	}
	
	public void clickOneWay() {
		oneWayButton.click();
	}
}
