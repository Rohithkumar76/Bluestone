package com.tys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tys.generics.BasePage;

public class ProductDetailsPage extends BasePage {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@id='details-top-right-inner']//form//h1")
	private WebElement productHeaddetails;

	public String getProdName() {

		return productHeaddetails.getText();

	}

}
