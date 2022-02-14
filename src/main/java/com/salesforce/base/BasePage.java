package com.salesforce.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.salesforce.utility.GenerateReports;

public class BasePage {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static GenerateReports report=GenerateReports.getInstance();
	
	
	public BasePage(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	
	public static void closeDriver() {
		driver.close();
	}
	
	public static void closeAllDriver() {
		driver.quit();
	}
	/* name of the method:   enterText
	 * BriefDescription  :   entering textvalue for textbox
	 * Arguments         :  element-->web element
	 *                      text--->to be entered 
	 *            
	 *  createdby        :  Automation team 
	 *  created date     :01/20/22 
	 *  LastModified Date:01/20/22          
	 */
	public static void enterText(WebElement element,String text) {
		waitUntilVisible(element);
		if(element.isDisplayed()) {
			clearElement(element);
			element.sendKeys(text);
			System.out.println("pass: text entered");
			report.logTestInfo("username entered");
		}
		else {
			System.out.println("fail: element not displayed");
		}
	}
	public static void pressSpace(WebElement element) {
		waitUntilVisible(element);
		if(element.isDisplayed()) {
			clearElement(element);
			element.sendKeys(Keys.SPACE);
			System.out.println("pass: space pressed");
			report.logTestInfo("username entered");
		}
		else {
			System.out.println("fail: element not displayed");
		}
	}
	public static void clickElement(WebElement element) {
		if(element.isDisplayed()) {
			element.click();
			System.out.println("pass: element clicked");
		}
		else {
			System.out.println("fail: element not displayed");
		}
	}
	
	public static void clearElement(WebElement element) {
		if(element.isDisplayed()) {
			element.clear();
			System.out.println("pass: element cleared");
		}
		else {
			System.out.println("fail: element not displayed");
		}
	}
	
	public static void waitUntilVisible(WebElement element) {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
		report.logTestInfo("waiting for the element to be visible");
	}
	public static void waitUntilAlertIsPresent() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void mouseOver(WebElement element) {
		waitUntilVisible(element);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public static void AcceptAlert() {
		waitUntilAlertIsPresent();
		Alert alert=driver.switchTo().alert();
		System.out.println("alert text="+alert.getText());
		alert.accept();
		
	}
	public static void dissmisAlert() {
		waitUntilAlertIsPresent();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		
	}
	public static void selectByTextData(WebElement element,String text) {
		Select selectCity = new Select(element);
		selectCity.selectByVisibleText(text);
		report.logTestInfo("selectByTextData method selected the data");
	}
	public static void selectByIndexData(WebElement element,int index) {
		Select selectCity = new Select(element);
		selectCity.selectByIndex(index);
	}
	public static void selectByValueData(WebElement element,String text) {
		Select selectCity = new Select(element);
		selectCity.selectByValue(text);
	}
	
	public static String getTitleOfThePage() {
		return driver.getTitle();
	}
	
}
