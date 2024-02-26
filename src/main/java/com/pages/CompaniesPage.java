package com.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;


public class CompaniesPage {
	private WebDriver driver;
	
	
	private By settingLink = By.xpath("//div[@class='nav-bottom']//a[1]");
	private By profileLink = By.xpath("//div[@class='nav-bottom']//a[2]");
	private By searchBox = By.id("searchInput");
	private By addContactBtn = By.xpath("//button[contains(text(),'Add Contact')]");
	private By addContactTitle = By.xpath("//div[@id='add-contact']//h5[contains(text(),'Add Contact')]");
	private By addCompanyBtn = By.xpath("//a[@class='add-con-btn flat_pickr']");
	private By addContactBtnPopUp = By.xpath("//a[@class='add-con-btn']");
	private By resetBtn = By.xpath("//button[@class='btn btn-secondary']");
	private By closePopup = By.xpath("//button[@class='btn-close']");
	private By companyName = By.xpath("//input[@placeholder='Company Name']");
	private By phoneNumber = By.xpath("//input[@id='phone_number_company']");    
	private By companyEmail = By.xpath("//input[@id='company_email']");     
	private By website = By.xpath("//input[@id='company_website']");
	private By address = By.xpath("//input[@id='company_address']");
	private By city = By.xpath("//input[@id='company_city']");
	private By state = By.xpath("//input[@id='company_state']");
	private By zipcode = By.xpath("//input[@placeholder='Zip Code']");
	private By sDate = By.xpath("//input[@placeholder='Start Date'][2]");
	private By companyNameCompaniesList = By.xpath("//a[contains(text(),'TestCompany')]");
	private By addButton = By.xpath("//input[@data-disable-with='Add']");
	private By reportTime = By.xpath("//input[@name='company[report_time]']");
	private By closeButton = By.xpath("//button[contains(text(),'Close')]");
	private By cnErrorMsg = By.xpath("//span[contains(text(),\"Company name can't be blank.\")]");
	private By pnErrorMsg = By.xpath("//span[contains(text(),\"Phone number can't be blank.\")]");
	private By wsErrorMsg = By.xpath("//span[contains(text(),\"Website can't be blank.\")]");
	private By adErrorMsg = By.xpath("//span[contains(text(),\"Address can't be blank.\")]");
	private By cityErrorMsg = By.xpath("//span[contains(text(),\"City can't be blank.\")]");
	private By stateErrorMsg = By.xpath("//span[contains(text(),\"State can't be blank.\")]");
	private By zipcodeErrorMsg = By.xpath("//div[contains(text(),\"Zip code can't be blank.\")]");
	private By sdErrorMsg = By.xpath("//span[contains(text(),\"Start date can't be blank.\")]");
	private By rtErrorMsg = By.xpath("//span[contains(text(),\"Report time can't be blank.\")]");
	private By clickSearch = By.xpath("//i[@class='fa-solid fa-search']");
	private By clickEditButton = By.xpath("//*[@id=\"myTable\"]/tbody/tr/td[7]/a[1]");
	private By updateBtn = By.xpath("//input[@value='Update']");
	private By deleteBtn = By.xpath("//a[@class='fa-solid fa-trash-can']");
	private By AddcontactBtn = By.xpath("//a[@class='add-con-btn']");
	private By clickContactAddBtn = By.xpath("//div[@id='submit_button']//input[@class='btn btn-primary']");
	private By fnErrorMsg = By.xpath("//span[contains(text(),\"First name can't be blank.\")]");
	private By lnErrorMsg = By.xpath("//span[contains(text(),\"Last name can't be blank.\")]");
	private By titleErrorMsg = By.xpath("//span[contains(text(),\"Title must exist.\")]");
	private By phoneErrorMsg = By.xpath("//span[contains(text(),\"Phone number can't be blank.\")]");
	private By CompanyNameErrorMsg = By.xpath("//span[contains(text(),\"Company ids can't be blank.\")]");
	private By fName = By.xpath("//input[@placeholder='First Name']");
	private By lName = By.xpath("//input[@id='contact_last_name']");
	private By title = By.xpath("//*[@id=\"contact_title_id\"]");
	private By email = By.xpath("//input[@id='contact_email']");
	private By phone = By.xpath("//input[@id='phone_number_contact']");
	private By companyDropdown = By.xpath("//select[@id='contact_company_ids']");
	private By clickCompany = By.xpath("//a[contains(text(),'Test Company')]");
	private By companyNameDisplay = By.xpath("//h2[contains(text(),'Test Company')]");
	private By closeAddContactPopup= By.xpath("//body/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]");
	private By addCompanyPopupStatus=By.xpath("//h4[@id='newCompanyModalLabel']");
	
	private By getCompanyNameStatus= By.xpath("//a[contains(text(),'Test Company')]");
	private By getSearchCompanyStatus= By.xpath("//a[contains(text(),'TestCompany')]");
	private By getDeleteCompanyStatus= By.xpath("//a[contains(text(),'TestCompany')]");
	private By getAddCompanyPopupCloseStatus= By.xpath("//div[@class='comp-head']//a[contains(.,'Companies')]");
	private By clickAddContactCompanyPage= By.xpath("//body/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[2]");
	private By getAddContactPopupTitleStatus= By.xpath("//h4[@id='newcontactModalLabel']");
	private By getContactSatusCompanyList = By.xpath("//div[@class='se-tit contact-item']//p[contains(.,'Test Contact')]");
	private By clickFilter = By.xpath("//thead/tr[1]/th[7]/a[1]");
	private By selectCompany= By.xpath("//select[@id='company_name']");
	private By filterBtn=By.xpath("//input[@value='Filter']");
	private By getFilterCompanyStatus= By.xpath("//a[contains(text(),'Test Company')]");
	private By filterResetBtn=By.xpath("//a[contains(text(),'Reset')]");
	private By getFilteredCompanyStatus= By.xpath("//a[contains(text(),'Test Company')]");
	private By clickCompanyLink=By.xpath("//span[contains(text(),'Companies')]");
	////////////////////////Statistics>>Royalty&Fidesic Locators////////////////////////////////////////////////
	private By getStatisticsTitle= By.xpath("//a[contains(text(),'Statistics')]");
	private By royaltyAndFidesic = By.xpath("//h6[contains(text(),'Royalty & Fidesic')]");
	private By royaltyAndFidesicPopupTitle= By.xpath("//h4[@id='newcontactModalLabel']");
	private By royaltyFiledDate=By.xpath("//input[@placeholder='Royalty filed date'][2]");
	private By royaltyAuditDate=By.xpath("//input[@placeholder='Royalty audit date'][2]");
	private By royaltyPaidDate=By.xpath("//input[@placeholder='Royalty paid date'][2]");
	private By royaltyAndFidesicAddBtn = By.xpath("//*[@id=\"tab-1\"]/div/div[2]/div[1]/div[1]/div[2]/a");
	private By royaltyandFidesicPopupTitle = By.xpath("//h4[contains(text(),'Create Royalty & Fidesic record')]");
	private By addButtonOfrAndfPopup = By.xpath("//div[@id='submit_button']//input[@name='commit']");
	private By closeButtonOfrAndfPopup = By.xpath("//div[@id='submit_button']//button[@name='button']");
	private By errorMsgLicenceNo = By.xpath("//span[contains(text(),\"License number can't be blank.\")]");
	private By errorMsgNotNumber = By.xpath("//span[contains(text(),'License number is not a number.')]"); 
	private By licenceNumber = By.xpath("//input[@id='royal_fidesic_license_number']");

	////////////////////////Statistics>>CheckOffList Locators////////////////////////////////////////////////
	private By addCheckList = By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/a");
	private By addCheckListPopUp = By.xpath("//*[@id=\"submit_button\"]/input");
	
	private By nameChekListErrorMSg = By.xpath("//span[contains(text(),\"Name can't be blank.\")]");
	private By dateCheckListErrorMsg = By.xpath("//span[contains(text(),\"Date can't be blank.\")]");
	
	private By nameCheckList = By.xpath("//input[@id='check_off_list_name']");

	////////////////////////RoyaltyDifference Locators////////////////////////////////////////////////
	private By royaltyDiffTab= By.xpath("//a[contains(text(),'Royalty Difference')]");
	private By clickAddFranchiseBtn= By.xpath("//*[@id=\"1\"]/div[1]/a");
	private By franchise= By.xpath("//input[@id='restrict_number']");
	private By qbo= By.xpath("//input[@placeholder='QBO']");
	private By sevpronet= By.xpath("//input[@placeholder='Servpronet']");
	private By errorFranchiseName = By.xpath("//span[contains(text(),\"Franchise number can't be blank.\")]");
	private By AddbuttonRAndD = By.xpath("//*[@id=\"contact_modal_body\"]/form/div[4]/input");
	private By royaltyDifferenceExpand = By.xpath("//div[@parentdiv=\"1\"]");
	private By selectYear = By.xpath("//select[@id='year']");
	private By closeBtnOfRoyaltyDiff = By.xpath("//button[contains(text(),'Close')]");
	private By clickDailyReconciledTab = By.xpath("//a[contains(text(),'Daily Reconciled')]");
	private By clickAddAccountbutton = By.xpath("//a[contains(text(),'+ Add Account')]");
	private By addAccountErrorMsg = By.xpath("//span[contains(text(),\"Name can't be blank.\")]");
	private By clickAddButtonPopup = By.xpath("//input[@type='submit']");
	private By accoutname = By.xpath("//input[@id='account_name']");
	private By editButtonAccount = By.xpath("//*[@id=\"tab-2\"]/div/div/div[1]/div[1]/div[2]/a");
	private By addButtonNewPayment = By.xpath("//div[@class='dashbox-header mb-2']//a[contains(.,'+ Add')]");
	private By newPayment = By.xpath("//input[@id='daily_reconciled_transaction_vendor_name']");

	private By deleteBtnRoyaltyDiff = By.xpath("//div[@class='accordion-container']//div[1]//div[1]//a[@data-turbo-method='delete']");
	
	//////////////DetailsTab///////////////////////////
	private By clickDetailsTab =By.xpath("//a[contains(.,'Details')]");
	private By clickOnEditButton = By.xpath("//a[contains(.,'Edit')]");
	private By updateWebsite = By.xpath("//input[@placeholder='Website']");
	private By addButtonLinkSection =By.xpath("//*[@id=\"tab2\"]/div[4]/div/a[contains(.,'Add')]");
	private By linkText= By.xpath("//input[@placeholder='Link Name']");
	private By websiteText= By.xpath("//input[@placeholder='Website']");
	private By updateWebsiteLink= By.xpath("//input[@id='company_link_website']");
	//private By addAnotherReport= By.cssSelector("div.add-com-f.d-flex:nth-child(1) a.add-more:nth-child(3) svg:nth-child(1) > path:nth-child(1)");

	
	///////////////////Notes Tab locators///////////////////////////////////
	private By clickNotesTab = By.xpath("//ul[@id='tabs-nav']//a[contains(.,'Notes')]");
	private By clickAddNotesButton = By.xpath("//a[contains(.,'Add Notes')]");
	private By addNotesPopupStatus = By.xpath("//*[@id=\"select-note\"]/li[1]/a");  
	private By resetButton = By.xpath("//*[@id=\"add-contact\"]/div/div/div[4]/div/a");
	private By assignToErrorMsg =By.xpath("//span[contains(text(),\"Assigned to can't be blank.\")]");
	private By assign = By.xpath("//select[@id='note_assigned_to']");
	private By textfieldNotes = By.xpath("//input[@id='note_subject']");
	private By notestext = By.xpath("//trix-editor[@id='note_detail']");
	
	///////////////////////Documents page locators///////////////////////
	private By documentPage= By.xpath("//body/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]");
	private By editButton = By.xpath("//div[@class='doc-list-b']//span");
	private By folderName= By.xpath("//input[@placeholder='Folder Name']");
	private By clickUpdateBtn = By.xpath("//input[@type='submit']");
	private By getUpdatedFolderNameStatus=By.xpath("//div[@class='doc-list-b']//p//a[1]");
	private By uploadDoc = By.xpath("//div[@class='btn-grp']//a[@class='btn-ed fl-btn']");
	private By addbtnUploadDocPopup = By.xpath("//input[@value=\"Add\"]");
	private By folderNameErrorMsg= By.xpath("//span[contains(text(),\"Name can't be blank.\")]");
	private By fileName = By.xpath("//input[@id='document_name']");
	private By clickUploadDoc = By.xpath("//input[@id='file-input']");
	private By uploadedDocumentStatus =By.xpath("//a[contains(text(),'Document1')]");
	private By searchText = By.xpath("//input[@placeholder='Search...']");
	private By searchDocumentStatus = By.xpath("//a[contains(text(),'Document2')]");
	private By editDoc = By.xpath("//tr[1]//button[@type='submit']");
	private By editDocFileName = By.xpath("//input[@placeholder='File Name']");
	private By updateBtnDocument = By.xpath("//input[@value='Update']");
	private By editDocument = By.xpath("//tr//td//a[text()='Document']");
	private By deleteBtnDoc = By.xpath("//tr[1]//i[@class='fa-solid fa-trash-can']");
	private By clickTasks = By.xpath("//span[contains(text(),'Tasks')]");
	private By taskTemplateTab = By.xpath("//ul[@id='tabs-nav']//a[@href='/task_templates']");
	private By createTemplateBtn = By.xpath("//a[@class='btn-ed fl-btn']");
	private By nameFieldOfTaskTemplatePopUp =  By.xpath("//input[@id='task_template_name']");
	private By addBtnOfCreateTemplatePopup = By.xpath("//input[@class='btn btn-primary']");
	
	
	
	
	public CompaniesPage(WebDriver driver) {
		this.driver = driver;
	}

