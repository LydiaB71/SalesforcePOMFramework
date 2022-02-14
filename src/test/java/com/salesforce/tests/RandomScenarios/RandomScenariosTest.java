package com.salesforce.tests.RandomScenarios;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.homepages.HomePage;
import com.salesforce.utility.CommonUtilities;

public class RandomScenariosTest extends BaseTest{

	@Test(enabled = true)
	public void verifyFirstAndLastNameTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		randomScenariosPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		randomScenariosPage.enterIntoPassword(password);
		randomScenariosPage.clickLoginButton();
		randomScenariosPage.clickAllTabs();
		randomScenariosPage.clickHomeLink();
		Thread.sleep(2000);
        randomScenariosPage.clickClosePopup();
        randomScenariosPage.clickUserLink();
        Thread.sleep(2000);
		String actual = HomePage.getTitleOfThePage();
		String expected = "User: Lydia Bierer ~ Salesforce - Developer Edition";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		contactsPage.clickLogoutButton();
}
	@Test(enabled = true)
	public void verifyEditedLastnameTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		randomScenariosPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		randomScenariosPage.enterIntoPassword(password);
		randomScenariosPage.clickLoginButton();
		randomScenariosPage.clickAllTabs();
		randomScenariosPage.clickHomeLink();
		Thread.sleep(2000);
        randomScenariosPage.clickClosePopup();
        randomScenariosPage.clickUserLink();
        Thread.sleep(2000);
        randomScenariosPage.clickEditProfile();
		String actual = HomePage.getTitleOfThePage();
		String expected = "User: Lydia Bierer ~ Salesforce - Developer Edition";
    	Assert.assertEquals(actual, expected);
    	randomScenariosPage.clickAbout();// this doesn't work and I don't know why
    	
		Thread.sleep(2000);
    	randomScenariosPage.clickLogoutButton();
    	// incomplete - couldn't click on about Tab
}
	
	@Test(enabled = true)
	public void verifyTabCustomTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		randomScenariosPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		randomScenariosPage.enterIntoPassword(password);
		randomScenariosPage.clickLoginButton();
		randomScenariosPage.clickAllTabs();
		Thread.sleep(2000);
		randomScenariosPage.clickCustomTabBtn();
		randomScenariosPage.clickTabToRemove();
		WebElement removedTab = driver.findElement(By.cssSelector("#duel_select_1 > option:nth-child(2)"));
		Assert.assertEquals(removedTab.getText(), "Accounts");
		randomScenariosPage.clickRemoveBtn();
		randomScenariosPage.clickSaveBtn();
		WebElement removedTabFromMenu = driver.findElement(By.id("Workspace_Tab"));
		System.out.println(removedTabFromMenu.getText());
		Assert.assertNotEquals(removedTabFromMenu.getText(), "Accounts");
		Thread.sleep(2000);
    	randomScenariosPage.clickLogoutButton();
    	// tc35
}
	@Test(enabled = true)
	public void BlockingEventInCalendarTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		randomScenariosPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		randomScenariosPage.enterIntoPassword(password);
		randomScenariosPage.clickLoginButton();
		randomScenariosPage.clickHomeTab();
		Thread.sleep(2000);
		randomScenariosPage.clickClosePopup();
		randomScenariosPage.clickCurrentDateLink();
    	randomScenariosPage.clickEightPMLink();
    	randomScenariosPage.clickSubCombo();
    	Thread.sleep(5000);
	    Set<String> getAllWindows = driver.getWindowHandles();
		String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
		driver.switchTo().window(getWindow[1]);
		randomScenariosPage.clickOtherOption();
		driver.switchTo().window(getWindow[0]);
    	randomScenariosPage.clickTimeEndDropDown();
    	randomScenariosPage.clickNinePMSelect();
		randomScenariosPage.clickSaveCalBtn();
		String actual = HomePage.getTitleOfThePage();
		String expected = "Calendar for Lydia Bierer ~ Salesforce - Developer Edition";
    	Assert.assertEquals(actual, expected);
    	WebElement otherLinkInCal = driver.findElement(By.linkText("Other"));
		Assert.assertEquals(otherLinkInCal.getText(), "Other");
		Thread.sleep(2000);
    	randomScenariosPage.clickLogoutButton();
    	// tc36
}
	@Test(enabled = true)
	public void BlockingEventRecurringTest() throws InterruptedException {
		Thread.sleep(2000);
		String username = CommonUtilities.getApplicationProperty("username");
		randomScenariosPage.enterIntoUsername(username);
		Thread.sleep(2000);
		String password = CommonUtilities.getApplicationProperty("password");
		randomScenariosPage.enterIntoPassword(password);
		randomScenariosPage.clickLoginButton();
		randomScenariosPage.clickHomeTab();
		Thread.sleep(2000);
		randomScenariosPage.clickClosePopup();
		randomScenariosPage.clickCurrentDateLink();
		randomScenariosPage.clickFourPMLink();
		randomScenariosPage.clickSubCombo();
    	Thread.sleep(5000);
	    Set<String> getAllWindows = driver.getWindowHandles();
		String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
		driver.switchTo().window(getWindow[1]);
		randomScenariosPage.clickOtherOption();
		driver.switchTo().window(getWindow[0]);
    	randomScenariosPage.clickTimeEndDropDown();
		randomScenariosPage.clickSevenPMSelect();
		randomScenariosPage.clickRecurrenceChkBox();
		randomScenariosPage.clickFrequencyWeeklyRadio();
	    randomScenariosPage.clickRecEndDate();
	    randomScenariosPage.clickMonthDropDown();
	    randomScenariosPage.clickMarchSelect();
	    randomScenariosPage.clickDaySelect();
	    randomScenariosPage.clickSaveCal2Btn();
	    randomScenariosPage.clickMonthView();
		String actual = HomePage.getTitleOfThePage();
		String expected = "Calendar for Lydia Bierer - Month View ~ Salesforce - Developer Edition";
    	Assert.assertEquals(actual, expected);
		WebElement otherLinkInCal = driver.findElement(By.cssSelector("#bodyCell > div.bCalendar > div.bPageBlock.brandSecondaryBrd.secondaryPalette > div.pbBody > table > tbody > tr:nth-child(3) > td.calToday > div:nth-child(2) > a"));
		Assert.assertEquals(otherLinkInCal.getText(), "Other");
		WebElement otherLinkInCalRec = driver.findElement(By.cssSelector("#bodyCell > div.bCalendar > div.bPageBlock.brandSecondaryBrd.secondaryPalette > div.pbBody > table > tbody > tr:nth-child(4) > td:nth-child(8) > div:nth-child(2) > a"));
		Assert.assertEquals(otherLinkInCalRec.getText(), "Other");
		Thread.sleep(2000);
    	randomScenariosPage.clickLogoutButton();
    	// tc37
} 
}
