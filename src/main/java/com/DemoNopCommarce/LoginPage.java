package com.DemoNopCommarce;

import org.openqa.selenium.By;

public class LoginPage extends Utils{

    By _email=By.id("Email");
    By _password=By.id("Password");
    By _loginButton=By.xpath("//input[@class=\"button-1 login-button\"]");





    public void fillingLoginDetails(){
        typeText(_email,RegistrationPage.email);
        typeText(_password,"Sitaram2345");
        clickOnElement(_loginButton);

    }

}
