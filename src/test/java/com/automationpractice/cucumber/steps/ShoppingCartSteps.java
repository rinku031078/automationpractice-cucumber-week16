package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.CasualDress;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.ProductOrderPage;
import com.automationpractice.pages.SummerDressPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * By
 **/
public class ShoppingCartSteps {
    @Given("^I am in home page$")
    public void iAmInHomePage() {
        System.out.println("I am on home page");
    }

    @When("^I mouse hover on \"([^\"]*)\"$")
    public void iMouseHoverOn(String menu) throws InterruptedException {
      new HomePage().mouseHoverOnTopCategory(menu);
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String dresses) throws InterruptedException {
        new HomePage().clickOnCasualDresses(dresses);

    }

    @And("^I mouse hover on Dress$")
    public void iMouseHoverOnDress() {
        new CasualDress().mouseHoverONDress();
    }

    @And("^I click on Add to cart$")
    public void iClickOnAddToCart() throws InterruptedException {
        new CasualDress().clickOnCart();
    }



    @Then("^I should see message \"([^\"]*)\"$")
    public void iShouldSeeMessage(String expected)  {
        Assert.assertEquals(expected,new ProductOrderPage().verifyDeleteMessageIsDisplayed());

        String expectedMessage = "Your shopping cart is empty.";
        String actualMessage = new ProductOrderPage().verifyDeleteMessageIsDisplayed();



    }

    @Then("^I able to select price range$")
    public void iAbleToSelectPriceRange() throws InterruptedException {
        new SummerDressPage().sliderAction();

    }

    @And("^I close window$")
    public void iCloseWindow() {
        new CasualDress().closeWindow();
    }

    @And("^I Mouse Hover on cart$")
    public void iMouseHoverOnCart() {
        new CasualDress().setMouseHoverCart();
    }

    @And("^I click on cross button$")
    public void iClickOnCrossButton() {
        new CasualDress().clickOnCloseBtn();
    }
}
