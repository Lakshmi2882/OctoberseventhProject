package com.qa.Opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.UtilPackage.ElementUtil;

public class LoginPage {
//1. Private By locators
	private WebDriver driver;
	private ElementUtil eutil;
	private By emailid= By.id("input-email");
	private By password= By.id("input-password");
	private By loginbutton= By.xpath("//input[@type='submit']");
	private By forgotpasswordlink= By.linkText("Forgotten Password");
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		eutil=new ElementUtil(driver);
	}
	public String getLoginPageTitle()
	{
	return	driver.getTitle();
	}
	public String getCurrentURL()
	{
		return driver.getCurrentUrl();
	}
	public boolean ForgotPasswordExist()
	{
return	driver.findElement(forgotpasswordlink).isDisplayed();
//private variable used in public method is called Encapsulation
	}
	public AccountPage doLogin(String un, String pwd)
	{
		//driver.findElement(emailid).sendKeys(un);
		eutil.getElement(emailid).sendKeys(un);
		//driver.findElement(password).sendKeys(pwd);
		eutil.getElement(password).sendKeys(pwd);
		//driver.findElement(loginbutton).click();
		eutil.doClick(loginbutton);
		return new AccountPage(driver);
	}
}
