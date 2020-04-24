package stepDefinations;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends Base {
	public WebDriver driver;
	public HomePage hp;
	public CheckOutPage cp;

    @Given("^User is on GreenKart Landing Page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
    	driver=Base.getDriver();
		
    }

    @When("^User searched for \"([^\"]*)\" Vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
    	hp=new HomePage(driver);
       hp.getSearch().sendKeys(strArg1);
       Thread.sleep(5000);
    }

    
	@Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
		Assert.assertTrue(hp.getSearchText().getText().contains(strArg1));
		
      
    }
	
	@Then("^Verify Selected \"([^\"]*)\" items are displayed in checkout page$")
    public void verify_selected_something_items_are_displayed_in_checkout_page(String strArg1) throws Throwable {
		cp=new CheckOutPage();
        Assert.assertTrue(cp.getItemsAtCheckout().getText().contains(strArg1));
    }


    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
    	hp.getIncr().click();
    	hp.getAddtoCart().click();
    	
        
    }

    @And("^User proceeded to checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
    	cp.getCartButton().click();
    	cp.proceedToCheckout().click();
    }

}