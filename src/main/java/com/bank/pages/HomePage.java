package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //location of elements
    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
    By homeBtn = By.xpath("//button[contains(text(),'Home')]");


    //actions performed on elements
    public void clickOnHomeButton() {
        clickOnElement(homeBtn);
    }

    public void clickOnBankManagerLoginTab() {
        clickOnElement(bankManagerLogin);
    }

    public void clickOnCustomerLoginTab() {
        clickOnElement(customerLogin);
    }
}
