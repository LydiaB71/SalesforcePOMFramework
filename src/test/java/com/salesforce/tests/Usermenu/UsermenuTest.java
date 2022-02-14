package com.salesforce.tests.Usermenu;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.homepages.HomePage;
import com.salesforce.utility.CommonUtilities;

public class UsermenuTest extends BaseTest {

	
	@Test(enabled = true)
	public void usernameDropdownTest() throws InterruptedException {
		String username=CommonUtilities.getApplicationProperty("username");
		usermenuPage.enterIntoUsername(username);
		String password=CommonUtilities.getApplicationProperty("password");
		usermenuPage.enterIntoPassword(password);
		usermenuPage.clickLoginButton();
		usermenuPage.clickusernameMenuButton();
	
		WebElement option1 = driver.findElement(By.linkText("My Profile"));
		WebElement option2 = driver.findElement(By.linkText("My Settings"));
		WebElement option3 = driver.findElement(By.linkText("Developer Console"));
		WebElement option4 = driver.findElement(By.linkText("Switch to Lightning Experience"));
		WebElement option5 = driver.findElement(By.linkText("Logout"));

		Assert.assertEquals(option1.getText(),"My Profile");
		Assert.assertEquals(option2.getText(),"My Settings");
		Assert.assertEquals(option3.getText(),"Developer Console");
		Assert.assertEquals(option4.getText(),"Switch to Lightning Experience");
		Assert.assertEquals(option5.getText(),"Logout");
	}
	@Test(enabled = true)
	public void selectMyProfileTest() throws InterruptedException {
		String username=CommonUtilities.getApplicationProperty("username");
		usermenuPage.enterIntoUsername(username);
		String password=CommonUtilities.getApplicationProperty("password");
		usermenuPage.enterIntoPassword(password);
		usermenuPage.clickLoginButton();
		usermenuPage.clickusernameMenuButton();
		usermenuPage.clickMyProfileOption();
		Thread.sleep(3000);
		usermenuPage.clickAddPhoto();
		Thread.sleep(2000);
		usermenuPage.clickChooseFile();
	} // I can't figure out how to Choose a file here
	
	@Test(enabled = true)
	public void selectMySettingsTest() throws InterruptedException {
		String username=CommonUtilities.getApplicationProperty("username");
		usermenuPage.enterIntoUsername(username);
		String password=CommonUtilities.getApplicationProperty("password");
		usermenuPage.enterIntoPassword(password);
		usermenuPage.clickLoginButton();
		usermenuPage.clickusernameMenuButton();
		usermenuPage.clickMySettings();
		WebElement mySettingsPage = driver.findElement(By.xpath("//*[@id=\"PersonalSetup_font\"]"));
		String actual = "My Settings";
		Assert.assertEquals(actual, mySettingsPage.getText());
		//my settings page is displayed
		usermenuPage.clickPersonalLink();
		usermenuPage.clickLoginHistory();
		Thread.sleep(2000);
		actual = "Login History ~ Salesforce - Developer Edition";
		String title=homePage.getTitleOfTheHomePage();
		Assert.assertEquals(actual, title);
//		//login history is displayed
		usermenuPage.clickDisplayAndLayout();
		usermenuPage.clickCustomizeTabs();
		usermenuPage.clickCustomApp();
		usermenuPage.clickSalesforceChatter();
		usermenuPage.clickReportsTab();
		usermenuPage.clickAddTab();
		actual = "Reports";
		WebElement selectedTabs = driver.findElement(By.xpath("//*[@id=\"duel_select_1\"]/option[7]"));
		Assert.assertEquals(actual, selectedTabs.getText());
//		// reports tab is added
		usermenuPage.clickEmailSetup();
		usermenuPage.clickEmailSettings();
		usermenuPage.enterSenderName("Lydia Bierer");
		usermenuPage.enterSenderEmail("lbierer@gmail.com");
		usermenuPage.clickSaveBtn();
		actual = "Your settings have been successfully saved.";
		WebElement savedMsg = driver.findElement(By.xpath("//*[@id=\"meSaveCompleteMessage\"]"));
		Assert.assertEquals(actual, savedMsg.getText());
//		//details are saved
		usermenuPage.clickCalendarAndReminders();
		usermenuPage.clickReminders();
		usermenuPage.clickOpenTestReminders();
		Thread.sleep(2000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		 
		for(String handle : allWindowHandles)
		{
		System.out.println("Switching to window - > " + handle.toString());
		
		driver.switchTo().window(handle); 		
		
		}
		actual = "Sample Event.";
		WebElement sampleEventPopup = driver.findElement(By.xpath("//*[@id=\"summary0\"]/div/text()"));
        Assert.assertEquals(actual, sampleEventPopup.getText());
		System.out.println("Text is "+ sampleEventPopup.getText());
		//sample window is displayed
		
	} // this test used to pass and now I can't figure out why it won't anymore
	
	
	@Test(enabled = true)
	public void selectDevConsoleTest() throws InterruptedException {
		String username=CommonUtilities.getApplicationProperty("username");
		usermenuPage.enterIntoUsername(username);
		String password=CommonUtilities.getApplicationProperty("password");
		usermenuPage.enterIntoPassword(password);
		usermenuPage.clickLoginButton();
		usermenuPage.clickusernameMenuButton();
		usermenuPage.clickDevConsole();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String handle : allWindowHandles)
		{
		System.out.println("Window handle - > " + handle.toString());
		driver.switchTo().window(handle);
		}
		String actual = HomePage.getTitleOfThePage();
		String expected = "Developer Console";
		Assert.assertEquals(actual, expected);
		System.out.println("Text is "+ actual);
//		//dev console page is displayed		
	}
	@Test(enabled = true)
	public void selectLogout() throws InterruptedException {
		String username=CommonUtilities.getApplicationProperty("username");
		usermenuPage.enterIntoUsername(username);
		String password=CommonUtilities.getApplicationProperty("password");
		usermenuPage.enterIntoPassword(password);
		usermenuPage.clickLoginButton();
		usermenuPage.clickusernameMenuButton();
		usermenuPage.clickusernameMenuButton();
		usermenuPage.clickLogoutButton();
        Thread.sleep(2000);
		String actual = HomePage.getTitleOfThePage();
		String expected = "Login | Salesforce";
		Assert.assertEquals(actual, expected);
		System.out.println("Text is "+ expected);
//		//dev console page is displayed		
	}
	
}

