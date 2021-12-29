package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * By Anand
 **/
public class OurStorePage extends Utility {
    private static final Logger log = LogManager.getLogger(OurStorePage.class.getName());

    public OurStorePage() {
        PageFactory.initElements(driver, this);
    }

    //ul[@class='toggle-footer']//li//a ------->Our Store,all information elements
    @CacheLookup
    @FindBy(xpath = " //ul[@class='toggle-footer']//li//a")
    List<WebElement> ourStore;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement OkBtn;
    @CacheLookup
//@FindBy(xpath = "//div[@class='gm-style']//iframe")
//@FindBy(xpath = "//div[@id='map']/div/div/div[2]/div[2]") ---full map
    @FindBy(id = "map")//store image
    WebElement mapLook;
    @CacheLookup
    @FindBy(xpath = "//button[@class='gm-ui-hover-effect']")
    WebElement closeImage;
    @CacheLookup
    @FindBy(xpath = "//button[@title='Zoom out']")
    WebElement zoomOut;
    @CacheLookup
    @FindBy(xpath = "//button[@title='Toggle fullscreen view']")
    WebElement fullScreen;


    public void selectOurStore(String pages) throws InterruptedException {
        for (WebElement information : ourStore) {
            System.out.println(information);
            if (information.getText().equalsIgnoreCase(pages)) {
                clickOnElement(information);
                Thread.sleep(2000);
                break;
            }
        }

    }

    public void clickOnOk() {
        clickOnElement(OkBtn);
    }

    public void setZoomOut() {

        clickOnElement(zoomOut);
    }


   /* public void clickOnfullScreen(){
        clickOnElement(fullScreen);
    }*/

    public void moveONMap() throws InterruptedException {
        Thread.sleep(2000);
        Actions builder = new Actions(driver);
        Action scroll1 = builder.moveToElement(mapLook, 10, -10)
                .clickAndHold()
                .moveToElement(mapLook, 10, -250)
                .release(mapLook).build();
        scroll1.perform();
        log.info( "scroll on map:" +mapLook .toString());
  Action scroll2 = builder.moveToElement(mapLook)
                .clickAndHold()
                .moveToElement(mapLook, 10, -250)
                .release(mapLook)
                .build();
        scroll2.perform();
        log.info( "scroll on map:" +mapLook .toString());
    }
}