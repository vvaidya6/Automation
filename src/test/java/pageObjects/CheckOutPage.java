package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cucumber.Automation.Base;

public class CheckOutPage extends Base {
	
	@FindBy(xpath="//a[@class='cart-icon']//img[contains(@class,'')]")
	WebElement cartBtn;
	
	@FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	WebElement proceed;
	
	@FindBy(xpath="//p[@class='product-name']")
	WebElement itemsAtCheckout;
	
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCartButton() {
		return cartBtn;
	}
	
	public WebElement proceedToCheckout() {
		return proceed;
	}
	
	public WebElement getItemsAtCheckout() {
		return itemsAtCheckout;
	}

}