	public String CompaniesPageURL() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String str = driver.getCurrentUrl();
//		if(str.equals("https://beta.cisin.com:4991/")||str.equals("https://beta.cisin.com:4991/users/sign_in")) {
//			System.out.printf(str);
//		}
//		else if(str.equals("https://beta.cisin.com:4991/users/sign_in")||str.equals("https://beta.cisin.com:4991/")){
//			System.out.println(driver.getCurrentUrl());
//		}
		return str;
		
	}

	public String CompaniesPageTitle() {
		String str = driver.getTitle();
		return str;
	}

	public boolean getSideNavLinkStatus(String linkName) {

		return driver.findElement(By.xpath("//span[text()='" + linkName + "']")).isDisplayed();

	}

	public boolean getTabLinkStatus(String tabName) {
		return driver.findElement(By.xpath("//ul[@id='tabs-nav']//*[contains(@href,'" + tabName + "')]")).isDisplayed();
	}

	public boolean getProfileIconStatus() {
		return driver.findElement(profileLink).isDisplayed();
	}

	public boolean getSettingLinkStatus() {
		return driver.findElement(settingLink).isDisplayed();
	}

	public boolean getSearchFieldStatus() {
		return driver.findElement(searchBox).isDisplayed();
	}

	public boolean getAddContactBtnStatus() {
		return driver.findElement(addContactBtn).isDisplayed();
	}

	public void clickedOnAddContactBtn() {
		WebElement AddContactBtn = driver.findElement(addContactBtn);
		AddContactBtn.click();
	}

	public String getAddContactTitleStatus() {
		new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.presenceOfElementLocated(addContactTitle));
		String title = driver.findElement(addContactTitle).getText();
		return title;
	}

	public boolean getAddCompanyBtnStatus() {
		return driver.findElement(addCompanyBtn).isDisplayed();
	}

	public boolean getAddContactBtnPopUpStatus() {
		return driver.findElement(addContactBtnPopUp).isDisplayed();
	}

	public boolean getResetBtnStatus() {
		return driver.findElement(resetBtn).isDisplayed();
	}

	public void  clickOnResetBtn() {
		WebElement resetbtn = driver.findElement(resetBtn);
		resetbtn.click();
	
	}
	
	public String addContactPopupCloseSuccessfully() {
		String str = driver.findElement(closeAddContactPopup).getText();
		return str;
	}

	public void clickOnCloseBtn() {
		driver.findElement(closePopup).click();

	}
	
	

	public void clickOnAddCompanyBtn() throws InterruptedException {
	Thread.sleep(1000);
		WebElement addCompanybtn = driver.findElement(addCompanyBtn);
		addCompanybtn.click();
		
	}
	
	public boolean getAddCompanyStatus() {
		return driver.findElement(addCompanyPopupStatus).isDisplayed();
	}

	public void enterCompanyInfo(String cn, String pn, String Ext, String wsite, String e, String ad, String c, String s,
			String zip, String sdate) throws InterruptedException {
	Thread.sleep(1000);
		WebElement cName = driver.findElement(companyName);
		cName.sendKeys(cn);
		WebElement pNumber = driver.findElement(phoneNumber);
		pNumber.sendKeys(pn);
		WebElement wSite = driver.findElement(website);
		wSite.sendKeys(wsite);
		driver.findElement(companyEmail).sendKeys(e);
		WebElement ext = driver.findElement(By.xpath("//input[@placeholder='Extension']"));
		ext.sendKeys(Ext);

		WebElement aD = driver.findElement(address);
		aD.sendKeys(ad);
		WebElement citY = driver.findElement(city);
		citY.sendKeys(c);
		WebElement S = driver.findElement(state);
		S.sendKeys(s);
		WebElement zipC = driver.findElement(zipcode);
		zipC.sendKeys(zip);

		WebElement startDate = driver.findElement(sDate);
		 startDate= new WebDriverWait(driver, Duration.ofSeconds(10))
       .until(ExpectedConditions.elementToBeClickable(driver.findElement(sDate)));
		startDate.click();
		
		WebElement sDate = driver.findElement(By.xpath("//span[@aria-label='" + sdate + "']"));
		sDate.click();
		
		driver.findElement(By.xpath("//input[@id='company_logo']")).sendKeys("E:\\Rahul Bhalla CIS\\OntrackProjectBDD\\OnTrack_BDD\\Image\\testing-logo.jpg");
		
		WebElement rTime = driver.findElement(reportTime);
		rTime.click();
		driver.findElement(addButton).click();

	}

	public String companyNameCompaniesList() {
		String str = driver.findElement(companyNameCompaniesList).getText();
		return str;
	}

	public void searchCompany(String companyName) {
		WebElement cn = driver.findElement(searchBox);
		cn.sendKeys(companyName);
	}

	public void clickOnEditButton() {
		driver.findElement(clickEditButton).click();
	}

	public void updateCompanyname(String cn) {
		WebElement cName = driver.findElement(companyName);
		cName.clear();
		cName.sendKeys(cn);

	}

	public void clickOnUpdateBtn() {
		driver.findElement(updateBtn).click();
	}
	
	public String getUpdatedCompanyNameStatus() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(getCompanyNameStatus).getText();
	}

	public void clickOnSearch() {
		driver.findElement(clickSearch).click();

	}

	public boolean getSearchCompanyStatus() {
		return driver.findElement(getSearchCompanyStatus).isDisplayed();
	}
	
	public void clickOnDeleteBtn() {
		driver.findElement(deleteBtn).click();
	}

	public String deleteCompany() {
		
		driver.switchTo().alert().accept();
		String str = driver.findElement(getDeleteCompanyStatus).getText();
		return str;
		
	}

	public void clickOnCloseButton() {
		driver.findElement(closeButton).click();
	}
	
	public String addCompanyPopupCloseSuccessfully() throws InterruptedException {
		Thread.sleep(1000);
		String str = driver.findElement(getAddCompanyPopupCloseStatus).getText();
		return str;
	}


	public void clickOnAddButtonPopup() throws InterruptedException {
		driver.findElement(addButton).click();
		Thread.sleep(1000);
	}

	public String getInvalidCredTextCompnayName() throws InterruptedException {
		Thread.sleep(1000);
		String str = driver.findElement(cnErrorMsg).getText();
		return str;
	}

	public String getInvalidCredTextPhoneNumber() throws InterruptedException {
		Thread.sleep(1000);
		String str = driver.findElement(pnErrorMsg).getText();
		return str;
	}

	public String getInvalidCredTextWebsite() {
		String str = driver.findElement(wsErrorMsg).getText();
		return str;
	}

	public String getInvalidCredTextAddress() throws InterruptedException {
		Thread.sleep(1000);
		String str = driver.findElement(adErrorMsg).getText();
		return str;
	}

	public String getInvalidCredTextCity() {
		String str = driver.findElement(cityErrorMsg).getText();
		return str;
	}

	public String getInvalidCredTextState() {
		String str = driver.findElement(stateErrorMsg).getText();
		return str;
	}

	public String getInvalidCredTextZipCode() throws InterruptedException {
		Thread.sleep(1000);
		String str = driver.findElement(zipcodeErrorMsg).getText();
		return str;
	}

	public String getInvalidCredTextStartDate() throws InterruptedException {
		Thread.sleep(2000);
		String str = driver.findElement(sdErrorMsg).getText();
		return str;
	}

	public String getInvalidCredTextReportingTime() {
		String str = driver.findElement(rtErrorMsg).getText();
		return str;
	}

	public void clickOnADDContactBtn() {
		driver.findElement(AddcontactBtn).click();
	}
	
	public void clickAddContactButtonOfCompany() {
		driver.findElement(clickAddContactCompanyPage).click();
	}
	
	public boolean getAddContactPopupTitleContactStatus() {
		
		return driver.findElement(getAddContactPopupTitleStatus).isDisplayed();
	}
	
	

	public void clickContactAddBtn() {
		WebElement addbtn = driver.findElement(clickContactAddBtn);
		addbtn.click();
	}

	public String getInvalidCredTextFristName() {
		String str = driver.findElement(fnErrorMsg).getText();
		return str;
	}

	public String getInvalidCredTextLastName() {
		String str = driver.findElement(lnErrorMsg).getText();
		return str;
	}

	public String getInvalidCredTextTitle() {
		String str = driver.findElement(titleErrorMsg).getText();
		return str;
	}

	public String getInvalidCredTextPhone() {
		String str = driver.findElement(phoneErrorMsg).getText();
		return str;
	}

	public String getInvalidCredTextCompany() {
		String str = driver.findElement(CompanyNameErrorMsg).getText();
		return str;
	}

	public void enterContactInfo(String fn, String ln, String t, String mail, String pn, String c) {
		WebElement fname = driver.findElement(fName);
		fname.sendKeys(fn);
		WebElement lname = driver.findElement(lName);
		lname.sendKeys(ln);
		Select titleE = new Select(driver.findElement(title));
		titleE.selectByVisibleText(t);
		WebElement eMail = driver.findElement(email);
		eMail.sendKeys(mail);
		WebElement pNumber = driver.findElement(phone);
		pNumber.sendKeys(pn);
		WebElement selectCompany = driver.findElement(companyDropdown);
		Select company = new Select(selectCompany);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		company.selectByVisibleText(c);

		driver.findElement(clickContactAddBtn).click();

	}
	
	public String getContactNameStatusCompanyList() throws InterruptedException 
	{
		Thread.sleep(1000);
		return driver.findElement(getContactSatusCompanyList).getText();
	}
	
	
	public void fiteredCompany(String com, String contact) {
		driver.findElement(clickFilter).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(30));
	    w.until(ExpectedConditions .visibilityOfElementLocated(selectCompany));
		WebElement company= driver.findElement(selectCompany);
		Select c = new Select(company);
		c.selectByVisibleText(com);
		Select selectContact = new Select(driver.findElement(By.xpath("//select[@name='related_contact']")));
		selectContact.selectByVisibleText(contact);
		driver.findElement(filterBtn).click();
	}
	
	public String getFilteredCompanyStatus() {
		return driver.findElement(getFilterCompanyStatus).getText();
	}
	
	public void resetFilteredCompany() {
		driver.findElement(clickFilter).click();
		driver.findElement(filterResetBtn).click();
	}
	
	public String getFilteredCompaniesStatus() {
		return driver.findElement(getFilteredCompanyStatus).getText();
	}
	
	
	public void clickOnCompany() {
		driver.findElement(clickCompanyLink).click();
		driver.navigate().refresh();
		WebElement clickOnCompany = driver.findElement(clickCompany);
		clickOnCompany.click();
		
	}
	
	public String getCompanyName() {
		String str = driver.findElement(companyNameDisplay).getText();
		return str;
	}
	
	
	////////////  Dashboard>>Statistics>>Royalty&Fidesic widget///////////////////////////////
	
	public String getStatistics() {
		String str = driver.findElement(getStatisticsTitle).getText();
		return str;
	}
	
	public String getRoyaltyAndFidesic() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)","");
		String str = driver.findElement(royaltyAndFidesic).getText();
		return str;
	}
	
	public boolean getRoyaltyAndFidesicAddBtnStatus() {
		return driver.findElement(royaltyAndFidesicAddBtn).isDisplayed();
	}
	
	public void addButtonOfRoyaltyAndFidesicRecord() {
		WebElement addButton = driver.findElement(royaltyAndFidesicAddBtn);
		addButton.click();
	}

	public String getRoyaltyAndFidesicTitleStatus() {
		String str = driver.findElement(royaltyandFidesicPopupTitle).getText();
		return str;
	}
	
	public boolean addBbuttonRoyaltyAndFidesicPopUp() {
		return driver.findElement(addButtonOfrAndfPopup).isDisplayed();
	}
	
	public boolean closeBbuttonRoyaltyAndFidesicPopUp() {
		return driver.findElement(closeButtonOfrAndfPopup).isDisplayed();
	}
	
	public void clickAddBbuttonRoyaltyAndFidesicPopUp() {
		WebElement addButton = driver.findElement(addButtonOfrAndfPopup);
		addButton.click();
	}
	
	public boolean  getLicenceNumberErrorMsg()
	{
		return driver.findElement(errorMsgLicenceNo).isDisplayed();
		
	}
	
	public boolean getLicenceNotNumber() {
		return driver.findElement(errorMsgNotNumber).isDisplayed();
	}
	
	public void FieldsOfRoyaltyAndFidesicInfo(String ln, String rdate, String adate, String rpdate, String ipdate) throws InterruptedException 
	{
		try {
		
		WebElement licenceNo = driver.findElement(licenceNumber);
		licenceNo.sendKeys(ln);
	
		driver.findElement(royaltyAndFidesicPopupTitle).click();
	
		driver.findElement(royaltyFiledDate).click();
		Thread.sleep(1000);
		List<WebElement> selectFiledDate = driver.findElements(By.xpath("//span[@aria-label='" + rdate + "']"));
		
		for (WebElement webElement : selectFiledDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		/////////////// Royalty Audit Date	
			driver.findElement(royaltyAuditDate).click();  
			Thread.sleep(1000);

			List<WebElement> selectAuditDate = driver.findElements(By.xpath("//span[@aria-label='" + adate + "']"));
		
			for (WebElement webElement : selectAuditDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		Thread.sleep(1000);
		
//			////// Royalty Paid Date
		driver.findElement(royaltyPaidDate).click();  
			Thread.sleep(1000);

		List<WebElement> selectRyaltyPaidDate = driver.findElements(By.xpath("//span[@aria-label='" + rpdate + "']"));
		for (WebElement webElement : selectRyaltyPaidDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		//////// Invoice Paid Date
		driver.findElement(By.xpath("//input[@placeholder='Invoice paid date'][2]")).click();  
		List<WebElement> selectInvoicePaidDate = driver.findElements(By.xpath("//span[@aria-label='" + ipdate + "']"));
		for (WebElement webElement : selectInvoicePaidDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		driver.findElement(By.xpath("//*[@id=\"submit_button\"]/input")).click();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean getRoyaltyAndFidesicRecordStatus() {
		return driver.findElement(By.xpath("//span[contains(text(),'12345')]")).isDisplayed();
		
	}
	
	public void click_EditButton_RoyaltyAndFidesicWidget() {
		driver.findElement(By.xpath("//*[@id=\"tab-1\"]/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[6]/a")).click();
	}
	
	public void FieldsOfRoyaltyAndFidesicUpdateInfo(String ln, String rdate, String adate, String rpdate, String ipdate) 
	{
		
		
		try {
			
		WebElement licenceNo = driver.findElement(licenceNumber);
		licenceNo.clear();
		licenceNo.sendKeys(ln);
	
		driver.findElement(By.xpath("//h4[@id='newcontactModalLabel']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@placeholder='Royalty filed date'][2]")).click();
		Thread.sleep(1000);

		List<WebElement> selectFiledDate = driver.findElements(By.xpath("//span[@aria-label='" + rdate + "']"));
		
		for (WebElement webElement : selectFiledDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		/////////////// Royalty Audit Date	//////////////////////////
		Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@placeholder='Royalty audit date'][2]")).click();  
			
			List<WebElement> selectAuditDate = driver.findElements(By.xpath("//span[@aria-label='" + adate + "']"));
		
			for (WebElement webElement : selectAuditDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		
//			////// Royalty Paid Date
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@placeholder='Royalty paid date'][2]")).click();  
//		
		List<WebElement> selectRyaltyPaidDate = driver.findElements(By.xpath("//span[@aria-label='" + rpdate + "']"));
		for (WebElement webElement : selectRyaltyPaidDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		//////// Invoice Paid Date
		driver.findElement(By.xpath("//input[@placeholder='Invoice paid date'][2]")).click();  
		List<WebElement> selectInvoicePaidDate = driver.findElements(By.xpath("//span[@aria-label='" + ipdate + "']"));
		for (WebElement webElement : selectInvoicePaidDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		driver.findElement(By.xpath("//*[@id=\"submit_button\"]/input")).click();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	
	public boolean getUpdateRoyaltyAndFidesicRecordStatus() {
		return driver.findElement(By.xpath("//span[contains(text(),'45689')]")).isDisplayed();
	}
	
	public void DeleteRoyaltyAndFidesicRecord() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tab-1\"]/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[7]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
		
	/////////////////////companies>>Dashboard>>Statistics>>Check off list widget

	
	public void addBtnCheckOFList() {
		WebElement addBtn = driver.findElement(addCheckList);
		addBtn.click();
	}
	
	public void clickCloseButtonReconciledDate() {
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
	}
	
	public boolean closeButtonReconciledDate() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//h6[contains(text(),'Check Off List')]")).isDisplayed();
	}
	public void addBtnCheckListPopup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)","");
		WebElement addBtn = driver.findElement(addCheckListPopUp);
		addBtn.click();
	}
	
	
	
	public String getNameCheckListErrorMsg()
	{
		String str = driver.findElement(nameChekListErrorMSg).getText();
		return str;	
	}
	
	public String getDateCheckListErrorMsg()
	{
		String str = driver.findElement(dateCheckListErrorMsg).getText();
		return str;	
	}
	
	public void enterFieldsOfCheckList(String name, String date) throws InterruptedException  {
		try {
				WebElement clName = driver.findElement(nameCheckList);
				clName.sendKeys(name);
			
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@placeholder='Date'][2]")).click();
				List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
				for (WebElement webElement : selectDate) {
					if (webElement.isDisplayed()) {
					
						webElement.click();
					} 
				}
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"submit_button\"]/input")).click();
				Thread.sleep(1000);
		}
				
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
			
		
		
	}
	
	public String getCheckOffListRecordStatus() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		return driver.findElement(By.xpath("//p[contains(text(),'Ravi')]")).getText();
		
	}
	
	public void clickOnEditButtonCheckOffList() {
		driver.findElement(By.xpath("//div[@class='check-list-box']//a[1]")).click();
	}
	
	public void EditCheckListRecord(String n, String date) throws InterruptedException   {
		
		try {
			WebElement clName = driver.findElement(nameCheckList);
			clName.clear();
			clName.sendKeys(n);
		
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@placeholder='Date'][2]")).click();
			List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
			for (WebElement webElement : selectDate) {
				if (webElement.isDisplayed()) {
				
					webElement.click();
				} 
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"submit_button\"]/input")).click();
	}
			
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	public String getUpdateCheckOffListRecordStatus() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		return driver.findElement(By.xpath("//p[contains(text(),'Janvi')]")).getText();
	}
	
	public void DeleteCheckOffListRecord() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='check-list-box']//a[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	
	////////////////////////////companies>>Dashboard>>Statistics>>Reconciled Date////////////////////////////////////////
	public void clickAddButtonReconciledDate() {
		driver.findElement(By.xpath("//div[@class='dashboard-box   cb-three  small-box ']//a")).click();
	}
	
	public void clickCloseButtonReconciledDatePopup() {
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
	}
	
	public boolean closeReconciledDatePopup() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//h6[contains(text(),'Reconciled Date')]")).isDisplayed();
	}
	
	public void clickAddButtonReconciledDatePopup() {
		 driver.findElement(By.xpath("//input[@value='Add']")).click();
	}
	
	public String getAccountNameReconciledDateErrorMsg() {
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Account name can't be blank.\")]")).getText();
		return str;
	}
	
	public void createReconciledDatesRecord(String ln, String rdate, String adate) throws InterruptedException {

		try {
		driver.findElement(By.xpath("//input[@id='reconciled_date_account_name']")).sendKeys(ln);
		driver.findElement(By.xpath("//h4[@id='newcontactModalLabel']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Report Date'][2]")).click();
		List<WebElement> selectrDate = driver.findElements(By.xpath("//span[@aria-label='" + rdate + "']"));
		for (WebElement webElement : selectrDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		driver.findElement(By.xpath("//h4[@id='newcontactModalLabel']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Auditor Date'][2]")).click();	
		Thread.sleep(1000);
		List<WebElement> selectaDate = driver.findElements(By.xpath("//span[@aria-label='" + adate + "']"));
		for (WebElement webElement : selectaDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(1000);
		}
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getCreatedReconciledDateRecord() {
		return driver.findElement(By.xpath("//span[contains(text(),'ICICI0000456123')]")).getText();
	}
	
	public void clickEditButtonReconciledDateRecord() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tab-1\"]/div/div[2]/div[3]/div[2]/table/tbody/tr/td[4]/a")).click();
	}
	
	public void editReconciledDateRecord(String ln, String rdate, String adate) {
		try {
		WebElement editan= driver.findElement(By.xpath("//input[@id='reconciled_date_account_name']"));
		editan.clear();
		editan.sendKeys(ln);
		driver.findElement(By.xpath("//h4[@id='newcontactModalLabel']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Report Date\"][2]")).click();
		List<WebElement> selectrDate = driver.findElements(By.xpath("//span[@aria-label='" + rdate + "']"));
		for (WebElement webElement : selectrDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		driver.findElement(By.xpath("//h4[@id='newcontactModalLabel']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Auditor Date'][2]")).click();
		List<WebElement> selectaDate = driver.findElements(By.xpath("//span[@aria-label='" + adate + "']"));
		for (WebElement webElement : selectaDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Update']")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getEditReconciledDateRecordStatus() throws InterruptedException {
		Thread.sleep(1000);

		return driver.findElement(By.xpath("//span[contains(text(),'ICICI0000356214')]")).getText();
	}
	
	public void deleteReconciledDateRecord() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tab-1\"]/div/div[2]/div[3]/div[2]/table/tbody/tr/td[5]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
////////////////////////////companies>>Dashboard>>Statistics>>Loan Payment////////////////////////////////////////
	
	public void clickAddButtonLoanPayment() {
		driver.findElement(By.xpath("//*[@id=\"tab-1\"]/div/div[2]/div[4]/div[1]/div[2]/a")).click();
	}
	

	public void clickCloseButtonLoanPaymentPopup() {
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[4]/button")).click();
	}
	
	public boolean closeLoanPaymentPopup() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//*[@id=\"tab-1\"]/div/div[2]/div[4]/div[1]/div[1]/h6")).isDisplayed();
	}
	
	public void clickAddButtonNewLoanPaymentPopup() {
		 driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[4]/input")).click();
	}
	
	public String getLoanNameErrorMsg() {
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Loan name can't be blank.\")]")).getText();
		return str;
	}
	
	
	public String getPaymentDateErrorMsg() {
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Payment date can't be blank.\")]")).getText();
		return str;
	}

	
	public String amountCanNotBeBlankErrorMsg() {
		return driver.findElement(By.xpath("//span[contains(text(),\"Amount can't be blank.\")]")).getText();
	}
	
	
	public void enterLoanInfo(String ln,String pdate, String an) throws InterruptedException  {
	try {
		WebElement lname = driver.findElement(By.xpath("//input[@id='loan_payment_loan_name']"));
		lname.sendKeys(ln);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Payment Date'][2]")).click();
		List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + pdate + "']"));
		for (WebElement webElement : selectDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		Thread.sleep(1000);
		WebElement aname = driver.findElement(By.xpath("//input[@id='restrict_amount']"));
		aname.sendKeys(an);
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[4]/input")).click();
		Thread.sleep(1000);
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	public boolean getLoanPaymentRecordStatus() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//span[contains(text(),'Ravi')]")).isDisplayed();
	}
		
	public void clickEditButtonLoanPayment() {
		driver.findElement(By.xpath("//*[@id=\"tab-1\"]/div/div[2]/div[4]/div[2]/table/tbody/tr/td[4]/a")).click();
	}
	
	public void editLoanInfo(String ln,String pdate, String an) throws InterruptedException  {
		try { 
		WebElement lname = driver.findElement(By.xpath("//input[@id='loan_payment_loan_name']"));
		lname.clear();
		lname.sendKeys(ln);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Payment Date'][2]")).click();
		List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + pdate + "']"));
		for (WebElement webElement : selectDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		Thread.sleep(1000);
		WebElement aname = driver.findElement(By.xpath("//input[@id='restrict_amount']"));
		aname.sendKeys(an);
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[4]/input")).click();
		Thread.sleep(1000);
		}
	
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	public boolean getEditLoanPaymentRecordStatus() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(By.xpath("//span[contains(text(),'Janvi')]")).isDisplayed();
	}
	
	public void deleteLoanPaymentRecord() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tab-1\"]/div/div[2]/div[4]/div[2]/table/tbody/tr/td[5]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	////////////////////////Comapnies>>Dashborad>>Daily Reconciled///////////////////////////////
	
	
	public void click_Daily_Reconciled_Tab() {
		driver.findElement(clickDailyReconciledTab).click();
	}
	
	public String getDailyReconciled() {
		String str = driver.findElement(By.xpath("//a[contains(text(),'Daily Reconciled')]")).getText();
		return str;
	}
	
	public void click_Add_Account_Button() {
		driver.findElement(clickAddAccountbutton).click();
		
	}
	
	public void click_Add_Button_Popup() {
		 driver.findElement(clickAddButtonPopup).click();
	}
	
	public String addAccountErrorMsg() {
		String str=  driver.findElement(addAccountErrorMsg).getText();
		return str;
	}
	
	public void enterAccountName(String accName) throws InterruptedException {
		WebElement accountName = driver.findElement(accoutname);
		accountName.sendKeys(accName);
		driver.findElement(clickAddButtonPopup).click();
		
		
		
	}
	
	public boolean getAccountStatusDr() throws InterruptedException  {

			return driver.findElement(By.xpath("//div[@class='edit-input']/input[@value='Automate DR']")).isDisplayed();
		
	}
	
	public void click_EditButton_Account( ) {
		driver.findElement(editButtonAccount).click();
	}
	
	public void update_Account (String accName) {
		
		WebElement accountName = driver.findElement(accoutname);
		accountName.clear();
		accountName.sendKeys(accName);
		driver.findElement(clickAddButtonPopup);
	}
	
	public boolean getupdateAccountStatus() {
		return driver.findElement(By.xpath("//input[@value='Auto DR']")).isDisplayed();
		
	}	
	
public void change_Account (String accName) throws InterruptedException {
	Thread.sleep(1000);
//	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
//    w.until(ExpectedConditions .visibilityOfElementLocated(editButtonAccount));
		driver.findElement(editButtonAccount).click();
		WebElement accountName = driver.findElement(accoutname);
		accountName.clear();
		accountName.sendKeys(accName);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}
	
	public void click_On_AddButton_For_Payment() throws InterruptedException {
		driver.findElement(addButtonNewPayment).click();
		Thread.sleep(1000);
		
	}
	
	public void enter_The_Fields_New_Payment(String newpayment,String date, String amt) throws InterruptedException {
		try { 
			WebElement np = driver.findElement(newPayment);
			np.sendKeys(newpayment);
			driver.findElement(By.xpath("//h4[@id='newcontactModalLabel']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Date'][2]")).click();
			List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
			for (WebElement webElement : selectDate) {
				if (webElement.isDisplayed()) {
				
					webElement.click();
				} 
			}
			driver.findElement(By.xpath("//input[@id='daily_reconciled_transaction_amount']")).sendKeys(amt);
			driver.findElement(By.xpath("//input[@value='Add']")).click();
			Thread.sleep(1000);
			}

		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	public String  getTransactionStatus() {
		return driver.findElement(By.xpath("//span[contains(text(),'(02/20/2024)')]")).getText();
	}
	
	public String  getUnclearedTransaction() {
		return driver.findElement(By.xpath("//div[1]/div[3]/div[2]/h1")).getText();
	}
	
	public boolean getAddPaymentPoupCloseStatus() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//h2[contains(text(),'Test Company')]")).isDisplayed();
	}

	public void clickOnEditButtonOfDailyReconciled() {
		driver.findElement(By.xpath("//*[@id=\"tab-2\"]/div/div/div[1]/div[4]/table/tbody/tr[1]/td[3]/a")).click();
		
	}
	
	public void enter_update_Fields_New_Payment(String newpayment,String date, String amt)  {
		
		try { 
			WebElement np = driver.findElement(newPayment);
			np.clear();
			np.sendKeys(newpayment);
			driver.findElement(By.xpath("//h4[@id='newcontactModalLabel']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Date'][2]")).click();
			List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
			for (WebElement webElement : selectDate) {
				if (webElement.isDisplayed()) {
				
					webElement.click();
				} 
			}
			driver.findElement(By.xpath("//input[@id='daily_reconciled_transaction_amount']")).sendKeys(amt);
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			Thread.sleep(1000);
			}

		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		}
	
	public String getUpdateTransactionStatus() throws InterruptedException {
		
		Thread.sleep(2000);
		return driver.findElement(By.xpath("//span[contains(text(),'(02/21/2024)')]")).getText();
	}
	
	public void deletePayment() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tab-2\"]/div/div/div/div[4]/table/tbody/tr/td[4]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	public void deleteAccount() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
//////////////////////////Companies>>Dashboard>>Transaction///////////////////
	
	public void clickTrasactionTab() {
		driver.findElement(By.xpath("//a[contains(text(),'Transaction')]")).click();
	}
	
	public String getTrsanction() {
		String str = driver.findElement(By.xpath("//a[contains(text(),'Transaction')]")).getText();
		return str;
	}
	
	public void clickAddButtonPaymentDeposited() {
		driver.findElement(By.xpath("//*[@id=\"tab-3\"]/div/div/div[1]/div[1]/div[2]/a")).click();
	}
	
	public boolean closeAddTransactionPopupPaymentDeposited()
	{
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[5]/button")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[contains(text(),'Payment Deposited but not Received')]")));

		return driver.findElement(By.xpath("//h6[contains(text(),'Payment Deposited but not Received')]")).isDisplayed();
	}
	
	public void clickAddButtonAddTransactionPaymentDeposited() {
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[5]/input")).click();
	}
	
	public String getVendorNameErrorMsg() {
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Customer name can't be blank.\")]")).getText();
		return str;
		
	}
	public String getDateErrorMsg() {
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Date can't be blank.\")]")).getText();
		return str;
		
	}
	
	public String getAmountCannotBeBlankErrorMsg() {
		return driver.findElement(By.xpath("//span[contains(text(),\"Amount can't be blank.\")]")).getText();
	}
	

	
	public void addTransactionPaymentDeposited(String vn, String ba, String date,String amt) throws InterruptedException {
		try {
		WebElement vendorName = driver.findElement(By.xpath("//input[@id='transaction_vendor_name']"));
		vendorName.sendKeys(vn);
		WebElement bankAccount = driver.findElement(By.xpath("//input[@id='transaction_invoice_id']"));
		bankAccount.sendKeys(ba);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Date'][2]")).click();
		List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
		for (WebElement webElement : selectDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		WebElement amount = driver.findElement(By.xpath("//input[@id='restrict_amount']"));
		amount.sendKeys(amt);
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[5]/input")).click();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	public String getTransactionPaymentDeposited()
	{
		return driver.findElement(By.xpath("//span[contains(text(),'Ravi(ICICI10000)')]")).getText();
	}
	
	public String getPaymentNotRecievedStatus()
	{
		return driver.findElement(By.xpath("//div[1]/div[4]/div[2]/h1")).getText();
	}
	
	public void clickEditButtonPaymentDeposited() {
		driver.findElement(By.xpath("//*[@id=\"tab-3\"]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[4]/a")).click();
	}
	

	public void editTransactionPaymentDeposited(String vn, String ba, String date, String amt) throws InterruptedException {
		try {
		WebElement vendorName = driver.findElement(By.xpath("//input[@id='transaction_vendor_name']"));
		vendorName.clear();
		vendorName.sendKeys(vn);
		WebElement bankAccount = driver.findElement(By.xpath("//input[@id='transaction_invoice_id']"));
		bankAccount.clear();
		bankAccount.sendKeys(ba);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Date'][2]")).click();
		List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
		for (WebElement webElement : selectDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		WebElement amount = driver.findElement(By.xpath("//input[@id='restrict_amount']"));
		amount.clear();
		amount.sendKeys(amt);
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[5]/input")).click();
		Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	public String getUpdatedTransactionPaymentDeposited() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Transaction')]")).click();
		return driver.findElement(By.xpath("//span[contains(text(),'Janvi(ICICI3000)')]")).getText();
	}
	
	public void deletePaymentDeposted() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tab-3\"]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[5]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	
	public void clickAddButtonPaymentRecieved() {
		driver.findElement(By.xpath("//*[@id=\"tab-3\"]/div/div/div[2]/div[1]/div[2]/a")).click();
	}
	
	public boolean closeAddTransactionPopupPaymentRecieved()
	{
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[5]/button")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[contains(text(),'Payment Received but not Deposited')]")));

		return driver.findElement(By.xpath("//h6[contains(text(),'Payment Received but not Deposited')]")).isDisplayed();
	}
	
	
	public void clickAddButtonAddTransactionPaymentRecieved() {
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[5]/input")).click();
	} 
	
	
	public String getVendorNameErrorMsgAddTransactionPaymentRecieved() {
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Customer name can't be blank.\")]")).getText();
		return str;
		
	}
	public String getDateErrorMsgAddTransactionPaymentRecieved() {
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Date can't be blank.\")]")).getText();
		return str;
		
	}
	
	public boolean getAmountCannotBeBlankErrorMsgPaymentRecieved() {
		return driver.findElement(By.xpath("//span[contains(text(),\"Amount can't be blank.\")]")).isDisplayed();
	}
	
	public boolean getAmountIsNotaNumberPaymentRecieved() {
		return driver.findElement(By.xpath("//span[contains(text(),'Amount is not a number.')]")).isDisplayed();
	}
	
	
	public void addTransactionPaymentRecieved(String vn, String ba,String date, String amt) throws InterruptedException {
		try {
		WebElement vendorName = driver.findElement(By.xpath("//input[@id='transaction_vendor_name']"));
		vendorName.sendKeys(vn);
		WebElement bankAccount = driver.findElement(By.xpath("//input[@id='transaction_invoice_id']"));
		bankAccount.sendKeys(ba);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Date'][2]")).click();
		List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
		for (WebElement webElement : selectDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		WebElement amount = driver.findElement(By.xpath("//input[@id='restrict_amount']"));
		amount.sendKeys(amt);
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[5]/input")).click();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	public String getTransactionPaymentRecived()
	{
		return driver.findElement(By.xpath("//span[contains(text(),'Ravi(ICICI10000)')]")).getText();
	}
	
	
	public String  getPaymentNotYetDeposited() {
		return driver.findElement(By.xpath("//div[1]/div[5]/div[2]/h1")).getText();
	}
	
	public void clickEditButtonPaymentRecived() {
		driver.findElement(By.xpath("//*[@id=\"tab-3\"]/div/div/div[2]/div[2]/table/tbody/tr[2]/td[4]/a")).click();
	}
	

	public void editTransactionPaymentRecived(String vn, String ba, String date, String amt) throws InterruptedException {
		try {
		WebElement vendorName = driver.findElement(By.xpath("//input[@id='transaction_vendor_name']"));
		vendorName.clear();
		vendorName.sendKeys(vn);
		WebElement bankAccount = driver.findElement(By.xpath("//input[@id='transaction_invoice_id']"));
		bankAccount.clear();
		bankAccount.sendKeys(ba);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Date'][2]")).click();
		List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
		for (WebElement webElement : selectDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		WebElement amount = driver.findElement(By.xpath("//input[@id='restrict_amount']"));
		amount.clear();
		amount.sendKeys(amt);
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[5]/input")).click();
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

	}
	
	public String getUpdatedTransactionPaymentRecived() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Transaction')]")).click();
		return driver.findElement(By.xpath("//span[contains(text(),'Janvi(ICICI3000)')]")).getText();
	}
	
	public void deletePaymentRecived() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tab-3\"]/div/div/div[2]/div[2]/table/tbody/tr[2]/td[5]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		}
	
	
	
	public void clickAddButtonUnknownTransactions() {
		driver.findElement(By.xpath("//*[@id=\"tab-3\"]/div/div/div[3]/div[1]/div[2]/a")).click();
	}
	
	public boolean closeAddTransactionPopupUnknownTransactions()
	{
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[5]/button")).click();
		return driver.findElement(By.xpath("//h6[contains(text(),'Unknown Transactions')]")).isDisplayed();
	}
	
	
	public void clickAddButtonAddTransactionUnknownTransactions() {
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[5]/input")).click();
	} 
	
	
	public String getVendorNameErrorMsgAddTransactionUnknownTransactions() {
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Customer name can't be blank.\")]")).getText();
		return str;
		
	}
	public String getDateErrorMsgAddTransactionUnknownTransactions() {
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Date can't be blank.\")]")).getText();
		return str;
		
	}
	
	public boolean getAmountCannotBeBlankErrorMsgUnknownTransactions() {
		return driver.findElement(By.xpath("//span[contains(text(),\"Amount can't be blank.\")]")).isDisplayed();
	}
	
	public boolean getAmountIsNotaNumberUnknownTransactions() {
		return driver.findElement(By.xpath("//span[contains(text(),'Amount is not a number.')]")).isDisplayed();
	}
	
	
	public void addTransactionUnknownTransactions(String vn, String ba,String date, String amt) throws InterruptedException {
		try {
		WebElement vendorName = driver.findElement(By.xpath("//input[@id='transaction_vendor_name']"));
		vendorName.sendKeys(vn);
		WebElement bankAccount = driver.findElement(By.xpath("//input[@id='transaction_invoice_id']"));
		bankAccount.sendKeys(ba);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Date'][2]")).click();
		List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
		for (WebElement webElement : selectDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		WebElement amount = driver.findElement(By.xpath("//input[@id='restrict_amount']"));
		amount.sendKeys(amt);
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[5]/input")).click();
		Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	
	public String getTransactionUnknownTransactions() throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//span[contains(text(),'Ravi(ICICI10000)')]")).getText();
	}
	
	public String getUnknownTransactions()
	{
		return driver.findElement(By.xpath("//div[1]/div[6]/div[2]/h1")).getText();
	}
	
	public void clickEditButtonUnknownTransactions() {
		driver.findElement(By.xpath("//*[@id=\"tab-3\"]/div/div/div[3]/div[2]/table/tbody/tr[2]/td[4]/a")).click();
	}
	

	public void editTransactionUnknownTransactions(String vn, String ba, String date,String amt) throws InterruptedException {
		try {
	
		WebElement vendorName = driver.findElement(By.xpath("//input[@id='transaction_vendor_name']"));
		vendorName.clear();
		vendorName.sendKeys(vn);
		WebElement bankAccount = driver.findElement(By.xpath("//input[@id='transaction_invoice_id']"));
		bankAccount.clear();
		bankAccount.sendKeys(ba);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Date'][2]")).click();
		List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
		for (WebElement webElement : selectDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		WebElement amount = driver.findElement(By.xpath("//input[@id='restrict_amount']"));
		amount.clear();
		amount.sendKeys(amt);
		driver.findElement(By.xpath("//*[@id=\"contact_modal_body\"]/form/div[5]/input")).click();
		Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	public String getUpdatedTransactionUnknownTransactions()
	{
		return driver.findElement(By.xpath("//span[contains(text(),'Janvi(ICICI3000)')]")).getText();
	}
	
	public void deleteUnknownTransactions() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tab-3\"]/div/div/div[3]/div[2]/table/tbody/tr[2]/td[5]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		}
	
//////////////////////////Companies>>Dashboard>>Bills.com vs QBO///////////////////
	public void clickBillsTab() {
		WebElement bills= driver.findElement(By.xpath("//a[contains(text(),'Bill.com VS QBO')]"));
		bills.click();
	}
	
	public String billsStatus() {
		String str = driver.findElement(By.xpath("//a[contains(text(),'Bill.com VS QBO')]")).getText();
		return str;
	}
	
	public void clickAddButtonBillsinBillscomthatarenotsyncinQBO() {
		driver.findElement(By.xpath("//*[@id=\"tab-4\"]/div/div[2]/div[1]/div[1]/div[2]/a")).click();
	}
	public String getVendorNameErrorMsgAddTransactionBillsinBillscomthatarenotsyncinQBO() {
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Vendor name can't be blank.\")]")).getText();
		return str;
		
	}
	public String getDateErrorMsgAddTransactionBillsinBillscomthatarenotsyncinQBO() {
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Date can't be blank.\")]")).getText();
		return str;
		
	}
	
	public void addTransactionBillsinBillscomthatarenotsyncinQBO(String vn, String ba,String date, String amt) throws InterruptedException {
		try {
		WebElement vendorName = driver.findElement(By.xpath("//input[@id='transaction_vendor_name']"));
		vendorName.sendKeys(vn);
		WebElement bankAccount = driver.findElement(By.xpath("//input[@id='transaction_invoice_id']"));
		bankAccount.sendKeys(ba);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Date'][2]")).click();
		List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
		for (WebElement webElement : selectDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		WebElement amount = driver.findElement(By.xpath("//input[@placeholder='Amount']"));
		amount.sendKeys(amt);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	
	public String getTransactionBillsinBillscomthatarenotsyncinQBO()
	{
		return driver.findElement(By.xpath("//span[contains(text(),'Ravi')]")).getText();
	}
	
	public void deleteBillsinBillscomthatarenotsyncinQBO() throws InterruptedException {
		driver.findElement(By.xpath("//div/div[2]/div[1]/div[2]/table/tbody/tr/td[5]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		}
	
	
	public void clickAddButtonBillsinBillscomthatarenotoutstandinginBillscom() {
		driver.findElement(By.xpath("//*[@id=\"tab-4\"]/div/div[2]/div[2]/div[1]/div[2]/a")).click();
	}
	public String getVendorNameErrorMsgAddTransactionBillsinBillscomthatarenotoutstandinginBillscom() {
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Vendor name can't be blank.\")]")).getText();
		return str;
		
	}
	
	public String getDateErrorMsgAddTransactionBillsinBillscomthatarenotoutstandinginBillscom() {
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		String str = driver.findElement(By.xpath("//span[contains(text(),\"Date can't be blank.\")]")).getText();
		return str;
		
	}
	
	
	public void addTransactionBillsinBillscomthatarenotoutstandinginBillscom(String vn, String ba,String date, String amt) throws InterruptedException {
		try {
		WebElement vendorName = driver.findElement(By.xpath("//input[@id='transaction_vendor_name']"));
		vendorName.sendKeys(vn);
		WebElement bankAccount = driver.findElement(By.xpath("//input[@id='transaction_invoice_id']"));
		bankAccount.sendKeys(ba);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Date'][2]")).click();
		List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
		for (WebElement webElement : selectDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		WebElement amount = driver.findElement(By.xpath("//input[@placeholder='Amount']"));
		amount.sendKeys(amt);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	
	public String getTransactionBillsinBillscomthatarenotoutstandinginBillscom() throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//span[contains(text(),'Ravi')]")).getText();
	}
	
	public void deleteBillsinBillscomthatarenotoutstandinginBillscom() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tab-4\"]/div/div[2]/div[2]/div[2]/table/tbody/tr/td[5]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		}
	
	public void enterAmountCalculateBillsWidget(String amt) throws InterruptedException {
		WebElement bills = driver.findElement(By.xpath("//input[@name='bills_sum']"));
		for (int i = 0; i < 4; i++) {
		bills.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		}
		

		bills.sendKeys(amt);
		driver.findElement(By.xpath("//*[@id=\"tab-4\"]/div/div[1]")).click();
		Thread.sleep(1000);
	}
	
	public void enterAmountCalculateQBOWidget(String amt) throws InterruptedException {
		Thread.sleep(1000);
		WebElement QBO = driver.findElement(By.xpath("//input[@name='qbo_sums']"));
		for (int i = 0; i < 4; i++) {
			QBO.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(1000);
			}
			
		QBO.sendKeys(amt);
		driver.findElement(By.xpath("//*[@id=\"tab-4\"]/div/div[1]")).click();
		Thread.sleep(1000);
	}
	
	
	public String diffbetweenBillsAndQBO() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//span[contains(text(),'$ 100.00')]")).getText();
	}
	
	//////////////////////////Companies>>Dashboard>>Royalty Difference///////////////////
	
	public void clickRoyaltyDiffTab() {
		WebElement royaltydiff= driver.findElement(royaltyDiffTab);
		royaltydiff.click();
	}
	
	public String royaltyDifferenceStatus() {
		String str = driver.findElement(By.xpath("//a[contains(text(),'Royalty Difference')]")).getText();
		return str;
	}
	public void clickonaddFranchisebutton() {
    WebElement clickaddfranchise = driver.findElement(clickAddFranchiseBtn);
    clickaddfranchise.click();
	}
	
	public boolean getAddFranchisePopupStatus() {
		return driver.findElement(By.xpath("//h4[@id='newcontactModalLabel']")).isDisplayed() ; 
	}
	
	public void clickAddBtnRoyaltyAndDifferennce() {
		driver.findElement(AddbuttonRAndD).click();
	}
	
	public String getErrorMsgFranchiseName() {
		String str = driver.findElement(errorFranchiseName).getText();
		return str;	
	}
	
	public void addFranciseFields(String franchice, String svpronet, String QBO) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[1]/a")).click();
		WebElement royaltyDiffFranchise= driver.findElement(franchise);
		
		royaltyDiffFranchise.sendKeys(franchice);
		WebElement sevproenet = driver.findElement(sevpronet);
		sevproenet.sendKeys(svpronet);
		WebElement RoyaltyDiffqbo = driver.findElement(qbo);
		RoyaltyDiffqbo.sendKeys(QBO);
		
		
		driver.findElement(By.xpath("//*[@id=\"submit_button\"]/input")).click();
		
		
	}
	
	public boolean getaddFranchiseStatus() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(royaltyDifferenceExpand).click();
		return driver.findElement(By.xpath("//span[contains(text(),'2586')]")).isDisplayed();
	}
	
	
	public void editFranciseFields(String franchice, String svpronet, String QBO) throws InterruptedException {
		driver.findElement(royaltyDifferenceExpand).click();
		driver.findElement(By.xpath("//*[@id=\"monthsTable\"]/div[2]/div/div/div/div[3]/a")).sendKeys(Keys.RETURN);
		WebElement royaltyDiffFranchise= driver.findElement(franchise);
		royaltyDiffFranchise.clear();
		royaltyDiffFranchise.sendKeys(franchice);
		WebElement sevproenet = driver.findElement(sevpronet);
		sevproenet.clear();
		sevproenet.sendKeys(svpronet);
		WebElement RoyaltyDiffqbo = driver.findElement(qbo);
		RoyaltyDiffqbo.clear();
		RoyaltyDiffqbo.sendKeys(QBO);
	
		
		driver.findElement(AddbuttonRAndD).click();
		
		
	}
	
	public boolean getFranchiseStatus() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(royaltyDifferenceExpand).click();
		return driver.findElement(By.xpath("//span[contains(text(),'1234')]")).isDisplayed();
	}
	

	
	public void selectYear() {
		WebElement selectyrs = driver.findElement(selectYear);
		Select year = new Select(selectyrs);
		year.selectByIndex(11);
		driver.findElement(By.xpath("//input[@value='search']")).click();

	}
	
	public boolean getFranchiseStatusAfterSearch() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(royaltyDifferenceExpand).click();
		return driver.findElement(By.xpath("//span[contains(text(),'1234')]")).isDisplayed();
	}
	
	
	
	public void clickcloseBtnRoyaltyDiff() {
		driver.findElement(closeBtnOfRoyaltyDiff).click();
	}
	
	public String getRoyaltyDiffPopupCloseStatus() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(text(),'Test Company')]")));

		return driver.findElement(By.xpath("//h2[contains(text(),'Test Company')]")).getText();
	}
	
	
		
		
		////////////////////////////////////////////////Details Tab//////////////////////////////////////////////////////////////////////
		public void click_Detils_Tab()
		{
			driver.findElement(clickDetailsTab).click();
		}
		
		public String getDetailsPageStatus() {
			String str = driver.findElement(By.xpath("//*[@id=\"tabs-nav\"]/li[2]/a")).getText();
			return str;
		}
		
		public void click_EditButton() {
			driver.findElement(clickOnEditButton).click();
		}
		
		public void update_CompanyDetails(String ws) {
			WebElement website = driver.findElement(updateWebsite);
			website.clear();
			website.sendKeys(ws);
			
			driver.findElement(By.xpath("//input[@value='Update']")).click();
		}
		
		public String getupdateWebsiteStatus() {
			return driver.findElement(By.xpath("//span[contains(text(),'www.yahoo.com')]")).getText();
		}	
		
		public void changeCompanyDetails(String ws)  {
			driver.navigate().refresh();
			driver.findElement(clickOnEditButton).sendKeys(Keys.RETURN);
			WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
	        w.until(ExpectedConditions .visibilityOfElementLocated(updateWebsite));			
	        WebElement website = driver.findElement(updateWebsite);
			website.clear();
			website.sendKeys(ws);
			
			driver.findElement(By.xpath("//input[@value='Update']")).click();
		}
		
		public void clickCloseBtn() {
			driver.findElement(By.xpath("//button[@class='secondary-btn']")).click();
		}
		
		public void clickAddButtonLinkSection() {
			driver.findElement(addButtonLinkSection).click();
		}
		
		public void Add_Links(String lt, String wt) {
			WebElement link = driver.findElement(linkText);
			link.sendKeys(lt);
			
			WebElement website = driver.findElement(websiteText);
			website.sendKeys(wt);
			
			driver.findElement(By.xpath("//button[@name='button']")).click();
		}
		
		public String getlinkStatus() {
			return driver.findElement(By.xpath("//a[contains(text(),'www.google.com')]")).getText();
		}
		
		public void clickonAddButtonLinkPopup() {
			driver.findElement(By.xpath("//button[@name='button']")).click();
		}
		
		public boolean getErrorMsgForLink() {
			return driver.findElement(By.xpath("//span[contains(text(),\"Name can't be blank.\")]")).isDisplayed();
		}
		
		public boolean getErrorMsgForwebsite() {
			return driver.findElement(By.xpath("//span[contains(text(),\"Website can't be blank.\")]")).isDisplayed();
		}
		
		public void click_CloseBtn_Linkpopup()
		{
			driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		}
		
		public void click_EditBtn_Linksection() {
			driver.findElement(By.xpath("//*[@id=\"tab2\"]/div[5]/div/table/tbody/tr/td[3]/a[1]")).click();
		}
		
		public void update_link(String wt, String lt) {
			WebElement link = driver.findElement(linkText);
			link.clear();
			link.sendKeys(lt);
			WebElement website = driver.findElement(updateWebsiteLink);
			website.clear();
			website.sendKeys(wt);
			
			driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
		}
		
		public String  getUpdateLinkStatus() throws InterruptedException {
			Thread.sleep(1000);
			driver.navigate().refresh();
			return driver.findElement(By.xpath("//a[contains(text(),'www.yahoo.com')]")).getText();
		}
		
		
		public void clickOnDeleteBtnLink() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"tab2\"]/div[5]/div/table/tbody/tr/td[3]/a[2]")).click();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
		}
		
		
		public void clickonAddBtnCompanyDetailSection() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(50000,0)");
			driver.findElement(By.xpath("//*[@id=\"company_details_sec\"]/div[2]/a")).sendKeys(Keys.RETURN);
		}
		
		public void addContactDetails(String c, String r) throws InterruptedException {
			WebElement selectcontact = driver.findElement(By.xpath("//select[@id='company_detail_contact_id']"));
			Select contact = new Select(selectcontact);
			Thread.sleep(1000);
			contact.selectByVisibleText(c);
			WebElement selectReport = driver.findElement(By.xpath("//select[@id='company_detail_report_type']"));
			Select report = new Select(selectReport);
			report.selectByVisibleText(r);
			
			driver.findElement(By.xpath("//input[@id='add_contact']")).click();
		}
		
		public String  getContactStatusSnapshot() throws InterruptedException {
			driver.navigate().refresh();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'Automate Report')] ")).sendKeys(Keys.RETURN);
			return driver.findElement(By.xpath("//a[contains(.,'Test Contact')]")).getText();
		}
	

		
		public void closebtnContactDetailPopup() {
			driver.findElement(By.xpath("//button[contains(text(),'Close')]")).sendKeys(Keys.RETURN);		}
		
		
		public void clickOnEditBtnCompanyDetailSection() throws InterruptedException {
			driver.findElement(By.xpath("//a[contains(text(),'Automate Report')]")).sendKeys(Keys.RETURN);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]")).sendKeys(Keys.RETURN);
			Thread.sleep(1000);
		}
		
	public void update_companyDetail(String email) {
	
		driver.findElement(By.xpath("//input[@id='contact_email']")).clear();
			driver.findElement(By.xpath("//input[@id='contact_email']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@value='Update']")).click();
		}
	
	public boolean getcompanyDetailStatus() throws InterruptedException {
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[contains(text(),'Snapshot')]")).click();
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//td[contains(text(),'Automate@yahoo.com')]")).isDisplayed();
	}
	
	
	public void clickOnDeleteBtnCompanyDetail() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Automate Report')]")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr/td[4]/a[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	
	public void clickonAddBtnCompaniesContactSection() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		driver.findElement(By.xpath("//*[@id=\"companies_contacts_sec\"]/div/a")).sendKeys(Keys.RETURN);
	}

	public void enterContactInfoForCompaniesContactSection(String fn, String ln, String t,String mail, String pn, String c) {
		WebElement fname = driver.findElement(By.xpath("//input[@id='contact_first_name']"));
		fname.sendKeys(fn);
		WebElement lname = driver.findElement(By.xpath("//input[@id='contact_last_name']"));
		lname.sendKeys(ln);
		WebElement titleE = driver.findElement(By.xpath("//select[@id='contact_title_id']"));
		Select title = new Select(titleE);
		title.selectByVisibleText(t);
		WebElement eMail = driver.findElement(By.xpath("//input[@id='contact_email']"));
		eMail.sendKeys(mail);
		WebElement pNumber = driver.findElement(By.xpath("//input[@id='phone_number_contact']"));
		pNumber.sendKeys(pn);
		
		WebElement selectCompany = driver.findElement(By.xpath("//select[@id='contact_company_ids']"));
		Select company = new Select(selectCompany);
		company.selectByVisibleText(c);
		driver.findElement(By.xpath("//*[@id=\"submit_button\"]/input")).click();

	}
	
	public String  getCompanyContactStatus() {
		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		return driver.findElement(By.xpath("//a[contains(text(),'Test Contact')]")).getText();
	}
	
	
	
	
	public void clickonEditBtnCompaniesContactSection() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		driver.findElement(By.xpath("//*[@id=\"tab2\"]/div[10]/div/table/tbody/tr/td[6]/a[1]")).sendKeys(Keys.RETURN);
	}

	public void updateContactInfoForCompaniesContactSection(String fn, String ln, String mail, String pn, String company) {
		WebElement fname = driver.findElement(By.xpath("//input[@id='contact_first_name']"));
		fname.clear();
		fname.sendKeys(fn);
		WebElement lname = driver.findElement(By.xpath("//input[@id='contact_last_name']"));
		lname.clear();
		lname.sendKeys(ln);
		WebElement titleE = driver.findElement(By.xpath("//select[@id='contact_title_id']"));
		Select t = new Select(titleE);
		t.selectByIndex(1);
		WebElement eMail = driver.findElement(By.xpath("//input[@id='contact_email']"));
		eMail.clear();
		eMail.sendKeys(mail);
		WebElement pNumber = driver.findElement(By.xpath("//input[@id='phone_number_contact']"));
		pNumber.clear();
		pNumber.sendKeys(pn);
		
		WebElement selectCompany = driver.findElement(By.xpath("//select[@id='contact_company_ids']"));
		Select c = new Select(selectCompany);
		c.selectByVisibleText(company);

		driver.findElement(By.xpath("//*[@id=\"submit_button\"]/input")).click();

	}
	
	public String getupdateCompanyContactStatus() {
		return driver.findElement(By.xpath("//a[contains(text(),'Test Contact')]")).getText();
	}
	
	
	public void deleteCompanyContact() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tab2\"]/div[10]/div/table/tbody/tr/td[6]/a[2]")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	public void clickonAddBtnStaffSection() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");

		driver.findElement(By.xpath("//*[@id=\"staff_member_sec\"]/div/a")).sendKeys(Keys.RETURN);
		
		
	}
	
	
	public void addStaffDetails(String staff) throws InterruptedException {
		
		WebElement selectcontact = driver.findElement(By.xpath("//select[@id='staff_member_user_ids']"));
		Select contact = new Select(selectcontact);
		Thread.sleep(2000);
		contact.selectByVisibleText(staff);
		driver.findElement(By.xpath("//input[@value=\"Add\"]")).click();
	 
	}
	
	public String getStaffMemberStatus() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		return driver.findElement(By.xpath("//a[contains(text(),'Automate Test Admin')]")).getText();
		
	}
	
	public void clickEditBtnStaffMemeber() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		driver.findElement(By.xpath("//*[@id=\"tab2\"]/div[12]/div/table/tbody/tr/td[2]/a[1]")).sendKeys(Keys.RETURN);
	}
	
