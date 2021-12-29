package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * By Anand
 **/
public class ProductOrderPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductOrderPage.class.getName());

    public ProductOrderPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[@title='Proceed to checkout']//span")
    WebElement checkOut;
    @FindBy(xpath = "//i[@class='icon-trash']")
    WebElement deleteBin;
    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty.')]")
    WebElement deleteMsg;

    /* @FindBy(xpath = "//p[@class='alert alert-warning']")
     WebElement deleteMsg;
 */

  /*  public void clickOnCheckout() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(checkOut);
        log.info( "click on checkout" + checkOut.toString());
    }

    public void clickOndeleteBin() {
        clickOnElement(deleteBin);
        log.info( "delete button" + deleteBin.toString());
    }
*/
    public String verifyDeleteMessageIsDisplayed() {

        log.info("delete message"+deleteMsg.toString());

        return deleteMsg.getText();
    }

}
