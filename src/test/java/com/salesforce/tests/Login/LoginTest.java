package com.salesforce.tests.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.utility.CommonUtilities;

public class LoginTest extends BaseTest{
	
	@Test(enabled = true)
	public void invalidLoginTest() throws InterruptedException {
		System.out.println("entering to logintest @test");
		String username=CommonUtilities.getApplicationProperty("username");
		loginPage.enterIntoUsername(username);
		loginPage.enterIntoPassword("123");
		loginPage.clickLoginButton();
		WebElement errorMessage = driver.findElement(By.id("error"));
		System.out.println("Message is "+errorMessage.getText());
		Assert.assertEquals("Please check your username and password. If you still can't log in, contact your Salesforce administrator.", errorMessage.getText());
		
	}
	
	@Test(enabled = true)
	public void validLoginTest() throws InterruptedException {
		String username=CommonUtilities.getApplicationProperty("username");
		loginPage.enterIntoUsername(username);
		String password=CommonUtilities.getApplicationProperty("password");
		loginPage.enterIntoPassword(password);
		loginPage.clickLoginButton();
		String title=homePage.getTitleOfTheHomePage();
		System.out.println("Title is "+title);
		Assert.assertEquals(title,"Home Page ~ Salesforce - Developer Edition");
		
	}

	@Test(enabled = true)
	public void validRememberMe() throws InterruptedException {
		String username=CommonUtilities.getApplicationProperty("username");
		loginPage.enterIntoUsername(username);
		String password=CommonUtilities.getApplicationProperty("password");
		loginPage.enterIntoPassword(password);
		loginPage.clickRememberMe();
		loginPage.clickLoginButton();
		loginPage.clickLogoutButton();
		WebElement prefilledName = driver.findElement(By.id("idcard-identity"));
		System.out.println("Name is "+prefilledName.getText());
		Assert.assertEquals("lbierer@gmail.com", prefilledName.getText());
	}
	
	@Test(enabled = true)
	public void forgotPassword1() throws InterruptedException {
		String username=CommonUtilities.getApplicationProperty("username");
		loginPage.enterIntoUsername(username);
		String password=CommonUtilities.getApplicationProperty("password");
		loginPage.enterIntoPassword(password);
		loginPage.clickForgotPassword();
		loginPage.enterIntoUsernameForgotPassword(username);
		loginPage.clickSubmitButton();
		WebElement passwordMessage = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/p[1]"));
		System.out.println("Name is "+passwordMessage.getText());
		Assert.assertEquals("We’ve sent you an email with a link to finish resetting your password.", passwordMessage.getText());	
	}
	
	@Test
	public void forgotPassword2() throws InterruptedException {
		String username="123";
		loginPage.enterIntoUsername(username);
		String password="22131";
		loginPage.enterIntoPassword(password);
		loginPage.clickLoginButton();
		WebElement errorMessage = driver.findElement(By.id("error"));
		System.out.println("Message is "+errorMessage.getText());
		Assert.assertEquals("Please check your username and password. If you still can't log in, contact your Salesforce administrator.", errorMessage.getText());
	}
	
}



