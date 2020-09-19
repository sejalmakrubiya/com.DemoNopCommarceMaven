package com.DemoNopCommarce;

import org.openqa.selenium.By;

public class GiftCardPage extends Utils{
    By _addingAVirtualGiftCardInTheCart = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]");


    public void clickOnAddingAVirtualGiftCardInTheCart(){
        clickOnElement(_addingAVirtualGiftCardInTheCart);
    }

}


