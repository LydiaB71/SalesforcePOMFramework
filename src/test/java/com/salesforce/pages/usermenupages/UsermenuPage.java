package com.salesforce.pages.usermenupages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;

public class UsermenuPage extends BasePage{
	public UsermenuPage(WebDriver driver) {
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
	@FindBy(linkText = "My Profile")
	WebElement myProfileOption;
	@FindBy(css = "#moderatorMutton > b")
	WebElement settings;
	@FindBy(xpath = "//*[@id=\\\"chatterTab\\\"]/div[1]/div/div[1]/div[1]/div/ul/li[2]/a")
	WebElement editProfile;
	@FindBy(xpath = "/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[2]/li/div/div/a")
	WebElement addPhoto;
	@FindBy(xpath = "//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]")
	WebElement chooseFile;

	@FindBy(css = "#userNav-menuItems > a:nth-child(2)")
	WebElement mySettings;
	@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[1]/div/div[4]/div[2]/a/span[2]")
	WebElement personalLink;
	@FindBy(css = "#LoginHistory_font")
	WebElement loginHistory;
	@FindBy(css = "#DisplayAndLayout_font")
	WebElement displayAndLayout;
	@FindBy(css = "#CustomizeTabs_font")
	WebElement customizeTabs;
	@FindBy(css = "#p4")
	WebElement customApp;
	@FindBy(css = "#p4 > option:nth-child(9)")
	WebElement salesforceChatter;
	@FindBy(css = "#duel_select_0 > option:nth-child(73)")
	WebElement reportsTab;
	@FindBy(css = "#duel_select_0_right > img")
	WebElement addTab;
	@FindBy(css = "#EmailSetup > a")
	WebElement emailSetup;
	@FindBy(css = "#EmailSettings_font")
	WebElement emailSettings;
	@FindBy(css = "#sender_name")
	WebElement senderName;
	@FindBy(css = "#sender_email")
	WebElement senderEmail;
	@FindBy(css = "#auto_bcc1")
	WebElement autoBccRadio;
	@FindBy(css = "#bottomButtonRow > input.btn.primary")
	WebElement saveBtn;
	@FindBy(css = "#CalendarAndReminders_font")
	WebElement calendarAndReminders;
	@FindBy(css = "#Reminders_font")
	WebElement reminders;
	@FindBy(css = "#testbtn")
	WebElement openTestReminders;

	@FindBy(css = "#userNav-menuItems > a.debugLogLink.menuButtonMenuLink")
	WebElement devConsole;
    
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
	public void clickMyProfileOption() {
		clickElement(myProfileOption);
	}
	public void clickSettingsButton() {
		clickElement(settings);
	}
	public void clickEditProfile() {
		clickElement(editProfile);
	}
	public void clickAddPhoto() {
		clickElement(addPhoto);
	}
	public void clickChooseFile() {
		clickElement(chooseFile);
//		chooseFile.sendKeys("C:/Users/synco/eclipse-workspace/SalesforcePOMFramework/resources");
	}
	public void clickMySettings() {
		clickElement(mySettings);
	}
	public void clickPersonalLink() {
		clickElement(personalLink);
	}
	public void clickLoginHistory() {
		clickElement(loginHistory);
	}
	public void clickDisplayAndLayout() {
		clickElement(displayAndLayout);
	}
	public void clickCustomizeTabs() {
		clickElement(customizeTabs);
	}
	public void clickCustomApp() {
		clickElement(customApp);
	}
	public void clickSalesforceChatter() {
		clickElement(salesforceChatter);
	}
	public void clickReportsTab() {
		clickElement(reportsTab);
	}
	public void clickAddTab() {
		clickElement(addTab);
	}
	public void clickEmailSetup() {
		clickElement(emailSetup);
	}
	public void clickEmailSettings() {
		clickElement(emailSettings);
	}
	public void enterSenderName(String name) {
			enterText(senderName, name);
			
		}
	public void enterSenderEmail(String email) {
			enterText(senderEmail, email);
		}
	public void clickAutoBccRadio() {
		clickElement(autoBccRadio);
	}
	public void clickSaveBtn() {
		clickElement(saveBtn);
	}
	public void clickCalendarAndReminders() {
		clickElement(calendarAndReminders);
	}
	public void clickReminders() {
		clickElement(reminders);
	}
	public void clickOpenTestReminders() {
		clickElement(openTestReminders);
	}
	public void clickDevConsole() {
		clickElement(devConsole);
	}
	
	public void clickLogoutButton() {
		clickElement(nameMenu);
		clickElement(btnLogout);
	}
	public void handleAlert() {
		AcceptAlert();
	}

}
