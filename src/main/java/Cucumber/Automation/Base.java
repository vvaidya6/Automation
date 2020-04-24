package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getDriver() throws IOException {
		
		prop =new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\vaibhav.vaidya\\eclipse-workspace_Rahul Shetty Course\\Automation\\src\\test\\java\\Cucumber\\Automation\\global.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhav.vaidya\\OneDrive - Accenture\\Desktop\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		return driver;

}

}