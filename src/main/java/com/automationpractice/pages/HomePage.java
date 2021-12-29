package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


/**
 * By Anand
 **/
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li//a")
    List<WebElement> topCategory;

    // @FindBy(xpath = "//li[@class='sfHoverForce']//ul[@class='submenu-container clearfix first-in-line-xs']//li//a")
    @FindBy(xpath = "(//ul)[4]//li//a")
    List<WebElement> subCategory;
    //for Sign in and Contactus WebElement
    @FindBy(xpath = "//div[@class='row']//nav//div//a")
  List<WebElement> signIn;
    @FindBy(id = "my-account")
    WebElement myName;

    public void mouseHoverOnTopCategory(String menu) throws InterruptedException {
        for (WebElement title : topCategory) {
            System.out.println(title);
            if (title.getText().equalsIgnoreCase(menu)) {
                mouseHoverToElement(title);
                Thread.sleep(2000);

                break;
            }
            log.info("mouse Hover On Women " + title.toString());
        }
    }

    public void clickOnCasualDresses(String dresses) throws InterruptedException {
        for (WebElement casual : subCategory) {
            System.out.println(casual);
            if (casual.getText().equalsIgnoreCase(dresses)) {
                mouseHoverToElementAndClick(casual);
                Thread.sleep(2000);
                break;
            }
            log.info("click on casual dress: " + casual.toString());
        }

    }
    public void clickOnSignInLink(String Sign){
        for(WebElement s : signIn){
            System.out.println(s);
            if(s.getText().equalsIgnoreCase(Sign)){
                clickOnElement(s);
                break;
            }
            log.info("click on sign in link " + s.toString());
        }

    }

public String verifyMyName(){
        return myName.getText();
}

}



