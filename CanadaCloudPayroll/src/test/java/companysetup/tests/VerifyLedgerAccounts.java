package companysetup.tests;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.ExcelUtil;

import companysetup.pages.LedgerAccounts;

public class VerifyLedgerAccounts extends BaseClass {
	ExcelUtil excel = new ExcelUtil();
	public String path = System.getProperty("user.dir") + readconfig.getExcelPath();
	String expectedtitle = "";
	public LedgerAccounts ledger;
	public Select s;
	int size; 
	WebElement el;

		@Test(priority=1)
	public void editAccountno() throws InterruptedException, IOException {
		test = report.startTest("Verify to edit Account no. of LedgerAccount Test");
		test.log(LogStatus.INFO, "Test Started" + test.getStartedTime());
		ledger = PageFactory.initElements(driver, LedgerAccounts.class);
		ledger.CompanySetupClick.click();
		Thread.sleep(1000);
		ledger.LedgerAccountsClick.click();
		Thread.sleep(1000);

		
		
		s = new Select(ledger.SelectPayrollCategoriesLedger);
		List<WebElement> payrollcategory = s.getOptions();
		int payrollsize = payrollcategory.size();
		System.out.println("payroll size is:" +payrollsize);
		
		
		
		for (int k = 0; k<payrollsize; k++) {
			WebElement e = payrollcategory.get(k);
			
			System.out.println("payroll category text is:" + e.getText());
			String data1 = excel.getCellData(path, "ledger accounts", k + 1, 0);
			s.selectByVisibleText(data1);
			Thread.sleep(5000);
		
		
		size =ledger.EditActionBtnLedger.size();
		System.out.println("edit size is: "+size);
		for (int i =0; i<size; i++) {
			 el =ledger.EditActionBtnLedger.get(i);
			Thread.sleep(1000);
				el.click();		
		}
		int acsize=ledger.EnterLedgerAccountNumbers.size();
		int save=ledger.SaveEditAccountNo.size();
        System.out.println("ac no size is: "+acsize);
        System.out.println(" save ac size is: "+acsize);

		for(int j=0;j<save;j++) {
			WebElement enteracno=ledger.EnterLedgerAccountNumbers.get(j);
			Thread.sleep(1000);
			enteracno.clear();
			enteracno.sendKeys(RandomStringUtils.randomNumeric(6));
			Thread.sleep(2000);
			
			WebElement savecheck =ledger.SaveEditAccountNo.get(j);
			savecheck.click();
			Thread.sleep(3000);
		}
		}

	}
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}