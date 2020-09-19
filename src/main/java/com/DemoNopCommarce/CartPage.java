package com.DemoNopCommarce;

import org.openqa.selenium.By;

public class CartPage extends Utils{
    By _termAndCondition = By.id("termsofservice");
    By _clickOnCheckOut = By.id("checkout");



    public void clickOnTermAndCondition(){
        clickOnElement(_termAndCondition);
    }
    public void clickOnCheckOut(){
        clickOnElement(_clickOnCheckOut);
    }






}
