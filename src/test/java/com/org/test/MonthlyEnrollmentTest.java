package com.org.test;

import org.testng.annotations.Test;

import com.org.globaltest.BaseTest;
import com.org.pages.MonthlyEnrollmentPage;
import com.org.utilities.ReadProperty;



public class MonthlyEnrollmentTest extends BaseTest {

	@Test(priority=1, enabled=true)
	public void VerifyAddResident() throws InterruptedException {
		MonthlyEnrollmentPage monthlyEnrollmentPage = new MonthlyEnrollmentPage(getdriver());
		monthlyEnrollmentPage.addErp();
		monthlyEnrollmentPage.firstName(ReadProperty.readProperty("firstName"));
		monthlyEnrollmentPage.lastName(ReadProperty.readProperty("lastName"));
		monthlyEnrollmentPage.email(ReadProperty.readProperty("email"));
		monthlyEnrollmentPage.phone(ReadProperty.readProperty("phone"));
		monthlyEnrollmentPage.dateOfBirth(ReadProperty.readProperty("dob"));
	}
	@Test(priority=2, enabled=false)
	public void verifyPropertySearch() throws InterruptedException {
		VerifyAddResident();
		MonthlyEnrollmentPage monthlyEnrollmentPage = new MonthlyEnrollmentPage(getdriver());
		monthlyEnrollmentPage.sendkeyszipcode(ReadProperty.readProperty("PropertyId"));
		monthlyEnrollmentPage.sendkeysZipcodeSearch();
		monthlyEnrollmentPage.clickOnPropertyRadioButton();
		monthlyEnrollmentPage.clickOnUnitRadioButton();
		monthlyEnrollmentPage.clickOnSave();
	}

}
