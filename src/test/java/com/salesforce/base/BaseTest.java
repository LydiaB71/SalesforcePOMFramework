package com.salesforce.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.salesforce.pages.contactspages.ContactsPage;
import com.salesforce.pages.createacctpages.CreateAcctPage;
import com.salesforce.pages.createoptypages.CreateOptyPage;
import com.salesforce.pages.homepages.HomePage;
import com.salesforce.pages.leadspages.LeadsPage;
import com.salesforce.pages.loginpages.LoginPage;
import com.salesforce.pages.randomscenariospages.RandomScenariosPage;
import com.salesforce.pages.usermenupages.UsermenuPage;
import com.salesforce.utility.CommonUtilities;
import com.salesforce.utility.Constants;
import com.salesforce.utility.GenerateReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
protected static WebDriver driver;
	
	protected static GenerateReports report=GenerateReports.getInstance();
	protected static LoginPage loginPage;
	protected static HomePage homePage;
	protected static UsermenuPage usermenuPage;
	protected static CreateAcctPage createAcctPage;
	protected static CreateOptyPage createOptyPage;
	protected static LeadsPage leadsPage;
	protected static ContactsPage contactsPage;
	protected static RandomScenariosPage randomScenariosPage;
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Before class is executing");
		report.startExtentReport();
		System.out.println("extent report document is created");
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void initialSetUp(String browserName,Method method){
		report.startSingleTestReport(method.getName());
		System.out.println("Before method is executing");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(CommonUtilities.getApplicationProperty("url"));
		loginPage=new LoginPage(driver);
		homePage=new HomePage(driver);
		usermenuPage=new UsermenuPage(driver);
		createAcctPage=new CreateAcctPage(driver);
		createOptyPage=new CreateOptyPage(driver);
		leadsPage=new LeadsPage(driver);
		contactsPage=new ContactsPage(driver);
		randomScenariosPage=new RandomScenariosPage(driver);
	}
	
	@AfterMethod (enabled = true)
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			report.logTestpassed();
		} else if(result.getStatus()==ITestResult.FAILURE) {
			report.logTestFailed();
			String path=takescreenshot();
			
			try {
				report.logger.addScreenCaptureFromPath(path);
				//report.logger.addScreenCaptureFromPath(path, path)
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		//closeAllDriver();
		driver.quit();
	}
	
	@AfterSuite
	public void endUp() {
		report.endTestReport();
	}
	
	public static String takescreenshot() {
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//D:\BatchProjectCodes\Dec21\SeleniumAutomation\screenshots\firebase.jpg
		String filePath=Constants.SCREENSHOT_PATH+"firebase.jpg";

		File DestFile=new File(filePath);
		//Copy file at destination
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "D://BatchProjectCodes//Dec21//SeleniumAutomation//screenshots//firebase.jpg";
		
		//return "c://Users/synco/eclipse-workspace/SalesforcePOMFramework/screenshots/firebase.jpg";
	}
	

}
