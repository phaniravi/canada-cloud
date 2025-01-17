package com.baseclass;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.ExcelUtil;
import com.utilities.ReadConfig;
import com.utilities.UtilsReuse;

import signin.pages.SignIn;

public class BaseClass {
	public ReadConfig readconfig = new ReadConfig();
	public ExcelUtil excel=new ExcelUtil();
	public UtilsReuse util=new UtilsReuse();
	public String baseurl = readconfig.getApplicationURL();
	public String userid = readconfig.getUserId();
	public String pwd = readconfig.getPassword();
	public String departmentname = readconfig.departmentName();
	public static WebDriver driver=null;
	public SignIn sign;

	public static String dest;
	public static String time;

	public static ExtentReports report;
	public static ExtentTest test;

	public static String takeScreenshot(WebDriver driver) {
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
			Date date = new Date();

			time = dateFormat.format(date);
			TakesScreenshot scrnshot = (TakesScreenshot) driver;
			File src = scrnshot.getScreenshotAs(OutputType.FILE);
			dest = System.getProperty("user.dir") + "\\Screenshots\\" + time + ".png";
			File destination = new File(dest);
			FileUtils.copyFile(src, destination);
			System.out.println("Screenshot taken");
		} catch (Exception e) {
			System.out.println("Screenshot error is :" + e.getMessage());
		}
		return dest;
	}

	@BeforeTest
	public void reportSetup() {
		try {
			DateTimeFormatter timelapse = DateTimeFormatter.ofPattern("yyyy.MM.dd.HH.mm.ss");
			ZonedDateTime zone = ZonedDateTime.now();
			String reportTime = timelapse.format(zone);
			String repName = "Test-Report-" + reportTime + ".html";
			report = new ExtentReports(System.getProperty("user.dir") + "/ExtentReport/" + repName, true);
			report.addSystemInfo("HostName", "phani").addSystemInfo("Environment", "QA")
					.addSystemInfo("User", "Ambadas").addSystemInfo("Project Name", "Automation Demo");
			report.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
		} catch (Exception e) {
			System.out.println("Report issue is :" + e.getMessage());
		}

	}

	@AfterMethod
	public void getReport(ITestResult result) {
		try {
			if (result.getStatus() == ITestResult.FAILURE) {

				test.log(LogStatus.FAIL, result.getThrowable());
				test.log(LogStatus.FAIL, "Below is the screen shot:-" + test.addScreenCapture(takeScreenshot(driver)));
				test.log(LogStatus.FAIL, "Test Case Fail is:- " + result.getName());

			} else if (result.getStatus() == ITestResult.SUCCESS) {
				test.log(LogStatus.PASS, "Test Case pass is:- " + result.getName());
			} else if (result.getStatus() == ITestResult.SKIP) {
				test.log(LogStatus.SKIP, "test Case skip is:- " + result.getName());
			} else if (result.getStatus() == ITestResult.STARTED) {
				test.log(LogStatus.INFO, "Test Case started");

			}
			report.endTest(test);
		} catch (Exception e) {

			System.out.println("Report generation exception is :" + e.getMessage());
		}

	}

	@AfterTest
	public void endTest() {
		report.flush();
		report.close();
	}

	@Parameters("browser")
	@BeforeClass
	public void baseSetup(String browser) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getIEPath());
			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		try {
			test = report.startTest("Verify Signin Test");
			test.log(LogStatus.INFO, "Test Started" + test.getStartedTime());

			sign = PageFactory.initElements(driver, SignIn.class);
			sign.enterEmailID(userid);
			sign.enterPassword(pwd);
			sign.clickSigninBtn();
			
		} catch (Exception e) {
			System.out.println("Test signin not executed msg is: " + e.getMessage());
		}
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	// To get values related taxes from calculate pay screen
	public WebElement waitForElementAttribute(WebElement ele, String attributeName, String attributeValue) {
		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.attributeContains(ele, attributeName, attributeValue));
		if (ele.getAttribute(attributeName) == attributeValue) {
			System.out.println("The element contains attribute value");
			System.out.println("The Attribute is" + ele.getAttribute(attributeName));
		} else {
			System.out.println("The element doesn't contains attribute value");
		}
		return ele;
	}

	
	public void elementToClickByWait(WebElement element) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 60);
	WebElement eleclick=wait.until(ExpectedConditions.elementToBeClickable(element));
	Thread.sleep(1000);
		eleclick.click();
	}
	public void elementClickByActions(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e);
		a.click().build().perform();

	}
	public void elementOperations(WebElement element, String operation, String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));
		
		if(operation.equalsIgnoreCase("click"))
		{
			ele.click();
		}
		else if(operation.equalsIgnoreCase("sendkeys"))
		{
			ele.sendKeys(value);
			
		}
	}
	
	
	
	
	
	
}
