package com.salesforce.pages.createoptypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;

public class CreateOptyPage extends BasePage {

	public CreateOptyPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]") WebElement username;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[1]") WebElement password;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]") WebElement btnLogin;

	@FindBy(xpath="/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]") WebElement btnLogout;
	@FindBy(xpath="/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[1]/span") WebElement nameMenu;
    @FindBy(css="#AllTab_Tab > a > img") WebElement allTabs;
    @FindBy(linkText="Opportunities") WebElement optyLink;
    @FindBy(css="#tryLexDialogX") WebElement closePopup;
    @FindBy(css="#fcf") WebElement dropDownMenu;
    @FindBy(css="#hotlist > table > tbody > tr > td.pbButton > input") WebElement newOptyBtn;
    @FindBy(css="#opp3") WebElement optyName;
    @FindBy(css="#opp4") WebElement acctName;
    @FindBy(css="#opp11") WebElement stage;
    @FindBy(css="#opp11 > option:nth-child(2)") WebElement stage2;
    @FindBy(css="#opp12") WebElement probability;
    @FindBy(css="#opp6") WebElement leadSource;
    @FindBy(css="#opp6 > option:nth-child(2)") WebElement leadSource2;
    @FindBy(css="#opp17") WebElement campaign;
    @FindBy(css="#opp9") WebElement closeDate;
    @FindBy(css="#datePicker > div.calBody > div > a") WebElement closeDate2;
    @FindBy(css="#topButtonRow > input:nth-child(1)") WebElement saveOptyBtn;
    @FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a") WebElement optyPipelineLink;
    @FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a") WebElement stuckOptyLink;
    @FindBy(css="#quarter_q") WebElement quarterlySumMenu;
    @FindBy(css="#quarter_q > option:nth-child(2)") WebElement menuSelect1;
    @FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[2]/td/select") WebElement quarterlySumMenu2;
    @FindBy(css="#open > option:nth-child(2)") WebElement menuSelect2 ;
    @FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[3]/td/input") WebElement runReportBtn;


    
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
 		public void clickOptyLink() {
			clickElement(optyLink);
		}
 		public void clickDropDownMenu() {
			clickElement(dropDownMenu);
		}
 		public void clickNewOptyBtn() {
			clickElement(newOptyBtn);
		}
 		public void enterOptyName(String oName) {
 			enterText(optyName, oName);
 		}
 		public void enterAcctName(String aName) {
 			enterText(acctName, aName);
 		}
 		public void clickStage() {
			clickElement(stage);
		}
 		public void clickStage2() {
			clickElement(stage2);
		}
 		public void enterProbility(String prob) {
 			enterText(probability,"");
 			enterText(probability, prob);
 		}
 		public void clickLeadSource() {
			clickElement(leadSource);
		}
 		public void clickLeadSource2() {
			clickElement(leadSource2);
		}
 		public void enterIntoCampaign(String camp) {
 			enterText(campaign, camp);
 		}
 		public void clickCloseDate() {
			clickElement(closeDate);
		}
 		public void clickCloseDate2() {
			clickElement(closeDate2);
		}
 		public void clickSaveOptyBtn() {
			clickElement(saveOptyBtn);
		}
 		public void clickOptyPipelineLink() {
 			clickElement(optyPipelineLink);
 		}
 		public void clickStuckOptyLink() {
 			clickElement(stuckOptyLink);
 		}
 		public void clickQuarterlySumMenu() {
			clickElement(quarterlySumMenu);
		}
 		public void clickMenuSelect1() {
			clickElement(menuSelect1);
		}
 		public void clickMenuSelect2() {
			clickElement(menuSelect2);
		}
 		public void clickQuarterlySumMenu2() {
 			clickElement(quarterlySumMenu2);
 		}
 		public void clickRunReportBtn() {
 			clickElement(runReportBtn);
 		}
 		
}

