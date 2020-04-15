package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    //location of elements
    By searchCustomerField = By.xpath("//input[@placeholder='Search Customer']");
    By deleteBtn  = By.xpath("//button[contains(text(),'Delete')]");



    //actions performed on elements
    public void searchCustomerName(String str) {

        sendTextToElement(searchCustomerField,str);
    }

    public void clickOnDeleteButton() {

        clickOnElement(deleteBtn);
    }

}
