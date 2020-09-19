package com.DemoNopCommarce;

import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {

    @Before
    public void openBrowser(){
        BrowserSelector browserSelector=new BrowserSelector();
        browserSelector.selectBrowser();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }
   // @After
    //public void closeBrowser(){
       // driver.quit();
    //}


}
