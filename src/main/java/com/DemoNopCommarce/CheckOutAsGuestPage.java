package com.DemoNopCommarce;

import org.openqa.selenium.By;

public class CheckOutAsGuestPage extends Utils{
    By _checkOutAsGuest = By.xpath("//input[@class='button-1 checkout-as-guest-button']");
    By _assertingConfirmationMessage =  By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");





    public void clickOnCheckOutAsGuest(){
        clickOnElement(_checkOutAsGuest);
    }
    public String verifyOrderConfirmationText(){
        return getText(_assertingConfirmationMessage);
    }

}
