package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.BasePage;
import com.qa.Base.Configuration;



public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//nav[@class='main-menu']")
	private WebElement mainMenu;

	@FindBy(xpath = "//div[@id='books-wrapper']//button")
	private WebElement logOut;
	
	@FindBy(xpath = "//label[@id='userName-value']")
	private WebElement userName;
	
		
	/**
	 * logout from the application
	 * @throws Exception 
	 */
	public LoginPage logOut(String username) throws Exception {
		String userNames = Configuration.readApplicationFile(username);
		verifyElementText(userName, userNames);		
		waitAndClick(logOut);
		return PageFactory.initElements(getDriver(), LoginPage.class);
	}

	
	
}
