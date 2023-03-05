package com.demoproject.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	WebDriver ldriver;
	
	public RegistrationPage(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement Registerbutton;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//select[@name='country']")
	WebElement country;
 
	public void clickOnRegisterButton()
	{
		Registerbutton.click();;
	}
	public void enterfirstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void selectCountry(String text)
	{
		Select obj = new Select(country);
		obj.selectByVisibleText(text);
	}
}
