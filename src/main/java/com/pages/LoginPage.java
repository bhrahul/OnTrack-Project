package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	WebDriver driver;	
	
	private By emailfield = By.xpath("//input[@name='user[email]']");
	private By passwordfield = By.xpath("//input[@name='user[password]']");
	private By logInBtn = By.xpath("//input[@name='commit']");
	private By invalidCredText = By.xpath("//div[@class='alert alert-danger']");
	private By forgetPasswordLink = By.xpath("//a[text()='Forgot your password?']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public String getTitle() {
	 String str = driver.getTitle();
	 return str;
	}
	
	public void enterEmail(String username) {
		WebElement email = driver.findElement(emailfield);
		email.sendKeys(username);
		
		
	}
	
	public void enterPassword(String password) {
		WebElement passwordBox = driver.findElement(passwordfield);
		passwordBox.sendKeys(password);
		
		
	}
	
	public void clickLoginbtn() {
		driver.findElement(logInBtn).click();
	}
	
	public String getInvalidCredText() {
		String str = driver.findElement(invalidCredText).getText();
		return str;
	}
	public void clickOnForgetPasswordLink()
	{
		driver.findElement(forgetPasswordLink).click();
	}
	
	
	
	public String loginPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public boolean forgetPasswordLinkIsDisplayed() {
		return driver.findElement(forgetPasswordLink).isDisplayed();
	}
	
	public CompaniesPage doLogin(String un, String pwd)
	{
		WebElement email = driver.findElement(emailfield);
		email.sendKeys(un);
		WebElement passwordBox = driver.findElement(passwordfield);
		passwordBox.sendKeys(pwd);
		driver.findElement(logInBtn).click();
		return new CompaniesPage(driver);
	}
	
	
	public ContactPage doLoginAgain(String un, String pwd)
	{
		WebElement email = driver.findElement(emailfield);
		email.sendKeys(un);
		WebElement passwordBox = driver.findElement(passwordfield);
		passwordBox.sendKeys(pwd);
		driver.findElement(logInBtn).click();
		return new ContactPage(driver);
	}
    
	public TasksPage loginForTasks(String un, String pwd)
	{
		WebElement email = driver.findElement(emailfield);
		email.sendKeys(un);
		WebElement passwordBox = driver.findElement(passwordfield);
		passwordBox.sendKeys(pwd);
		driver.findElement(logInBtn).click();
		return new TasksPage(driver);
	}
	
	public UsersPage loginForUsers(String un, String pwd)
	{
		WebElement email = driver.findElement(emailfield);
		email.sendKeys(un);
		WebElement passwordBox = driver.findElement(passwordfield);
		passwordBox.sendKeys(pwd);
		driver.findElement(logInBtn).click();
		return new UsersPage(driver);
	}


	public SettingsPage loginForSettings(String un, String pwd)
	{
		WebElement email = driver.findElement(emailfield);
		email.sendKeys(un);
		WebElement passwordBox = driver.findElement(passwordfield);
		passwordBox.sendKeys(pwd);
		driver.findElement(logInBtn).click();
		return new SettingsPage(driver);
	}




	
}