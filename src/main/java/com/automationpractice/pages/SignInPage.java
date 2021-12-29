package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * By Anand
 **/
public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    //@FindBy(xpath = "//span[text()[normalize-space()='Create an account']]")
    @FindBy(id="SubmitCreate")      //button[@id='SubmitCreate']
    WebElement createAccountBtn;
    @FindBy(id = "email_create")
    WebElement emailCreate ;
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")   //h3[contains(text(),'Create an account')]
    WebElement createText;

    public void enterEmil(String eID){
        randomEmail(emailCreate);
        // sendTextToElement(emailCreate,eID);

        log.info("enter email:"  + emailCreate.toString());
    }

public void clickonCreateAccountBtn(){
    clickOnElement(createAccountBtn);
    log.info("click on button"+createAccountBtn.toString());

}


}
