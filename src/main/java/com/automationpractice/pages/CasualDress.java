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
public class CasualDress extends Utility {
    private static final Logger log = LogManager.getLogger(CasualDress.class.getName());

    public CasualDress() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//img[@title='Printed Dress']")
    WebElement mouseHover;
    @FindBy(xpath = "//a[@title='Add to cart']//span")
    WebElement cartBtn;
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeBtn;
    @FindBy(xpath = "//span[@class='ajax_cart_product_txt unvisible']")
    WebElement mouseHoverCart;
    @FindBy(xpath = "//a[@class='ajax_cart_block_remove_link']")
    WebElement delete;



    public void mouseHoverONDress() {
        mouseHoverToElement(mouseHover);
        log.info( "Mouse Hover On :" +mouseHover .toString());
    }


    public void clickOnCart() throws InterruptedException {

        Thread.sleep(2000);
        clickOnElement(cartBtn);
        log.info("click on cart "  + cartBtn.toString());
    }
    public void closeWindow(){
        clickOnElement(closeBtn);
        log.info( "close window" + closeBtn.toString());
    }

    public void setMouseHoverCart(){
        mouseHoverToElement(mouseHoverCart);
        log.info( "mouseHover on :" +mouseHoverCart .toString());
    }

    public void clickOnCloseBtn(){
        clickOnElement(delete);
        log.info("click on close :"  + delete.toString());
    }
}
