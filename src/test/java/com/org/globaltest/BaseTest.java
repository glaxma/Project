package com.org.globaltest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.org.ld.login.LoginPage;
import com.org.utilities.Log;
import com.org.utilities.ReadProperty;

public class BaseTest {

	private WebDriver driver;

	@BeforeSuite
	public void initialize() throws IOException {
		DOMConfigurator.configure("C:\\Users\\lginne\\eclipse-workspace\\NewLesingdesk\\resources\\log4j.xml");
		ReadProperty.initializepropertyFile();

	}

	@BeforeMethod
	public void openBrowser(Method method) {

		System.setProperty("webdriver.chrome.driver",
				"..\\NewLesingdesk\\driver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(chromeOptions);
		Log.error("Browser name please check");
		driver.get(ReadProperty.readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Log.startTestcase(method.getName());
		Log.info("Successfully launched browser");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		Log.info("Successfully Closed the browser");
		Log.endTestcase();
	}

	@BeforeMethod(dependsOnMethods="openBrowser")
	public void login() {
		LoginPage loginpage = new LoginPage(getdriver());
		loginpage.login(ReadProperty.readProperty("userName"), ReadProperty.readProperty("password"));
	}

	public WebDriver getdriver() {
		return driver;
	}
}
