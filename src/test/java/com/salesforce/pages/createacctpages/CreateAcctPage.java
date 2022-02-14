package com.salesforce.pages.createacctpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;

public class CreateAcctPage extends BasePage {
	public CreateAcctPage(WebDriver driver) {
		super(driver); 

}
	
@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")
WebElement username;
@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[1]")
WebElement password;
@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")
WebElement btnLogin;

@FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]")
WebElement btnLogout;
@FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[1]/span")
WebElement nameMenu;
@FindBy(css = "#AllTab_Tab > a > img")
WebElement allTabs;
@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[2]/div[3]/div[2]/table/tbody/tr[1]/td[1]/a")
WebElement accounts;
@FindBy(css = "#tryLexDialogX")
WebElement closePopup;
@FindBy(css = "#hotlist > table > tbody > tr > td.pbButton > input")
WebElement newAccountBtn;
@FindBy(css = "#acc2")
WebElement name;
@FindBy(css = "#topButtonRow > input:nth-child(1)")
WebElement saveBtn;
@FindBy(xpath = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[2]")
WebElement createNewView;
@FindBy(css = "#fname")
WebElement devFirstName;
@FindBy(css = "#devname")
WebElement devName;
@FindBy(css = "#editPage > div.pbHeader > table > tbody > tr > td.pbButtonb > input.btn.primary")
WebElement saveBtn2;
@FindBy(css = "#filter_element > div > span > span.fFooter > a:nth-child(1)")
WebElement editViewBtn;
@FindBy(css = "#fname")
WebElement viewName;
@FindBy(css = "#fcol1")
WebElement field;
@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[2]/div[2]/table[2]/tbody/tr[2]/td[2]/select/option[2]")
WebElement fieldFilter;
@FindBy(css = "#fop1")
WebElement operator;
@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[2]/div[2]/table[2]/tbody/tr[2]/td[3]/select/option[4]")
WebElement operatorSelect;
@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[2]/div[2]/table[2]/tbody/tr[2]/td[4]/input")
WebElement value;
@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr/td[1]/select/option[31]")
WebElement availableFields;
@FindBy(css = "#colselector_select_0_right > img")
WebElement addBtn;
@FindBy(css = "#editPage > div.pbHeader > table > tbody > tr > td.pbButtonb > input.btn.primary")
WebElement saveViewBtn;
@FindBy(xpath = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a")
WebElement mergeAccounts;
@FindBy(css = "#srch")
WebElement findAccount;
@FindBy(css = "#stageForm > div > div.pbBody > div.pbWizardBody > input.btn")
WebElement findBtn;
@FindBy(css = "#stageForm > div > div.pbBody > div.pbWizardFooter > div > input.btn")
WebElement nextBtn;
@FindBy(css = "#stageForm > div > div.pbBody > div.pbWizardFooter > div > input:nth-child(2)")
WebElement mergeBtn;
@FindBy(xpath = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a ")
WebElement acctLastAct;
@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/div/div/form/div/div[1]/img")
WebElement menu;
@FindBy(xpath = "/html/body/div[15]/div/div[3]")
WebElement createDate;
@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/div/div/form/div/div[3]/img")
WebElement showCalendar;
@FindBy(id = "ext-gen281")
WebElement cal1;
@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/div/div/form/div/div[4]/img")
WebElement showCalendar2;
@FindBy(id = "ext-gen296")
WebElement cal2;
@FindBy(css = "#ext-gen49")
WebElement saveCalendarBtn;
@FindBy(xpath = "/html/body/div[20]/div[2]/div[1]/div/div/div/div/div/form/fieldset/div/div/div[1]/div[1]/input")
WebElement reportName;
@FindBy(xpath = "/html/body/div[20]/div[2]/div[1]/div/div/div/div/div/form/fieldset/div/div/div[2]/div[1]/input")
WebElement reportUnique;
@FindBy(xpath = "/html/body/div[20]/div[2]/div[2]/div/div/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button")
WebElement saveRunBtn;

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
		public void clickClosePopup() {
			clickElement(closePopup);
		}
		public void clickNewAccountBtn() {
			clickElement(newAccountBtn);
		}
		public void enterName(String acctName) {
			enterText(name, acctName);
		}
		public void clickSaveBtn() {
			clickElement(saveBtn);
		}
		public void clickAllTabs() {
			clickElement(allTabs);
		}
		public void clickAccounts() {
			clickElement(accounts);
		}
		public void clickCreateNewView() {
			clickElement(createNewView);
		}
		public void enterDevFirstName(String devFName) {
			enterText(devFirstName, devFName);
		}
		public void enterUniqueName(String uniqueName) {
			enterText(devName, uniqueName);
		}
		public void clickSaveCreateNewViewBtn() {
			clickElement(saveBtn2);
		}
		public void clickEditView() {
			clickElement(editViewBtn);
		}
		public void enterViewFirstName(String name) {
			enterText(viewName, name);
		}
		public void clickField() {
			clickElement(field);
		}
		public void clickFieldFilter() {
			clickElement(fieldFilter);
		}
		public void clickOperatorSelect() {
			clickElement(operatorSelect);
		}
		public void enterValue(String val) {
			enterText(value, val);
		}
		public void clickAvailableFields() {
			clickElement(availableFields);
		}
		public void clickAddBtn() {
			clickElement(addBtn);
		}
		public void clickSaveViewBtn() {
			clickElement(saveViewBtn);
		}
		public void clickMergeAccounts() {
			clickElement(mergeAccounts);
		}
		public void enterFindAccount(String acctName) {
			enterText(findAccount, acctName);
		}
		public void clickFindBtn() {
			clickElement(findBtn);
		}
		public void clickNextBtn() {
			clickElement(nextBtn);
		}
		public void clickMergeBtn() {
			clickElement(mergeBtn);
		}
		public void clickAcctLastAct() {
			clickElement(acctLastAct);
		}
		public void clickMenu() {
			clickElement(menu);
		}
		public void clickCreateDate() {
			clickElement(createDate);
		}
		public void clickShowCalendar() {
			clickElement(showCalendar);
		}
	
		public void clickShowCalendar2() {
			clickElement(showCalendar2);
		}
	
		public void clickSaveCalendarBtn() {
			clickElement(saveCalendarBtn);
		}
		public void enterReportName (String repName) {
			enterText(reportName, repName);
		}
		public void enterReportUnique (String repUnique) {
			enterText(reportUnique, repUnique);
		}
		public void clickSaveRunBtn() {
			clickElement(saveRunBtn);
		}
		public void clickTodayBtn() {
			clickElement(cal1);
		}
		public void clickTodayBtn2() {
			clickElement(cal2);
		}
}