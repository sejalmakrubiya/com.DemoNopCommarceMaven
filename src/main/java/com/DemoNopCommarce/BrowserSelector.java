package com.DemoNopCommarce;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends Utils {

    static String browserName="Firefox";

    public void selectBrowser() {
        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\browserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\browserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();

        }
    }
}
