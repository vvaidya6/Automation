package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import Cucumber.Automation.Base;

@RunWith(Cucumber.class)
public class StepDefination extends Base {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       System.out.println("Validated Landing page");
    }
    
    
    @When("^User login in to application with username and password$")
    public void user_login_in_to_application_with_username_and_password() throws Throwable {
       System.out.println("Logged in successfully");
    }
    
    @When("^User login in to application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_in_to_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("Logged in successfully");
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    	
    }

    @Then("^Home Page is Displayed$")
    public void home_page_is_displayed() throws Throwable {
        System.out.println("Home page validated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
       System.out.println("Cards validated");
    }
    
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
       System.out.println(arg1);
    }
    
    @When("^User need to signup with below details$")
    public void user_need_to_signup_with_below_details(DataTable data) throws Throwable {
    List<List<String>> obj	=data.raw();
        System.out.println(obj.get(0).get(0));  //as we have only one row thats why get(0)--- first get(0) refers row and other one is column
        System.out.println(obj.get(0).get(1)); 
        System.out.println(obj.get(0).get(2)); 
        System.out.println(obj.get(0).get(3)); 
        System.out.println(obj.get(0).get(4)); 
        System.out.println(obj.get(0).get(5)); 
    }
    
    @When("^User Login in to application with username (.+) and password (.+)$")
    public void user_login_in_to_application_with_username_and_password(String username, String password) throws Throwable {
        	System.out.println(username);
        	System.out.println(password);
    }
    

    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
       System.out.println("Validated the browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered successfully");
       
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	
    	System.out.println("Check if browser is started");
    	
       
    }
}