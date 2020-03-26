package com.page_objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageFactoryObjects {

	@FindBy(xpath = "//*[contains(text(),'Sign in')]")
	private List<WebElement> signIn;

	@FindBy(xpath = "//input[@id='email']")
	private List<WebElement> Email;

	@FindBy(xpath = "//input[@id='passwd']")
	private List<WebElement> Password;

	@FindBy(xpath = "//i[@class='icon-lock left']")
	private List<WebElement> signButton;

	@FindBy(xpath = "(//*[@class='sf-with-ul'])[4]")
	private List<WebElement> dressesBtn;

	@FindBy(xpath = "//*[@id='selectProductSort']")
	private List<WebElement> drpDwn;
	
	@FindBy(xpath = "//*[@class='product-image-container']")
	private List<WebElement> allDress;
	

	@FindBy(xpath = "//*[contains(text(),'Add to cart')]")
	private List<WebElement> addToCart;
	
	
	@FindBy(xpath = "//*[@id='total_price_container']")
	private List<WebElement> totalPrice;
	

	@FindBy(xpath = "//*[contains(text(),'Proceed to checkout')]")
	private List<WebElement> procced;
	
	public List<WebElement> getSignIn() {
		return signIn;
	}

	public List<WebElement> getEmail() {
		return Email;
	}

	public List<WebElement> getPassword() {
		return Password;
	}

	public List<WebElement> getSignButton() {
		return signButton;
	}

	public List<WebElement> getDressesBtn() {
		return dressesBtn;
	}

	public List<WebElement> getDrpDwn() {
		return drpDwn;
	}

	public List<WebElement> getAllDress() {
		return allDress;
	}

	public List<WebElement> getAddToCart() {
		return addToCart;
	}

	public List<WebElement> getTotalPrice() {
		return totalPrice;
	}

	public List<WebElement> getProcced() {
		return procced;
	}
	
	

}
