package com.qa.Opencart.Factory;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.UtilPackage.OptionsManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public Properties prop;
	public OptionsManager op;

	
	public static String highlight;
	public WebDriver initDriver(Properties prop)
	{    op= new OptionsManager(prop);
	highlight=prop.getProperty("hightlight");
		String browsername=prop.getProperty("browser");
		System.out.println("browsername is:"+browsername);
	
		if(browsername.trim().equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(op.getChromeOptions());
		
		}
		else if(browsername.trim().equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
			
		}
		else if(browsername.trim().equalsIgnoreCase("Safari"))
		{
			driver=new SafariDriver();
		}
		else if(browsername.trim().equalsIgnoreCase("Edge"))
		{
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("Enter correct browser name"+browsername);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		return driver;
	}
	/**
	 * Initialise properties from config
	 */
	public Properties initproperties()
	{
		 prop= new Properties();
		 try {
			FileInputStream ip= new FileInputStream("C:\\Users\\eddan\\eclipse-workspace\\Sepproject\\src\\test\\resources\\ConfigFile");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}
