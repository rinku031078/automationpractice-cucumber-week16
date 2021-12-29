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
public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='account_creation']//input") //div[@class='account_creation']/descendant::div
    List<WebElement> allFields;
    //div[@class='account_creation']//input[class=(contains(text(),'required form-group'))]
    @FindBy(xpath = "//div[@class='radio-inline']//label")   //div[@class='radio-inline']//label
            List<WebElement> gender;


    @FindBy(xpath = "//div[@class='account_creation']//select[@class='form-control']")
    List<WebElement> selFields;

    @FindBy(xpath = "//button[@id='submitAccount']") //button[@id='submitAccount']
    WebElement register;
    @FindBy(xpath = "//span[@class='navigation_page']")    //span[@class='navigation_page']  //h1[@class='page-heading']
    WebElement myAc;

    public void getGender(String gend) {
        for (WebElement gen : gender) {
            System.out.println(gen.getText());
            if (gen.getText().equalsIgnoreCase(gend)) {
                gen.click();
                break;
            }
        }

    }

    public void allFieldNames(String fieldName, String sendValue) {
        for (WebElement field : allFields) {
            if (field.getAttribute("name").trim().equalsIgnoreCase(fieldName)) {
                if (field.getAttribute("type").equalsIgnoreCase("radio")) {
                    for (WebElement gen : gender) {
                        if (gen.getText().equalsIgnoreCase(sendValue)) {
                            gen.click();
                            break;
                        }

                    }
                } else
                if (field.getAttribute("type").equalsIgnoreCase("checkbox")) {
                    if (sendValue.equalsIgnoreCase("Yes")) {
                        field.click();
                    }
                } else {
                    if (!field.getText().trim().equals(sendValue.trim())) {
                        field.clear();
                        field.sendKeys(sendValue);
                    }
                }
                break;
            }
        }
        for (WebElement selField : selFields) {
            if (selField.getAttribute("name").trim().equalsIgnoreCase(fieldName)) {
                selectByContainsTextFromDropDown(selField, sendValue);

                break;
            }
            log.info( "select name" +selFields .toString());
        }
    }

    public void clickRegister() {
        // Reporter.log("Click Register" + register.toString() + "<br>");
        clickOnElement(register);
        log.info("Click Register"  + register.toString());
    }

    public String textMyAc() {
        //  Reporter.log("Verify Sign Out" + myAc.toString() + "<br>");
        String myAccount = getTextFromElement(myAc);
        log.info( "Verify Sign Out" + myAc.toString());
        return myAccount;
    }


}
