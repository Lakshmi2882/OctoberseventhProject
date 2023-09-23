package com.qa.opencart.basepage;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.Opencart.Factory.DriverFactory;
import com.qa.Opencart.pages.AccountPage;
import com.qa.Opencart.pages.LoginPage;

public class basePageTest {
	// to create all objects of all pages and you can use methods by reference variable
	DriverFactory df;
	WebDriver driver;
	public Properties prop;
	protected LoginPage login;
	protected AccountPage account;
@BeforeTest
public void SetUp()
{
	df= new DriverFactory();// we need  driver 
	prop= df.initproperties();
			
	driver=df.initDriver(prop);//chrome , url
	login= new LoginPage(driver);//
}
@AfterTest
public void tearDown()
{
	//driver.quit();
}
}
