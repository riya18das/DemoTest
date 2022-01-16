package com.crm.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignIn;

public class SignInpageTest extends TestBase {
	SignIn signinObj;
	LoginPage login;
	 
	public SignInpageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		signinObj = new SignIn();
}
	@Test
	public void verifyFirstLogin() throws InterruptedException {
		login = signinObj.firstPagelogin();
		Thread.sleep(5);
		}
		
	@AfterMethod
	public void tearDown(){
	driver.quit();
	}
}
