package com.DemoNopCommarce;

import org.openqa.selenium.By;

public class VirtualGiftCardPage extends Utils{
    String myEmail = "abc" + timeStamp() + "@yahoo.com";
    String recipientEmail = "automation" + timeStamp() + "@yahoo.com";

    By _recipientName =  By.id("giftcard_43_RecipientName");
    By _recipientEmail = By.id("giftcard_43_RecipientEmail");
    By _yourName =By.id("giftcard_43_SenderName");
    By _yourEmail =By.id("giftcard_43_SenderEmail");


    public void fillingAllPersonalDetail(){
        typeText(_recipientName,"Sita");
        typeText(_recipientEmail, recipientEmail);
        typeText(_yourName,"Radha");
        typeText(_yourEmail,myEmail);


    }


}
