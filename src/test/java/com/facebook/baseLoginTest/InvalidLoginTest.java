package com.facebook.baseLoginTest;

import org.testng.annotations.Test;

import com.facebook.base.BaseTest;

import pom_PageFactory.LoginPageWithPageFactory;

public class InvalidLoginTest extends BaseTest{
	LoginPageWithPageFactory lpf;
	
	@Test
	public void validLoginTest() {
	lpf= new LoginPageWithPageFactory(driver);
	lpf.userNameMethod("Nurul");
	lpf.passWordMethod("uou44444");
	lpf.logingButton();
	}

}