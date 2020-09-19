package com.DemoNopCommarce;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils{
    static String email= "abv" + timeStamp() + "@gmail.com";
    By _clickOnRegister = By.className("ico-register");
    By _gender =By.id("gender-male");
    By _firstName =By.id("FirstName");
    By _LastName =By.id("LastName");
    By _dateOfBirthday=By.name("DateOfBirthDay");
    By _dateOfBirthMonth=By.name("DateOfBirthMonth");
    By _dateOfBirthYear=By.name("DateOfBirthYear");
    By _email = By.id("Email");
    By _password=By.id("Password");
    By _confirmPassword=By.id("ConfirmPassword");
   By _registerBtn = By.id("register-button");


    public void fillTheRegistrationForm(){
        clickOnElement(_clickOnRegister);
        clickOnElement(_gender);
        typeText(_firstName,"John");
        typeText(_LastName,"peter");
        typeText(_dateOfBirthday,"06");
        typeText(_dateOfBirthMonth,"April");
        typeText(_dateOfBirthYear,"1910");
        typeText(_email,email);
        typeText(_password,"Sitaram2345");
        typeText(_confirmPassword,"Sitaram2345");
        clickOnElement(_registerBtn);



    }


}
