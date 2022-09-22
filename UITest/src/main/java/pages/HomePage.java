package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HomePage {
	WebDriver driver;

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator for login button
	By LoginBtn = By.xpath("//a[@class='js-search-toggler header__controls-link']");
	By searchfield = By.xpath("//input[@type='search']");
	By clicksearchimage = By.xpath("//button[@class='cta-primary search__button']']");
	By acceptcookies = By.xpath("//button[text()='Accept all cookies']");
	By focusinsights = By.xpath("//label[contains(text(),'Focus Insights')]");

	// Method to click login button
	public void clicksearchbutton() {
		driver.findElement(LoginBtn).click();
	}

	public void enterSearchStr(String str) {
		driver.findElement(searchfield).sendKeys(str);
		System.out.println("The search string is : " + str);
		driver.findElement(searchfield).sendKeys(Keys.ENTER);
	}

	public void acceptcookies() {
		driver.findElement(acceptcookies).click();

	}

	public void clicksearchimage() {
		driver.findElement(clicksearchimage).click();

	}

	public void focussinsights() {
		driver.findElement(focusinsights).click();

	}
}