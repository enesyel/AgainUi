package stepDefinitions.flightBooking;

import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import stepDefinitions.BaseStep;

public class flightTest  extends BaseStep {
    public static final Logger LOGGER = LogManager.getLogger(flightTest.class);

    @When("The user clicks on the Flight Tab")
    public void theUserClicksOnTheFlightTab() {
        PAGES.getBookingHomePage().clickOnFlightsTab();
        LOGGER.debug("The user clicked on the Flight Tab");
    }
}
