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

public class UsersPage {
	WebDriver driver;

	private By UsersTabLink = By.xpath("//span[contains(text(),'Users')]");
//	private By selectTitle = By.xpath("//select[@id='user_title_id']");
	//private By dateselect = By.xpath("//input[@placeholder='Birth Date'][2]");
	private By email = By.xpath("//input[@id='user_email']");
	private By editBtn = By.xpath("//a[text()='Edit']");
	private By updateBtnofEditUserPopUp = By.xpath("//input[@value='Update']");
	private By searchFieldofUser = By.xpath("//input[@id='q']");
	private By searchResultUser = By.xpath("//*[@id=\"tab1\"]/div[3]/div[1]/div/div[1]/form/div/button[2]/i");
	private By addContactBtn = By.xpath("//button[contains(text(),'Add Contact')]");
	private By addCompanyBtn = By.xpath("//a[@class='add-con-btn flat_pickr']");
	private By companyName = By.xpath("//input[@placeholder='Company Name']");
	private By phoneNumber = By.xpath("//input[@id='phone_number_company']");    
	private By companyEmail = By.xpath("//input[@id='company_email']");     
	private By website = By.xpath("//input[@id='company_website']");
	private By address = By.xpath("//input[@id='company_address']");
	private By city = By.xpath("//input[@id='company_city']");
	private By state = By.xpath("//input[@id='company_state']");
	private By zipcode = By.xpath("//input[@placeholder='Zip Code']");
	private By sDate = By.xpath("//input[@placeholder='Start Date'][2]");
	private By addButton = By.xpath("//input[@data-disable-with='Add']");
	private By reportTime = By.xpath("//input[@name='company[report_time]']");
	private By companyDropdown = By.xpath("//select[@id='company_ids']");
	private By clickAddBtn= By.xpath("//input[@value='Add']");
	private By clickTasks = By.xpath("//span[contains(text(),'Tasks')]");
	private By clickReoccuringTab = By.xpath("//body/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
	private By addTaskButton = By.xpath("//a[contains(.,'Add Task')]");
	private By selectTaskTemplate= By.xpath("//select[@id='task_task_template_id']");
	private By taskname = By.xpath("//input[@id='task_task_name']");
	private By assignTo = By.xpath("//select[@id='assigned-to-select']");
	private By client = By.xpath("//select[@id='client-to-select']");
	private By taskRepeat = By.xpath("//select[@id='repeat_task']");
	private By taskrepeatEvery = By.xpath("//div[@id='daily-options']");
	private By collapseBtn = By.xpath("//i[@id='collapse_icon']");
	private By nameExpand = By.xpath("//i[@id='task_collapse_name']");
	private By companyExpand = By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[1]/p/span/i");
	private By updateButton = By.xpath("//input[@value='Update']");
	private By startDate= By.xpath("//input[@placeholder='Start Date'][2]");
	private By taskRecurringAddTaskPopupTitle=By.xpath("//h5[@id='newCompanyTaskModalLabel']");


	public UsersPage(WebDriver driver) {
		this.driver = driver;
	}

	public void usersSidebarMenu() {
		driver.findElement(UsersTabLink).click();
	}
	
	public void clickAddUserBtn() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(.,'Add User')]")).click();
		Thread.sleep(2000);
		}

	public String usersPageURL() throws InterruptedException {
		Thread.sleep(2000);
		String str = driver.getCurrentUrl();
		return str;
	}

	public void clickEditBtn() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(editBtn).click();
		Thread.sleep(2000);
	}

	public void enterUsersInfo(String el) {
		
		try {
		
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(el);
		Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickUpdateBtnOfEditUserPopUP() throws InterruptedException {

		driver.findElement(updateBtnofEditUserPopUp).click();
		Thread.sleep(2000);
	}
	
	public String getUpdateEmailStatus() throws InterruptedException {
		
		return driver.findElement(By.xpath("//span[contains(text(),'admin77@mailinator.com')]")).getText();
	}

	public void searchUser(String user) throws InterruptedException {

		driver.findElement(searchFieldofUser).sendKeys(user);
		Thread.sleep(2000);
		driver.findElement(searchResultUser).click();
		
	}
	
	public void clickuser() {
		driver.findElement(By.xpath("//div[@data-id='17']//p[contains(.,'Final check')]")).sendKeys(Keys.RETURN);
	}
	
	public void clickedOnAddContactBtn() {
		WebElement AddContactBtn = driver.findElement(addContactBtn);
		AddContactBtn.click();
	}
	
	public void clickOnAddCompanyBtn() throws InterruptedException {
		WebElement addCompanybtn = driver.findElement(addCompanyBtn);
		addCompanybtn.click();
		addCompanybtn = new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(companyName)));

	}
	
	public void enterCompanyInfo(String cn, String pn, String wsite, String e, String ad, String c, String s,
			String zip, String sdate) {
		
		WebElement cName = driver.findElement(companyName);
		cName.sendKeys(cn);
		WebElement pNumber = driver.findElement(phoneNumber);
		pNumber.sendKeys(pn);
		WebElement wSite = driver.findElement(website);
		wSite.sendKeys(wsite);
		driver.findElement(companyEmail).sendKeys(e);
//		WebElement ext = driver.findElement(extention);
//		ext.sendKeys(Ext);
//	
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
		WebElement rTime = driver.findElement(reportTime);
		rTime.click();
		driver.findElement(addButton).click();
		
	}
	
	public void selectCompany(String company) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='custom-btn']")).click();
		WebElement uc = driver.findElement(companyDropdown);
		Thread.sleep(1000);
		Select c = new Select(uc);
		c.selectByVisibleText(company);
		driver.findElement(clickAddBtn).click();
	}
	
	public String getCompanyStatus() {
		return driver.findElement(By.xpath("//a[contains(text(),'Test Company')]")).getText();
	}
	
	public void DeleteCompany() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[3]/div[2]/div[2]/div[2]/p/a[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
	}

	

 	public void deletecompany() throws InterruptedException {
 		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[3]/td[7]/a[2]")).click();
 		Thread.sleep(1000);
 		driver.switchTo().alert().accept();
 	}
 	
 	
	public void selectCompanyTaskRecurring(String company) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[3]/div[1]/div/div[1]/form/div/button[2]/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'Test admin')]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[contains(.,'Add Companies')]")).click();
		Thread.sleep(1000);

		WebElement uc = driver.findElement(companyDropdown);
		Select c = new Select(uc);
		c.selectByVisibleText(company);
		driver.findElement(clickAddBtn).click();
	}
	
	public String getCompanyStatusForTheTaskRecurring() {
		driver.navigate().refresh();
		return driver.findElement(By.xpath("//div[@class='com-ft']//p[1]")).getText();
	}
 	
 	public void tasksSidebarMenu() {
		driver.findElement(clickTasks).click();
	}
 	
 	public void clickTasksReoccuringTab() {
		driver.findElement(clickReoccuringTab).click();
	}
 	public void click_AddTask_Button() {
		driver.findElement(addTaskButton).click();
	}
	
	public void enterFieldsInAddTaskPopup(String template, String taskName,String assignee, String clien, String date) {
		try {
			Select taskTemplate = new Select(driver.findElement(selectTaskTemplate));
			Thread.sleep(1000);
			taskTemplate.selectByVisibleText(template);;
			driver.findElement(taskname).sendKeys(taskName);
			Select assign = new Select(driver.findElement(assignTo));
			Thread.sleep(1000);
			assign.selectByVisibleText(assignee);;
			Select c = new Select(driver.findElement(client));
			Thread.sleep(1000);
			c.selectByVisibleText(clien);
			driver.findElement(taskRecurringAddTaskPopupTitle).click();
			driver.findElement(startDate).click();
			List<WebElement> selectFiledDate = driver.findElements(By.xpath("//span[@aria-label='" + date + "']"));

			for (WebElement webElement : selectFiledDate) {
				if (webElement.isDisplayed()) {

					webElement.click();
				}
			}
			Select taskrepeat = new Select(driver.findElement(taskRepeat));
			taskrepeat.selectByIndex(1);
			driver.findElement(taskrepeatEvery).click();
			driver.findElement(By.xpath("//input[@value='Monday']")).click();
			driver.findElement(taskrepeatEvery).click();
			driver.findElement(clickAddBtn).click();
			Thread.sleep(1000);
		}

		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().refresh();

	}

	  public void clickExpandView() {
	    	 
		    driver.findElement(By.xpath("//*[@id=\"section_4\"]/p/span")).click();
		     }
	  
	  public String getTaskStatus() {
		   driver.navigate().refresh();
	    	 return driver.findElement(By.xpath("//a[contains(text(),'Important Work')]")).getText();
	     }
	     
	  public void clickOnUser() {
		  driver.findElement(By.xpath("//p[contains(text(),'Test admin')]")).click();
	  }
	  
	  public void clickOnCollapseBtn() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(collapseBtn).click();
	  }
	  
	  public void clickOnNameExpandButton() {
		  driver.findElement(nameExpand).click();
	  }
	  
	  public void clickOnCompanyExpandBtn() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 5000)");
		  Thread.sleep(1000);
		  driver.findElement(companyExpand).click();
	  }
	  
	  public String getTaskRecurringStatus() {
		  driver.navigate().refresh();
		  return driver.findElement(By.xpath("//a[contains(.,'Important Work')]")).getText();
		  
	  }
	  
	  public void filterTaskRecurring() throws InterruptedException {
		  driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[3]/div[2]/div[3]/div[1]/div[2]/a[2]")).click();
		  WebElement company= driver.findElement(By.xpath("//select[@id='company']"));
		  Thread.sleep(2000);
		  company.click();
		  Select c = new Select(company);
		  c.selectByVisibleText("Toyota Pvt Ltd");
		  company.click();
		  Thread.sleep(1000);
		  WebElement task = driver.findElement(By.xpath("//select[@id='task']"));
		  Thread.sleep(1000);
		  task.sendKeys(Keys.RETURN);
		  Thread.sleep(1000);
		  Select t = new Select(task);
		  Thread.sleep(1000);
		  t.selectByVisibleText("Important Wrok");
		  task.sendKeys(Keys.RETURN);

		  driver.findElement(By.xpath("//input[@value='Filter']")).click();
	  }
	  
	  public void clickOnFilteredCompany() {
		  driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[1]/p/span/i")).click();
	  }
	  
	  public String getFilteredTaskRecurringStatus() {
		  driver.navigate().refresh();
		  return driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[2]/div[2]/div[3]/div[3]/div[2]/div/a")).getText();
		  
	  }
	  
	  
	  public void clickonTask() throws InterruptedException {
	    	 driver.navigate().refresh();
	    	 driver.findElement(By.xpath("//a[contains(.,'Important Work')]")).click();
	    	 Thread.sleep(1000);
	     }
	  
	  public void UpdateFieldsInAddTaskPopup(String taskName, String date) throws InterruptedException  {
	    	 try {
	    	WebElement task = driver.findElement(taskname);
	    	task.clear();
	    	task.sendKeys(taskName);
	 		Select testing = new Select(driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/select[1]")));
	 		testing.selectByIndex(1);
	 		Select repeatfield = new Select(driver.findElement(By.xpath("//select[@id='repeat_task']")));
	 		repeatfield.selectByIndex(1);
	 		driver.findElement(By.xpath("//h2[contains(text(),'Test Company')]")).click();

	 		driver.findElement(updateButton).sendKeys(Keys.RETURN);
	 		
	 		Thread.sleep(1000);
	 		}
	 	
	 		catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	    	 
	 		
	 		
	 	}
	  
	  
	  public String gettaskStatusCompanyTaskRecurringTab() throws InterruptedException 
	     {
	    	 Thread.sleep(1000);
	    	 return driver.findElement(By.xpath("//a[contains(text(),'Very Important Work')]")).getText();
	     }
	  
	  public void clickRecurringTab() {
		  driver.findElement(By.xpath("//a[contains(text(),'Recurring')]")).click();
	  }
	  
	  public void EditTaskDetails(String taskname) {
	    	 driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[1]/td[4]/a[1]")).click();
	    	WebElement task = driver.findElement(By.xpath("//input[@id='task_task_name']"));
	    	task.clear();
	    	task.sendKeys(taskname);
	    	 driver.findElement(By.xpath("//*[@id=\"company_task_modal_body\"]/form/div[2]/input")).click();
	    	 driver.navigate().refresh();
	    	 
	     }
	  
	  public String getEditTaskStatus() {
	    	 return driver.findElement(By.xpath("//a[contains(text(),'Very very Important Work')]")).getText();
	     }
	  
	  public void deleteTask() throws InterruptedException {
	    	 driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[1]/td[4]/a[2]")).click();
	    	 Thread.sleep(1000);
	    	 driver.switchTo().alert().accept();
	     }
	     
	  
	  public void deletecompanyCompanyPage() throws InterruptedException {
		  	driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Test Company");
		  	driver.findElement(By.xpath("//i[@class='fa-solid fa-search']")).click();
	 		driver.findElement(By.xpath("//td[@class='act-btn']//a[@data-turbo-method='delete']")).click();
	 		Thread.sleep(1000);
	 		driver.switchTo().alert().accept();
	 	}
	 	
	 public void clickLogoutBtn() {
		 driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
	 }
	 
	 public boolean getApplicationLoginPage() {
		 return driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/form[1]/a[1]/img[1]")).isDisplayed();
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
			
	 
	 public String getCompanyDeleteMSg() {
		 return driver.findElement(By.xpath("//span[contains(.,'Company was successfully deleted.')]")).getText();
	 }
		 
	 public void clickOnUserse() throws InterruptedException {
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//p[contains(text(),'Automate Test Admin')]")).click();
		 
	 }
	 
		public void clickSettingTab() {
			driver.findElement(By.xpath("//a[@href=\"/settings\"]")).click();
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
		
		public void clickOnCompany() {
			driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
			driver.navigate().refresh();
			WebElement clickOnCompany = driver.findElement(By.xpath("//a[contains(text(),'Test Company')]"));
			clickOnCompany.click();
			
		}
		
		public void click_Detils_Tab()
		{
			driver.findElement(By.xpath("//a[contains(.,'Details')]")).click();
		}
		
		public String getStaffMemeberStatus() {
			return driver.findElement(By.xpath("//a[contains(text(),'Test admin')]")).getText();
					
		}
		public void clickTasksTemplateTab() {
			driver.findElement(By.xpath("//ul[@id='tabs-nav']//a[@href='/task_templates']")).click();
		}

		public void clickCreateTemplateBtn() {
			driver.findElement(By.xpath("//a[@class='btn-ed fl-btn']")).click();
		}
		
		public void enterNameInCreateTemplatePopup(String str) {
			driver.findElement(By.xpath("//input[@id='task_template_name']")).sendKeys(str);
		}
		public void clickAddBtnOfCreateTemplatePopup() {
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

		}
		
		public String getActTempName() {

			String str = driver.findElement(By.xpath("//a[text()='Qa automation template']")).getText();
			return str;
		}
		
		public String getMsgAfterCreatedTaskTemplate() {
			return driver.findElement(By.xpath("//*[contains(text(),'Task Template was created successfully.')]")).getText();
			
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
		
		public void clickCreatedTemplateLink() {
			driver.findElement(By.xpath("//a[text()='Qa automation template']")).click();

		}
		
		public void clickOnDeleteBtnOfTemplate() throws InterruptedException {
			driver.findElement(By.xpath("//a[@class='delete-btn']")).click();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();

		}
		
		public String getDeleteTaskTemplate() throws InterruptedException {
			Thread.sleep(1000);
		return driver.findElement(By.xpath("//span[text()='Task Template was deleted successfully.']")).getText();
		}
		

		
}
