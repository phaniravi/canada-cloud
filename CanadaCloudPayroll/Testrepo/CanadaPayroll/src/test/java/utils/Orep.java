package utils;

public class Orep {
	final static public String URL = "http://f6e22f9039d74193a760a0c72852434d.cloudapp.net/CanadaCloudPayroll/";
	final static public String Password = "Shane@4617";
	final static public String User = "rockinrocker.shane@gmail.com";
	final static public String LoginpageUserName = ".//input[@id='EmailAddress']";
	final static public String LoginpagePassword = ".//input[@id='Password']";
	final static public String LoginpageButton = ".//button[@name='go']";
	final static public String LaunchPagePaycycle = "(//*[@class='hasSubmenu'])[2]";
	final static public String LaunchPageProcessPay = "(//*[@class='linksli'])[11]";
	final static public String LaunchPageProcessPaynextbutton = "//*[@id='Next']";
	final static public String LaunchPageTimesheetnextbutton = "//*[@id='RetainHours']";
	final static public String Employee = ".//option[@value='NJnHHehJ/XB4ZeSEtKE0Gw==']";
	final static public String PayCheckbox = "//*[@id='isPayFrequencySelected_Monthly']";
	// ********EMPLOYEE WAGES>>TAXES************************//
	final static public String TAXEI = "//*[@id='TAXEI']";
	final static public String TAXQPIP = "//*[@id='TAXQPIP']";
	final static public String TAXCPP = "//*[@id='TAXCPP']";
	final static public String TAXQPP = "//*[@id='TAXQPP']";
	final static public String TAXIT = "//*[@id='TAXIT']";
	final static public String TAXQTax = "//*[@id='TAXQTax']";
	// ******************Excel file path*******************************//
	final static public String xlPath = "C:\\Users\\User\\Desktop\\SampleExcel.xlsx";
	// ****************EMPLOYEE EARNINGS**************************//
	final static public String DashboardReports = "(//*[@class='linksli'])[14]";
	final static public String EmployeeEarnings = "(//*[@class='collapsed'])[1]";
	final static public String ChequeDateSelect = "//*[text()='06-17-2019 ']";
	final static public String ChequeDateSelect2 = "//*[text()='06-21-2019 ']";
	final static public String EmployeeSelect = "(//*[@value='NJnHHehJ/XB4ZeSEtKE0Gw=='])[1]";
	final static public String EmployeeName2 = ".//option[@value='hD52BCIMvuTWx1dxj7tgkQ==']";
	final static public String EarningsRegister = "//*[@id='ern_rgstr']";
	// ******************Add Departments************//
	final static public String companysetupclick = "(//*[@class='hasSubmenu'])[1]";
	final static public String departmentsclick = "//*[@href='/CanadaCloudPayroll/Departments']";
	final static public String addnewdepartmentsclick = ".//*[@id='AdDept']";
	final static public String enterdepartmentName = ".//*[@id='Department0']";
	final static public String departmentsaveBtn = ".//*[@id='SubmitDepartmentText']";
	final static public String HourCategory = "//*[@href=\"/CanadaCloudPayroll/HourCategories\"]";
	final static public String AdditionalIncome = "//*[@href='/CanadaCloudPayroll/AdditionalIncome']";
	final static public String AddFromListButton = "(.//*[@class='btn btn-primary'])[3]";
	final static public String SelectFromList = "//*[@id='ListCategoryMaster']";
	final static public String AddButtonList = "//*[@id='LoadHourCatList']";
	final static public String companysetupStale = ".//*[@class='hasSubmenu active']";
	// *********************Additional Income**********************//
	final static public String AddFromListAddtlIncome = ".//*[@id='btnIncomeAddFromList']";
	final static public String EmptyClickAddtlIncome = ".//*[@id='dropIncomePopUpList']";
	final static public String AdditonalIncomeAddbtn = ".//*[@id='LoadIncomeList']";
	// **********************Deductions**************************//
	final static public String OtherDeductions = "//*[@href=\"/CanadaCloudPayroll/OtherDeductions\"]";
	final static public String AddFromlistBtn = "//*[@id='btnAddFromListDeduction']";
	final static public String EmptyClickOtherDeduc = "//*[@id='dropDeductionPopUpList']";
	final static public String AddButton = "//*[@id='LoadIncomeList']";
	final static public String PopupOK = "//*[@class='confirm']";
	//****************************Employee Creation****************//
	final static public String DashboardEmployeeSetup = ".//*[@id='lnkEmployees']";
	final static public String CreateEmployee = ".//*[@data-target='#createemp']";
	final static public String EmpFirstName=".//*[@id='FNameCr']";
	final static public String EmpLastName="//*[@id='LnameCr']";
	final static public String EmpStreet="//*[@id='AddressCr']";
	final static public String EmpCity="//*[@id='cityCr']";
	final static public String EmpProvince="//*[@id='ProvinceCr']";
	final static public String EmpSIN="//*[@id='SINCr']";
	final static public String EmpDOB="//*[@name='BirthDate']";
	final static public String EmpPostalCode="//*[@id='PostalCodeCr']";
	final static public String EmpSaveButton="//*[@id='SubmitPersonalInfo']";
	final static public String SelectEmpList="//*[@id='empList']";
	//*********Wages Tab****************//
	final static public String Tab_Wages=".//*[@href='#Wages']";
	final static public String EmpSalPerPayPeriod=".//*[@id='WagesInformation_SalaryPerPay']";
	final static public String PayFrequencyDropDown=".//*[@id='PayFrequency']";
	final static public String HourRate01=".//*[@id='HourRateEdit0']";
	final static public String HourRate02=".//*[@id='HourRateEdit1']";
	final static public String HourRate03=".//*[@id='HourRateEdit2']";
	final static public String HourRate04=".//*[@id='HourRateEdit3']";
	final static public String EmpHireDate=".//*[@id='WagesInformation_HireDate']";
	final static public String SaveButtonCommon="//*[@id='employeeUpdate']";
	final static public  String Tab_Taxes=".//*[@href='#Taxes']";
	//*****************Taxes Tab************//
	final static public String TaxesProvince="//*[@id='provinceListED']";
	//*********************Income/Deductions Tab*************************//
	final static public String Tab_Income=".//*[@href='#Income']";
	final static public String IncomeDropDown="//*[@id='IncomeDrpEdit']";
	final static public String AssignIncomeButton="//*[@id='AssignIncomeEdit']";
	final static public String OtherDeductionTab=".//*[@href='#DeductionsGridTabEdit']";
	final static public String DropDownDeduction=".//*[@id='DeductionsdrpEdit']";
	final static public String AssignDeduction=".//*[@id='AssignDeductionEdit']";
	//*****************Reports-Employee*************************************//
	final static public String ReportsEmpSalary="(//*[@id='frbody']/div/div[17]/div)[2]";
	final static public String ReportsEmpEI="//*[@id=\"frbody\"]/div/div[23]/div[2]";
	final static public String ReportsEmpCPP="//*[@id=\"frbody\"]/div/div[29]/div[2]";
	final static public String ReportsEmpIT="(//*[@id='frbody']/div/div[35]/div)[2]";
	final static public String ReportsEmpNET="(//*[@id=\"frbody\"]/div/div[41]/div)[2]";
	//****************Reports-CompanyTotals********//
	final static public String ReportsCTSalary="(//*[@id='frbody']/div/div[51]/div)[2]";
	final static public String ReportsCTHourly="(//*[@id=\"frbody\"]/div/div[56]/div)[2]";
	final static public String ReportsCTVacation="(//*[@id='frbody']/div/div[61]/div)[2]";
	final static public String ReportsCTEI="(//*[@id='frbody']/div/div[66]/div)[2]";
	final static public String ReportsCTQPIP="(//*[@id='frbody']/div/div[71]/div)[2]";
	final static public String ReportsCTCPP="(//*[@id='frbody']/div/div[76]/div)[2]";
	final static public String ReportsCTQPP="(//*[@id=\"frbody\"]/div/div[81]/div)[2]";
	final static public String ReportsCTIT="(//*[@id='frbody']/div/div[86]/div)[2]";	
	final static public String ReportsCTQTax="(//*[@id='frbody']/div/div[91]/div)[2]";
	final static public String ReportsCTNet="(//*[@id='frbody']/div/div[96]/div)[2]";
	//*****************************YTD************************//
	final static public String YTDSalary="(//*[@id=\"frbody\"]/div/div[19]/div)[2]";
	final static public String YTDEI="(//*[@id='frbody']/div/div[25]/div)[2]";
	final static public String YTDQPIP="(//*[@id='frbody']/div/div[31]/div)[2]";
	final static public String YTDQPP="(//*[@id='frbody']/div/div[37]/div)[2]";
	final static public String YTDIT="(//*[@id='frbody']/div/div[43]/div)[2]";
	final static public String YTDQTax="(//*[@id='frbody']/div/div[49]/div)[2]";
	final static public String YTDNet="(//*[@id='frbody']/div/div[55]/div)[2]";
	//*******************YTD-Company Totals***********************//
	final static public String YTDCSalary="//*[@id='frbody']/div/div[65]/div";
	final static public String YTDCHourly="//*[@id='frbody']/div/div[70]/div";
	final static public String YTDCVacation="//*[@id='frbody']/div/div[75]/div";
	final static public String YTDCEI="//*[@id='frbody']/div/div[80]/div";
	final static public String YTDCQPIP="//*[@id='frbody']/div/div[85]/div";
	final static public String YTDCCPP="//*[@id='frbody']/div/div[90]/div";
	final static public String YTDCQPP="//*[@id='frbody']/div/div[95]/div";
	final static public String YTDCIT="//*[@id='frbody']/div/div[100]/div";
	final static public String YTDCQTax="//*[@id='frbody']/div/div[105]/div";
	final static public String YTDCNet="//*[@id='frbody']/div/div[110]/div";
	//*************************Employees List**********************//
	final static public String ReportsEmployeesList=".//*[@id='dropEmployeeList']";
	final static public String ReportsChequeDateList= ".//*[@id='dropChequeList']";
	//*************************************************************************************//
	final static public String ProcessPayEmpList=".//*[@id='EmpList']";
	final static public String ProcessPay_Taxes=".//*[contains(@id,'TAX')]";
	final static public String Process_OtherDeduc="//*[(@id='OD1' or @id='OD2' or  @id='OD3' or @id='OD4' or @id='OD5' or @id='OD6' or @id='OD7') and @type='text']";
	final static public String Process_AddtlInc="//*[@class='wages']//*[@class='OI pull-right' or @id='VacPay' or @id='Accrued']";
	}
