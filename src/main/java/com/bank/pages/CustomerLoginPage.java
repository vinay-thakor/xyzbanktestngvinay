package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    //location of elements
    By yourNameField  = By.id("userSelect");
    By loginBtn = By.xpath("//button[contains(text(),'Login')]");
    By yourNameText = By.xpath("//label[contains(text(),'Your Name')]");


    //actions performed on elements
    public void searchCustomer(String str) {
        selectByVisibleTextFromDropDown(yourNameField,str);
//        selectByIndexFromDropDown(yourNameField,1);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
    }

    public void verifyYourNameTextDisplayed(String str) {
        verifyTextAssertMethod(yourNameText,str);
    }


}
