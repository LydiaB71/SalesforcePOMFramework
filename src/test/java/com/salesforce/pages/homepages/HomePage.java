package com.salesforce.pages.homepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	public String getTitleOfTheHomePage() {
		String title=getTitleOfThePage();
		System.out.println("title of the page "+title);
		return title;
	}
	
	
}
