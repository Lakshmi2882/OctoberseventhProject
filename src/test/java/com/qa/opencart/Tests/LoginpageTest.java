package com.qa.opencart.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.basepage.basePageTest;

public class LoginpageTest extends basePageTest{
@Test
public void PageTitleTest()
{
	Assert.assertEquals(login.getLoginPageTitle(), "Account Login");
}


}
