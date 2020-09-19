package com.DemoNopCommarce;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {
    //Reusable method for to click on web element
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    //Reusable method for clear field
    public static void clearField(By by){
        driver.findElement(by).clear();


    }
    //Reusable method for send keys
    public static void typeText(By by,String textValue){
        driver.findElement(by).sendKeys(textValue);


    }
    //Reusable method for get text

        public static String getText(By by){
        return driver.findElement(by).getText();

    }
    public static String timeStamp(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        //get current date time with Date()
        Date date = new Date();
        // now format the date
        return dateFormat.format(date);
    }

    //Reusable method for select drop down
    public static void selectDropDown (By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //Reusable method for Screenshot
    //Take screenshot and store it as a file format
    public static void takeScreenshot(String fileName){
        try{
        //Take screenshot and store it as a file format
       TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
       // File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //2.now copy the screenshot to desired location using copyfile method
            FileUtils.copyFile (source, new File("src\\test\\resources\\screenShot\\"+fileName+".jpg"));

        System.out.println("Screenshot taken");
        }catch (Exception e){
            System.out.println("Exception while taking screenshot" +e.getMessage());

        }
    }
}















































































































































































































































































