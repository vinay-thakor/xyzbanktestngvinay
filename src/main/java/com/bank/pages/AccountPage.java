package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    //location of elements
    By transactionTab = By.xpath("//button[contains(text(),'Transactions')]");
    By depositTab = By.xpath("//button[contains(text(),'Deposit')]");
    By withdrawTab = By.xpath("//button[contains(text(),'Withdrawl')]");
    By logoutBtn = By.xpath("//button[contains(text(),'Logout')]");
    By amountField = By.xpath("//input[@placeholder='amount']");
    By depositBtn = By.xpath("//button[1][contains(text(),'Deposit')]");
    By depositSuccessText = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By withdrawBtn = By.xpath("//button[1][contains(text(),'Withdraw')]");
    By transactionsSuccessText = By.xpath("//span[contains(text(),'Transaction successful')]");


    //actions performed on elements
    public void verifyLogoutTabDisplayed(String str) {
        waitUntilElementToBeClickable(logoutBtn,5);
        verifyTextAssertMethod(logoutBtn,str);
    }

    public void clickOnLogout() {
        clickOnElement(logoutBtn);
    }

    public void clickOnDepositTab() {
        clickOnElement(depositTab);
    }

    public void clickOnWithdrawlTab() {
        clickOnElement(withdrawTab);
    }

    public void enterAmount50(String str) {
        sendTextToElement(amountField,str);
    }
    public void enterAmount100(String str) {
        sendTextToElement(amountField,str);
    }

    public void clickOnDepositButton() {
        clickOnElement(depositBtn);
    }

    public void clickOnWithdrawButton() {
        clickOnElement(withdrawBtn);
    }

    public void verifyMessageDepositSuccessful(String str) {
        verifyTextAssertMethod(depositSuccessText,str);
    }

    public void verifyMessageTransactionSuccessful(String str) {
        verifyTextAssertMethod(transactionsSuccessText,str);
    }

}