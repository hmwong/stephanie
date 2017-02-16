package flights;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Driver;
import page.Flights;

public class FlightsTest extends Driver {
	@Test
	public void flightsTest() {
		driver.get("https://www.google.com/flights/");
		try {
			Thread.sleep(2000);
			
			Flights flights = new Flights(driver);
			Assert.assertEquals(flights.flightsHeader.getText(), "Flights");
			
			Thread.sleep(2000);
			
			flights.clickOneWay();
			
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
