package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public SearchResultsPage(WebDriver driver) {
		this.driver=driver;
	}
	By undetsandingcashinvestment = By.xpath("//*[contains(text(), 'Understanding')]");
	public void clickOnUndetsandingcashinvestmentlink() {
		driver.findElement(undetsandingcashinvestment).click();

	}
}
