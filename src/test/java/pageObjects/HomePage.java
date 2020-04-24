package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cucumber.Automation.Base;

public class HomePage extends Base {
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search = By.xpath("//input[@class='search-keyword']");
	
	By searchItems = By.xpath("//p[@class='product-name']");
	
	By incr = By.xpath("//a[@class='increment']");
	
	By addtoCart= By.xpath("//button[contains(text(),'ADD TO CART')]");
	
	
	
	
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	
	public  WebElement getSearchText() {
		return driver.findElement(searchItems);
	}
	
	public WebElement getIncr() {
		return driver.findElement(incr);
	}
	
	public WebElement getAddtoCart() {
		return driver.findElement(addtoCart);
	}

}
