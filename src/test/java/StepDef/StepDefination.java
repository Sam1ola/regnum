package StepDef;

import PageObject.Homepage;
import Resource.base;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination extends base {

    @Given("^I Initialize the browser and Navigate to \"([^\"]*)\" Site$")
    public void i_initialize_the_browser_and_navigate_to_something_site(String strArg1) throws Throwable {
        driver =initializeDriver();
        driver.get( strArg1 );
    }

    @When("^I enter the Car Registration number and click on Find Vehicle$")
    public void i_enter_the_car_registration_number_and_click_on_find_vehicle() throws Throwable {
        Homepage hp =new Homepage( driver );
        hp.Searchbox().sendKeys("ov12uyy" );
        hp.Findvehicle().click();
    }

    @Then("^My Car Registration Number is Displayed$")
    public void my_car_registration_number_is_displayed() throws Throwable {
        Homepage hp =new Homepage( driver );
        hp.VehicleResult().isDisplayed();

    }



}






