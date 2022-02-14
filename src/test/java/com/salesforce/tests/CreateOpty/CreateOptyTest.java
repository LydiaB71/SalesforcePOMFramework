package com.salesforce.tests.CreateOpty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.homepages.HomePage;
import com.salesforce.utility.CommonUtilities;

public class CreateOptyTest extends BaseTest {
	
	@Test(enabled = false)
	public void selectOptyTest() throws InterruptedException {
		Thread.sleep(2000);
		String username=CommonUtilities.getApplicationProperty("username");
		createOptyPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password=CommonUtilities.getApplicationProperty("password");
		createOptyPage.enterIntoPassword(password);
		createOptyPage.clickLoginButton();
	    createOptyPage.clickAllTabs();
	    createOptyPage.clickOptyLink();
	    createOptyPage.clickClosePopup();
	    createOptyPage.clickDropDownMenu();
		WebElement option1 = driver.findElement(By.cssSelector("html.ext-strict body.hasMotif.opportunityTab.overviewPage.ext-gecko.ext-gecko3.sfdcBody.brandQuaternaryBgr div#contentWrapper div.bodyDiv.brdPalette.brandPrimaryBrd table#bodyTable.outer tbody tr td#bodyCell.oRight div.filterOverview form#filter_element div.bFilterView span.bFilter span.fBody select#fcf option"));
		WebElement option2 = driver.findElement(By.cssSelector("#fcf > option:nth-child(2)"));
		WebElement option3 = driver.findElement(By.cssSelector("#fcf > option:nth-child(3)"));
		WebElement option4 = driver.findElement(By.cssSelector("#fcf > option:nth-child(4)"));
		WebElement option5 = driver.findElement(By.cssSelector("#fcf > option:nth-child(6)"));
		WebElement option6 = driver.findElement(By.cssSelector("#fcf > option:nth-child(9)"));
		WebElement option7 = driver.findElement(By.cssSelector("#fcf > option:nth-child(10)"));
		Assert.assertEquals(option1.getText(),"All Opportunities");
		Assert.assertEquals(option2.getText(),"Closing Next Month");
	    Assert.assertEquals(option3.getText(),"Closing This Month");
		Assert.assertEquals(option4.getText(),"My Opportunities");
		Assert.assertEquals(option5.getText(),"New This Week");
		Assert.assertEquals(option6.getText(),"Recently Viewed Opportunities");
		Assert.assertEquals(option7.getText(),"Won");
	}
	
	@Test(enabled = true)
	public void createNewOptyTest() throws InterruptedException {
		Thread.sleep(2000);
		String username=CommonUtilities.getApplicationProperty("username");
		createOptyPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password=CommonUtilities.getApplicationProperty("password");
		createOptyPage.enterIntoPassword(password);
		createOptyPage.clickLoginButton();
	    createOptyPage.clickAllTabs();
	    createOptyPage.clickOptyLink();
	    createOptyPage.clickClosePopup();
	    createOptyPage.clickNewOptyBtn();
	    createOptyPage.enterOptyName("Good opp.");
	    createOptyPage.enterAcctName("work account");
	    createOptyPage.clickStage();
	    createOptyPage.clickStage2();
	    createOptyPage.enterProbility("20");
	    createOptyPage.clickLeadSource();
	    createOptyPage.clickLeadSource2();
	    createOptyPage.enterIntoCampaign("ABC");
	    // there are no primary campaigns even when entering * wildcard
	    // I created a campaign called ABC
	    // and still I didn't find it in the search
	    createOptyPage.clickCloseDate();
	    createOptyPage.clickCloseDate2();
	    createOptyPage.clickSaveOptyBtn();
        Assert.assertEquals(false, true);// trigger a fail
	}
	
	@Test(enabled = true)
	public void optyPipelineReportTest() throws InterruptedException {
		Thread.sleep(2000);
		String username=CommonUtilities.getApplicationProperty("username");
		createOptyPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password=CommonUtilities.getApplicationProperty("password");
		createOptyPage.enterIntoPassword(password);
		createOptyPage.clickLoginButton();
	    createOptyPage.clickAllTabs();
	    createOptyPage.clickOptyLink();
	    createOptyPage.clickClosePopup();
	    createOptyPage.clickOptyPipelineLink();
	    String actual = HomePage.getTitleOfThePage();
		String expected = "Opportunity Pipeline ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
	}
	@Test(enabled = true)
	public void stuckOptyReportTest() throws InterruptedException {
		Thread.sleep(2000);
		String username=CommonUtilities.getApplicationProperty("username");
		createOptyPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password=CommonUtilities.getApplicationProperty("password");
		createOptyPage.enterIntoPassword(password);
		createOptyPage.clickLoginButton();
	    createOptyPage.clickAllTabs();
	    createOptyPage.clickOptyLink();
	    createOptyPage.clickClosePopup();
	    createOptyPage.clickStuckOptyLink();
	    String actual = HomePage.getTitleOfThePage();
		String expected = "Stuck Opportunities ~ Salesforce - Developer Edition";
		Assert.assertEquals(actual, expected);
	} 
	@Test(enabled = true)
	public void quarterlySummaryReportTest() throws InterruptedException {
		Thread.sleep(4000);
		String username=CommonUtilities.getApplicationProperty("username");
		createOptyPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password=CommonUtilities.getApplicationProperty("password");
		createOptyPage.enterIntoPassword(password);
		createOptyPage.clickLoginButton();
	    createOptyPage.clickAllTabs();
	    createOptyPage.clickOptyLink();
	    createOptyPage.clickClosePopup();
	    createOptyPage.clickQuarterlySumMenu();
	    createOptyPage.clickMenuSelect1();
	    createOptyPage.clickQuarterlySumMenu2();
	    createOptyPage.clickMenuSelect2();
	    createOptyPage.clickRunReportBtn();
	    String actual = HomePage.getTitleOfThePage();
		String expected = "Opportunity Report ~ Salesforce - Developer Edition";
    	Assert.assertEquals(actual, expected);
	} 
}
