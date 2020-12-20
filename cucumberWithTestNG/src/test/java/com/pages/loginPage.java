package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.base;

public class loginPage extends base{

	@FindBy(name="email")
	WebElement userId;
	@FindBy(name="email")
     WebElement userID;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//div[@class=\"ui fluid large blue submit button\"]")
	WebElement loginBtn;
	@FindBy(xpath="//div[@class=\"header item\"]")
	 WebElement masterMenu;
	
	public loginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void checkUserField() {
		userId.isDisplayed();
   
		
	}
	@Parameters(value = { "userName" })
	public void useID(String userName) {
		userID.sendKeys(userName);
		// driver.findElement(by.name("email")).sendKeys(userName);
	}

	public void passWord(String pssword) {
		userID.sendKeys(pssword);
	}

	public void loginButton() {
		loginBtn.click();
	}

	public void masterMenuIcon() {
		masterMenu.click();
	}
	

	public void logIN(String userName, String pssword) {
		userID.sendKeys(userName);
		password.sendKeys(pssword);
		loginBtn.click();
	}
	
}