public void editStaffDetails(String t) throws InterruptedException  {
		try {
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys(t);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		driver.navigate().refresh();
		Thread.sleep(10000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		driver.navigate().refresh();
	 
	}

		public String getUpdatedStaffMemberStatus() {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 50000)");
			return driver.findElement(By.xpath("//a[contains(text(),'Automate Test Admin')]")).getText();
			}
	
		
		public void deleteStaffDetails() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 50000)");
			driver.findElement(By.xpath("//*[@id=\"tab2\"]/div[12]/div/table/tbody/tr/td[2]/a[2]")).sendKeys(Keys.RETURN);
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
		}

		
		public void clickonAddBtnNotesSection() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 50000)");

			driver.findElement(By.xpath("//*[@id=\"company_notes_sec\"]/div/a")).sendKeys(Keys.RETURN);
			
			
		}
		
		
		public void addNotesDetails(String sub, String n) throws InterruptedException {
			
			WebElement selectSubject = driver.findElement(By.xpath("//select[@id='company_note_subject']"));
			Thread.sleep(1000);
			Select s = new Select(selectSubject);
			Thread.sleep(1000);
			s.selectByVisibleText(sub);
			driver.findElement(By.xpath("//input[@id='company_note_notes']")).sendKeys(n);
			driver.findElement(By.xpath("//input[@value=\"Add\"]")).click();
		 
		}
		
		public String getnotesStatus() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 50000)");
			return driver.findElement(By.xpath("//td[contains(text(),'Automate Notes')]")).getText();
			}

		public void clickonEditBtnNotesSection() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 50000)");

			driver.findElement(By.xpath("//*[@id=\"myTable1\"]/tbody/tr/td[3]/a[1]")).sendKeys(Keys.RETURN);
			
			
		}
		
	public void editNotesDetails(String n) throws InterruptedException {
			
			WebElement selectSubject = driver.findElement(By.xpath("//select[@id='company_note_subject']"));
			Select s = new Select(selectSubject);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			s.selectByValue("DEXT");			
			driver.findElement(By.xpath("//input[@id='company_note_notes']")).clear();
			driver.findElement(By.xpath("//input[@id='company_note_notes']")).sendKeys(n);
			driver.findElement(By.xpath("//input[@value=\"Update\"]")).click();
		 
		}
	
	public String getUpdatednotesStatus() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		return driver.findElement(By.xpath("//td[contains(text(),'AutomateNotes')]")).getText();
		}
	
	public void deleteNotes() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		driver.findElement(By.xpath("//*[@id=\"myTable1\"]/tbody/tr/td[3]/a[2]")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	
//////////////////////////LOGINS PAGE////////////////////////////////////////////
	
public void click_LoginTab() throws InterruptedException {
driver.findElement(By.xpath("//*[@id=\"tabs-nav\"]/li[3]/a")).click();
Thread.sleep(1000);
}

public String getLoginsTabUrl()
{
String str = driver.findElement(By.xpath("//*[@id=\"tabs-nav\"]/li[3]/a")).getText();
	return str;	
}

public void click_AddLogins_Button() {
driver.findElement(By.xpath("//a[contains(.,'Add Logins')]")).click();
}

public void click_AddButton_loginpopup() {
driver.findElement(By.xpath("//*[@id=\"company_login_modal_body\"]/form/div[2]/input")).click();
}

public String getWebsiteErrorMsg()
{
String str = driver.findElement(By.xpath("//span[contains(text(),\"Website can't be blank.\")]")).getText();
return str;	
}

public String getNameErrorMsg()
{
String str = driver.findElement(By.xpath("//span[contains(text(),\"Name can't be blank.\")]")).getText();
return str;	
}


public String getNotesErrorMsg()
{
String str = driver.findElement(By.xpath("//span[contains(text(),\"Notes can't be blank.\")]")).getText();
return str;	
}

public void addLoginsDetails(String cln, String ws, String cu, String p, String n, String an, String sq, String answer) throws InterruptedException {
	
	WebElement label = driver.findElement(By.xpath("//select[@id='company_login_label']"));
	Select l = new Select(label);
	l.selectByIndex(0);
	WebElement name = driver.findElement(By.xpath("//input[@id='company_login_name']"));
	name.sendKeys(cln);
	WebElement lw = driver.findElement(By.xpath("//input[@id='company_login_website']"));
	lw.sendKeys(ws);
	
	WebElement userid= driver.findElement(By.xpath("//input[@id='company_login_user']"));
	userid.sendKeys("mahesh");
//	Select companyuserid = new Select(userid);
//	companyuserid.selectByIndex(1);
	WebElement cc= driver.findElement(By.xpath("//input[@id='company_login_company_code']"));
	cc.sendKeys(cu);
	WebElement pass = driver.findElement(By.xpath("//input[@id='company_login_password']"));
	pass.sendKeys(p);
	driver.findElement(By.xpath("//textarea[@id='company_login_notes']")).sendKeys(n);
	driver.findElement(By.xpath("//input[@id='company_login_account_number']")).sendKeys(an);
	driver.findElement(By.xpath("//a[@id='add_statement']")).click();	
	driver.findElement(By.xpath("//*[@id=\"company_login_modal_body\"]/form/div[1]/a")).click();
	driver.findElement(By.xpath("//div[@class=\"nested-form-wrapper\"]//input[@title=\"Security Questions\"]")).sendKeys(sq);
	driver.findElement(By.xpath("//div[@class=\"nested-form-wrapper\"]//input[@title=\"Security Answer\"]")).sendKeys(answer);
	WebElement addbtn= driver.findElement(By.xpath("//*[@id=\"company_login_modal_body\"]/form/div[2]/input"));
	addbtn.click();
	Thread.sleep(1000);

}
public String getNameStatus() throws InterruptedException {
	
return driver.findElement(By.xpath("//span[contains(.,'Admin@ontrack.com')]")).getText();

	}
	public void clickEditBtnloginsListPage() {
		driver.findElement(By.xpath("//*[@id=\"tab3\"]/div/div[1]/div[2]/a[2]")).click();
	}
	public void updateLoginsDetails(String cln,String ws, String cu, String n, String an, String sq, String answer) {
		
		WebElement name = driver.findElement(By.xpath("//input[@id='company_login_name']"));
		name.clear();
		name.sendKeys(cln);
		WebElement lw = driver.findElement(By.xpath("//input[@id='company_login_website']"));
		lw.clear();
		lw.sendKeys(ws);
		
		WebElement cc= driver.findElement(By.xpath("//input[@id='company_login_company_code']"));
		cc.clear();
		cc.sendKeys(cu);
		driver.findElement(By.xpath("//textarea[@id='company_login_notes']")).clear();
		driver.findElement(By.xpath("//textarea[@id='company_login_notes']")).sendKeys(n);
		driver.findElement(By.xpath("//input[@id='company_login_account_number']")).clear();
		driver.findElement(By.xpath("//input[@id='company_login_account_number']")).sendKeys(an);
		driver.findElement(By.xpath("//div[@class=\"nested-form-wrapper\"]//input[@title=\"Security Questions\"]")).clear();
		driver.findElement(By.xpath("//div[@class=\"nested-form-wrapper\"]//input[@title=\"Security Questions\"]")).sendKeys(sq);
		driver.findElement(By.xpath("//div[@class=\"nested-form-wrapper\"]//input[@title=\"Security Answer\"]")).clear();
		driver.findElement(By.xpath("//div[@class=\"nested-form-wrapper\"]//input[@title=\"Security Answer\"]")).sendKeys(answer);
		WebElement updatebtn= driver.findElement(By.xpath("//input[@name='commit']"));
		updatebtn.click();

	}
	
	public String  getUpdateLoginsStatus() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//span[contains(.,'Admin Automate')]")).getText();
	}
	
