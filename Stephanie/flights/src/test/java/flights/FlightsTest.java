package flights;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Driver;
import page.Flights;

public class FlightsTest extends Driver {
	@Test
	public void flightsTest() {
		driver.get("https://www.google.com/flights/");
	
		Flights flights = new Flights(driver);
		Assert.assertEquals(flights.flightsHeader.getText(), "Flights");
	}
}
