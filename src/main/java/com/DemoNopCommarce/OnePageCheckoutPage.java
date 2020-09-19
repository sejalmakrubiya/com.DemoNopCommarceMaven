package com.DemoNopCommarce;

import org.openqa.selenium.By;

public class OnePageCheckoutPage extends Utils{

    static String email = "abc"  +  timeStamp()  +  "@yahoo.com";

    By _firstName =By.id("BillingNewAddress_FirstName");
    By _lastName =By.id("BillingNewAddress_LastName");
    By _email = By.id("//input[@id='BillingNewAddress_Email']");
    By _country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By _city = By.id("BillingNewAddress_City");
    By _Address1 =By.id("BillingNewAddress_Address1");
    By _zipPostalCode = By.id("BillingNewAddress_ZipPostalCode");
    By _phoneNumber =By.id("BillingNewAddress_PhoneNumber");
    By _continueBtn = By.xpath("//div[@id='billing-buttons-container']//input[@class='button-1 new-address-next-step-button']");






    public void fillingPersonalDetails(){
        typeText(_firstName,"Reena");
        typeText(_lastName,"Roy");
        typeText(_email,email);
        selectDropDown(_country,"United States");
        selectDropDown(_city,"London");
        typeText(_Address1,"609 RamNagar");
        typeText(_zipPostalCode,"gr6 8lo");
        typeText(_phoneNumber,"08563423905");
        clickOnElement(_continueBtn);



    }
}
