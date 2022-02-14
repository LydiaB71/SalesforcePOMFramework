package com.salesforce.pages.loginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver){
		super(driver);

    }
	
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]") WebElement username;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[1]") WebElement password;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]") WebElement btnLogin;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[3]/input") WebElement remember;
	@FindBy(xpath="/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]") WebElement btnLogout;
	@FindBy(xpath="/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[1]/span") WebElement nameMenu;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div/a[1]") WebElement forgotPassword;
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/form/div[1]/input[1]") WebElement enterUsername;
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/form/div[1]/input[2]") WebElement submitUsername;
	public void enterIntoUsername(String usrName) {
		enterText(username, usrName);
		
	}
	public void enterIntoPassword(String passwrd) {
		enterText(password, passwrd);
	}
	public void enterIntoUsernameForgotPassword(String usrName) {
		enterText(enterUsername, usrName);
		
	}
	public void clickLoginButton() throws InterruptedException {
		clickElement(btnLogin);
		Thread.sleep(2000);
	}
	public void clickLogoutButton() {
		clickElement(nameMenu);
		clickElement(btnLogout);
	}
	public void clickSubmitButton() {
		clickElement(submitUsername);
	}
	public void clickRememberMe() {
		clickElement(remember);
	}
	public void clickForgotPassword() {
		clickElement(forgotPassword);
	}
	public void handleAlert() {
		AcceptAlert();
	}


}