public void deleteSecurityQuesiAddLoginsPopup() {
		
		driver.findElement(By.xpath("//div[@class=\"nested-form-wrapper\"]//a[@class=\"remove-link\"]")).click();
		WebElement updatebtn= driver.findElement(By.xpath("//input[@name='commit']"));
		updatebtn.click();

	}
	
	
	public void deleteLogins() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class=\"delete-login-btn\"]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	
	////////////////////////////TASKS PAGE///////////////////////////////////////////
	public void tasksPage() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tabs-nav\"]/li[4]/a")).click();
		Thread.sleep(1000);
	}
	
	public String getTasksTab()
	{
	String str = driver.findElement(By.xpath("//*[@id=\"tabs-nav\"]/li[4]/a")).getText();
	return str;	
	}
	
	public void click_AddTask_Button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tab4\"]/div[1]/a")).click();
	}
	
	public void click_AddButton_Taskpopup( ) {
		driver.findElement(By.xpath("//*[@id=\"company_task_modal_body\"]/form/div[2]/input")).click();
	}

	public String getTaskNameErrorMsg()
	{
	String str = driver.findElement(By.xpath("//span[contains(text(),\"Task name can't be blank.\")]")).getText();
	return str;	
	}
	
	public String getAssignedToErrorMsg()
	{
	String str = driver.findElement(By.xpath("//span[contains(text(),\"Assigned to can't be blank\")]")).getText();
	return str;	
	}
	
	public String getClientErrorMsg()
	{
	String str = driver.findElement(By.xpath("//span[contains(text(),\"Client must exist\")]")).getText();
	return str;	
	}
	
	public String getStartDateErrorMsg()
	{
	String str = driver.findElement(By.xpath("//span[contains(text(),\"Start date can't be blank.\")]")).getText();
	return str;	
	}
	
	public void tasksSidebarMenu() {
		driver.findElement(clickTasks).click();
	}
	
	public void clickTasksTemplateTab() {
		driver.findElement(taskTemplateTab).click();
	}
	public void clickCreateTemplateBtn() {
		driver.findElement(createTemplateBtn).click();
	}
	
	public void enterNameInCreateTemplatePopup(String str) {
		driver.findElement(nameFieldOfTaskTemplatePopUp).sendKeys(str);
	}
	public void clickAddBtnOfCreateTemplatePopup() {
		driver.findElement(addBtnOfCreateTemplatePopup).click();
		
	}
	public void createTask(String task, String name,  String assign, String company, String repitation, String date) throws InterruptedException {
		try {
	
	
		WebElement taskTemplate = driver.findElement(By.xpath("//select[@id='task_task_template_id']"));
		Thread.sleep(2000);
		Select tt = new Select(taskTemplate);
		tt.selectByVisibleText(task);
		driver.findElement(By.xpath("//input[@id='task_task_name']")).sendKeys(name);
		Select assignee = new Select(driver.findElement(By.xpath("//select[@id='assigned-to-select']")));
		assignee.selectByVisibleText(assign);
		Select client = new Select(driver.findElement(By.xpath("//select[@id='client-to-select']")));
		client.selectByVisibleText(company);
		driver.findElement(By.xpath("//h5[@id='newCompanyTaskModalLabel']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Start Date'][2]")).click();
		List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
		for (WebElement webElement : selectDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		
		Select taskrepeat= new Select(driver.findElement(By.xpath("//select[@id='repeat_task']")));
		taskrepeat.selectByIndex(1);
		driver.findElement(By.xpath("//div[@class='form-control daily-weekly-repeat']")).click();
		driver.findElement(By.xpath("//input[@value='Monday']")).click();
		driver.findElement(By.xpath("//div[@class='form-control daily-weekly-repeat']")).click();
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	public String viewTask() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Open')]")).click();
		return driver.findElement(By.xpath("//a[contains(text(),'Feb 26 | Task12')]")).getText();
	}
	
	public void clickOnTask() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Task12')]")).click();
		
	}
	
	public String taskPage() {
		return driver.getCurrentUrl();
	}
	
	public void addNotesInTaskTab(String assign, String sub, String notes) throws InterruptedException {
		driver.navigate().refresh();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[3]/div/a[2]")).click();
		Select assignee = new Select(driver.findElement(By.xpath("//*[@id=\"note_assigned_to\"]")));
		Thread.sleep(1000);
		assignee.selectByVisibleText(assign);
		WebElement subNotes = driver.findElement(By.xpath("//input[@id='note_subject']"));
		subNotes.sendKeys(sub);
		driver.findElement(By.xpath("//trix-editor[@id='note_detail']")).sendKeys(notes);
		driver.findElement(By.xpath("//*[@id=\"add-contact\"]/div/div/div[4]/input[2]")).click();
		
	}
	
	public boolean getNotesStatusTask() {
		return driver.findElement(By.xpath("//h4[contains(text(),'Today')]")).isDisplayed();
	}
	
	public void addcoachingsInTaskTab(String assign, String sub, String notes) throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[3]/div/a[2]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Coaching')]")).click();
		Select assignee = new Select(driver.findElement(By.xpath("//*[@id=\"note_assigned_to\"]")));
		Thread.sleep(1000);
		assignee.selectByVisibleText(assign);
		WebElement subNotes = driver.findElement(By.xpath("//input[@id='note_subject']"));
		subNotes.sendKeys(sub);
		driver.findElement(By.xpath("//trix-editor[@id='note_detail']")).sendKeys(notes);
		driver.findElement(By.xpath("//*[@id=\"add-contact\"]/div/div/div[4]/input[2]")).click();
		
	}
	
	public boolean getCoachingsStatusTask() {
		return driver.findElement(By.xpath("//h4[contains(text(),'Today')]")).isDisplayed();
	} 
	
	
	public void addSetionTask(String section) {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[3]/div/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='section_detail']")).sendKeys(section);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
	}
	
	public boolean getSectonsStatus() {
		return driver.findElement(By.xpath("//h3[contains(.,'TASK01')]")).isDisplayed();
	}
	
	public void createSubTask(String task) {
		driver.findElement(By.xpath("//*[@class=\"accordion-head active\"]/div/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='sub_task_name']")).sendKeys(task);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		}
	
	public String getSubtaskStatus() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/ul/li/div[1]/div/a[2]]")).click();
		return driver.findElement(By.xpath("//label[contains(.,'Task01-01')]")).getText();
		
	}
	
	public void completeTask() throws InterruptedException {
		
		driver.findElement(By.xpath("//label[contains(text(),'Task01-01')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[3]/ul/li/div[2]/div/div/input")).click();
		driver.findElement(By.xpath("//trix-editor[@id ='sub_task_detail']")).sendKeys("Automate Message");
		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@id='tabs-nav']//a[contains(.,'Tasks')]")).click();
		
	}
	public String getCompletedTaskStatus() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@id='tabs-nav']//a[contains(.,'Tasks')]")).click();
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Completed')]")).click();
		return driver.findElement(By.xpath("//a[contains(text(),'Feb 26 | Task12')]")).getText();
	}
	
	public void editBtnTaskComplete() {
		driver.findElement(By.xpath("//a[contains(text(),'Completed')]")).click();
		driver.findElement(By.xpath("//tbody/tr/td[7]/a[1]")).click();
	}
	
	public void updateTaskComplete(String name, String assign, String date) {
		try {
			
			
			
			driver.findElement(By.xpath("//input[@id='task_task_name']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='task_task_name']")).sendKeys(name);
			Select assignee = new Select(driver.findElement(By.xpath("//select[@id='assigned-to-select']")));
			assignee.selectByVisibleText(assign);
			
			driver.findElement(By.xpath("//h5[@id='newCompanyTaskModalLabel']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Start Date'][2]")).click();
			List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
			for (WebElement webElement : selectDate) {
				if (webElement.isDisplayed()) {
				
					webElement.click();
				} 
			}
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
	}
	
	public String getUpdateCompletedTaskStatus() {
	
		return driver.findElement(By.xpath("//td[contains(text(),'Staff for QACheck')]")).getText();
	}
	
	public void  deleteCompleteTask() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Completed')]")).click();
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr/td[7]/a[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	
	public String getOpenTaskWidget() {
		return driver.findElement(By.xpath("//div[1]/div[1]/div[2]/h1")).getText();
	}
	
	public void updateTask(String name, String assign,String date) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr/td[6]/a[1]")).click();
			
try {
			
			
			
			driver.findElement(By.xpath("//input[@id='task_task_name']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='task_task_name']")).sendKeys(name);
			Select assignee = new Select(driver.findElement(By.xpath("//select[@id='assigned-to-select']")));
			assignee.selectByVisibleText(assign);
			
			driver.findElement(By.xpath("//h5[@id='newCompanyTaskModalLabel']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Start Date'][2]")).click();
			List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
			for (WebElement webElement : selectDate) {
				if (webElement.isDisplayed()) {
				
					webElement.click();
				} 
			}
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
	}
	
	
	
	public boolean editTask() {
		return driver.findElement(By.xpath("//td[contains(text(),'Staff for QACheck')]")).isDisplayed();
	}
	
	
	public void  deleteTask() throws InterruptedException {
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
	}
	
	public void clickCreatedTemplateLink() {
		WebElement newTemplateNameCreated = driver.findElement(By.xpath("//a[text()='Qa automation template']"));
		newTemplateNameCreated.click();
		
	}
	public void clickOnDeleteBtnOfTemplate() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Qa automation template')]")).click();
		WebElement deleteBtnTemplate = driver.findElement(By.xpath("//a[@class='delete-btn']"));

		deleteBtnTemplate.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
	}
	
	public void createRecurringTask(String task, String name,  String assign, String company, String repitation, String date) throws InterruptedException {
		try {
	
	
		WebElement taskTemplate = driver.findElement(By.xpath("//select[@id='task_task_template_id']"));
		Thread.sleep(1000);
		Select tt = new Select(taskTemplate);
		tt.selectByVisibleText(task);
		driver.findElement(By.xpath("//input[@id='task_task_name']")).sendKeys(name);
		Select assignee = new Select(driver.findElement(By.xpath("//select[@id='assigned-to-select']")));
		assignee.selectByVisibleText(assign);
		Select client = new Select(driver.findElement(By.xpath("//select[@id='client-to-select']")));
		client.selectByVisibleText(company);
		driver.findElement(By.xpath("//h5[@id='newCompanyTaskModalLabel']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Start Date'][2]")).click();
		List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
		for (WebElement webElement : selectDate) {
			if (webElement.isDisplayed()) {
			
				webElement.click();
			} 
		}
		
		Select taskrepeat= new Select(driver.findElement(By.xpath("//select[@id='repeat_task']")));
		taskrepeat.selectByIndex(1);
		driver.findElement(By.xpath("//div[@class='form-control daily-weekly-repeat']")).click();
		driver.findElement(By.xpath("//input[@value='Monday']")).click();
		driver.findElement(By.xpath("//div[@class='form-control daily-weekly-repeat']")).click();
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	public void clickAddBtnTaskRecurringTab() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Recurring')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tab4\"]/div[1]/a")).click();
	}
	
	public String getRecurringTAskStatus() {
		return driver.findElement(By.xpath("//a[contains(text(),'Task12')]")).getText();
	}
	
	
	public void editRecurringTask(String name, String assign,String date) throws InterruptedException {
try {
			
			
			
			driver.findElement(By.xpath("//input[@id='task_task_name']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='task_task_name']")).sendKeys(name);
			Select assignee = new Select(driver.findElement(By.xpath("//select[@id='assigned-to-select']")));
			assignee.selectByVisibleText(assign);
			
			driver.findElement(By.xpath("//h5[@id='newCompanyTaskModalLabel']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Start Date'][2]")).click();
			List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));
			for (WebElement webElement : selectDate) {
				if (webElement.isDisplayed()) {
				
					webElement.click();
				} 
			}
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
	}
	
	public void clickEditBtnTaskRecurringTab() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Recurring')]")).click();
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]")).click();
	}
	
	public String getUpdateRecurringTAskStatus() {
		return driver.findElement(By.xpath("//a[contains(text(),'Task20')]")).getText();
	}
	
	public void clickOnClientatTask() {
		driver.findElement(By.xpath("//a[contains(text(),'Test Company')]")).click();
	}
	
	public String getCompanyDetailsStatus() {
		return driver.findElement(By.xpath("//span[contains(text(),'Test Company')]")).getText();
	}
	
	public void clickOnasignee() {
		driver.findElement(By.xpath("//a[contains(text(),'Automate Test Admin')]")).click();
	}
	
	public String getUserStatus() {
		return driver.findElement(By.xpath("//span[contains(text(),'Automate Test Admin')]")).getText();
	}
	
	public String getRecurringTaskWidget() {
		return driver.findElement(By.xpath("//div[1]/div[2]/div[2]/h1")).getText();
	}
	
