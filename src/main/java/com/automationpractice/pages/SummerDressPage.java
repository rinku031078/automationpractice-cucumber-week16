package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * By Anand
 **/
public class SummerDressPage extends Utility {
    private static final Logger log = LogManager.getLogger(SummerDressPage.class.getName());

    public SummerDressPage() {
        PageFactory.initElements(driver, this);
    }


    //div[@id='layered_price_slider']
    //span[@id='layered_price_range'] //price range  , $16.00 - $20.00

    @FindBy(xpath = " //div[@id='layered_price_slider']")
    WebElement leftSlider;

  //  @FindBy(xpath = " //div[@id='layered_price_slider']")
  //  @FindBy(xpath = "//a[@class='ui-slider-handle ui-state-default ui-corner-all ui-state-hover']")
    @FindBy(xpath = "//div[@id='left_column']//a[2]")
    WebElement rightSlider;
    @FindBy(xpath = "//div[@id='layered_price_slider']")
    WebElement sliderWidth;

public void sliderAction() throws InterruptedException {
    Actions actions = new Actions(driver);
   // WebElement slider = rightSlider;
    Thread.sleep(3000);
    int width =  sliderWidth.getSize().width;
    int halfWidth = (width/4)*3;
    actions.dragAndDropBy(rightSlider,0-halfWidth,0).build().perform();
jvJavaScriptExecutorExecuteASyncScriptPerformingSleep();

    //actions.dragAndDropBy(leftSlider,0,0).build().perform();
    Thread.sleep(5000);
    log.info("move slider to left until :"+rightSlider.toString());
}


}


