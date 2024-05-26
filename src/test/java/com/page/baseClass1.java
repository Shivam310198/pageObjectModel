package com.page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utility.browserFactory;

public class baseClass1 {
	public WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {
		driver = browserFactory.startApp(driver, "Edge", "https://demo.nopcommerce.com/");
		Thread.sleep(4000);
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		browserFactory.quitApp(driver);
	}

}
