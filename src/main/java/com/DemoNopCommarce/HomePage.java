package com.DemoNopCommarce;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    By _registerButton=By.className("ico-register");
    By _loginButton=By.className("ico-login");
    By _apparelButton=By.linkText("Apparel");
    By _clickOnBookButton=By.linkText("Books");
    By _giftCardButton = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]");


    public void clickOnRegisterBtn(){


        clickOnElement(_registerButton);

    }
    public void clickOnLoginBtn(){
        clickOnElement(_loginButton);

    }
    public void clickOnApparel(){
        clickOnElement(_apparelButton);
    }

    public void clickOnBook(){
        clickOnElement(_clickOnBookButton);


    }
    public void clickOnGiftCardBtn(){
        clickOnElement(_giftCardButton);
    }
}
