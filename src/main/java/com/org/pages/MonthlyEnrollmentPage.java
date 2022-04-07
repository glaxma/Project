package com.org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.org.globalpagefactory.BasePage;
import com.org.utilities.Log;

public class MonthlyEnrollmentPage extends BasePage {

	@FindBy(xpath = "//a[text()='Add ERP Policy ']")
	private WebElement btnAddErp;

	@FindBy(xpath = "//input[@id='inputFname1']")
	private WebElement txtfn;

	@FindBy(xpath = "//input[@id='inputLname1']")
	private WebElement txtln;

	@FindBy(xpath = "//input[@id='inputEmail1']")
	private WebElement txtemail;

	@FindBy(xpath = "//input[@id='inputPhone1']")
	private WebElement txtphn;

	@FindBy(xpath = "//input[@id='txtBirthDate1']")
	private WebElement txtdob;

	// Search Zip code

	@FindBy(xpath = "//input[@id='txtZipcodes']")
	private WebElement txtZipcode;

	@FindBy(xpath = "//input[@id='btnSearchProperty']")
	private WebElement txtZipcodeSearch;

	@FindBy(xpath = "//input[@type='radio'])[1]")
	private WebElement btnprop_radio;

	@FindBy(xpath = "//table[@id='tableLocations']/tbody/tr[1]/td[2]")
	private WebElement unitSelection;

	@FindBy(xpath = "//input[@id='btnSave']")
	private WebElement btnSave;

	public MonthlyEnrollmentPage(WebDriver driver) {
		super(driver);
	}

	public void addErp() {
		Assert.assertTrue(btnAddErp.isDisplayed());
		btnAddErp.click();
		Log.info("Successfully Navigated to Residents Details");

	}

	public void firstName(String firstName) {
		Assert.assertTrue(txtfn.isDisplayed());
		txtfn.sendKeys(firstName);
		Log.info("Successfully entered First Name:" + firstName);

	}

	public void lastName(String lastName) {
		Assert.assertTrue(txtln.isDisplayed());
		txtln.sendKeys(lastName);
		Log.info("Successfully entered Last Name:" + lastName);

	}

	public void email(String email) throws InterruptedException {
		Assert.assertTrue(txtemail.isDisplayed());
		Thread.sleep(1000);
		txtemail.sendKeys(email);
		Log.info("Successfully entered Email:" + email);

	}

	public void phone(String phone) throws InterruptedException {
		Assert.assertTrue(txtphn.isDisplayed());
		Thread.sleep(1000);
		txtphn.sendKeys(phone);
		Log.info("Successfully entered phnoe Number:" + phone);

	}

	public void dateOfBirth(String dob) throws InterruptedException {
		Assert.assertTrue(txtdob.isDisplayed());
		txtdob.sendKeys(dob);
		Log.info("Successfully entered date of birth:" + dob);
		Thread.sleep(6000);

	}

	// property Search methods

	public void sendkeyszipcode(String PropertyId) {
		Assert.assertTrue(txtZipcode.isDisplayed());
		txtZipcode.click();
		txtZipcode.sendKeys(PropertyId);
		Log.info("Successfully entered Zipcode:" + PropertyId);

	}

	public void sendkeysZipcodeSearch() {
		Assert.assertTrue(txtZipcodeSearch.isDisplayed());
		txtZipcodeSearch.click();
		Log.info("Successfully Clicked");

	}

	public void clickOnPropertyRadioButton() {
		Assert.assertTrue(btnprop_radio.isDisplayed());
		btnprop_radio.click();
		Log.info("Successfully Clicked");

	}

	public void clickOnUnitRadioButton() {
		Assert.assertTrue(unitSelection.isDisplayed());
		unitSelection.click();
		Log.info("Successfully Clicked");

	}

	public void clickOnSave() {
		Assert.assertTrue(btnSave.isDisplayed());
		btnSave.click();
		Log.info("Successfully Clicked on Save and Insured Question");
	}
}
