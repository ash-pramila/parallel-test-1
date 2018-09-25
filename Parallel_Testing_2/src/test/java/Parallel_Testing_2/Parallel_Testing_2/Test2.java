package Parallel_Testing_2.Parallel_Testing_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
 
import org.testng.annotations.BeforeMethod;
 
import org.testng.annotations.AfterMethod;
 
public class Test2 {
 
	public WebDriver driver;
 
  @Test
 
  public void main() {
 
	// Find the element that's ID attribute is 'account'(My Account)
 
     System.out.println(driver.getCurrentUrl());
     System.out.println(driver.getTitle());
    
 
  }
 
  @BeforeMethod
 
  public void beforeMethod() {
 
	
	  System.setProperty("webdriver.ie.driver","D:\\Drivers\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe");
	  
      driver = new InternetExplorerDriver();
 
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      //Launch the Online Store Website
 
      driver.get("http://newtours.demoaut.com/create_account_success.php");
 
  }
 
  @AfterMethod
 
  public void afterMethod() {
 
	  // Close the driver
	  
      driver.quit();
 
  }
 
}