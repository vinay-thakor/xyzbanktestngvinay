package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    //location of elements
    By addCustomer = By.xpath("//button[contains(text(),'Add Customer')]");
    By openAccount = By.xpath("//button[contains(text(),'Open Account')]");
    By customers   = By.xpath("//button[contains(text(),'Customers')]");


    //actions performed on elements
    public void clickOnAddCustomerTab() {
        waitUntilElementToBeClickable(addCustomer,10);
        clickOnElement(addCustomer);
    }

    public void clickOnOpenAccountTab() {
        waitUntilElementToBeClickable(openAccount,10);
        clickOnElement(openAccount);
    }

    public void clickOnCustomersTab() {
        waitUntilElementToBeClickable(customers,10);
        clickOnElement(customers);
    }

}
