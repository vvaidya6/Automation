package stepDefinations;

import Cucumber.Automation.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	
	@Before("@MobileTest")
	public void beforeMobileValidation() {
		System.out.println("Before mobile validation");
	}
	
	@After("@MobileTest")
	public void afterMobileValidation() {
		System.out.println("After mobile validation");
	}
	
	@Before("@WebTest")
	public void beforeWebValidation(){
		System.out.println("Before web validation");
	}
	
	@After("@SeleniumTest")
	public void afterTestValidation() {
		driver.close();
	}

	
	
	@After("@WebTest")
	public void afterWebValidation() {
		System.out.println("After web validation");
	}

}
