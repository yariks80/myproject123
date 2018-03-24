package com.company.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {


	@FindBy(name = "login")
	private WebElement inputLogin;

	@FindBy(name = "pass")
	private WebElement inputPassword;

	@FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
	private WebElement btnLogin;



	public void login(String name, String password) {
		log.info("set input name - "+name);
		driver.jsSetValue(inputLogin,name);
		log.info("set input password - "+password);
		driver.jsSetValue(inputPassword,password);
		btnLogin.click();
	}




}
