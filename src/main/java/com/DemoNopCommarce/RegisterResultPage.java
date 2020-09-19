package com.DemoNopCommarce;

import org.openqa.selenium.By;

public class RegisterResultPage extends Utils {
    By _registrationConfirmationMessage =By.className("result");
    By _logout=By.className("ico-logout");

    public String registrationConfirmationMessageText(){
        return  getText(_registrationConfirmationMessage);

    }
    public void logOut(){
        clickOnElement(_logout);

    }

}
