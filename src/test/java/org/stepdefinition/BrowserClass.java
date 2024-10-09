package org.stepdefinition;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Set;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrowserClass extends BaseClass{
	PojoClass p;
	
	@Given("User enter into chrome browser and open the amazon url")
	public void user_enter_into_chrome_browser_and_open_the_facebook_url() {
	   chromeBrowser();
	   maxWindow();
	   fetchUrl("https://www.amazon.in/");
	}

	

	@When("User click and search electronics")
	public void user_click_and_search_electronics() {
	  p = new PojoClass();
	  buttonClick(p.getBtnClick());
	}

	@When("User click and search mobile accessories")
	public void user_click_and_search_mobile_accessories() {
      
	  p = new PojoClass();
	  Actions actions = new Actions(driver);
	  
	  try {
		Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}
	  p.moveToMobileAccessories(actions);
	  
	}

	
	
	@When("User select the product screen guard")
	public void userSelectTheProductScreenGuard() {
		 p = new PojoClass();
		 buttonClick(p.getScrgrdClick());
		  try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		 buttonClick(p.getScritemClick());  
	}

	@When("User select the add to cart button and click the proceed to buy button")
	public void userSelectTheAddToCartButtonAndClickTheProceedToBuyButton() {
	   p = new PojoClass();
			   buttonClick(p.getCartClick());
			   
	}

	@Then("User taken screenshot for the confirmation")
	public void userTakenScreenshotForTheConfirmation() throws IOException {
	   TakesScreenshot tk= (TakesScreenshot) driver;
	   File ScreenShotAs = tk.getScreenshotAs(OutputType.FILE);
	   File f =new File(("D:\\Java-selenium\\screenshot\\amazon.png"));
	   FileUtils.copyFile(ScreenShotAs, f);
	   
	}

}
