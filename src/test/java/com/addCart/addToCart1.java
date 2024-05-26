package com.addCart;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.addToCart;
import com.page.baseClass1;

public class addToCart1 extends baseClass1{
	
	@Test
	public void cart() throws InterruptedException {
		addToCart addCart = PageFactory.initElements(driver, addToCart.class);
//		addCart.addCart(driver);
		addCart.function();
	}

}
