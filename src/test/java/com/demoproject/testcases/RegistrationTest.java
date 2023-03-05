package com.demoproject.testcases;

import org.testng.annotations.Test;

import com.demoproject.pageobject.RegistrationPage;

public class RegistrationTest extends BaseClass {
	
	@Test
	public void registration()
	{
		
		RegistrationPage pg=new RegistrationPage(driver);
		pg.clickOnRegisterButton();
		pg.enterfirstname("Dweep");
		pg.selectCountry("INDIA");
		
		
	}

}
