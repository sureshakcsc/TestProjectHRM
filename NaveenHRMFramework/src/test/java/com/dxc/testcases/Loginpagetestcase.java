package com.dxc.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dxc.hrm.pages.DashboardPage;
import com.dxc.hrm.pages.LoginPage;
import com.dxc.qa.base.TestBase;

public class Loginpagetestcase extends TestBase {
	
	LoginPage log;
	DashboardPage dash;
	
	public  Loginpagetestcase()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setupmethod()
	{
		intilization();
		
		log=new LoginPage();
		
	}
	
	@Test
	public void loginmethod() throws InterruptedException {
		Thread.sleep(5000);
		//dash=log.login(prop.getProperty("Username"),prop.getProperty("Password"));
		dash=log.login("Admin", "Ag7GDtCs2@");
	}
	
   /* @AfterMethod
    public void teardownmethod()
    {
    	driver.quit();
    }*/
}
