package com.page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.utility.browserFactory;

public class baseClass {
public WebDriver driver;
	

	
	@BeforeClass
	public void setup() {
		driver = browserFactory.startApp(driver, "Chrome", "https://demo.nopcommerce.com/");
	}
	
	@AfterClass
	public void teardown() {
		browserFactory.quitApp(driver);
	}


}
