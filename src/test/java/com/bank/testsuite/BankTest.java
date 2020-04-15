package com.bank.testsuite;

import com.bank.loadproperty.LoadProperty;
import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.bank.utility.Utility.getRandomNumber;


/*
In Testsuite package
create
1.BankTest
Inside his create testmethods
*/

public class BankTest extends TestBase {

    //static variable
//    static String firstName = null;
  //  String lastName = "Snape";
    //String postCode = "HG3 14WB";

    //object creation
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();
    CustomersPage customersPage = new CustomersPage();
    LoadProperty loadProperty = new LoadProperty();
    //object Creation
    String firstName = loadProperty.getProperty("firstName");
    String lastName = loadProperty.getProperty("lastName");
    String postCode = loadProperty.getProperty("postCode");




    @BeforeTest
    public static void setUp() {
      //  firstName = "Severus" + getRandomNumber(2);
    }

    /*
        1.bankManagerShouldAddCustomerSuccessfully.
    */
    @Test(priority = 0,groups = {"Sanity","Regression","Smoke"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        //    click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginTab();
        //	click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomerTab();
        //	enter FirstName
        addCustomerPage.enterFirstName(firstName);
        //	enter LastName
        addCustomerPage.enterLastName(lastName);
        //	enter PostCode
        addCustomerPage.enterPostCode(postCode);
        //	click On "Add Customer" Button
        addCustomerPage.clickOnAddCustomerButton();
        //	popup display
        //	verify message "Customer added successfully"
        //	click on "ok" button on popup.
        addCustomerPage.verifyMessageFromPopupAndAcceptPopup("Customer added successfully");
        //  "Customer added successfully with customer id :6"
    }

    /*
    2. bankManagerShouldOpenAccountSuccessfully.
    */
    @Test(priority = 1,groups = {"Sanity","Regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnHomeButton();
        //	click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginTab();
        //	click On "Open Account" Tab
        bankManagerLoginPage.clickOnOpenAccountTab();
        //	Search customer that created in first test
        openAccountPage.searchCustomerCreatedInFirstTest(firstName + " " + lastName);
        //	Select currency "Pound"
        openAccountPage.selectCurrencyPound(2);
        //	click on "process" button
        openAccountPage.clickOnProcessButton();
        //	popup displayed
        //	verify message "Account created successfully"
        //	click on "ok" button on popup.
        openAccountPage.verifyMessageFromPopupAndAcceptPopup("Account created successfully");
        // "Account created successfully with account Number :1016"
    }

    /*
    3. customerShouldLoginAndLogoutSuceessfully.
    */
    @Test(priority = 2,groups = {"Sanity","Smoke"})
    public void customerShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnHomeButton();
        //	click on "Customer Login" Tab
        homePage.clickOnCustomerLoginTab();
        //	search customer that you created.
        customerLoginPage.searchCustomer(firstName + " " + lastName);
        //	click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        //	verify "Logout" Tab displayed.
        accountPage.verifyLogoutTabDisplayed("Logout");
        //	click on "Logout"
        accountPage.clickOnLogout();
        //	verify "Your Name" text displayed.
        customerLoginPage.verifyYourNameTextDisplayed("Your Name :");
    }

    /*
    4. customerShouldDepositMoneySuccessfully.
    */
    @Test(priority = 3,groups = {"Sanity","Regression"})
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnHomeButton();
        //	click on "Customer Login" Tab
        homePage.clickOnCustomerLoginTab();
        //	search customer that you created.
        customerLoginPage.searchCustomer(firstName + " " + lastName);
        //	click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        //	click on "Deposit" Tab
        accountPage.clickOnDepositTab();
        //	Enter amount 100
        accountPage.enterAmount100("100");
        //	click on "Deposit" Button
        accountPage.clickOnDepositButton();
        //	verify message "Deposit Successful"
        accountPage.verifyMessageDepositSuccessful("Deposit Successful");
    }

    /*
    5. customerShouldWithdrawMoneySuccessfully
    */
    @Test(priority=4,groups = {"Sanity","Regression"})
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnHomeButton();
        //	click on "Customer Login" Tab
        homePage.clickOnCustomerLoginTab();
        //	search customer that you created.
        customerLoginPage.searchCustomer(firstName + " " + lastName);
        //	click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        //	click on "Withdrawl" Tab
        accountPage.clickOnWithdrawlTab();
        //	Enter amount 50
        accountPage.enterAmount50("50");
        //	click on "Withdraw" Button
        accountPage.clickOnWithdrawButton();
        //	verify message "Transaction Successful"
        accountPage.verifyMessageTransactionSuccessful("Transaction successful");
    }

    /*
     *  6.bankManagerShouldDeleteCustomerSuccessfully.
     */

    @Test(priority = 5,groups = {"Sanity","Regeression"})
    public void bankManagerShouldDeleteCustomerSuccessfully() {
    homePage.clickOnHomeButton();
    // 1. click on Bank Manager Login Tab
    homePage.clickOnBankManagerLoginTab();
    // 2. click on Customers Tab
    bankManagerLoginPage.clickOnCustomersTab();
    // 3.search customer by firstname
    customersPage.searchCustomerName(firstName);
    // click on Delete button.
    customersPage.clickOnDeleteButton();
    }

}