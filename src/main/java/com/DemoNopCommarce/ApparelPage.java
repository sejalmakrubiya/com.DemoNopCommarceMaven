package com.DemoNopCommarce;

import org.openqa.selenium.By;

public class ApparelPage extends Utils {
    By _clothingButton= By.linkText("Clothing");

    public void clickOnClothingButton(){
        clickOnElement(_clothingButton);
    }
}
