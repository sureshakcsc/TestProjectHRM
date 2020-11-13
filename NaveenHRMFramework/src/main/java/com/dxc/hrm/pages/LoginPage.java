package com.dxc.hrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.dxc.qa.base.TestBase;

public class LoginPage extends TestBase {
	
 
	 public LoginPage()
	 {
		// this.driver=driver;
	 PageFactory.initElements(driver,this);
	 }
	

	//Pagefactory 
	
	 
	@FindBy(how=How.XPATH,using="//input[@name='txtUsername']") 
//	@FindBy(id="txtUsername")
	
	WebElement username;
	
   @FindBy(id="txtPassword")
	
	WebElement password;
   
   @FindBy(id="btnLogin")
   
   WebElement submit;
   
   public DashboardPage login(String un,String pwd)
   {
	   username.sendKeys(un);
	   password.sendKeys(pwd);
	   submit.click();
	 return new DashboardPage();
   }
   
  
	
}
