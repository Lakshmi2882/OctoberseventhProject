package com.qa.opencart.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.constants.Constants;
import com.qa.opencart.basepage.basePageTest;

public class AccountpageTest extends basePageTest{

	@BeforeClass
	public void AccountPageSetUp()
	{
	account=login.doLogin("sbharadwaj06@gmail.com", "bmw26RIDE*");
	
	}
	@Test
	public void VerifyAccountpageTitle()
	{
		Assert.assertTrue(account.MyAccountlinkisDisplayed());
	}
	@Test
	public void AccountHeaders()
	{ System.out.println(account.AccountPageHeaders());
		Assert.assertEquals(account.AccountPageHeaders(), Constants.AccountHeaderlist());
	}
}
