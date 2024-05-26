package com.addWish;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.addToWishlist;
import com.page.baseClass1;

public class addtowish extends baseClass1{
			
		@Test
		public void cart() throws InterruptedException {
			addToWishlist addwish = PageFactory.initElements(driver, addToWishlist.class);
//			addCart.addCart(driver);
			addwish.functionw();
		}

}
