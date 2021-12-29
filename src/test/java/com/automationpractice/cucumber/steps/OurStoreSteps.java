package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.OurStorePage;
import com.automationpractice.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import static com.automationpractice.drivermanager.ManageDriver.driver;

/**
 * By
 **/
public class OurStoreSteps {
    @When("^I select On \"([^\"]*)\"$")
    public void iSelectOn(String store) throws InterruptedException {
       new OurStorePage().selectOurStore(store);
    }

    @And("^I click on OK button$")
    public void iClickOnOKButton() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,400)");
        new OurStorePage().clickOnOk();
    }

    @And("^I click On zoomOut$")
    public void iClickOnZoomOut() {
        new OurStorePage().setZoomOut();
    }

    @And("^I scroll on map$")
    public void iScrollOnMap() throws InterruptedException {
        new OurStorePage().moveONMap();
    }

    @Then("^I take screenshot$")
    public void iTakeScreenshot() {
        Utility.takeScreenShot();
    }
}