public void clickonTask() throws InterruptedException {

	driver.findElement(By.xpath("//a[contains(text(),'Recurring')]")).click();
	
//		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[contains(text(),'Task20')]")).click();
		Thread.sleep(1000);
	}

public void UpdateFieldsInAddTaskPopup(String taskName, String temp,String date) throws InterruptedException {
	try {
		WebElement task = driver.findElement(By.xpath("//input[@id='task_task_name']"));
		task.clear();
		task.sendKeys(taskName);
		Select template = new Select(driver.findElement(By.xpath("//div[1]/div/div[2]/div//select[@class=\"form-control form-select\"]")));
		Thread.sleep(1000);
		template.selectByVisibleText(temp);
		
		WebElement sdate = driver.findElement(By.xpath("//input[@placeholder='Start Date'][2]"));
		sdate.click();
		List<WebElement> selectFiledDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));

		for (WebElement webElement : selectFiledDate) {
			if (webElement.isDisplayed()) {

				webElement.click();
			}
		}
		
		driver.findElement(By.xpath("//input[@value='Update']")).sendKeys(Keys.RETURN);

		Thread.sleep(1000);
	}

	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

public String getRecurringUpdateTAskStatus() {
	return driver.findElement(By.xpath("//a[contains(text(),'Task21')]")).getText();
}

