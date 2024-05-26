package com.signup;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.baseClass;
import com.page.signUpPage;

public class signUp extends baseClass{
	
	@Test
	public void signUpTest() {
		signUpPage SignUpPage = PageFactory.initElements(driver, signUpPage.class);
		SignUpPage.signUpNop("Shivam", "Agrawal", "shivam@310198@gmail.com", "shivam", "shivam", "shivam");
	}

}
