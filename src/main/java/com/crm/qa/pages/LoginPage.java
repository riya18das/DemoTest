package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//PageFactory or OR	
	@FindBy(xpath = "//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//div[contains(@class,'ui fluid large blue submit button')]")
	WebElement submit;
	
	@FindBy(xpath = "//a[contains(@class,'btn btn-sm btn-primary btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30')])")
	WebElement signUp;
	
	@FindBy(xpath = "(//a[@class='brand-name'])[1]")
	WebElement logo;
	
	//Initializing the Page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return logo.isDisplayed(); 
		
	}
	
		
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		submit.click(); 
		return new HomePage();
	}
		
		
		
	
		
	}

