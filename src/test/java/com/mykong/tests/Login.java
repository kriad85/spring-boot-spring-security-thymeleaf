package com.mykong.tests;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class Login { 
   WebDriver driver = null; 
   @Given("^I am on MyKong login page$") 
	
   public void goToMyKong() { 
	  System.setProperty("webdriver.gecko.driver", "C:\\SeleniumGecko\\geckodriver.exe");
      driver = new FirefoxDriver(); 
      driver.navigate().to("http://localhost:8080/login"); 
   }
	
   @When("^I enter username as \"(.*)\"$") 
   public void enterUsername(String arg1) {   
      driver.findElement(By.id("username")).sendKeys(arg1); 
   }
	
   @When ("^I enter password as \"(.*)\"$") 
   public void enterPassword(String arg1) {
      driver.findElement(By.id("password")).sendKeys(arg1);
      driver.findElement(By.id("signin")).click(); 
   } 
	
   @Then("^Login should fail$") 
   public void checkFail() {  
      if(driver.getCurrentUrl().equals("http://localhost:8080/login?error")) {
    	  System.out.println("Login failed");
      }
      else {
    	  System.out.println("Login successful");
      }
      driver.close(); 
   }
} 
