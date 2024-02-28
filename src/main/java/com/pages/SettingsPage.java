package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SettingsPage {
	private WebDriver driver;
	
	private By settingPage = By.xpath("//a[@href=\"/settings\"]");
	private By settingPageDisplay = By.xpath("//h6[contains(text(),'Contact Title')]");
	private By addBtnContactTitle = By.xpath("//div[@class='header-btn']//a[@href=\"/titles/new?type=contact\"]");
	private By addTitlePopupTitle = By.xpath("//input[@value='Add']");
	private By titleErrorMsg = By.xpath("//span[contains(text(),\"Title can't be blank.\")]");
	private By title = By.xpath("//input[@id='title_title']");
    private By closeTitlePopup = By.xpath("//button[@id='close']");
    private By closeContactTitlePopup = By.xpath("//h6[contains(text(),'Contact Title')]");
    private By getTitleStatus= By.xpath("//td[contains(text(),'Auto Admin')]");
    private By editButtonOfContactTitle = By.xpath("/html/body/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[3]/form/button/i");
    private By udatebtnTitlePopup = By.xpath("//input[@value='Update']");
    private By addBtnStaffTitle = By.xpath("//div[@class='header-btn']//a[@href=\"/titles/new?type=staff\"]");
    private By closeStaffTitlePopup =By.xpath("//h6[contains(text(),'Staff Title')]");
    private By editBtnStaffTitle = By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[3]/form/button/i");
    private By getStaffTitleStatus= By.xpath("//td[contains(text(),'Auto Admin')]");
    private By clickAddBtnEmailSignature = By.xpath("//a[contains(text(),'+ Add')]");
    private By clickCloseBtnEmailSignature = By.xpath("//button[@id='close']");
    private By closePopEmailSignaturePopup = By.xpath("//h6[contains(text(),'Email Signature')]");
    private By addBtnEmailSignaturePopup = By.xpath("//input[@name='commit']");
    private By validErrorMsgEmailSignatureName = By.xpath("//span[contains(text(),\"Name can't be blank.\")]");
    private By emailSignatureName = By.xpath("//input[@id='email_signature_name']");
    private By messageEmailSignature = By.xpath("//body[@aria-placeholder='Content']");
    private By getEmailSignatureStatus = By.xpath("//td[text()='Automate Email Signature']");
    private By editBtnEmailSignautre=By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div/table/tbody/tr/td[3]/form/button");
    private By getUpdatedSignatureStatus= By.xpath("//td[text()='Automate Signature']");
    private By getUpdatedEmailMessage = By.xpath("//p[contains(text(),'Automate New Message')]");
    private By deleteEmailSignature = By.xpath("//div[3]/div[2]/div[1]/table/tbody/tr/td[4]/form/button");
    private By addBtnReport = By.xpath("//a[@data-turbo-frame=\"report_modal\"]");
    private By addBtnTitlePoupReport= By.xpath("//input[@value='Add']");
    private By closeReportsPopupStatus = By.xpath("//h6[contains(text(),'Reports')]");
    private By editBtnReportsPopup= By.xpath("/html/body/div/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[2]/form/button");
    private By reportTitle = By.xpath("//input[@id='report_title']");
    private By getReportStatus = By.xpath("//td[text()='Auto Report']");
    
    
    
	public SettingsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickSettingTab() {
		driver.findElement(settingPage).click();
	}
	
	public String settingsPage() {
		
		String str = driver.findElement(settingPageDisplay).getText();
		return str;
		
	}
	
	public void addBtnContactTitleWidget() {
		driver.findElement(addBtnContactTitle).click();
	}
	
	public void addButtonTitlePoupContactTitle() {
		driver.findElement(addTitlePopupTitle).click();
	}
	
	public String getValidationStatusTitleContactTitle() {
		String str = driver.findElement(titleErrorMsg).getText();
		return str;
	}
	
	public void closeAddTitlePopupContactTitle() {
		driver.findElement(closeTitlePopup).click();
	}
	
public String closeAddTitlePopupContactTitleSuccess() {
		driver.navigate().refresh();
		String str = driver.findElement(closeContactTitlePopup).getText();
		return str;
		
	}
	
	public void editTitleContactTitle(String t) {

		driver.findElement(editButtonOfContactTitle).click();
		driver.findElement(title).clear();
		driver.findElement(title).sendKeys(t);
		driver.findElement(udatebtnTitlePopup).click();
	}
	
	public String getContactTitleStatus() {
		String str = driver.findElement(getTitleStatus).getText();
		return str;
	}
	
	
	public void addBtnStaffTitleWidget() {
		driver.findElement(addBtnStaffTitle).click();
	}
	public void addButtonTitlePoupStaffTitle() {
		driver.findElement(addTitlePopupTitle).click();
	}
	
	public String getValidationStatusTitleStaffTitle() {
		String str = driver.findElement(titleErrorMsg).getText();
		return str;
	}
	
	public void closeAddTitlePopupStaffTitle() {
		driver.findElement(closeTitlePopup).click();
	}
	
	public String closeAddTitlePopupStaffTitleSuccess() {
		driver.navigate().refresh();
		String str = driver.findElement(closeStaffTitlePopup).getText();
		return str;
		
	}

	public void editTitleStaffTitle(String t) throws InterruptedException {
		Thread.sleep(1000);
	driver.findElement(editBtnStaffTitle).click();
	driver.findElement(title).clear();
	driver.findElement(title).sendKeys(t);
	driver.findElement(udatebtnTitlePopup).click();
	driver.navigate().refresh();
	
	}

	public String getStaffTitleStatus() throws InterruptedException {
		Thread.sleep(1000);
	String str = driver.findElement(getStaffTitleStatus).getText();
	return str;
	}

	public void changeTitleStaffTitle(String t) {
	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
    w.until(ExpectedConditions .visibilityOfElementLocated(editBtnStaffTitle));
	driver.findElement(editBtnStaffTitle).click();
	driver.findElement(title).clear();
	driver.findElement(title).sendKeys(t);
	driver.findElement(udatebtnTitlePopup).click();
	}
	public void addButtonSignaturePoupEmailSignature() {
	driver.findElement(clickAddBtnEmailSignature).sendKeys(Keys.RETURN);
	}
	public void closeBtnEmailSignature() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(clickCloseBtnEmailSignature).click();
	}
	
	public String getCloseSignaturePopupStatus() throws InterruptedException {
		Thread.sleep(2000);
		String str = driver.findElement(closePopEmailSignaturePopup).getText();
		return str;
	}
	public void addBtnEmailSignaturePopup() {
		driver.findElement(addBtnEmailSignaturePopup).click();
	}
	

	
	public void addSignatureEmail(String s, String message) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(1000);
		driver.findElement(emailSignatureName).sendKeys(s);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='email_signature_detail_ifr']"))); 
		driver.findElement(messageEmailSignature).sendKeys(message);
		driver.switchTo().defaultContent();
		driver.findElement(addBtnEmailSignaturePopup).sendKeys(Keys.RETURN);
		}
	

	public String getEmailSignatureStatus() {
		String str = driver.findElement(getEmailSignatureStatus).getText();
		return str;
	}
	
	public void clickEditBtnEmailSignature() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		driver.findElement(editBtnEmailSignautre).sendKeys(Keys.RETURN);
	}
	
	public void editSignatureEmail(String s, String message) {
		driver.findElement(emailSignatureName).clear();
		driver.findElement(emailSignatureName).sendKeys(s);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='email_signature_detail_ifr']"))); 
		driver.findElement(By.xpath("//body[@class='mce-content-body ']")).clear();
		driver.findElement(By.xpath("//body[@class='mce-content-body ']")).sendKeys(message);
		driver.switchTo().defaultContent();

		driver.findElement(addBtnEmailSignaturePopup).click();
		}
	
	public String getUpdatedEmailSignatureStatus() {
		String str = driver.findElement(getUpdatedSignatureStatus).getText();
		return str;
	}
	
	public String getUpdatedEmailSignatureMsgStatus() throws InterruptedException {
		Thread.sleep(1000);
		String str = driver.findElement(getUpdatedEmailMessage).getText();
		return str;
	}
	
	public void deleteEmailSignature() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		driver.findElement(deleteEmailSignature).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.navigate().refresh();
		
	}
	
	public void clickAddBtnReportWidget() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		driver.findElement(addBtnReport).sendKeys(Keys.RETURN);
	}
	
	public void clickAddBtnTitlePopupReport() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(addBtnTitlePoupReport).click();
	}
	public String getValidationStatusTitleReports() {
		String str = driver.findElement(titleErrorMsg).getText();
		return str;
	}
	
	public void closeAddTitlePopupReports() {
		driver.findElement(closeTitlePopup).click();
	}
	
	public String getcloseReportsPopupStatus() {
		driver.navigate().refresh();
		String str= driver.findElement(closeReportsPopupStatus).getText();
		return str;
	}
	
	public void editTitleReports(String t) throws InterruptedException {
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 5000)");
	
	Thread.sleep(1000);
