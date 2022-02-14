package com.salesforce.tests.CreateAcct;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.homepages.HomePage;
import com.salesforce.utility.CommonUtilities;

public class CreateAcctTest extends BaseTest {
	@Test(enabled = true)
	public void createAccountTest() throws InterruptedException {
		Thread.sleep(2000);
		String username=CommonUtilities.getApplicationProperty("username");
		createAcctPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password=CommonUtilities.getApplicationProperty("password");
		createAcctPage.enterIntoPassword(password);
		createAcctPage.clickLoginButton();
		createAcctPage.clickusernameMenuButton();
	    createAcctPage.clickAllTabs();
	    createAcctPage.clickAccounts();
	    createAcctPage.clickClosePopup();
	    Thread.sleep(2000);
	    String actual = HomePage.getTitleOfThePage();
		String expected = "Accounts: Home ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
	    createAcctPage.clickNewAccountBtn();
	    String acctName="work account3";
	    createAcctPage.enterName(acctName);
	    createAcctPage.clickSaveBtn();
	    Thread.sleep(5000);
	    actual = HomePage.getTitleOfThePage();
		expected = "Account: "+acctName+" ~ Salesforce - Developer Edition";
    	Assert.assertEquals(actual, expected);
	}
	@Test(enabled = true)
	public void createNewViewTest() throws InterruptedException {
		Thread.sleep(4000);
		String username=CommonUtilities.getApplicationProperty("username");
		createAcctPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password=CommonUtilities.getApplicationProperty("password");
		createAcctPage.enterIntoPassword(password);
		createAcctPage.clickLoginButton();
		createAcctPage.clickusernameMenuButton();
	    createAcctPage.clickAllTabs();
	    createAcctPage.clickAccounts();
	    createAcctPage.clickClosePopup();
	    Thread.sleep(2000);
	    String actual = HomePage.getTitleOfThePage();
		String expected = "Accounts: Home ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
	    createAcctPage.clickCreateNewView();
	    createAcctPage.enterDevFirstName("Chrissie");
	    Random r = new Random();
	    int suffix = r.nextInt(1000);
	    createAcctPage.enterUniqueName("_"+suffix);
	    createAcctPage.clickSaveCreateNewViewBtn();
	    WebElement newViewName = driver.findElement(By.name("fcf"));
		Select select = new Select(newViewName);
		WebElement o = select.getFirstSelectedOption();
	    String selectedoption = o.getText();
	    actual = selectedoption;
		expected = "Chrissie";
 	    Assert.assertEquals(actual, expected);
	}
	
	@Test(enabled = true)
	public void createEditViewTest() throws InterruptedException {
		Thread.sleep(2000);
		String username=CommonUtilities.getApplicationProperty("username");
		createAcctPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password=CommonUtilities.getApplicationProperty("password");
		createAcctPage.enterIntoPassword(password);
		createAcctPage.clickLoginButton();
		createAcctPage.clickusernameMenuButton();
	    createAcctPage.clickAllTabs();
	    createAcctPage.clickAccounts();
	    createAcctPage.clickClosePopup();
	    Thread.sleep(2000);
	    String actual = HomePage.getTitleOfThePage();
		String expected = "Accounts: Home ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
		createAcctPage.clickEditView();
		createAcctPage.enterViewFirstName("Janie");
		createAcctPage.clickField();
		createAcctPage.clickFieldFilter();
		createAcctPage.clickOperatorSelect();
		createAcctPage.enterValue("a");
		createAcctPage.clickAvailableFields();
		createAcctPage.clickAddBtn();
		createAcctPage.clickSaveViewBtn();

	}
	@Test(enabled = true)
	public void mergeAccountsTest() throws InterruptedException {
		Thread.sleep(2000);
		String username=CommonUtilities.getApplicationProperty("username");
		createAcctPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password=CommonUtilities.getApplicationProperty("password");
		createAcctPage.enterIntoPassword(password);
		createAcctPage.clickLoginButton();
		createAcctPage.clickusernameMenuButton();
	    createAcctPage.clickAllTabs();
	    createAcctPage.clickAccounts();
	    createAcctPage.clickClosePopup();
	    Thread.sleep(2000);
	    String actual = HomePage.getTitleOfThePage();
		String expected = "Accounts: Home ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
	    createAcctPage.clickMergeAccounts();
	    createAcctPage.enterFindAccount("Other");
	    createAcctPage.clickFindBtn();
	    createAcctPage.clickNextBtn();
	    createAcctPage.clickMergeBtn();

	} 
	@Test(enabled = true)
	public void createAccountReportTest() throws InterruptedException {
		Thread.sleep(2000);
		String username=CommonUtilities.getApplicationProperty("username");
		createAcctPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password=CommonUtilities.getApplicationProperty("password");
		createAcctPage.enterIntoPassword(password);
		createAcctPage.clickLoginButton();
		createAcctPage.clickusernameMenuButton();
	    createAcctPage.clickAllTabs();
	    createAcctPage.clickAccounts();
	    createAcctPage.clickClosePopup();
	    Thread.sleep(2000);
	    String actual = HomePage.getTitleOfThePage();
		String expected = "Accounts: Home ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
        createAcctPage.clickAcctLastAct();
        createAcctPage.clickMenu();
        Thread.sleep(5000);
        createAcctPage.clickCreateDate();
        createAcctPage.clickShowCalendar();
        createAcctPage.clickTodayBtn();
        createAcctPage.clickShowCalendar2();
        createAcctPage.clickTodayBtn2();
        createAcctPage.clickSaveCalendarBtn();
        createAcctPage.enterReportName("Work report");
        Random r = new Random();
	    int suffix = r.nextInt(1000);
	    createAcctPage.enterReportUnique("_"+suffix);
        Thread.sleep(2000);
        createAcctPage.clickSaveRunBtn();
        Thread.sleep(2000);
        actual = HomePage.getTitleOfThePage();
 		expected = "Work report ~ Salesforce - Developer Edition";
    	Assert.assertEquals(actual, expected);
	}
}
