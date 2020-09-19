package com.DemoNopCommarce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    ApparelPage apparelPage = new ApparelPage();
    ClothingPage clothingPage = new ClothingPage();
    BookPage bookPage = new BookPage();
    CompareProductsPage compareProductsPage = new CompareProductsPage();
    GiftCardPage giftCardPage = new GiftCardPage();
    VirtualGiftCardPage virtualGiftCardPage = new VirtualGiftCardPage();
    Fahrenheit451BookPage fahrenheit451BookPage = new Fahrenheit451BookPage();
    CartPage cartPage = new CartPage();
    CheckOutAsGuestPage checkOutAsGuestPage = new CheckOutAsGuestPage();
    OnePageCheckoutPage onePageCheckoutPage = new OnePageCheckoutPage();


    //program1
    @Test
    public void verifyRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterBtn();
        //filling registration details
        registrationPage.fillTheRegistrationForm();
        //verify message for successful registration
        String expectedResult = "Your registration completed";
        String actualResult = registerResultPage.registrationConfirmationMessageText();
        Assert.assertEquals("User is unable to register", expectedResult, actualResult);
        //click on logout
        registerResultPage.logOut();
        //click on login
        homePage.clickOnLoginBtn();
        //filling login details
        loginPage.fillingLoginDetails();

    }

   //program2
    @Test
    public void clothingShoppingWithScreenShot() {
        //click on Apparel
        homePage.clickOnApparel();
        //click on clothing
        apparelPage.clickOnClothingButton();
        //sort by low to high price
        clothingPage.clickOnSortByLowToHighPrice();
        //click on display
        clothingPage.displayPerPageByNumber3();
        //click on list(view)
        clothingPage.clickOnList();
        //take  a screenshot of clothing page
        clothingPage.firstScreenShot();
        //add to comparision custom t-shirt
        clothingPage.addCustomTiShirtToComparison();
        //add to compare oversized women t-shirt
        clothingPage.addOverSizedWomenTiShirtToComparison();
        //take again screen short with green line on top with message
        clothingPage.secondScreenShot();
        //click on product comparison from green line link
        clothingPage.clickOnProductComparisonFromGreenLineLink();
        //assert product name custom t- shirt
        String expectedName  = "Custom T-Shirt.";
        String actualName = compareProductsPage.verifyCustomTShirt();
        Assert.assertEquals("Custom T-Shirt is not there", expectedName, actualName );
        //clear compare list
        compareProductsPage.clearCompareList();
        //asserting message you have no items to compare
        String expectedText = "you have no items to compare.";
        String actualText = compareProductsPage.noProductForComparision();
        Assert.assertEquals("Item is still in compare list", expectedText, actualText);


    }

   // program3
      @Test
      public void clothingShoppingWithoutScreenShot(){
          //click on Apparel
          homePage.clickOnApparel();
          //click on clothing
          apparelPage.clickOnClothingButton();
          //sort by high to low price
          clothingPage.clickOnSortByHighToLowPrice();
          //click on display
          clothingPage.displayByNumber9();
          //click on list
          clothingPage.clickOnList();
          //add to compare custom t-shirt
          clothingPage.addCustomTiShirtToComparison();
          //add to compare oversized women t-shirt
          clothingPage.addOverSizedWomenTiShirtToComparison();
          //take again screen short with green line on top with message
          clothingPage.clickOnProductComparisonFromGreenLineLink();
          //assert product name oversized women t-shirt
          String expectedTShirtName = "Oversized Women T-Shirt";
          String actualTShirtName = compareProductsPage.verifyOverSizedWomenTShirt();
          Assert.assertEquals("Oversizes women t-shirt is not there", expectedTShirtName, actualTShirtName );
          //clear compare list
          clothingPage.clickOnClearCompareList();
          //asserting message you have no items to compare
          String expectedText = "You have no items to compare.";
          String actualText = compareProductsPage.noProductComparision();
          Assert.assertEquals("Item is still  in compare List", expectedText, actualText);


        }



    //program4
    @Test
    public void buyingBook(){
        //click on book
      homePage.clickOnBook();
      //click on 451 by ray Bradbury
      bookPage.clickOnFahrenheit451ByRayBradbury();
      //clear the quantity
      fahrenheit451BookPage.clearFieldOnChangeTheQuantity();
      //enter the quantity 4
      fahrenheit451BookPage.typeTextOnEnterTheQuantity();
      //add the book in wishlist
      fahrenheit451BookPage.clickOnAddTheBookInWishList();
      //verify the book has been added to you wishlist
        String expectMessage = "The product has been added to your wishlist";
        String actualMessage = fahrenheit451BookPage.verifyBookAddedToWishList();
        Assert.assertEquals("Book is not in wish list", expectMessage, actualMessage);
        //add product in to cart
        fahrenheit451BookPage.addProductInToCart();
        //go to cart from top green message
        fahrenheit451BookPage.clickOnCartTopGreenMessage();
        //click on term and condition
        cartPage.clickOnTermAndCondition();
        //click on checkout
        cartPage.clickOnCheckOut();
        //click on checkout as guest
        checkOutAsGuestPage.clickOnCheckOutAsGuest();
        //filling personal details for checkout
        onePageCheckoutPage.fillingPersonalDetails();
        //asserting confirmation message
        String expectedText = "Your oder has been successfully processed!";
        String actualText = checkOutAsGuestPage.verifyOrderConfirmationText();
        Assert.assertEquals("user is unable to processed order" , expectedText, actualMessage);












    }
    //program5
    @Test
    public void addingVirtualGiftCard() {
        //click on register
        homePage.clickOnRegisterBtn();
        //fill the register form
        registrationPage.fillTheRegistrationForm();
        //click on register btn
        // registrationPage.clickOnRegisterBtn();
        //click on logout btn
        registerResultPage.logOut();
        //click on login btn
        homePage.clickOnLoginBtn();
        //click on gift card
        homePage.clickOnGiftCardBtn();
        //adding a virtual gift card in the cart
        giftCardPage.clickOnAddingAVirtualGiftCardInTheCart();
        //filling all the personal details
        virtualGiftCardPage.fillingAllPersonalDetail();
        //asserting confirmation message
    }

@After
    public void closeBrowser(){
    driver.quit();
}




    }





















































































}