package com.DemoNopCommarce;

import org.openqa.selenium.By;

public class Fahrenheit451BookPage extends Utils{
    By _changeTheQuantity =By.xpath("//input[@id='product_enteredQuantity_37']");
    By _enterTheQuantity =By.xpath("//input[@id='product_enteredQuantity_37']");
    By _addTheBookInWishList = By.id("add-to-wishlist-button-37");
    By _TheBookHasBeenAddedToYourWishList = By.className("content");
    By _addProductInToCart = By.id("add-to-cart-button-37");
    By _goToCartFromTopGreenMessage =By.xpath("//a[contains(text(),'shopping cart')]");



    public void clearFieldOnChangeTheQuantity(){
        clearField(_changeTheQuantity);

    }
    public void typeTextOnEnterTheQuantity(){
        typeText(_enterTheQuantity,"4");
    }
    public void clickOnAddTheBookInWishList() {
        clickOnElement(_addTheBookInWishList);
    }
    public String verifyBookAddedToWishList(){
        return getText(_TheBookHasBeenAddedToYourWishList);

    }
    public void addProductInToCart(){
        clickOnElement(_addProductInToCart);
    }
    public void clickOnCartTopGreenMessage(){
        clickOnElement(_goToCartFromTopGreenMessage);
    }



}
