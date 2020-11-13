package com.dxc.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dxc.hrm.pages.DashboardPage;
import com.dxc.hrm.pages.LoginPage;
import com.dxc.qa.base.TestBase;

public class Dashboardtestcase extends TestBase {
	
	DashboardPage dash;
	LoginPage log;
	/*public Dashboardtestcase()
	{
		super();
	}*/
	
	/*@Test
	public void setup1()
	{
		intilization();
		
		dash=new DashboardPage();
	}*/
	@Parameters({"emp","usname"})
     @Test
     public void enteruserdata(String emp,String usname) throws InterruptedException
     {
    	 dash=new DashboardPage();
    	 dash.dashboardtitle();
    	 dash.adminlinkclick();
    	 dash.usernamangementclick();
    	 dash.userslinkclick();
    	 dash.adduserplusicon();
    	 dash.empname(emp);
    	 dash.empusername(usname);
    	 dash.cancelclick();
    	 
     }
}
