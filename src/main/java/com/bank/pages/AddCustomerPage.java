package com.bank.pages;

import com.bank.utility.Utility;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddCustomerPage extends Utility {

    //location of elements
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postCodeField = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerBtn = By.cssSelector("button.btn.btn-default");


    //actions performed on elements
    public void enterFirstName(String str) {
        waitUntilElementToBeClickable(firstNameField, 10);
        sendTextToElement(firstNameField, str);
    }

    public void enterLastName(String str) {
        waitUntilElementToBeClickable(lastNameField, 10);
        sendTextToElement(lastNameField, str);
    }

    public void enterPostCode(String str) {
        waitUntilElementToBeClickable(postCodeField, 10);
        sendTextToElement(postCodeField, str);
    }

    public void clickOnAddCustomerButton() {
        clickOnElement(addCustomerBtn);
    }

    public void verifyMessageFromPopupAndAcceptPopup(String str) {
//        String actualMessage = alertGetText();
//        String expectedMessage = "Customer added successfully with customer id :";
//        Assert.assertTrue(actualMessage.contains(expectedMessage), str);
        verifyTextAssertMethodForAlert(str);
        alertAccept();
    }

}
