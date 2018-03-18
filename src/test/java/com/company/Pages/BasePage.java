package com.company.Pages;

import com.company.Driver.MyDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
   protected   static MyDriver driver= MyDriver.getMyDriver();
   protected  static WebDriverWait wait= new WebDriverWait(driver,10);;


    public BasePage() {

        PageFactory.initElements(driver,this);
    }
}
