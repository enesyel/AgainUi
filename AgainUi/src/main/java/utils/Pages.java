package utils;

import lombok.Data;
import pages.HomePage;
import pages.headerSection.FlightTab;
import pages.headerSection.BookingHomePage;
@Data
public class Pages {

	private HomePage homePage;

	private FlightTab flightTab;

	private BookingHomePage bookingHomePage;



	public Pages() {
		homePage = new HomePage();
		flightTab = new FlightTab();
		bookingHomePage = new BookingHomePage();
	}
	public HomePage getHomePage() {
		return homePage;
	}
	public FlightTab getFlightTab() {
		return flightTab;
	}
	public BookingHomePage getBookingHomePage() {
		return bookingHomePage;
	}

}
