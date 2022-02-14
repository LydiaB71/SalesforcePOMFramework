package com.salesforce.pages.contactspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;

public class ContactsPage extends BasePage {

	public ContactsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")
	WebElement username;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[1]")
	WebElement password;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")
	WebElement btnLogin;
	@FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[1]/span")
	WebElement nameMenu;
	@FindBy(css = "#userNav-menuItems > a:nth-child(5)")
	WebElement btnLogout;
	@FindBy(css = "#AllTab_Tab > a > img")
	WebElement allTabs;
	@FindBy(css = "#tryLexDialogX")
	WebElement closePopup;
	@FindBy(css = "#bodyCell > div.bPageBlock.secondaryPalette > div.pbBody > table > tbody > tr:nth-child(27) > td.dataCol.contactBlock > a")
	WebElement contactsLink;
	@FindBy(css = "#hotlist > table > tbody > tr > td.pbButton > input")
	WebElement newContactBtn;
	@FindBy(css = "#name_lastcon2")
	WebElement lastName;
	@FindBy(css = "#con4")
	WebElement acctName;
	@FindBy(css = "#topButtonRow > input:nth-child(1)")
	WebElement saveBtn;
	@FindBy(css = "#filter_element > div > span > span.fFooter > a:nth-child(2)")
	WebElement newViewLink;
	@FindBy(css = "#fname")
	WebElement viewName;
	@FindBy(css = "#devname")
	WebElement uniqueName;
	@FindBy(css = "#editPage > div.pbHeader > table > tbody > tr > td.pbButtonb > input.btn.primary")
	WebElement saveViewBtn;
	@FindBy(css = "#fcf")
	WebElement dropDownMenu;
	@FindBy(css = "#fcf > option:nth-child(4)")
	WebElement menuSelect;
	@FindBy(css = "#bodyCell > div.bRelatedList > div.hotListElement > div > div.pbBody > table > tbody > tr.dataRow.even.first > th > a")
	WebElement aContact;
	@FindBy(name = "cancel")
	WebElement cancelBtn;
	@FindBy(css = "#topButtonRow > input:nth-child(2)")
	WebElement saveAndNewBtn;
	@FindBy(id = "hotlist_mode")
	WebElement recentlyCreatedDropDown;
	
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
	public void clickContactsLink() {
		clickElement(contactsLink);
	}

	public void clickNewContactBtn() {
		clickElement(newContactBtn);
	}
	public void enterLastName(String LName) {
		enterText(lastName, LName);
	}

	public void enterAcctName(String AName) {
		enterText(acctName, AName);
	}
	public void clickSaveBtn() {
		clickElement(saveBtn);
	}
	public void clickNewViewLink() {
		clickElement(newViewLink);
	}
	public void enterViewName(String VName) {
		enterText(viewName, VName);
	}

	public void enterUniqueName(String UName) {
		enterText(uniqueName, UName);
	}
	public void clickSaveViewBtn() {
		clickElement(saveViewBtn);
	}
	public void clickDropDownMenu() {
		clickElement(dropDownMenu);
	}
	public void clickMenuSelect() {
		clickElement(menuSelect);
	}
	public void clickAContact() {
		clickElement(aContact);
	}
	public void clickCancelBtn() {
		clickElement(cancelBtn);
	}
	public void clickSaveAndNewBtn() {
		clickElement(saveAndNewBtn);
	}
	public void clickRecentlyCreatedDropDown() {
		clickElement(recentlyCreatedDropDown);
	}
}
