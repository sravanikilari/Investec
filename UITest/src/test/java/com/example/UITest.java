package com.example;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;
import pages.SignUpPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UITest {
	WebDriver driver;

	@Test
	public void scenario1() throws InterruptedException {
		System.out.println("--------Start Test----------------");

		driver.get("https://www.investec.com/");
		driver.manage().window().maximize();
		System.out.println("Before" + driver.getTitle());

		HomePage home = new HomePage(driver);
		home.clicksearchbutton();
		home.enterSearchStr("cash investment rates");
		home.acceptcookies();
		home.focussinsights();

		SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
		searchResultsPage.clickOnUndetsandingcashinvestmentlink();
		driver.navigate().refresh();

		SignUpPage signup = new SignUpPage(driver);
		signup.signup();
		signup.name("sravani");
		signup.surname("kilari");
		signup.email("test@investec.co.za");
		signup.checkbox();
		signup.submitbutton();
		Thread.sleep(5000);
		Assert.assertEquals("Thank you", signup.getText());

	}

	@BeforeTest
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

	}

	@AfterTest
	public void afterMethod() { // close and quit the browser
		driver.quit();
	}

}
