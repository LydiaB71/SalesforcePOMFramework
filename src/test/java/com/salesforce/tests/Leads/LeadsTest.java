package com.salesforce.tests.Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.homepages.HomePage;
import com.salesforce.utility.CommonUtilities;

public class LeadsTest extends BaseTest {
	@Test(enabled = true)
	public void leadsTabTest() throws InterruptedException {
		Thread.sleep(2000);
		String username=CommonUtilities.getApplicationProperty("username");
		leadsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password=CommonUtilities.getApplicationProperty("password");
		leadsPage.enterIntoPassword(password);
		leadsPage.clickLoginButton();
	    leadsPage.clickAllTabs();
	    leadsPage.clickLeadsLink();
	    leadsPage.clickClosePopup();
	    String actual = HomePage.getTitleOfThePage();
		String expected = "Leads: Home ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(enabled = true)
	public void leadsSelectViewTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		leadsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		leadsPage.enterIntoPassword(password);
		leadsPage.clickLoginButton();
		leadsPage.clickAllTabs();
		leadsPage.clickLeadsLink();
		leadsPage.clickClosePopup();
		String actual = HomePage.getTitleOfThePage();
		String expected = "Leads: Home ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
		leadsPage.clickDropDownMenu();
		WebElement option1 = driver.findElement(By.cssSelector("#fcf > option:nth-child(1)"));
		WebElement option2 = driver.findElement(By.cssSelector("#fcf > option:nth-child(2)"));
		WebElement option3 = driver.findElement(By.cssSelector("#fcf > option:nth-child(3)"));
		WebElement option4 = driver.findElement(By.cssSelector("#fcf > option:nth-child(4)"));
		Assert.assertEquals(option1.getText(), "All Open Leads");
		Assert.assertEquals(option2.getText(), "My Unread Leads");
		Assert.assertEquals(option3.getText(), "Recently Viewed Leads");
		Assert.assertEquals(option4.getText(), "Today's Leads");
		leadsPage.clickLogoutButton();
	}
	
	@Test(enabled = true)
	public void functOfGoBtnTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		leadsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		leadsPage.enterIntoPassword(password);
		leadsPage.clickLoginButton();
		leadsPage.clickAllTabs();
		leadsPage.clickLeadsLink();
		leadsPage.clickClosePopup();
		Thread.sleep(2000);
		String actual = HomePage.getTitleOfThePage();
		String expected = "Leads: Home ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
		leadsPage.clickTodaysLeadsSelected();
		leadsPage.clickLogoutButton();
		leadsPage.enterIntoUsername(username);
		leadsPage.enterIntoPassword(password);
		leadsPage.clickLoginButton();
		leadsPage.clickAllTabs();
		leadsPage.clickLeadsLink();
		WebElement optionSelected = driver.findElement(By.cssSelector("#fcf > option:nth-child(4)"));
		actual = optionSelected.getText();
		expected = "Today's Leads";
		Assert.assertEquals(actual, expected);
		leadsPage.clickGoBtn();
		actual = HomePage.getTitleOfThePage();
		expected = "Leads ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
    	leadsPage.clickLogoutButton();
	}
	@Test(enabled = true)
	public void todaysLeadsTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		leadsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		leadsPage.enterIntoPassword(password);
		leadsPage.clickLoginButton();
		leadsPage.clickAllTabs();
		leadsPage.clickLeadsLink();
		leadsPage.clickClosePopup();
		Thread.sleep(2000);
		String actual = HomePage.getTitleOfThePage();
		String expected = "Leads: Home ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
		leadsPage.clickTodaysLeadsSelected();
		actual = HomePage.getTitleOfThePage();
		expected = "Leads ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
    	leadsPage.clickLogoutButton();
	}
	@Test(enabled = true)
	public void newBtnLeadsHomeTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		leadsPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		leadsPage.enterIntoPassword(password);
		leadsPage.clickLoginButton();
		leadsPage.clickAllTabs();
		leadsPage.clickLeadsLink();
		leadsPage.clickClosePopup();
		Thread.sleep(2000);
		String actual = HomePage.getTitleOfThePage();
		String expected = "Leads: Home ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
		leadsPage.clickNewLeadBtn();
		leadsPage.enterLastName("ABCD");
		leadsPage.enterCompanyName("ABCD");
		leadsPage.clickSaveBtn();
		actual = HomePage.getTitleOfThePage();
		expected = "Lead: ABCD ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
    	leadsPage.clickLogoutButton();
	}
}
