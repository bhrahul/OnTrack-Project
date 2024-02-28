package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import com.pages.LoginPage;
import com.pages.TasksPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class TasksSteps {

	DriverFactory driverFactory;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private TasksPage tasksPage;

	@Given("User has already logged in to application for the tasks page")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
		List<Map<String, String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("username");
		String passWord = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://beta.cisin.com:4991/users/sign_in");
		tasksPage = loginPage.loginForTasks(userName, passWord);

	}

	@And("User is on Companies page url {string} for the tasks page")
	public void user_is_on_companies_page(String acUrl) throws InterruptedException {
		String expUrl = tasksPage.CompaniesPageURL();
		Assert.assertEquals(expUrl, acUrl);
	}

	@When("user should be click on Tasks at sidebar menu")
	public void user_should_be_click_on_tasks_at_sidebar_menu() throws InterruptedException {
		tasksPage.tasksSidebarMenu();
		Thread.sleep(1000);
	}

	@Then("{string} user should be on Task page url")
	public void user_should_be_on_task_page_url_https_beta_cisin_com_tasks(String acUrl) {
		String expUrl = tasksPage.TasksPageURL();
		Assert.assertEquals(expUrl, acUrl);
	}

	@When("user should be able to select company in the company page for the task page")
	public void user_should_be_able_to_select_company_in_the_company_page_for_the_task_page()
			throws InterruptedException {
		tasksPage.clickOnCompany();
		Thread.sleep(1000);
	}

	@When("user should be on tasks page for the task page")
	public void user_should_be_on_tasks_page_for_the_task_page() throws InterruptedException {
		tasksPage.tasksPage();

	}

	@When("user should be click on Add tasks button in the tasks page for the task page")
	public void user_should_be_click_on_add_tasks_button_in_the_tasks_page_for_the_task_page() {
		tasksPage.click_AddTask_Button();
	}

	@When("user should be able to create task in the tasks page for the task page")
	public void user_should_be_able_to_create_task_in_the_tasks_page_for_the_task_page(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> TaskInfo = dataTable.asMaps();
		String tt = TaskInfo.get(0).get("task template");
		String name = TaskInfo.get(0).get("name");
		String assign = TaskInfo.get(0).get("assign");

		String company = TaskInfo.get(0).get("company");
		String taskrepeat = TaskInfo.get(0).get("taskrepeat");
		String date = TaskInfo.get(0).get("date");

		tasksPage.createTask(tt, name, assign, company, taskrepeat, date);
	}

	@Then("user should be see the task in the tasks page for the task page{string}")
	public void user_should_be_see_the_task_in_the_tasks_page_for_the_task_page_feb_task12(String ext) {
		String act = tasksPage.viewTask();
		Assert.assertEquals(act, ext);
	}
	
	@Then("user should be see the task in the tasks page for the week task page{string}")
	public void user_should_be_see_the_task_in_the_tasks_page_for_the_week_task_page_feb_task12(String ext) {
		String act = tasksPage.viewTaskweek();
		Assert.assertEquals(act, ext);
	}
	
	
	@When("user should be able to create next week task in the tasks page for the task page")
	public void user_should_be_able_to_create_next_week_task_in_the_tasks_page_for_the_task_page(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> TaskInfo = dataTable.asMaps();
		String tt = TaskInfo.get(0).get("task template");
		String name = TaskInfo.get(0).get("name");
		String assign = TaskInfo.get(0).get("assign");

		String company = TaskInfo.get(0).get("company");
		String taskrepeat = TaskInfo.get(0).get("taskrepeat");
		String date = TaskInfo.get(0).get("date");

		tasksPage.createNextWeekAndLaterTask(tt, name, assign, company, taskrepeat, date);
	}



	
	
	@Then("user should be see the task in the tasks page for the next week task page{string}")
	public void user_should_be_see_the_task_in_the_tasks_page_for_the_next_week_task_page_feb_task12(String ext) throws InterruptedException {
		String act = tasksPage.viewTaskNextweek();
		Assert.assertEquals(act, ext);
	}

	@Then("user should be see the task in the tasks page for the later week task page{string}")
	public void user_should_be_see_the_task_in_the_tasks_page_for_the_later_week_task_page_feb_task12(String ext) {
		String act = tasksPage.viewTaskLaterweek();
		Assert.assertEquals(act, ext);
	}

	@And("user should be click on tasks template tab")
	public void user_should_be_able_to_click_on_tasks_template_tab() throws InterruptedException {
		tasksPage.clickTasksTemplateTab();
		Thread.sleep(1000);
	}

	@And("user should be click on create template button")
	public void user_should_be_click_on_create_template_button() throws InterruptedException {
		tasksPage.clickCreateTemplateBtn();
		Thread.sleep(1000);
	}

	@And("user should be enter the {string} in the name field at add task template pop up")
	public void user_should_be_enter_the_in_the_name_field_at_add_task_template_pop_up(String tempName) {
		tasksPage.enterNameInCreateTemplatePopup(tempName);

	}

	@And("user should be click on add button of task template popup")
	public void user_should_be_click_on_add_button_of_task_template_popup() throws InterruptedException {
		tasksPage.clickAddBtnOfCreateTemplatePopup();
		Thread.sleep(1000);
	}

	@And("user should click on QA Automation Template link")
	public void user_should_click_on_QA_Automation_Template_link() {
		tasksPage.clickCreatedTemplateLink();

	}

	@And("user should click on delete button at the QA Automation Template Page to delete the template")
	public void user_should_click_on_delete_button_at_the_QA_Automation_Template_Page_to_delete_the_template()
			throws InterruptedException {
		tasksPage.clickOnDeleteBtnOfTemplate();

	}
	
	@Then("user should able to delete QA Automation Template Successfully{string}")
	public void user_should_able_to_delete_qa_automation_template_successfully_task_template_was_deleted_successfully(String ext) throws InterruptedException {
	   String act = tasksPage.getDeleteTaskTemplate();
	   Assert.assertEquals(act, ext);
	}

	@And("user should click on add section button")
	public void user_should_click_on_add_section_button() throws InterruptedException {
		tasksPage.clickOnAddSectionBtn();

	}

	@And("user should be enter the {string} in the name field at add section pop up")
	public void user_should_be_enter_the_in_the_name_field_at_add_section_pop_up(String secName) {
		tasksPage.enterNameInAddSectionPopup(secName);

	}

	@And("user should be click on add button of create section popup")
	public void user_should_be_click_on_add_button_of_create_section_popup() throws InterruptedException {
		tasksPage.clickAddBtnOfCreateSectionPopup();
		Thread.sleep(1000);
	}

	@Then("user should be able to see the section {string} inside the created template page")
	public void user_should_be_able_to_see_the_section_inside_the_created_template_page(String actTempName) {
		String expTempName = tasksPage.getActSecName();
		Assert.assertEquals(expTempName, actTempName);

	}

	@Then("user should be able to see the template {string} at template page")
	public void user_should_be_able_to_see_the_template_at_template_page(String actTempName) {
		String expTempName = tasksPage.getActTempName();
		Assert.assertEquals(expTempName, actTempName);

	}
	
	@Then("user should be able to see valdation message of created template{string}")
	public void user_should_be_able_to_see_valdation_message_of_created_template_task_template_was_created_successfully(String ext) {
	   String act = tasksPage.getMsgAfterCreatedTaskTemplate();
	   Assert.assertEquals(act, ext);
	}

	@And("user should be able to click on tasks reoccurring tab")
	public void user_should_be_able_to_click_on_tasks_reoccurring_tab() throws InterruptedException {
		tasksPage.clickTasksReoccuringTab();
		Thread.sleep(1000);
	}

	@Then("{string} user should be on Template page of task module url")
	public void user_should_be_on_template_page_of_task_module_url(String acUrl) throws InterruptedException {
		String expUrl = tasksPage.tasksReoccuringPageURL();
		Assert.assertEquals(expUrl, acUrl);
	}

	@Then("{string} user should be on Task reoccuring page url")
	public void user_should_be_on_task_reoccuring_page_url(String acUrl) {
		String expUrl = tasksPage.tasksTemplatePageURL();
		Assert.assertEquals(expUrl, acUrl);
	}

	@And("user should be able to click on add task button in the tasks reoccuring page")
	public void user_should_be_able_to_click_on_add_task_button() throws InterruptedException {
		tasksPage.click_AddTask_Button();
		Thread.sleep(1000);
	}

	@Then("user should be able to see add task popup in the tasks reoccuring page")
	public void user_should_be_able_to_see_add_task_popup_in_the_tasks_reoccuring_page() {
		tasksPage.getAddTaskPopupTitleStatus();
	}

	@And("user should be able to click on add button at add task popup")
	public void user_should_be_able_to_click_add_button_at_add_task_popup() {
		tasksPage.clickAddButton();
	}

	@Then("User should see an validation message on task name field {string}")
	public void user_should_see_an_validation_message_on_task_name_field(String act) {
		String exp = tasksPage.tasksNameErrorMsg();
		Assert.assertEquals(exp, act);

	}

	@Then("User should see an validation message on Asigned To field {string}")
	public void user_should_see_an_validation_message_on_asigned_to_field(String act) {
		String exp = tasksPage.assigntoErrorMsg();
		Assert.assertEquals(exp, act);

	}

	@Then("User should see an validation message on client field {string}")
	public void user_should_see_an_validation_message_on_client_field(String act) {
		String exp = tasksPage.clientErrorMsg();
		Assert.assertEquals(exp, act);
	}

	@Then("User should see an validation message on start date field {string}")
	public void user_should_see_an_validation_message_on_start_date_field(String act) {
		String exp = tasksPage.startDateErrorMsg();
		Assert.assertEquals(exp, act);
	}

	@And("user should be able to click on close icon at add task popup")
	public void user_should_be_able_to_click_on_close_icon_at_add_task_popup() {
		tasksPage.clickCloseIcon();
	}

	@Then("user should be able to close  add task popup successfully in the tasks reocurring page")
	public void user_should_be_able_to_close_add_task_popup_successfully_in_the_tasks_reocurring_page() throws InterruptedException {
		tasksPage.closeAddTaskPopup();
	}

	@And("user should be click on Users at sidebar menu for the task page")
	public void user_should_be_click_on_users_at_sidebar_menu() throws InterruptedException {
		tasksPage.usersSidebarMenu();
		Thread.sleep(1000);
	}

	@And("user is able to add company in the user contact page for the task page{string}")
	public void user_is_able_to_add_company_in_the_user_contact_page(String uc) throws InterruptedException {
		tasksPage.selectCompany(uc);
	}

	@Then("user should be able to see the company in the task reocurring tab after add company in the user at the user page.{string}")
	public void user_should_be_able_to_see_the_company_in_the_task_reocurring_tab_after_add_company_in_the_user_at_the_user_page(
			String ext) throws InterruptedException {
		String act = tasksPage.getCompanyStatusTaskReocurringPage();
		Assert.assertEquals(act, ext);
	}

	@And("user should be enter all fields of add task popup")
	public void user_should_be_enter_all_fields_of_add_task_popup(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> taskInfo = dataTable.asMaps();
		String template = taskInfo.get(0).get("task template");
		String taskName = taskInfo.get(0).get("taskname");
		String assign = taskInfo.get(0).get("assign");
		String client = taskInfo.get(0).get("client");
		String date = taskInfo.get(0).get("date");

		tasksPage.enterFieldsInAddTaskPopup(template, taskName, assign, client, date);
		Thread.sleep(1000);

	}

	@And("user should be able to see task after click on expand view button  in the tasks reoccuring page")
	public void user_should_be_able_to_see_task_after_click_on_expand_view_button_in_the_tasks_reoccuring_page() {
		tasksPage.clickExpandView();
	}

	@Then("user should see the task in the company of tasks reoccuring page{string}")
	public void user_should_see_the_task_in_the_company_of_tasks_reoccuring_page(String ext)
			throws InterruptedException {
		String act = tasksPage.getTaskStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user should be enter all fields of add task popup for filter")
	public void user_should_be_enter_all_fields_of_add_task_popupForFilter(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> taskInfo = dataTable.asMaps();
		String template = taskInfo.get(0).get("task template");
		String taskName = taskInfo.get(0).get("taskname");
		String assign = taskInfo.get(0).get("assign");
		String client = taskInfo.get(0).get("client");
		String date = taskInfo.get(0).get("date");

		tasksPage.enterFieldsInAddTaskPopupForFilter(template, taskName, assign, client, date);
		Thread.sleep(1000);

	}

	@And("user should be able to click on task of the company at tasks reoccurring page Important Task")
	public void user_should_be_able_to_click_on_task_of_the_company_at_tasks_reoccurring_page()
			throws InterruptedException {
		tasksPage.clickonTask();
	}

	@Then("user should be see the company name in the company task page")
	public void user_should_be_see_the_company_name_in_the_company_task_page() {
		tasksPage.getCompanyStatus();
	}

	@And("User should be able to update fields at recurring tab in the  company task tab")
	public void user_should_be_able_to_update_fields_at_recurring_tab_in_the_company_task_tab(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> taskInfo = dataTable.asMaps();
		String taskName = taskInfo.get(0).get("taskname");
		String template = taskInfo.get(0).get("template");
		String date = taskInfo.get(0).get("date");

		tasksPage.UpdateFieldsInAddTaskPopup(taskName, template, date);

	}

	@Then("user should be able to see the task recurring tab in the  company task tab{string}")
	public void user_should_be_able_to_see_the_task_recurring_tab_in_the_company_task_tab(String ext)
			throws InterruptedException {
		String act = tasksPage.gettaskStatusCompanyTaskRecurringTab();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to search company in the tasks reocurring page{string}")
	public void user_should_be_able_to_search_company_in_the_tasks_reocurring_page_amd(String company)
			throws InterruptedException {
		tasksPage.searchcompany(company);
		Thread.sleep(1000);
	}

	@Then("user should be able to see the company in the tasks reocurring page{string}")
	public void user_should_be_able_to_see_the_company_in_the_tasks_reocurring_page(String ext) {
		String act = tasksPage.getSearchCompanyStatus();
		Assert.assertEquals(act, ext);
	}

	@And("User should be able to search task by filter at recurring tab in the  company task tab")
	public void user_should_be_able_to_search_task_by_filter_at_recurring_tab_in_the_company_task_tab(DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> taskInfo = dataTable.asMaps();
		String taskName = taskInfo.get(0).get("taskname");
		String assign = taskInfo.get(0).get("assign");
		tasksPage.filteredTask(taskName,assign);
		Thread.sleep(1000);
	}

	@Then("user should be able to see the filtered task in the task of the company at tasks reoccurring page")
	public void user_should_be_able_to_see_the_filtered_task_in_the_task_of_the_company_at_tasks_reoccurring_page() throws InterruptedException {
		tasksPage.getFilteredTaskStatus();
	}

	@And("user should be able to clcik on task reoccurring tab at company task tab")
	public void user_should_be_able_to_clcik_on_task_reoccurring_tab_at_company_task_tab() {
		tasksPage.clickReoccurringTab();
	}

	@And("User should be able to edit fields in the edit task popup at recurring tab in the  company task tab{string}")
	public void user_should_be_able_to_edit_fields_at_recurring_tab_in_the_company_task_tab(String task) {
		tasksPage.EditTaskDetails(task);
	}

	@Then("user should be able to see the updated task in the task of the company at tasks reoccurring page")
	public void user_should_be_able_to_see_the_updated_task_in_the_task_of_the_company_at_tasks_reoccurring_page() {
		tasksPage.getEditTaskStatus();
	}

	@And("User should be able to delete task at recurring tab in the  company task tab")
	public void user_should_be_able_to_delete_task_at_recurring_tab_in_the_company_task_tab()
			throws InterruptedException {
		tasksPage.deleteTask();

	}

	@And("user should be click on my task tab")
	public void user_should_be_click_on_my_task_tab() {
		tasksPage.clickMyTaskTab();
	}
	
	@And("user should be able to select assign user at my task tab{string}")
	public void user_should_be_able_to_select_assign_user_at_my_task_tab(String assign) throws InterruptedException {
		Thread.sleep(1000);
	    tasksPage.SelectUserAssignee(assign);
	}
	
	@Then("user should be able to see users today task count at My task tab{string}")
	public void user_should_be_able_to_see_users_today_task_at_my_task_tab(String ext) throws InterruptedException {
		String act = tasksPage.getTodayTaskStatus();
		Assert.assertEquals(act, ext);
	}
	
	@And("user should be click on delete btn tasks button in the tasks for the task page")
	public void user_should_be_click_on_delete_btn_tasks_button_in_the_tasks_for_the_task_page() throws InterruptedException {
		tasksPage.deleteTaskForMytask();
	}

	
	@Then("user should be able to see users today task count after the delete task at My task tab{string}")
	public void user_should_be_able_to_see_users_today_task_count_after_the_delete_task_at_my_task_tab(String ext) throws InterruptedException {
		String act = tasksPage.getTodayTaskStatusAfterDelete();
		Assert.assertEquals(act, ext);
	}
	
	@Then("user should be able to see users week task count at My task tab{string}")
	public void user_should_be_able_to_see_users_week_task_at_my_task_tab(String ext) throws InterruptedException {
		String act = tasksPage.getThisWeekTaskStatus();
		Assert.assertEquals(act, ext);
	}
	
	@Then("user should be able to see users week task count after the delete task at My task tab{string}")
	public void user_should_be_able_to_see_users_week_task_count_after_the_delete_task_at_my_task_tab(String ext) throws InterruptedException {
		String act = tasksPage.getThisWeekTaskStatusAfterDelete();
		Assert.assertEquals(act, ext);
	}
	
	@Then("user should be able to see users next week task count at My task tab{string}")
	public void user_should_be_able_to_see_users_next_week_task_at_my_task_tab(String ext) throws InterruptedException {
		
		String act = tasksPage.getNextWeekTaskStatus();
		Assert.assertEquals(act, ext);
	}
	
	@Then("user should be able to see users next week task count after the delete task at My task tab{string}")
	public void user_should_be_able_to_see_users_next_week_task_count_after_the_delete_task_at_my_task_tab(String ext) throws InterruptedException {
		String act = tasksPage.getNextWeekTaskStatusAfterDelete();
		Assert.assertEquals(act, ext);
	}

	@Then("user should be able to see users later week task count at My task tab{string}")
	public void user_should_be_able_to_see_users_later_week_task_count_at_my_task_tab(String ext) throws InterruptedException {
		String act = tasksPage.getLaterTaskStatus();
		Assert.assertEquals(act, ext);
	}

	@Then("user should be able to see users later week task count after the delete task at My task tab{string}")
	public void user_should_be_able_to_see_users_later_week_task_count_after_the_delete_task_at_my_task_tab(String ext) throws InterruptedException {
		String act = tasksPage.getLaterTaskStatusAfterDelete();
		Assert.assertEquals(act, ext);
	}
	
	@When("user should be able to click on task template in the tasks page")
	public void user_should_be_able_to_click_on_task_template_in_the_tasks_page() {
	   tasksPage.clickOnTemplate();
	}

	@When("user should be able to add sections in the task page{string}")
	public void user_should_be_able_to_add_sections_in_the_task_page_task01(String section) {
	    tasksPage.addsection(section);
	}

	@Then("Sections should be displayed on task page{string}")
	public void sections_should_be_displayed_on_task_page_task01(String ext) {
	  String act = tasksPage.getCreateSectionStatus();
	  Assert.assertEquals(act, ext);
	}

	@Then("user should be able to create Section successfuly{string}")
	public void user_should_be_able_to_create_section_successfuly_section_was_successfuly_created(String ext) {
	   String act = tasksPage.getCreateSectionStatusMsg();
	   Assert.assertEquals(act, ext);
	}
	
	@When("user should be able to add sub task in the task page{string}")
	public void user_should_be_able_to_add_sub_task_in_the_task_page_task01(String subTask) {
	  tasksPage.createSubTask(subTask);
	}

	@Then("user should be able to see subtask in a task on task page{string}")
	public void user_should_be_able_to_see_subtask_in_a_task_on_task_page_task01(String ext) {
	    String act = tasksPage.verifySubTaskStatus();
	    Assert.assertEquals(act, ext);
	}

	@Then("user should be able to create sub task successfuly{string}")
	public void user_should_be_able_to_create_sub_task_successfuly_sub_task_was_successfully_created(String ext) {
	   String act = tasksPage.verifyCreateSubTaskMsg();
	   Assert.assertEquals(act, ext);
	}
	
	@And("user should be able to update sub task{string}")
	public void user_should_be_able_to_update_sub_task_important_work(String subTaskUpdate) {
	    tasksPage.updateSubTask(subTaskUpdate);
	}
	@Then("user shoule be able to update sub task successfully{string}")
	public void user_shoule_be_able_to_update_sub_task_successfully_sub_task_was_successfully_updated(String ext) {
	   String act = tasksPage.getSubTaskUpdateStatus();
	   Assert.assertEquals(act, ext);
	}

	@Then("user should be able to create recurring task successfully{string}")
	public void user_should_be_able_to_create_recurring_task_successfully_task_was_successfully_created(String ext) throws InterruptedException {
	   String act = tasksPage.getTAskRecurringStatus();
	   Assert.assertEquals(act, ext);
	}
	
	@And("user should be able to update recurring task successfully{string}")
	public void user_should_be_able_to_update_recurring_task_successfully_task_was_successfully_updated(String ext) {
	   String act = tasksPage.getUpdateRecurringTaskStatus();
	   Assert.assertEquals(act, ext);
	}
	
	@When("user should be able to edit sub task in the task page{string}")
	public void user_should_be_able_to_edit_sub_task_in_the_task_page_task01(String subtask) {
	  tasksPage.editsubtask(subtask);
	}

	@Then("user should be able to see update subtask in a task on task page{string}")
	public void user_should_be_able_to_see_update_subtask_in_a_task_on_task_page_task01(String ext) {
	    String act = tasksPage.getUpdateSubTaskStatus();
	    Assert.assertEquals(act, ext);
	}
	
	@When("user should be able to delete sub task in the task page")
	public void user_should_be_able_to_delete_sub_task_in_the_task_page() throws InterruptedException {
	    tasksPage.deleteSubTask();
	}

	@Then("user should able delete subtask successfully{string}")
	public void user_should_able_delete_subtask_successfully_sub_task_was_successfully_deleted(String ext) {
	   String act = tasksPage.getdeleteSubTaskStatus();
	   Assert.assertEquals(act, ext);
	}
	
	@When("user should be able to edit section{string}")
	public void user_should_be_able_to_edit_task_qa_two(String task) {
	   tasksPage.editTask(task);
	}

	@Then("user shoule be able to update section successfully{string}")
	public void user_shoule_be_able_to_update_task_successfully_qa_two(String ext) {
	   String act = tasksPage.updateTaskStatus();
	   Assert.assertEquals(act, ext);
	}
	
	@When("user should be able to delete section")
	public void user_should_be_able_to_delete_task() throws InterruptedException {
	    tasksPage.deleteTaskOfTaskTemplate();
	}

	@Then("user shoule be able to delete section successfully{string}")
	public void user_shoule_be_able_to_delete_task_successfully(String ext) {
	    String act = tasksPage.getDeleteSectionStatus();
	    Assert.assertEquals(act, ext);
	}

	@When("user should be click on user link on sidebar for the task")
	public void user_should_be_click_on_user_link_on_sidebar_for_the_task() {
	    tasksPage.clickOnUserLink();
	}

	@When("user should be click on add user button in the user page for the task")
	public void user_should_be_click_on_add_user_button_in_the_user_page_for_the_task() {
		tasksPage.clickOnAddUserButton();
	}

	@When("user should be enter fields for adding user in the user page for the task")
	public void user_should_be_enter_fields_for_adding_user_in_the_user_page_for_the_task(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> usersInfo = dataTable.asMaps();
		String fn = usersInfo.get(0).get("fullname");
		String t = usersInfo.get(0).get("title");
		String date = usersInfo.get(0).get("bdate");
		String role = usersInfo.get(0).get("role");
		String email = usersInfo.get(0).get("email");
		String sdate = usersInfo.get(0).get("sdate");
		tasksPage.enterFieldsForUsers(fn, t, date, role, email, sdate);
	}

	@Then("user should be able to see the user in the user page for the task{string}")
	public void user_should_be_able_to_see_the_user_in_the_user_page_for_the_task_automate_test_admin(String ext) {
		String act = tasksPage.getAddUserStatus();
		Assert.assertEquals(act, ext);

	}
	@When("user should be able to click on Settings for the task")
	public void user_should_be_able_to_click_on_settings_for_the_task() {
	   tasksPage.clickSettingTab();
	}

	@When("user should be able to click on add title button in staff title widget for the task")
	public void user_should_be_able_to_click_on_add_title_button_in_staff_title_widget_for_the_task() {
	    tasksPage.clickonAddTitleStaffTitleWidget();
	}

	@When("user should enter the title in add title popup of staff title widget for the task{string}")
	public void user_should_enter_the_title_in_add_title_popup_of_staff_title_widget_for_the_task_automate_admin(String title) {
	   tasksPage.enterTitleStaffTitleWidget(title);
	}

	@Then("user should be able to see the title on staff title widget for the task{string}")
	public void user_should_be_able_to_see_the_title_on_staff_title_widget_for_the_task_automate_admin(String ext) {
		String act = tasksPage.getAddTitleStatusStaffTitleWidget();
		Assert.assertEquals(act, ext);
	}

	@When("user should be able to select user in the user for the task{string}")
	public void user_should_be_able_to_select_user_in_the_user_for_the_task_automate_test_admin(String user) throws InterruptedException {
	    tasksPage.selectUser(user);
	}

	@When("user should be click on edit button in the user page for the task")
	public void user_should_be_click_on_edit_button_in_the_user_page_for_the_task() throws InterruptedException {
	    tasksPage.clickEditbutton();
	}

	@When("user should be delete the user in the user page for the task")
	public void user_should_be_delete_the_user_in_the_user_page_for_the_task() throws InterruptedException {
	    tasksPage.clickDeleteButtonUser();
	}

	@When("User should be able to delete title in staff title widget for the task")
	public void user_should_be_able_to_delete_title_in_staff_title_widget_for_the_task() throws InterruptedException {
	    tasksPage.deleteTitleStaffTitleWidget();
	}

	@Then("user should be able to delete contact title successfully in the staff title widget for the task{string}")
	public void user_should_be_able_to_delete_contact_title_successfully_in_the_staff_title_widget_for_the_task_title_was_successfully_deleted(String ext) {
		String act = tasksPage.deleteTitleSuccessfullyStaffTitleWidget();
		Assert.assertEquals(act, ext);
	}



}
