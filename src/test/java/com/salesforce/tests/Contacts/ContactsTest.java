package com.salesforce.tests.Contacts;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.homepages.HomePage;
import com.salesforce.utility.CommonUtilities;

public class ContactsTest extends BaseTest {

	
	@Test(enabled = true)
	public void createNewContactTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		contactsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		contactsPage.enterIntoPassword(password);
		contactsPage.clickLoginButton();
		contactsPage.clickAllTabs();
		contactsPage.clickContactsLink();
		contactsPage.clickClosePopup();
		contactsPage.clickNewContactBtn();
		contactsPage.enterLastName("Indian");
		contactsPage.enterAcctName("work account");
        contactsPage.clickSaveBtn();
		Thread.sleep(2000);
		String actual = HomePage.getTitleOfThePage();
		String expected = "Contact: Indian ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
    	contactsPage.clickLogoutButton();
	} 
	@Test(enabled = true)
	public void createNewViewContactTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		contactsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		contactsPage.enterIntoPassword(password);
		contactsPage.clickLoginButton();
		contactsPage.clickAllTabs();
		contactsPage.clickContactsLink();
		contactsPage.clickClosePopup();
		contactsPage.clickNewViewLink();
		contactsPage.enterViewName("Very Important");
		Random r = new Random();
		int num = r.nextInt(1000);
		System.out.println(num);
		contactsPage.enterUniqueName("_"+num);
		contactsPage.clickSaveViewBtn();
		Thread.sleep(2000);
		WebElement options = driver.findElement(By.name("fcf"));
		Select select = new Select(options);
		WebElement o = select.getFirstSelectedOption();
	      String selectedoption = o.getText();
		String expected = "Very Important";
		Assert.assertEquals(o.getText(), expected);
    	contactsPage.clickLogoutButton();
	
	} 

	@Test(enabled = true)
	public void checkRecentlyCreatedContactTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		contactsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		contactsPage.enterIntoPassword(password);
		contactsPage.clickLoginButton();
		contactsPage.clickAllTabs();
		contactsPage.clickContactsLink();
		contactsPage.clickClosePopup();
		contactsPage.clickRecentlyCreatedDropDown();
		WebElement options = driver.findElement(By.name("hotlist_mode"));
		Select select = new Select(options);
		WebElement o = select.getFirstSelectedOption();
		String selectedoption = o.getText();
		String expected = "Recently Created";
		Assert.assertEquals(selectedoption, expected);
		WebElement recCreatedTitle = driver.findElement(By.cssSelector("#hotlist > table > tbody > tr > td.pbTitle > h3"));
		System.out.println(recCreatedTitle.getText());
		expected = "Recent Contacts";
    	Assert.assertEquals(recCreatedTitle.getText(), expected);
		Thread.sleep(2000);
    	contactsPage.clickLogoutButton();
		
	} 
	@Test(enabled = true)
	public void checkMyContactViewTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		contactsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		contactsPage.enterIntoPassword(password);
		contactsPage.clickLoginButton();
		contactsPage.clickAllTabs();
		contactsPage.clickContactsLink();
		contactsPage.clickClosePopup();
		contactsPage.clickDropDownMenu();
		contactsPage.clickMenuSelect();
		Thread.sleep(2000);
		WebElement myOption = driver.findElement(By.cssSelector("#fcf"));
		String expected = "My Contacts";
		Select select = new Select(myOption);
	      WebElement o = select.getFirstSelectedOption();
	      String actual = o.getText();
    	Assert.assertEquals(actual, expected);
		actual = HomePage.getTitleOfThePage();
		expected = "Contacts: Home ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
    	contactsPage.clickLogoutButton();
		
	} 
	
	@Test(enabled = true)
	public void viewAContactTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		contactsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		contactsPage.enterIntoPassword(password);
		contactsPage.clickLoginButton();
		contactsPage.clickAllTabs();
		contactsPage.clickContactsLink();
		contactsPage.clickClosePopup();
		contactsPage.clickDropDownMenu();
		contactsPage.clickAContact();
    	WebElement contact = driver.findElement(By.cssSelector("#contactHeaderRow > div.textBlock > h2"));
		String actual = contact.getText();
		String expected = "Indian";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		contactsPage.clickLogoutButton();
		
	}
	@Test(enabled = true)
	public void newViewContactErrorMsgTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		contactsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		contactsPage.enterIntoPassword(password);
		contactsPage.clickLoginButton();
		contactsPage.clickAllTabs();
		contactsPage.clickContactsLink();
		contactsPage.clickClosePopup();
		contactsPage.clickNewViewLink();
		contactsPage.enterViewName("");
		contactsPage.enterUniqueName("EFGH");
    	contactsPage.clickSaveViewBtn();
    	WebElement errorMsg = driver.findElement(By.cssSelector("#editPage > div.pbBody > div:nth-child(1) > div.pbSubbody > table > tbody > tr:nth-child(1) > td.dataCol > div > div.errorMsg"));
		String actual = errorMsg.getText();
		String expected = "Error: You must enter a value";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		contactsPage.clickLogoutButton();
	}
	@Test(enabled = true)
	public void cancelBtnInCreateNewViewTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		contactsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		contactsPage.enterIntoPassword(password);
		contactsPage.clickLoginButton();
		contactsPage.clickAllTabs();
		contactsPage.clickContactsLink();
		contactsPage.clickClosePopup();
		contactsPage.clickNewViewLink();
		contactsPage.enterViewName("ABCD");
		contactsPage.enterUniqueName("EFGH");
		contactsPage.clickCancelBtn();
		Thread.sleep(2000);
		String actual = HomePage.getTitleOfThePage();
		String expected = "Contacts: Home ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		contactsPage.clickLogoutButton();
		
	} 
	@Test(enabled = true)
	public void saveAndNewBtnInNewContactPageTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		contactsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		contactsPage.enterIntoPassword(password);
		contactsPage.clickLoginButton();
		contactsPage.clickAllTabs();
		contactsPage.clickContactsLink();
		contactsPage.clickClosePopup();
		contactsPage.clickNewContactBtn();
		contactsPage.enterLastName("Indian");
		contactsPage.enterAcctName("Global Media");
		contactsPage.clickSaveAndNewBtn();
		Thread.sleep(2000);
		String actual = HomePage.getTitleOfThePage();
		String expected = "Contact Edit: New Contact ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
    	contactsPage.clickLogoutButton();
		
	} 
}
