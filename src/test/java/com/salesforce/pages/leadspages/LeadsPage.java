package com.salesforce.pages.leadspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;

public class LeadsPage extends BasePage{

	public LeadsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")
	WebElement username;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[1]")
	WebElement password;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")
	WebElement btnLogin;

	@FindBy(css = "#userNav-menuItems > a:nth-child(5)")
	WebElement btnLogout;
	@FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[1]/span")
	WebElement nameMenu;
	@FindBy(css = "#AllTab_Tab > a > img")
	WebElement allTabs;
	@FindBy(css = "#tryLexDialogX")
	WebElement closePopup;
	@FindBy(linkText = "Leads")
	WebElement leadsLink;
	@FindBy(css = "#fcf")
	WebElement dropDownMenu;
	@FindBy(css = "#fcf > option:nth-child(4)")
	WebElement todaysLeadsSelected;
	@FindBy(css = ".fBody > input:nth-child(2)")
	WebElement goBtn;
	@FindBy(css = "#hotlist > table > tbody > tr > td.pbButton > input")
	WebElement newLeadBtn;
	@FindBy(css = "#name_lastlea2")
	WebElement lastName;
	@FindBy(css = "#lea3")
	WebElement coName;
	@FindBy(css = "#topButtonRow > input:nth-child(1)")
	WebElement saveBtn;
	@FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[1]/span")
	WebElement usernameMenu;
	@FindBy(css = "#userNav-menuItems > a:nth-child(5)")
	WebElement selectLogout;

	public void enterIntoUsername(String usrName) {
		enterText(username, usrName);
	}
	public void enterIntoPassword(String passwrd) {
			enterText(password, passwrd);
		}
		public void clickLoginButton() throws InterruptedException {
			clickElement(btnLogin);
			Thread.sleep(2000);
		}
		public void clickusernameMenuButton() {
			clickElement(nameMenu);
		}
		public void clickLogoutButton() {
			clickElement(nameMenu);
			clickElement(btnLogout);
		}
		public void clickAllTabs() {
		clickElement(allTabs);
	}
		public void clickClosePopup() {
		clickElement(closePopup);
	}
		public void clickLeadsLink() {
			clickElement(leadsLink);
		}
		public void clickDropDownMenu() {
			clickElement(dropDownMenu);
		}
		public void clickNameMenu() {
			clickElement(nameMenu);
		}
		public void clickTodaysLeadsSelected() {
			clickElement(todaysLeadsSelected);
		}
		public void clickGoBtn() {
			clickElement(goBtn);
		}
		public void clickNewLeadBtn() {
			clickElement(newLeadBtn);
		}		
		public void enterLastName(String LName) {
			enterText(lastName, LName);	
		}
		public void enterCompanyName(String compName) {
				enterText(coName, compName);
		}
		public void clickSaveBtn() {
			clickElement(saveBtn);
		}
		
		
}
