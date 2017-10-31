package com.tys.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.tys.generics.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@id='login']")
	private WebElement loginBTN;

	@FindBy(xpath = "//input[@id='email-id']")
	private WebElement emailIDF;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordF;

	@FindBy(xpath = "//input[@id='edit-login-account']")
	private WebElement signInBtn;

	@FindBy(xpath = "//input[@id='search_query_top_elastic_search']")
	private WebElement searchBar;

	@FindBy(xpath = "//input[@name='submit_search']")
	private WebElement searchButton;

	@FindBy(xpath = "//span[@class='inner' and .='Rings ']")
	private WebElement ringsLink;

	@FindBy(xpath = "//span[@id='wishListCountHeader']")
	private WebElement wishListCount;

	@FindBy(xpath = "//span[@class='cart-count']")
	private WebElement cartItemCount;

	@FindBy(xpath = "//a[contains(.,'Cart')]")
	private WebElement cartIcon;
	
	
	@FindBy(xpath = "//a[@title='BlueStone']")
	private WebElement bluestoneLogo;
	
	@FindBy(xpath = "//span[.='All about Jewellery']")
	private WebElement allAboutjewLink;
	
	@FindBy(xpath = "//div[@class='formErrorContent']")
	private WebElement errorMsg;
	
	

	public void ClickLogin() {
		loginBTN.click();
	}

	public void setUserName(String un) {
		emailIDF.sendKeys(un);
	}

	public void setPassWord(String pw) {
		passwordF.sendKeys(pw);
	}

	public void ClickSignIn() {
		signInBtn.click();
	}

	public void enterProductName(String searchProdName) {
		searchBar.sendKeys(searchProdName);
	}

	public void clickSearchButton() {
		searchButton.click();
	}

	public void ClicOnRings() {
		ringsLink.click();

	}

	public int getWishListCount() {
		return Integer.parseInt(wishListCount.getText());

	}

	public int getCartItemCount() {
		return Integer.parseInt(cartItemCount.getText());

	}

	public void ClicOnCart() {
		cartIcon.click();

	}

	public void ScrollPage() {

		int x = allAboutjewLink.getLocation().getX();
		int y = allAboutjewLink.getLocation().getY();
		// JavascriptExecutor j = (JavascriptExecutor)driver;
		/*
		 * for (int i = 0; i <=10; i++) { j.executeScript("window.scrollBy(0,500)"); }
		 */

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(" + x + "," + y + ")");
		allAboutjewLink.click();

		// return new int[] {x,y};
	}

	public boolean verifyTooltip(String expTooltip) {

		String actTooltip = bluestoneLogo.getAttribute("title");
		System.out.println("dfsfsfds");
		System.out.println(actTooltip);
		
		if (actTooltip.equals(expTooltip)) {
			return true;
		} else {
			return false;
		}
	}

}
