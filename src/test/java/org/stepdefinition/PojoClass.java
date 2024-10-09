package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{

	public PojoClass() {
		PageFactory.initElements(driver, this);             
	}
	
	@FindBy(xpath="//a[text()=' Electronics ']")
	private WebElement btnClick;

	public WebElement getBtnClick() {
		return btnClick;
	}
	
	@FindBy(xpath="(//span[@class='nav-a-content'])[2]")
	private WebElement mblAccess;

	public WebElement getMblAccess() {
		return mblAccess;
	}
    public void moveToMobileAccessories(Actions actions) {
		actions.moveToElement(mblAccess).perform();

	}
	
	@FindBy(xpath="//a[text()='Screen guards']")
	private WebElement scrgrdClick;

	
	
	public WebElement getScrgrdClick() {
		return scrgrdClick;
	}

	@FindBy(xpath="(//div[@class='a-section octopus-pc-item-hue-shield octopus-pc-item-image-background-v3'])[2]")
	private WebElement scritemClick;
	
	public WebElement getScritemClick() {
		return scritemClick;
	}
	
	@FindBy(id="add-to-cart-button")
	private WebElement cartClick;

	
	public WebElement getCartClick() {
		return cartClick;
	}
}
