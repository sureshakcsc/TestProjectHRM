package com.dxc.hrm.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dxc.qa.base.TestBase;

public class DashboardPage extends TestBase {
	
	public DashboardPage()
	{
		PageFactory.initElements(driver,this);
	}
	//Admin Click 
	@FindBy(xpath="//span[@class='material-icons collapsible-indicator']")
	public WebElement adminlink;
	
	
	//user mgmt click
	
	@FindBy(xpath="//span[text()='User Management']/following-sibling::span")
	public WebElement usermgmtlink;
	
	//users click
	
	@FindBy(xpath="//span[contains(text(),'Users')]")
	public WebElement usersclick;
	
    //add user
	@FindBy(xpath="//i[contains(text(),'add')]")
	public WebElement addusericon;
	
	//enter emp name 
	
	@FindBy(xpath="//input[@id='selectedEmployee_value']")
	public WebElement  empname ;
	
	//enter username -suresh
	
	@FindBy(id="user_name")
	public WebElement empusername ;
	
	//cancelclick
	
	@FindBy(xpath="(//a[contains(@class,'modal-action modal-close')])[2]")
	public WebElement cancel;
	
	public String dashboardtitle()
	{
		
		return driver.getTitle();
	}
	
	//Action
	
	public void adminlinkclick()
	{
		adminlink.click();
	}
	public void usernamangementclick()
	{
		usermgmtlink.click();
	}
	public void userslinkclick()
	{
		usersclick.click();
	}
	public void adduserplusicon() throws InterruptedException
	{
		Thread.sleep(3000);
		addusericon.click();
	  //Alert alert=driver.switchTo().alert();
		//System.out.println(driver.getWindowHandles().size());
		
			
	}
	
	//empnametextbox 
	
	public void empname(String emp) throws InterruptedException
	{
		Thread.sleep(3000);
		empname.sendKeys(emp);
	}
	
	public void empusername(String usname)
	{
		empusername.sendKeys(usname);
	}
	public void cancelclick()
	{
		cancel.click();
	}
}

