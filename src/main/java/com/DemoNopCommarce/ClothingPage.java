package com.DemoNopCommarce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ClothingPage extends Utils{

    By _sortByLowToHighPrice =By.id("products-orderby");
    By _displayNumberForClothing1=By.id("products-pagesize");
    By _list=By.linkText("List");
    By _addCustomTShirtToCompareList= By.xpath("//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[2]");
    By _addOversizedWomenTShirtToCompareList= By.xpath("//div[@class='product-list']//div[3]//div[1]//div[2]//div[3]//div[2]//input[2]");
    By _productComparisonFromGreenLineLink = By.linkText("product comparison");
    By _clearCompareList = By.xpath("//a[@class= 'clear-list']");
    By _sortByHighToLowPrice = By.id("products-orderby");
    By _displayNumberForClothing2 =By.id("products-pagesize");
    By _assertingProductNameCustomTShirt =By.xpath("//a[contains(text(),'Custom T-Shirt')]");



    public void clickOnSortByLowToHighPrice(){
       clickOnElement(_sortByLowToHighPrice);
        selectDropDown(_sortByLowToHighPrice,"Price: Low to High");


    }
    public void displayPerPageByNumber3() {
        clickOnElement(_displayNumberForClothing1);
        selectDropDown(_displayNumberForClothing1, "3");

    }
    public void displayByNumber9() {
        clickOnElement(_displayNumberForClothing2);
        selectDropDown(_displayNumberForClothing2, "9");
    }



    public void clickOnList(){
        clickOnElement(_list);

    }
    public void firstScreenShot(){

        takeScreenshot("Clothing page");
    }

    public void addCustomTiShirtToComparison(){
        clickOnElement(_addCustomTShirtToCompareList);

    }
    public void addOverSizedWomenTiShirtToComparison(){
        clickOnElement(_addOversizedWomenTShirtToCompareList);
    }
    public void secondScreenShot(){
        takeScreenshot("Clothing page");
    }
    public void clickOnProductComparisonFromGreenLineLink(){
        clickOnElement(_productComparisonFromGreenLineLink);
    }
    public void clickOnClearCompareList(){
        clickOnElement(_clearCompareList);
    }
    public void clickOnSortByHighToLowPrice(){
        clickOnElement(_sortByHighToLowPrice);
        selectDropDown(_sortByHighToLowPrice,"Price: High to Low");
    }












}
