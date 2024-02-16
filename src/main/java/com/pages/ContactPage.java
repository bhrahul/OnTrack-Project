package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage {
	private WebDriver driver;
	private By clickContactTab = By.xpath("//a[contains(.,'Contact')]");
	private By emailAddressText = By.xpath("//span[contains(text(),'admin@ontrack.com')]");
	private By addContactBtn = By.xpath("//a[text()='Add Contact']");
	private By searchBox = By.id("q");
	private By editBtn = By.xpath("//a[@class='btn-ed']"); 
	private By contactList = By.xpath("//div[@class='se-list mCustomScrollbar']"); 
	private By usersDetail = By.xpath("//div[@class='pro-dlv']");
	private By uploadPhotoBtn = By.xpath("//input[@id='photoInput']");
	
	private By addButton = By.xpath("//*[@id=\"submit_button\"]/input");
	private By updateBtn = By.xpath("//input[@value='Update']");
	private By titleDropdown = By.xpath("//select[@id='contact_title_id']");
	private By emailid= By.xpath("//input[@id='contact_email']");
	private By searchFieldofContact = By.xpath("//input[@id='q']");
	private By searchResultContact = By.xpath("//*[@id=\"tab2\"]/div[3]/div[1]/div/div[1]/form/div/button[2]");


	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String CompaniesPageURL() throws InterruptedException  {
		Thread.sleep(1000);
		String str = driver.getCurrentUrl();
		return str;
		
	}

	
	public void clickOnContactTab() throws InterruptedException 
	{
		Thread.sleep(1000);

		WebElement contacts = driver.findElement(clickContactTab);
		contacts.click();
		Thread.sleep(3000);
	}
	
	public String ContactPageURL() throws InterruptedException
	{
		Thread.sleep(2000);

		String str = driver.getCurrentUrl();
		return str;
	}
	
	public boolean getUserEmailAddressStatus()
	{
		
		return driver.findElement(emailAddressText).isDisplayed();
	}
	
	public boolean getAddContactBtnStatus() {
		return driver.findElement(addContactBtn).isDisplayed();
	}
	
	public boolean getSearchFieldStatus() {
		return driver.findElement(searchBox).isDisplayed();
	}
	
	public boolean getEditBtnStatus() {
		return driver.findElement(editBtn).isDisplayed();
	}
	
	public boolean getContactListStatus() {
		return driver.findElement(contactList).isDisplayed();
	}
	
	public boolean getUserDetailStatus() {
		return driver.findElement(usersDetail).isDisplayed();
	}
	
	public boolean getUploadPhotoBtnStatus() {
		return driver.findElement(uploadPhotoBtn).isDisplayed();
		
	}

	public void clickAddContactButton() {
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
        w.until(ExpectedConditions .visibilityOfElementLocated(addContactBtn));
		driver.findElement(addContactBtn).click();
	}
	
	public boolean closeAddContactPopup() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='close']")).click();
		Thread.sleep(1000);
		return driver.findElement(emailAddressText).isDisplayed();
	}
	
	public void clickAddButtonContactPagePopup() {
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(50));
        w.until(ExpectedConditions .visibilityOfElementLocated(addButton));
		driver.findElement(addButton).click();
	}
	
	public String  getFirstNameErrorMsg() {
		String str = driver.findElement(By.xpath("//span[contains(text(),\"First name can't be blank.\")]")).getText();
		return str;
	}
	
	
	public String getLasttNameErrorMsg() {
		String str =  driver.findElement(By.xpath("//span[contains(text(),\"Last name can't be blank.\")]")).getText();
		return str;
	}
	
	
	public String getTitleErrorMsg() {
		String str =  driver.findElement(By.xpath("//span[contains(text(),'Title must exist.')]")).getText();
		return str;
	}
	
	
	public String getPhoneNumberErrorMsg() {
		return driver.findElement(By.xpath("//span[contains(text(),\"Phone number can't be blank.\")]")).getText();
	}
	
	public String getCompanyIdErrorMsg() {
		return driver.findElement(By.xpath("//span[contains(text(),\"Company ids can't be blank.\")]")).getText();
	}
	
	
	public void clickADDContactBtn() {
		driver.findElement(addContactBtn).click();
	}
	
	
	public void enterContactInfo(String fn, String ln, String mail, String pn, String c) {
		WebElement fname = driver.findElement(By.xpath("//input[@id='contact_first_name']"));
		fname.sendKeys(fn);
		WebElement lname = driver.findElement(By.xpath("//input[@id='contact_last_name']"));
		lname.sendKeys(ln);
		Select titleE = new Select(driver.findElement(By.xpath("//select[@id='contact_title_id']")));
		titleE.selectByIndex(2);
		WebElement eMail = driver.findElement(By.xpath("//input[@id='contact_email']"));
		eMail.sendKeys(mail);
		WebElement pNumber = driver.findElement(By.xpath("//input[@id='phone_number_contact']"));
		pNumber.sendKeys(pn);
		WebElement selectCompany = driver.findElement(By.xpath("//select[@id='contact_company_ids']"));
		Select company = new Select(selectCompany);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		company.selectByVisibleText(c);

		driver.findElement(By.xpath("//input[@value='Add']")).click();

	}
	
	public String getContactStataus() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//p[contains(text(),'Test Contact')]")).getText();
	}
	
	public void searchContact(String contact)  {

		driver.findElement(searchFieldofContact).sendKeys(contact);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(searchResultContact).click();
	}
	public void clickEditBtn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//p[contains(text(),'Test Contact')]")).click();
		Thread.sleep(1000);
		driver.findElement(editBtn).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}

	
	
	
public void enterUsersInfo(String el, String c) throws InterruptedException {
		try {
		WebElement titleValue = driver.findElement(By.xpath("//select[@name='contact[title_id]']"));
		Thread.sleep(1000);
		Select objSelect = new Select(titleValue);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		objSelect.selectByVisibleText("contact1");
		driver.findElement(emailid).clear();
		driver.findElement(emailid).sendKeys(el);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='contact_image']")).sendKeys("E:\\Rahul Bhalla CIS\\OntrackProjectBDD\\OnTrack_BDD\\Image\\download.jpg");
		Select company = new Select(driver.findElement(By.xpath("//select[@id='contact_company_ids']")));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));
		company.selectByVisibleText(c);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
public void clickUpdateBtnOfEditUserPopUP() {
	driver.findElement(updateBtn).click();
	driver.navigate().refresh();

}

public String getContactDetailStatus() {
    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));
	return driver.findElement(By.xpath("//span[contains(text(),'contact1')]")).getText();
}

public void enterOldUsersInfo(String tl,String el) {
	
	try {
	WebElement titleValue = driver.findElement(titleDropdown);
	Select objSelect = new Select(titleValue);
	objSelect.selectByVisibleText(tl);
	driver.findElement(emailid).clear();
	driver.findElement(emailid).sendKeys(el);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='contact_image']")).sendKeys("E:\\Rahul Bhalla CIS\\OntrackProjectBDD\\OnTrack_BDD\\Image\\Audi.png");

	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void uploadImage() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//input[@id='photoInput']")).sendKeys("E:\\Rahul Bhalla CIS\\OntrackProjectBDD\\OnTrack_BDD\\Image\\aaa.png");
	driver.navigate().refresh();
}

public void clickDeleteButton() throws InterruptedException {
	driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
	Thread.sleep(1000);
		driver.switchTo().alert().accept();

}

public String getContactDeleteStatus() throws InterruptedException {
	Thread.sleep(1000);
	return driver.findElement(By.xpath("//span[contains(.,'Contact was successfully deleted.')]")).getText();
}
}


