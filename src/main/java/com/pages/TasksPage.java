package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class TasksPage {
	private WebDriver driver;

	private By clickOnTasks = By.xpath("//span[contains(text(),'Tasks')]");
	private By clickReoccuringTab = By.xpath("//body/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
	//private By addTaskButton = By.xpath("//body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]");
	//private By selectCompany = By.xpath("//select[@id='company-select-options']");
	private By selectTaskTemplate = By.xpath("//select[@id='task_task_template_id']");
	private By taskname = By.xpath("//input[@id='task_task_name']");
	private By assignTo = By.xpath("//select[@id='assigned-to-select']");
	private By client = By.xpath("//select[@id='client-to-select']");
	private By taskRepeat = By.xpath("//select[@id='repeat_task']");
	private By taskrepeatEvery = By.xpath("//div[@id='daily-options']");
	private By updateButton = By.xpath("//input[@value='Update']");
	private By searchCompany = By.xpath("//input[@id='searchInput']");
	private By taskTemplateTab = By.xpath("//ul[@id='tabs-nav']//a[@href='/task_templates']");
	private By createTemplateBtn = By.xpath("//a[@class='btn-ed fl-btn']");
	private By nameFieldOfTaskTemplatePopUp = By.xpath("//input[@id='task_template_name']");
	private By addBtnOfCreateTemplatePopup = By.xpath("//input[@class='btn btn-primary']");
	private By newTemplateNameCreated = By.xpath("//a[text()='Qa automation template']");
	private By newSectionNameCreated = By.xpath("//span[text()='QA One']");
	private By addSectionBtn = By.xpath("//a[@class='btn-ed'][1]");
	private By detailFieldOfAddSectionPopUp = By.xpath("//input[@id='section_detail']");
	private By deleteBtnTemplate = By.xpath("//a[@class='delete-btn']");
	private By UsersTabLink = By.xpath("//span[contains(text(),'Users')]");
	private By companyDropdownTasks = By.xpath("//select[@id='company_ids']");
	private By clickAddBtn = By.xpath("//input[@value='Add']");
	private By clickCompany = By.xpath("//a[contains(text(),'Test Company')]");
	private By addTaskPopupTitleStatus =By.xpath("//h5[@id='newCompanyTaskModalLabel']");
	private By errorMsgTaskName= By.xpath("//span[contains(text(),\"Task name can't be blank.\")]");
	private By errorMsgusersname=By.xpath("//span[contains(text(),\"Assigned to can't be blank\")]");
	private By errorMsgClient=By.xpath("//span[contains(text(),'Client must exist')]");
	private By errorStartDate=By.xpath("//span[contains(text(),\"Start date can't be blank.\")]");
	private By closeTaskPopup= By.xpath("//*[@id=\"add-task\"]/div/div/div[1]/button");
	private By closeTaskPopupSuccess=By.xpath("//body/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
//	private By selectUser= By.xpath("//p[contains(text(),'Test admin')]");
	private By addcompanyButton= By.xpath("//a[contains(.,'Add Companies')]");
	private By taskReccuringCompanyStatus =By.xpath("//p[contains(.,'Test Company')]");
	private By taskRecurringAddTaskPopupTitle=By.xpath("//h5[@id='newCompanyTaskModalLabel']");
	private By taskStartDate=By.xpath("//input[@placeholder='Start Date'][2]");
	private By expandCompanyTaskBtn=By.xpath("//*[@id=\"section_1\"]/p/span");
	private By getTaskRecurringStatus=By.xpath("//a[contains(text(),'Important Work')]");
	private By companyTaskRecurringTab= By.xpath("//a[contains(text(),'Recurring')]");
	private By selectTemplate= By.xpath("//div[1]/div/div[2]/div//select[@class=\"form-control form-select\"]");
	private By updateTaskRecurringTask=By.xpath("//a[contains(text(),'Very Important Work')]");
	private By searchBtn=By.xpath("//i[@onclick=\"document.getElementById('searchForm').submit();\"]");
	private By getFilteredCompnayStatus =By.xpath("//p[contains(.,'Test Company')]");
	private By MyTaskTab= By.xpath("//a[contains(.,'My Task')]");
	private By selectAssign = By.xpath("//select[@id='MyTask']");
	
	
	public TasksPage(WebDriver driver) {
		this.driver = driver;
	}

	public String CompaniesPageURL() throws InterruptedException {
		Thread.sleep(2000);
		String str = driver.getCurrentUrl();		
		return str;

	}

	public void tasksSidebarMenu() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(clickOnTasks).click();
	}

	public String TasksPageURL() {
		String str = driver.getCurrentUrl();
		return str;
	}
	

	public void clickTasksReoccuringTab() {
		driver.findElement(clickReoccuringTab).click();
	}

	public void clickTasksTemplateTab() {
		driver.findElement(taskTemplateTab).click();
	}

	public void clickCreateTemplateBtn() {
		driver.findElement(createTemplateBtn).click();
	}

	public String tasksTemplatePageURL() {
		String str = driver.getCurrentUrl();
		return str;
	}

	public String tasksReoccuringPageURL() throws InterruptedException {
		Thread.sleep(2000);
		String str = driver.getCurrentUrl();
		return str;
	}

	public void click_AddTask_Button() {
		driver.findElement(By.xpath("//a[contains(.,'Add Task')]")).click();	
	}

	public boolean getAddTaskPopupTitleStatus() {
		return driver.findElement(addTaskPopupTitleStatus).isDisplayed();
	}

	public void clickAddButton() {
		driver.findElement(clickAddBtn).click();

	}

	public String tasksNameErrorMsg() {
		String str = driver.findElement(errorMsgTaskName).getText();
		return str;
	}

	public void enterNameInCreateTemplatePopup(String str) {
		driver.findElement(nameFieldOfTaskTemplatePopUp).sendKeys(str);
	}

	public void enterNameInAddSectionPopup(String str) {
		driver.findElement(detailFieldOfAddSectionPopUp).sendKeys(str);
	}

	public void clickAddBtnOfCreateTemplatePopup() {
		driver.findElement(addBtnOfCreateTemplatePopup).click();

	}

	public void clickAddBtnOfCreateSectionPopup() {
		driver.findElement(addBtnOfCreateTemplatePopup).click();

	}

	public void clickCreatedTemplateLink() {
		driver.findElement(newTemplateNameCreated).click();

	}

	public void clickOnDeleteBtnOfTemplate() throws InterruptedException {
		driver.findElement(deleteBtnTemplate).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

	}
	
	public String getDeleteTaskTemplate() throws InterruptedException {
		Thread.sleep(1000);
	return driver.findElement(By.xpath("//span[text()='Task Template was deleted successfully.']")).getText();
	}

	public void clickOnAddSectionBtn() {
		driver.findElement(addSectionBtn).click();

	}

	public String getActTempName() {

		String str = driver.findElement(newTemplateNameCreated).getText();
		return str;
	}
	
	public String getMsgAfterCreatedTaskTemplate() {
		return driver.findElement(By.xpath("//*[contains(text(),'Task Template was created successfully.')]")).getText();
		
	}

	public String getActSecName() {

		String str = driver.findElement(newSectionNameCreated).getText();
		return str;
	}

	public String assigntoErrorMsg() {
		String str = driver.findElement(errorMsgusersname).getText();
		return str;
	}

	public String clientErrorMsg() {
		String str = driver.findElement(errorMsgClient).getText();
		return str;
	}

	public String startDateErrorMsg() {
		String str = driver.findElement(errorStartDate).getText();
		return str;
	}

	public void clickCloseIcon() {
		driver.findElement(closeTaskPopup).click();

	}

	public boolean closeAddTaskPopup() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(closeTaskPopupSuccess).isDisplayed();

	}

	public void usersSidebarMenu() {
		driver.findElement(UsersTabLink).click();

	}

	public void selectCompany(String company) throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Search user']")).sendKeys("Arjay McCann");
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[3]/div[1]/div/div[1]/form/div/button[2]/i")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(addcompanyButton).click();
		WebElement uc = driver.findElement(companyDropdownTasks);
		Select c = new Select(uc);
		Thread.sleep(1000);
		c.selectByVisibleText(company);
		driver.findElement(clickAddBtn).click();
		Thread.sleep(1000);
	}

	public String getCompanyStatusTaskReocurringPage() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(taskReccuringCompanyStatus).getText();
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
			driver.findElement(taskStartDate).click();
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

		driver.findElement(expandCompanyTaskBtn).click();
	}

	public String getTaskStatus() throws InterruptedException {
	//	driver.findElement(expandCompanyTaskBtn).click();
		Thread.sleep(1000);
		return driver.findElement(getTaskRecurringStatus).getText();
	}

	public void clickonTask() throws InterruptedException {

		
//		driver.navigate().refresh();
		
		driver.findElement(getTaskRecurringStatus).click();
		Thread.sleep(1000);
	}

	public boolean getCompanyStatus() {
		return driver.findElement(companyTaskRecurringTab).isDisplayed();
	}

	public void UpdateFieldsInAddTaskPopup(String taskName, String temp, String date) throws InterruptedException {
		try {
			WebElement task = driver.findElement(taskname);
			task.clear();
			task.sendKeys(taskName);
			Select template = new Select(driver.findElement(selectTemplate));
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
			
			driver.findElement(updateButton).sendKeys(Keys.RETURN);

			Thread.sleep(1000);
		}

		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String gettaskStatusCompanyTaskRecurringTab() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(updateTaskRecurringTask).getText();
	}

	public void searchcompany(String company) {
		WebElement search = driver.findElement(searchCompany);
		search.sendKeys(company);
		driver.findElement(searchBtn).click();
	}

	public String getSearchCompanyStatus() {
		return driver.findElement(getFilteredCompnayStatus).getText();
	}

	public void clickReoccurringTab() {
		driver.findElement(By.xpath("//a[contains(text(),'Recurring')]")).click();

	}

	public void EditTaskDetails(String taskname) {
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[2]/td[4]/a[1]")).click();
		WebElement task = driver.findElement(By.xpath("//input[@id='task_task_name']"));
		task.clear();
		task.sendKeys(taskname);
		driver.findElement(By.xpath("//*[@id=\"company_task_modal_body\"]/form/div[2]/input")).click();

	}

	public boolean getEditTaskStatus() {
		return driver.findElement(By.xpath("//a[contains(text(),'Very Important Work')]")).isDisplayed();
	}

	public void enterFieldsInAddTaskPopupForFilter(String template, String taskName,String assignee, String clien, String date) {
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
			driver.findElement(taskStartDate).click();
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


	public void filteredTask(String taskname,String assign) {
		try {
		driver.findElement(By.xpath("//thead/tr[1]/th[4]/a[1]/*[1]")).click();
		Select task = new Select(driver.findElement(By.xpath("//select[@id='task_id']")));
	
			Thread.sleep(1000);
		
		task.selectByVisibleText(taskname);
		Select assignTo = new Select(driver.findElement(By.xpath("//select[@id='user_id']")));
		assignTo.selectByVisibleText(assign);
		driver.findElement(By.xpath("//input[@value='Filter']")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean getFilteredTaskStatus() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody")).isDisplayed();
	}

	public void deleteTask() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[2]/td[4]/a[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[1]/td[4]/a[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	public void clickOnCompany() {
		driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
		driver.navigate().refresh();
		WebElement clickOnCompany = driver.findElement(clickCompany);
		clickOnCompany.click();
		
	}
	public void tasksPage() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tabs-nav\"]/li[4]/a")).click();
		Thread.sleep(1000);
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
		driver.findElement(By.xpath("//input[@value='Thursday']")).click();
		driver.findElement(By.xpath("//div[@class='form-control daily-weekly-repeat']")).click();
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	


public void createNextWeekAndLaterTask(String task, String name,  String assign, String company, String repitation, String date) throws InterruptedException {
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
	
	public String viewTask() {
		return driver.findElement(By.xpath("//a[contains(text(),'Task12')]")).getText();
	}
	
	public String viewTaskweek() {
		return driver.findElement(By.xpath("//a[contains(text(),'Task12')]")).getText();
	}
	
	public String viewTaskNextweek() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//a[contains(text(),'Task12')]")).getText();
	}
	
	public String viewTaskLaterweek() {
		return driver.findElement(By.xpath("//a[contains(text(),'Task12')]")).getText();
	}
	
	public void clickMyTaskTab() {
		driver.findElement(MyTaskTab).click();
	}
	 
	public void SelectUserAssignee(String assignee) throws InterruptedException  {
		Thread.sleep(1000);
		Select assign = new Select(driver.findElement(selectAssign));
		assign.selectByVisibleText(assignee);
	}
	
	public String getTodayTaskStatus() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		return driver.findElement(By.xpath("//a[contains(@href, '/tasks?val=Today')]//h1")).getText();
	}
	
	public void deleteTaskForMytask() throws InterruptedException {
		driver.findElement(By.xpath("//a[@data-turbo-method='delete']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	public String getTodayTaskStatusAfterDelete() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		return driver.findElement(By.xpath("//a[contains(@href, '/tasks?val=Today')]//h1")).getText();
	}
	
	public String getThisWeekTaskStatus() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		return driver.findElement(By.xpath("//a[contains(@href, '/tasks?val=This+Week')]//h1")).getText();
		
	}
	
	public String getThisWeekTaskStatusAfterDelete() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		return driver.findElement(By.xpath("//a[contains(@href, '/tasks?val=This+Week')]//h1")).getText();
	}
	
	public String getNextWeekTaskStatus() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		return driver.findElement(By.xpath("//a[contains(@href, '/tasks?val=Next+Week')]//h1")).getText();
		
	}
	
	public String getNextWeekTaskStatusAfterDelete() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		return driver.findElement(By.xpath("//a[contains(@href, '/tasks?val=Next+Week')]//h1")).getText();
	}
	
	public String getLaterTaskStatus() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		return driver.findElement(By.xpath("//a[contains(@href, '/tasks?val=Later')]//h1")).getText();
		
	}
	
	public String getLaterTaskStatusAfterDelete() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		return driver.findElement(By.xpath("//a[contains(@href, '/tasks?val=Later')]//h1")).getText();
	}
	
	public void clickOnTemplate() {
		driver.findElement(newTemplateNameCreated).click();
	}
	
	public void addsection(String section) {
		driver.findElement(By.xpath("//a[contains(.,'Add Section')]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Detail\"]")).sendKeys(section);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
	}
	
	public String getCreateSectionStatus(){
		return driver.findElement(By.xpath("//h3[contains(text(),'TASK01')]")).getText();
	}
	
	public String getCreateSectionStatusMsg(){
		return driver.findElement(By.xpath("//*[contains(text(),'Section was successfuly created.')]")).getText();
	}
	
	
	public void createSubTask(String subtask) {
		
		driver.findElement(By.xpath("//a[contains(.,'Add Task')]")).click();
		driver.findElement(By.xpath("//input[@id='sub_task_name']")).sendKeys(subtask);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
	}
	
	public String verifySubTaskStatus() {
		return driver.findElement(By.xpath("//label[contains(text(),'TASK01-01')]")).getText();
	}
	
	public String verifyCreateSubTaskMsg() {
		return driver.findElement(By.xpath("//*[contains(text(),'Sub Task was successfully created.')]")).getText();
	}
	
	public void updateSubTask(String subTaskNote) {
		driver.findElement(By.xpath("//label[contains(text(),'TASK01-01')]")).click();
		driver.findElement(By.xpath("//trix-editor[@id='sub_task_detail']")).sendKeys(subTaskNote);
		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
	}
	
	public String getSubTaskUpdateStatus() {
		return driver.findElement(By.xpath("//*[contains(text(),'Sub Task was successfully updated.')]")).getText();
	}
	public String getTAskRecurringStatus() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//*[contains(text(),'Task was successfully created.')]")).getText();
	}
	
	public String getUpdateRecurringTaskStatus() {
		return driver.findElement(By.xpath("//*[contains(text(),'Task was successfully updated.')]")).getText();
	}
	
	
	public void editsubtask(String subtask) {
		driver.findElement(By.xpath("//label[contains(text(),'TASK01-01')]")).click();
		driver.findElement(By.xpath("//*[@id=\"tab02\"]/div[2]/div/ul/li/div[2]/div/div/div/form/span/a[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Task Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Task Name']")).sendKeys(subtask);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
	}
		
	
	public String getUpdateSubTaskStatus() {
		return driver.findElement(By.xpath("//label[contains(text(),'TASK01-00')]")).getText();
	}
	
	
	
	public void deleteSubTask() throws InterruptedException {
		driver.findElement(By.xpath("//label[contains(text(),'TASK01-00')]")).click();

		driver.findElement(By.xpath("//*[@id=\"tab02\"]/div[2]/div/ul/li/div[2]/div/div/div/form/span/a[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	
	public String getdeleteSubTaskStatus() {
		return driver.findElement(By.xpath("//span[contains(.,'Sub Task was successfully deleted.')]")).getText();
	}
	
	public void editTask(String task) {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/div/ul/li/div[1]/span/a[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Detail']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Detail']")).sendKeys(task);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}
	
	public String updateTaskStatus() {
		return driver.findElement(By.xpath("//span[contains(text(),'QA Two')]")).getText();
	}
	
	public void deleteTaskOfTaskTemplate() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/div/ul/li/div[1]/span/a[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	public String getDeleteSectionStatus() {
		return driver.findElement(By.xpath("//span[contains(.,'Section was successfully deleted.')]")).getText();
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








