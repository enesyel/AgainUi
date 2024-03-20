package stepDefinitions.homePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.ComparisonFailure;
import org.openqa.selenium.NoSuchElementException;
import stepDefinitions.BaseStep;
import utils.BrowserUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.Assert.assertTrue;

public class HomePage_StepDefs extends BaseStep {

    public static final Logger LOGGER = LogManager.getLogger(HomePage_StepDefs.class);

    @When("they click on the {string} tab")
    public void they_click_on_the_tab(String tabName) {
        HOMEPAGE.clickOnTabs(tabName);
        LOGGER.debug("User clicked on {} tab", tabName);
    }

    @Then("the header title should be {string}")
    public void the_header_title_should_be(String title) {
        then(HOMEPAGE.getHeaderTitle()).isEqualTo(title);
        LOGGER.debug("User sees {} title", title);
    }

    @Then("the header button text should be {string}")
    public void the_header_button_text_should_be(String buttonText) {
        then(HOMEPAGE.getHeaderButtonText()).isEqualTo(buttonText);
        LOGGER.debug("User sees {} button", buttonText);
    }

    @When("they click on the {int} button")
    public void they_click_on_the_button(int flightButton) {
        HOMEPAGE.clickOnBookFlightButton(flightButton);
        LOGGER.debug("User clicked on Book Flight button {}", flightButton);
    }

}
