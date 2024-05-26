package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class signUpPage {

	WebDriver driver;

	public void signupPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement register;

	@FindBy(id = "gender-male")
	WebElement gender;

	@FindBy(id = "FirstName")
	WebElement firstName;

	@FindBy(id = "LastName")
	WebElement lastName;

	@FindBy(name = "DateOfBirthDay")
	WebElement date;

	@FindBy(name = "DateOfBirthMonth")
	WebElement month;

	@FindBy(name = "DateOfBirthYear")
	WebElement year;

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "Company")
	WebElement company;

	@FindBy(id = "Password")
	WebElement pass;

	@FindBy(id = "ConfirmPassword")
	WebElement cnfPass;

	@FindBy(id = "register-button")
	WebElement submit;

	public void signUpNop(String FirstName, String LastName, String eml, String comp, String passw, String cnfPassw) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		register.click();

		gender.click();

		firstName.sendKeys(FirstName);

		lastName.sendKeys(LastName);

		Select date1 = new Select(date);
		date1.selectByValue("31");

		Select month1 = new Select(month);
		month1.selectByValue("1");

		Select year1 = new Select(year);
		year1.selectByValue("1998");

		email.sendKeys(eml);

		company.sendKeys(comp);

		pass.sendKeys(passw);

		cnfPass.sendKeys(cnfPassw);

		submit.click();
	}

}
