package com.company.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AfterLoginPage  extends BasePage{
	@FindBy(xpath = "//li/span[@class='sn_menu_title']")
	private WebElement userEmail;



    public String getUserEmail() {
		return userEmail.getText();
	}


}
