package com.salesforce.pages.randomscenariospages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;

public class RandomScenariosPage extends BasePage{

	public RandomScenariosPage(WebDriver driver) {
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
	@FindBy(css = "#home_Tab > a")
	WebElement homeLink;
	@FindBy(css = "#ptBody > div > div.content > span.pageType > h1 > a")
	WebElement userLink;
	@FindBy(css = "#chatterTab > div.leftContent > div.contactInfo.profileSection > div.vfButtonBar > h3 > div > div > a > img")
	WebElement editProfile;
	@FindBy(xpath = "/html/body/div/div/div/div[1]/ul/li[1]")
	WebElement aboutTab;
	@FindBy(css = "#bodyCell > div.bPageBlock.secondaryPalette > div.pbHeader > table > tbody > tr > td.bCustomize > input")
	WebElement customTabsBtn;
	@FindBy(css = "#duel_select_1 > option:nth-child(2)")
	WebElement tabToRemove;
	@FindBy(css = "#duel_select_0_left > img")
	WebElement removeBtn;
	@FindBy(css = "#bottomButtonRow > input.btn.primary")
	WebElement saveBtn;
	@FindBy(css = "#ptBody > div > div.content > span.pageDescription > a")
	WebElement currentDateLink;
	@FindBy(css = "#p\\:f\\:j_id25\\:j_id61\\:28\\:j_id64 > a")
	WebElement eightPMLink;
	@FindBy(css = "#ep > div.pbBody > div:nth-child(4) > table > tbody > tr:nth-child(2) > td.dataCol.col02 > div > a > img")
	WebElement subCombo;
	@FindBy(xpath = "/html/body/div[2]/ul/li[5]/a")
	WebElement otherOption;
	@FindBy(css = "#EndDateTime_time")
	WebElement timeEndDropDown;
	@FindBy(css = "#timePickerItem_42")
	WebElement ninePMSelect;
	@FindBy(css = "#topButtonRow > input:nth-child(1)")
	WebElement saveCalBtn;
	@FindBy(css = "#home_Tab > a")
	WebElement homeTab;
	@FindBy(css = "#p\\:f\\:j_id25\\:j_id61\\:20\\:j_id64 > a")
	WebElement fourPMLink;
	@FindBy(css = "#timePickerItem_38")
	WebElement sevenPMSelect;
	@FindBy(css = "#IsRecurrence")
	WebElement recurrenceChkBox;
	@FindBy(css = "#rectypeftw")
	WebElement frequencyWeeklyRadio;
	@FindBy(css = "#RecurrenceEndDateOnly")
	WebElement recEndDate;
	@FindBy(css = "#calMonthPicker")
	WebElement monthDropDown;
	@FindBy(css = "#calMonthPicker > option:nth-child(3)")
	WebElement marchSelect;
	@FindBy(css = "#calRow1 > td:nth-child(7)")
	WebElement daySelect;
	@FindBy(css = "#topButtonRow > input:nth-child(1)")
	WebElement saveCal2Btn;
	@FindBy(css = "#bCalDiv > div > div.calendarHeader.calendarHeaderBG > span.dwmIcons > a:nth-child(3) > img")
	WebElement monthView;
	
	
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
	public void clickHomeLink() {
		clickElement(homeLink);
	}
	public void clickUserLink() {
		clickElement(userLink);
	}
	public void clickEditProfile() {
		clickElement(editProfile);
	}
	public void clickAbout() {
		clickElement(aboutTab);
	}
	public void clickCustomTabBtn() {
		clickElement(customTabsBtn);
	}
	public void clickTabToRemove() {
		clickElement(tabToRemove);
	}
	public void clickRemoveBtn() {
		clickElement(removeBtn);
	}
	public void clickSaveBtn() {
		clickElement(saveBtn);
	}
	public void clickCurrentDateLink() {
		clickElement(currentDateLink);
	}
	public void clickEightPMLink() {
		clickElement(eightPMLink);
	}
	public void clickSubCombo() {
		clickElement(subCombo);
	}
	public void clickOtherOption() {
		clickElement(otherOption);
	}
	public void clickTimeEndDropDown() {
		clickElement(timeEndDropDown);
	}
	public void clickNinePMSelect() {
		clickElement(ninePMSelect);
	}
	public void clickSaveCalBtn() {
		clickElement(saveCalBtn);
	}
	public void clickHomeTab() {
		clickElement(homeTab);
	}
	public void clickFourPMLink() {
		clickElement(fourPMLink);
	}
	public void clickRecurrenceChkBox() {
		clickElement(recurrenceChkBox);
	}
	public void clickFrequencyWeeklyRadio() {
		clickElement(frequencyWeeklyRadio);
	}
	public void clickRecEndDate() {
		clickElement(recEndDate);
	}
	public void clickMonthDropDown() {
		clickElement(monthDropDown);
	}
	public void clickMarchSelect() {
		clickElement(marchSelect);
	}
	public void clickDaySelect() {
		clickElement(daySelect);
	}
	public void clickSaveCal2Btn() {
		clickElement(saveCal2Btn);
	}
	public void clickMonthView() {
		clickElement(monthView);
	}
	public void clickSevenPMSelect() {
		clickElement(sevenPMSelect);
	}
}
