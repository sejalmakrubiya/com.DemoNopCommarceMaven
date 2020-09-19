package com.DemoNopCommarce;

import org.openqa.selenium.By;

public class CompareProductsPage extends Utils {
By _assertingProductNameCustomTShirt = By.xpath("//a[contains(text(),'Custom T-Shirt']");
By _compareList = By.xpath("//a[@class=clear-list']");
By _assertingMessageNoItemsToCompare =By.xpath("//div[@class='no-data']");
By _assertingProductNameOverSizedWomenTShirtComparison =By.xpath("//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[2]");
By _assertingMassageYouHaveNoItemsToCompare = By.xpath("//div[@class='no-data']");





public String verifyCustomTShirt(){
   return getText(_assertingProductNameCustomTShirt);
}
public String clearCompareList(){
   return getText(_compareList);
}
public String noProductForComparision(){
    return getText(_assertingMessageNoItemsToCompare);
}
public String verifyOverSizedWomenTShirt(){
    return getText(_assertingProductNameOverSizedWomenTShirtComparison);
}
public String noProductComparision(){
    return getText(_assertingMassageYouHaveNoItemsToCompare);
}



}




























