//	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
//	w.until(ExpectedConditions .visibilityOfElementLocated(editBtnReportsPopup));		

	driver.findElement(editBtnReportsPopup).sendKeys(Keys.RETURN);
	driver.findElement(reportTitle).clear();
	driver.findElement(reportTitle).sendKeys(t);
	driver.findElement(udatebtnTitlePopup).click();
	driver.navigate().refresh();
		
    
	}
	
	public String getReportsStatus() throws InterruptedException {
		
		Thread.sleep(2000);
		String str = driver.findElement(getReportStatus).getText();
		return str;
		}
	
	public void changeTitleReports(String t) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(1000);
//		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
//		w.until(ExpectedConditions .visibilityOfElementLocated(editBtnReportsPopup));		

		driver.findElement(editBtnReportsPopup).sendKeys(Keys.RETURN);
		driver.findElement(reportTitle).clear();
		driver.findElement(reportTitle).sendKeys(t);
		driver.findElement(udatebtnTitlePopup).click();
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
	
	public void deleteTitleContactTitleWidget() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[4]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	public String deleteTitleSuccessfullyContactTitleWidget() {
		return driver.findElement(By.xpath("//span[contains(.,'Title was successfully deleted.')]")).getText();
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
	
	public void deleteTitleStaffTitleWidget() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[4]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	public String deleteTitleSuccessfullyStaffTitleWidget() {
		return driver.findElement(By.xpath("//span[contains(.,'Title was successfully deleted.')]")).getText();
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
	
	public void deleteReport() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[3]/a")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	public String deleteReportSuccessfully() {
		return driver.findElement(By.xpath("//span[contains(.,'Report was successfully deleted.')]")).getText();
	}
	
}
