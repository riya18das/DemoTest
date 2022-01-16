package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignIn extends TestBase{

	@FindBy(xpath = "//a[contains(@class,'btn btn-primary btn')]")
	WebElement signin;
	
	public SignIn() {
		PageFactory.initElements(driver, this);
	}
		
	public LoginPage firstPagelogin() {
		signin.click();
		return new LoginPage();	
	}
		
}

