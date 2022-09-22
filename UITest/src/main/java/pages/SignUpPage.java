package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUpPage {
	WebDriver driver;

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator for login button
	By singup = By.xpath("//body[@id='iframewrap']//*[contains(text(),'Sign up')]");
	By name = By.xpath("//input[@name='name']");
	By surname = By.xpath("//input[@name='surname']");
	By email = By.xpath("//input[@name='email']");
	By checkbox = By.xpath("(//div[@class='checkbox-input__holder clearfix']//button[@type='button'])[1]");
	By submitbutton = By.xpath("//button[@type='submit']");
	By thankyou = By.xpath("//*[text()='Thank you']");

	public void signup() throws InterruptedException {
		Actions actions = new Actions(driver); 
		actions.click().perform(); 
		Thread.sleep(2000);
		driver.findElement(singup).click();
		  
	}
	public void name(String str) {
		driver.findElement(name).sendKeys(str);
	}
	public void surname(String str) {
		driver.findElement(surname).sendKeys(str);
	}
	public void email(String str) {
		driver.findElement(email).sendKeys(str);
	}
	public void checkbox() {
		Actions actions = new Actions(driver);
		actions.click().perform();
		driver.findElement(checkbox).click();
	}
	public void submitbutton() {
		driver.findElement(submitbutton).click();
	}
	public String getText() {
		return driver.findElement(thankyou).getText();
	}
}
