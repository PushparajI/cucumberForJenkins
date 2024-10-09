package org.stepdefinition;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver driver;
	JavascriptExecutor js;
	
	public static void chromeBrowser() {
		driver= new ChromeDriver();

	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();

	}
	
	public static void fetchUrl(String url) {
		driver.get(url);

	}
	
	
	
	public void clickElementByJs(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	
	}
	
	public static void buttonClick(WebElement valueClick) {
		valueClick.click();
	}
	


}
