package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;


public class OpenAccountPage extends Utility {

    //location of elements
    By customerNameField = By.id("userSelect");
    By currencyField = By.id("currency");
    By processBtn = By.xpath("//button[contains(text(),'Process')]");


    //actions performed on elements

    public void searchCustomerCreatedInFirstTest(String str) {
        selectByVisibleTextFromDropDown(customerNameField, str);
    }

    public void selectCurrencyPound(int index) {
        selectByIndexFromDropDown(currencyField, index);
    }

    public void clickOnProcessButton() {
        clickOnElement(processBtn);
    }

    public void verifyMessageFromPopupAndAcceptPopup(String str) {
//        String actualMessage = alertGetText();
//        String expectedMessage = "Account created successfully with account Number :";
//        Assert.assertTrue(actualMessage.contains(expectedMessage), str);

        verifyTextAssertMethodForAlert(str);
        alertAccept();
    }
}