public void deleteTaskReccuringTasks() throws InterruptedException {
	driver.findElement(By.xpath("//a[contains(text(),'Recurring')]")).click();
	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[2]")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
}

	//////////////////////////////////NOTES TAB Methods///////////////////////////////////////////////////
	
	public void click_NotesTab() {
		driver.findElement(clickNotesTab).click();
	}
	
	public String CompanyNotesTab() {
		String str = driver.findElement(clickNotesTab).getText();
		return str;
	}
	
	public void clickAddnotes_Button() throws InterruptedException {
		Thread.sleep(1000);	
		driver.findElement(clickAddNotesButton).click();
	}
	
	public boolean getAddNotesPopupStatus() {
		return driver.findElement(addNotesPopupStatus).isDisplayed();
		
	}
	
	public void resetButtonAddNotesPopup()  {
		driver.findElement(resetButton).click();
	}
	
	public boolean closeAddNotesPopup() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//h2[contains(text(),'Test Company')]")).isDisplayed();
	}
	
	public void addButtonAddNotesPopup()  {
		driver.findElement(By.xpath("//*[@id=\"add-contact\"]/div/div/div[4]/input[2]")).click();
	}
	
	public boolean assignToFieldErrrorMsg() {
		return driver.findElement(assignToErrorMsg).isDisplayed();
	}
	
	public void createNotes_NotesTab(String assigne, String sub, String notes ) throws InterruptedException {
		WebElement assignee = driver.findElement(assign);
		Select assignto = new Select(assignee);
		Thread.sleep(1000);
		assignto.selectByVisibleText(assigne);
		driver.findElement(textfieldNotes).sendKeys(sub);
		driver.findElement(notestext).sendKeys(notes);
		driver.findElement(By.xpath("//*[@id=\"add-contact\"]/div/div/div[4]/input[2]")).click();
		
	}
	
	public boolean getCreatedNotesStatus() {
		return driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]")).isDisplayed();
	}
	
	

	public void createCoachingNotes_NotesTab(String assigne, String sub, String notes ) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"select-note\"]/li[2]/a")).click();
		WebElement assignee = driver.findElement(assign);
		Select assignto = new Select(assignee);
		Thread.sleep(1000);
		assignto.selectByVisibleText(assigne);
		driver.findElement(textfieldNotes).sendKeys(sub);
		driver.findElement(notestext).sendKeys(notes);
		driver.findElement(By.xpath("//*[@id=\"add-contact\"]/div/div/div[4]/input[2]")).click();
		
	}
	
	public boolean getCreatedCoachingNotesStatus() {
		return driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]")).isDisplayed();
	}
	
	public void clickCoaching () {
		driver.findElement(By.xpath("//a[contains(text(),'Coachings')]")).click();
	}
	
	public boolean getCoachingNotesStatus() {
		return driver.findElement(By.xpath("//*[@id=\"tab5\"]/div[2]")).isDisplayed();
	}
	
	public void textSearch(String text) {
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(text);
	}
	
	public boolean getSearchnotesStatus() {
		return driver.findElement(By.xpath("//*[@id=\"task-01\"]/div/div")).isDisplayed();
	}
	
	public void searchNotesWithFilter() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"task-01\"]/div[2]/a")).click();
		Select date = new Select(driver.findElement(By.xpath("//select[@id='filter_created_at']")));
		Thread.sleep(1000);
		date.selectByIndex(1);
		Select retlatedContact = new Select(driver.findElement(By.xpath("//select[@id='filter_contact']")));
		Thread.sleep(1000);
		retlatedContact.selectByIndex(1);
		driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/input[1]")).click();
		
	}
	
	public boolean getSearchNotesFilterStatus() {
		return driver.findElement(By.xpath("//*[@id=\"task-01\"]/div")).isDisplayed();
	}
	
	public void resetFilter() {
		driver.findElement(By.xpath("//*[@id=\"task-01\"]/div[2]/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Reset')]")).click();
	}
	
	public boolean allnotesDisplayed() {
		return driver.findElement(By.xpath("//*[@id=\"tab5\"]/div[2]")).isDisplayed();
	}
	
	/////////////////////////Document Page Methods////////////////////////////////////////
	public void clickDocumentTab() {
		driver.findElement(documentPage).click();
	}
	
	public String getDocumentTabStatus() {
		String str = driver.findElement(documentPage).getText();
		return str;
	}
	
	public void clickAddBtnDocumentPage(String foldername) {
		driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='folder_name']")).sendKeys(foldername);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
	}
	public String getFolderStatus() {
		return driver.findElement(By.xpath("//a[contains(text(),'Automate Folder')]")).getText();
	}
	
	public void clickEditButtonDocumentPage() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(editButton).click();
	}
	
	public void updateFoldername(String fn) {
		driver.findElement(folderName).clear();
		driver.findElement(folderName).sendKeys(fn);
		driver.findElement(clickUpdateBtn).click();
	}
	
	public String getUpdateFolderNameStatus() {
		String str = driver.findElement(getUpdatedFolderNameStatus).getText();
		return str;
	}
	
	public void updateAgainFoldername(String fn) {
		driver.findElement(folderName).clear();
		driver.findElement(folderName).sendKeys(fn);
		driver.findElement(clickUpdateBtn).click();
	}
	
	public void clickFolder() {
		driver.findElement(getUpdatedFolderNameStatus).click();
	}
	
	public String getDocumentNameStatusErrorMsg() {
		driver.findElement(uploadDoc).click();
		driver.findElement(addbtnUploadDocPopup).click();
		String str = driver.findElement(folderNameErrorMsg).getText();
		return str;
	}
	
	public void uploadDocument(String fn) {
		driver.findElement(uploadDoc).click();
		driver.findElement(fileName).sendKeys(fn);
		driver.findElement(clickUploadDoc).sendKeys("E:\\Rahul Bhalla CIS\\OntrackProjectBDD\\OnTrack_BDD\\Image\\Audi.png");
		driver.findElement(addbtnUploadDocPopup).click();
	}
	
	public String uploadedDocumentStatus() {
		String str = driver.findElement(uploadedDocumentStatus).getText();
		return str;
	}
	
	public void uploadDocumentForSearch(String fn) {
		
			driver.findElement(uploadDoc).click();
			driver.findElement(fileName).sendKeys(fn);
			driver.findElement(clickUploadDoc).sendKeys("E:\\Rahul Bhalla CIS\\OntrackProjectBDD\\OnTrack_BDD\\Image\\Audi.png");
			driver.findElement(addbtnUploadDocPopup).click();
			driver.navigate().refresh();
			WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
	        w.until(ExpectedConditions .visibilityOfElementLocated(searchText));		
	        }
		
	public void searchDocment(String fn) {
		driver.findElement(searchText).click();
		driver.findElement(searchText).sendKeys(fn);
		driver.findElement(searchText).sendKeys(Keys.ENTER);
		
	}
	
	public String searchDocumentStatus() {
		String str = driver.findElement(searchDocumentStatus).getText();
		return str;
	}
	
	public void updateDocumentDocument(String fn) {
		driver.findElement(editDoc).click();
		driver.findElement(editDocFileName).clear();
		driver.findElement(editDocFileName).sendKeys(fn);
		driver.findElement(updateBtnDocument).click();
		
	}
	
	public String editDocumentStatus() {
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
        w.until(ExpectedConditions .visibilityOfElementLocated(editDocument));
		String str = driver.findElement(editDocument).getText();
		return str;
	}
	
	public void deleteDocument() throws InterruptedException {
		driver.findElement(deleteBtnDoc).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	public String deleteDocumentStatus() {
		String str = driver.findElement(editDocument).getText();
		return str;
	}

	
	public void clickOnEXpandButton() {
		driver.findElement(royaltyDifferenceExpand).click();
	}
	
	public void deleteFranchise() throws InterruptedException {
		driver.findElement(deleteBtnRoyaltyDiff).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	public String getFranchiseDeleteSuccessfully() {
		return driver.findElement(By.xpath("//span[contains(.,'Franchise was deleted successfully.')]")).getText();
	}
	
	public void replyToNotes() {
		driver.findElement(By.xpath("//*[@id=\"task-01\"]/div[2]/div/div[2]/a/i")).click();
		driver.findElement(By.xpath("//trix-editor[@placeholder='Write your note...']")).sendKeys("Testing Notes");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
	}
	
	public String getReplyNotesStatus() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[contains(.,'work')]")).click();
		return driver.findElement(By.xpath("//div[contains(text(),'Testing Notes')]")).getText();
	}
	
	public void editReplyNotes() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[contains(.,'work')]")).click();
		driver.findElement(By.xpath("//*[@id=\"task-01\"]/div[2]/div/div[2]/div[2]/div/div[2]/span/a[1]")).click();
		driver.findElement(By.xpath("//trix-editor[@placeholder='Write your note...']")).clear();
		driver.findElement(By.xpath("//trix-editor[@placeholder='Write your note...']")).sendKeys("TestingNotes");	
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}
	
	public String getEditReplyNotesStatus() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[contains(.,'work')]")).click();
		return driver.findElement(By.xpath("//div[contains(text(),'TestingNotes')]")).getText();
	}
	
	public void deleteReplyNotes() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[contains(.,'work')]")).click();
		driver.findElement(By.xpath("//*[@id=\"task-01\"]/div[2]/div/div[2]/div[2]/div/div[2]/span/a[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	
	}
	public String validateDeleteReply() {
		return driver.findElement(By.xpath("//span[contains(.,'Reply was deleted successfully')]")).getText();
	}
	
	public void replyNotesCoachingTab() {
		driver.findElement(By.xpath("//a[contains(.,'Notes')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Coachings')]")).click();
	}
	
	public void replyToNotesCoaching() {
		driver.findElement(By.xpath("//*[@id=\"task-02\"]/div[2]/div/div[2]/a/i")).click();
		driver.findElement(By.xpath("//trix-editor[@placeholder='Write your note...']")).sendKeys("Testing Notes");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
	}
	
	public String getReplyNotesStatusCoaching() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[contains(.,'work')]")).click();
		return driver.findElement(By.xpath("//div[contains(text(),'Testing Notes')]")).getText();
	}
	
	public void editReplyNotesCoaching() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='notes-body-in trix-content show-other-replies']")).click();
		driver.findElement(By.xpath("//*[@id=\"task-02\"]/div[2]/div/div[2]/div[2]/div/div[2]/span/a[1]")).click();
		driver.findElement(By.xpath("//trix-editor[@placeholder='Write your note...']")).clear();
		driver.findElement(By.xpath("//trix-editor[@placeholder='Write your note...']")).sendKeys("TestingNotes");	
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}
	
	public String getEditReplyNotesStatusCoaching() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[contains(.,'work')]")).click();
		return driver.findElement(By.xpath("//div[contains(text(),'TestingNotes')]")).getText();
	}
	
	public void deleteReplyNotesCoaching() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[contains(.,'work')]")).click();
		driver.findElement(By.xpath("//*[@id=\"task-02\"]/div[2]/div/div[2]/div[2]/div/div[2]/span/a[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	
	}
	
	public String validateDeleteReplyCoaching() {
		return driver.findElement(By.xpath("//span[contains(.,'Reply was deleted successfully')]")).getText();
	}
	
	public void clickOnLogo() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/a/img")).click();
	}
	
	public String companiesListPageURL() throws InterruptedException {
		Thread.sleep(1000);
		return driver.getCurrentUrl();
	}
	
	public void clickOnProfileSideBar() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='con-col-p bg_profile']")).click();
	}
	
	public String getProfileStatus() {
		return driver.findElement(By.xpath("//div[@class='con-col-p']//span[contains(.,'Arjay McCann')]")).getText();
	}
	
	public void clickSettingTab() {
		driver.findElement(By.xpath("//a[@href=\"/settings\"]")).click();
	}
	
	public void clickonAddTitleContactTitleWidget() {
		driver.findElement(By.xpath("//div[@class='setting-box'][1]//a[contains(.,'New Title')]")).click();
	}
	public void enterTitleContactTitleWidget(String title) {
		driver.findElement(By.xpath("//input[@placeholder='Title']")).sendKeys(title);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
	}
	
	public String getAddTitleStatusContactTitleWidget() {
		return driver.findElement(By.xpath("//td[contains(text(),'Automate Admin')]")).getText();
	}
	
	public void clickReportBtn() {
		driver.findElement(By.xpath("//a[contains(.,'New Report')]")).sendKeys(Keys.RETURN);
	}
	public void enterReportFields(String title) {
		driver.findElement(By.xpath("//input[@placeholder='Title']")).sendKeys(title);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
	}
	public String getAddReportStatus() {
		return driver.findElement(By.xpath("//td[contains(text(),'Automate Report')]")).getText();
	}
	
	public void deleteTitleContactTitleWidget() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='setting-table'][1]//tr[2]//td[4]//a[@data-turbo-method='delete'][1]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	public String deleteTitleSuccessfullyContactTitleWidget() {
		return driver.findElement(By.xpath("//span[contains(.,'Title was successfully deleted.')]")).getText();
	}
	

	public void deleteReport() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[3]/a")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	public String deleteReportSuccessfully() {
		return driver.findElement(By.xpath("//span[contains(.,'Report was successfully deleted.')]")).getText();
	}
	
	
	public void clickonAddTitleStaffTitleWidget() {
		driver.findElement(By.xpath("//div[@class='setting-box'][2]//a[contains(.,'New Title')]")).click();
	}
	
	public void enterTitleStaffTitleWidget(String title) {
		driver.findElement(By.xpath("//input[@placeholder='Title']")).sendKeys(title);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
	}
	
	public String getAddTitleStatusStaffTitleWidget() {
		return driver.findElement(By.xpath("//td[contains(text(),'Automate Admin')]")).getText();
	}
	public void clickOnUserLink() {
		driver.findElement(By.xpath("//span[contains(text(),'Users')]")).click();
	}
	
	public void clickOnAddUserButton() {
		driver.findElement(By.xpath("//a[contains(text(),'Add User')]")).click();
	}
	public void enterFieldsForUsers(String fn, String t, String bdate,String role,String email, String sdate) throws InterruptedException {
		try {
			
			driver.findElement(By.xpath("//input[@id='user_full_name']")).sendKeys(fn);
			Select title = new Select(driver.findElement(By.xpath("//select[@id='user_title_id']")));
			Thread.sleep(1000);
			title.selectByVisibleText(t);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Birth Date'][2]")).click();
			Thread.sleep(1000);
			List<WebElement> selectaDate = driver.findElements(By.xpath("//span[@aria-label='" + bdate + "']"));
			for (WebElement webElement : selectaDate) {
				if (webElement.isDisplayed()) {
				
					webElement.click();
				} 
			}
			Select r = new Select(driver.findElement(By.xpath("//select[@id='user_role']")));
			Thread.sleep(1000);
			r.selectByVisibleText(role);
			driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@id='user_image']")).sendKeys("E:\\Rahul Bhalla CIS\\OntrackProjectBDD\\OnTrack_BDD\\Image\\profile.jpg");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Start Date'][2]")).click();
			Thread.sleep(1000);
			List<WebElement> selectDate = driver.findElements(By.xpath("//span[@aria-label='" + sdate + "']"));
			for (WebElement webElement : selectDate) {
				if (webElement.isDisplayed()) {
				
					webElement.click();
				} 
			}
			
			driver.findElement(By.xpath("//input[@value='Add']")).click();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getAddUserStatus() {
		return driver.findElement(By.xpath("//p[contains(text(),'Automate Test Admin')]")).getText();
	}
	
	public void selectUser(String user) throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Search user']")).sendKeys(user);
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[3]/div[1]/div/div[1]/form/div/button[2]/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'Automate Test Admin')]")).click();
	}
	
	public void clickEditbutton() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	}
	
	public void clickDeleteButtonUser() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	public void deleteTitleStaffTitleWidget() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[4]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	public String deleteTitleSuccessfullyStaffTitleWidget() {
		return driver.findElement(By.xpath("//span[contains(.,'Title was successfully deleted.')]")).getText();
	}
	
}


