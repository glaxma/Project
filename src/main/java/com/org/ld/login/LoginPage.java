package com.org.ld.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.org.globalpagefactory.BasePage;

import jdk.internal.org.jline.utils.Log;

public class LoginPage extends BasePage {

	@FindBy(xpath = "//input[@id='Login']")
	private WebElement txtUserName;

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement txtPassword;

	@FindBy(xpath = "//input[@value='LOG IN']")
	private WebElement btnLogin;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String userName, String password) {
		try {
			txtUserName.sendKeys(userName);
			Thread.sleep(3000);
			
			txtPassword.sendKeys(password);
			Thread.sleep(3000);
			
			btnLogin.click();

		} catch (Exception e) {
			e.getMessage();
		}

	}

}
