package com.qa.Opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
 public WebDriver driver;
 private By Accountlink=By.partialLinkText("My Account");
 private By AccountHeaders= By.cssSelector("div#content h2");
 private By Searchbar= By.xpath("//input[@name='search']");
 public AccountPage(WebDriver driver)
 {
	 this.driver=driver;
 }
	
 public String AccountpageTitle()
 {
	String text=driver.getTitle();
	System.out.println(text);
	return text;
 }
 public boolean MyAccountlinkisDisplayed()
 {
	return driver.findElement(Accountlink).isEnabled();
 }
 public ArrayList<String> AccountPageHeaders()
 {
	List<WebElement> AccountHeaderlist= driver.findElements(AccountHeaders);
	ArrayList<String> Headerlist= new ArrayList<String>();
	for(WebElement e:  AccountHeaderlist )
	{
		 String text=e.getText();
		Headerlist.add(text);
		 
	}
	return Headerlist;
 }
 
 
 
}
