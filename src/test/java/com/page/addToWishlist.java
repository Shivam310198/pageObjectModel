package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class addToWishlist {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/h2/a")
	WebElement product;

	@FindBy(xpath = "//*[@id=\"product_attribute_1\"]")
	WebElement processor;

	@FindBy(xpath = "//*[@id=\"product_attribute_2\"]")
	WebElement ram;

	@FindBy(xpath = "//*[@id=\"product_attribute_3_7\"]")
	WebElement hdd;

	@FindBy(xpath = "//*[@id=\"product_attribute_4_9\"]")
	WebElement os;

	@FindBy(xpath = "//*[@id=\"product_attribute_5_12\"]")
	WebElement software;

	@FindBy(xpath = "//*[@id=\"add-to-wishlist-button-1\"]")
	WebElement btn;

	public void functionw() throws InterruptedException {

		Thread.sleep(2000);
		product.click();
		Thread.sleep(2000);
		Select drpdwn = new Select(processor);
		drpdwn.selectByValue("1");
		
		Thread.sleep(2000);
		Select drpdwn1 = new Select(ram);
		drpdwn1.selectByValue("4");
		
		Thread.sleep(2000);
		hdd.click();
		Thread.sleep(2000);
		os.click();
		Thread.sleep(2000);
		software.click();
		Thread.sleep(2000);
		btn.click();
		Thread.sleep(2000);
	}


}
