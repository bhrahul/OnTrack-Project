package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.pages.LoginPage;
import com.pages.UsersPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UsersSteps {

	DriverFactory driverFactory;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private UsersPage usersPage;

	@Given("User has already logged in to application for the users page")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
		List<Map<String, String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("username");
		String passWord = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://beta.cisin.com:4991/users/sign_in");
		usersPage = loginPage.loginForUsers(userName, passWord);

	}
	
	@When("user should be click on Users at sidebar menu")
	public void user_should_be_click_on_users_at_sidebar_menu() throws InterruptedException {
		   usersPage.usersSidebarMenu();
		   Thread.sleep(2000);
	}
	
	@And("user should be click on add user button in the user page")
	public void user_should_be_click_on_add_user_button_in_the_user_page() {
	   usersPage.clickAddUserBtn();
	}

	@Then("{string} user should be on Users page url")
	public void user_should_be_on_users_page_url(String acUrl) {
		String expUrl = usersPage.usersPageURL();
		Assert.assertEquals(expUrl, acUrl);
	}
	
	@And("user click on edit button")
	public void user_click_on_edit_button() throws InterruptedException {
	   usersPage.clickEditBtn();
	}
	
	@And("user able to search the user {string}")
	public void user_click_on_edit_button(String user) throws InterruptedException {
	   usersPage.searchUser(user);
	}
	
	@And("user should be click on Automate Test Admin user")
	public void user_should_be_click_on_final_check_user() {
	  usersPage.clickOnUserse();
	}

	
	@And("user clear the filed and enter the updates values in the fields")
	public void user_clear_the_filed_and_enter_the_updates_values_in_the_fields(io.cucumber.datatable.DataTable dataTable)  {
		List<Map<String, String>> companyInfo = dataTable.asMaps();
		String email = companyInfo.get(0).get("Email");
		usersPage.enterUsersInfo(email);
	}
	
	@And("user click on update button at edit user popup")
	public void user_click_on_add_button_at_edit_user_popup() throws InterruptedException  {
	   usersPage.clickUpdateBtnOfEditUserPopUP();
	}
	
	@Then("user should be able to see update email{string}")
	public void user_should_be_able_to_see_update_email_admin7758_mailinator_com(String ext) throws InterruptedException {
	  String act= usersPage.getUpdateEmailStatus();
	  Assert.assertEquals(act, ext);
	}

	
	@When("user should be clicked on AddContact button in the company page for the user page")
	public void user_should_be_clicked_on_add_contact_button_in_the_company_page_for_the_user_page() {
	   usersPage.clickedOnAddContactBtn();
	}

	@And("User should be clicked on Add Company button in the add contact popup of the company page for the user page")
	public void user_should_be_clicked_on_add_company_button_in_the_add_contact_popup_of_the_company_page_for_the_user_page() throws InterruptedException {
	   usersPage.clickOnAddCompanyBtn();
	}

	
	@And("User should be able to create the company for the user page")
	public void user_should_be_able_to_create_the_company_for_the_user_page(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> companyInfo = dataTable.asMaps();
		String cName = companyInfo.get(0).get("companyname");
		String pName = companyInfo.get(0).get("phonenumber");
	//	String ext = companyInfo.get(0).get("extention");
		String ws = companyInfo.get(0).get("website");
		String email = companyInfo.get(0).get("email");
		String ad = companyInfo.get(0).get("address");
		String city = companyInfo.get(0).get("city");
		String state = companyInfo.get(0).get("state");
		String zipCode = companyInfo.get(0).get("zipcode");
		String date = companyInfo.get(0).get("sdate");
		usersPage.enterCompanyInfo(cName, pName, ws, email, ad, city, state, zipCode, date);
		Thread.sleep(1000);
	}
	
	@And("user is able to add company in the user contact page{string}")
	public void user_is_able_to_add_company_in_the_user_contact_page(String uc) throws InterruptedException {
	  usersPage.selectCompany(uc);
	}

	@Then("user should be able to see the company in the user contact page{string}")
	public void user_should_be_able_to_see_the_company_in_the_user_contact_page_automate_user(String ext) {
	    String act = usersPage.getCompanyStatus();
	    Assert.assertEquals(act, ext);
	}

	@And("user able to search the user final check")
	public void user_click_on_edit_button_final_check(String user) throws InterruptedException {
	   usersPage.clickuser();
	}
	
	@And("user should be able to delete company in the user page")
	public void user_should_be_able_to_delete_company_in_the_user_page() throws InterruptedException {
	   usersPage.DeleteCompany();
	}

	
	@And("user should be able to delete the company from company page")
	public void user_should_be_able_to_delete_the_company_from_company_page() throws InterruptedException {
	   usersPage.deletecompany();
	}
	
	@And("user is able to add company in the user contact page for the task recurring{string}")
	public void user_is_able_to_add_company_in_the_user_contact_page_for_the_task_recurring(String uc) throws InterruptedException {
	  usersPage.selectCompanyTaskRecurring(uc);
	}
	
	@Then("user should be able to see the company in the user contact page for the task recurring{string}")
	public void user_should_be_able_to_see_the_company_in_the_user_contact_page_automate_user_for_the_task_recurring(String ext) {
	    String act = usersPage.getCompanyStatusForTheTaskRecurring();
	    Assert.assertEquals(act, ext);
	    
	}

	@And("user should be click on Tasks at sidebar menu for the user page")
	public void user_should_be_click_on_tasks_at_sidebar_menu_for_the_user_page() {
	   usersPage.tasksSidebarMenu();
	}

	@And("user should be able to click on tasks reoccurring tab for the user page")
	public void user_should_be_able_to_click_on_tasks_reoccurring_tab_for_the_user_page() throws InterruptedException {
		 usersPage.clickTasksReoccuringTab();
		   Thread.sleep(1000);
	}

	@And("user should be able to click on add task button in the tasks reoccuring page for the user page")
	public void user_should_be_able_to_click_on_add_task_button_in_the_tasks_reoccuring_page_for_the_user_page() throws InterruptedException {
		usersPage.click_AddTask_Button();
	    Thread.sleep(1000);
	}
	
	@And("user should be enter all fields of add task popup for the user page")
	public void user_should_be_enter_all_fields_of_add_task_popup_for_the_user_page(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> taskInfo = dataTable.asMaps();
		String template = taskInfo.get(0).get("task template");
		String taskName = taskInfo.get(0).get("taskname");
		String assign = taskInfo.get(0).get("assign");
		String client = taskInfo.get(0).get("client");
		String date = taskInfo.get(0).get("date");

		usersPage.enterFieldsInAddTaskPopup(template, taskName, assign, client, date);
		Thread.sleep(1000);
	}
	
	@And("user should be able to see task after click on expand view button  in the tasks reoccuring page for the user page")
	public void user_should_be_able_to_see_task_after_click_on_expand_view_button_in_the_tasks_reoccuring_page_for_the_user_page() {
		  usersPage.clickExpandView();

	}

	@Then("user should see the task in the company of tasks reoccuring page for the page{string}")
	public void user_should_see_the_task_in_the_company_of_tasks_reoccuring_page_for_the_page_important_work(String ext) {
		  String act = usersPage.getTaskStatus();
		    Assert.assertEquals(act, ext);
	}
	
	@And("user should be able to click user in the user page")
	public void user_should_be_able_to_click_user_in_the_user_page() {
	    usersPage.clickOnUser();
	}

	@And("user should be able to click on collapse button in the user page")
	public void user_should_be_able_to_click_on_collapse_button_in_the_user_page() throws InterruptedException {
		Thread.sleep(1000);
		usersPage.clickOnCollapseBtn();
	}
	
	@And("user shoud be able to click on name expand button in the user page")
	public void user_shoud_be_able_to_click_on_name_expand_button_in_the_user_page() throws InterruptedException {
		Thread.sleep(1000);
	    usersPage.clickOnNameExpandButton();
	}
	
	@And("user should be able to click on company expand button in the user page")
	public void user_should_be_able_to_click_on_company_expand_button_in_the_user_page() throws InterruptedException {
		Thread.sleep(1000);
	   usersPage.clickOnCompanyExpandBtn();
	   
	}
	
	@Then("user should be able to see recurring task in the user page{string}")
	public void user_should_be_able_to_see_recurring_task_in_the_user_page(String ext) {
		 String act = usersPage.getTaskRecurringStatus();
		    Assert.assertEquals(act, ext);
	}
	
	@And("user should be able to filter the task recurring in the user page")
	public void user_should_be_able_to_filter_the_task_recurring_in_the_user_page() throws InterruptedException {
	   usersPage.filterTaskRecurring();
	}
	
	@And("user should be able to click on company expand button in the user page for the filtered task")
	public void user_should_be_able_to_click_on_company_expand_button_in_the_user_page_for_the_filtered_task() {
	   usersPage.clickOnFilteredCompany();
	}
	
	@Then("user should be able to see recurring task in the user page for the filtered task{string}")
	public void user_should_be_able_to_see_recurring_task_in_the_user_page_for_the_filtered_task(String ext) {
		 String act = usersPage.getFilteredTaskRecurringStatus();
		    Assert.assertEquals(act, ext);
	}
	
	@And("user should be able to click on task of the company at users page Important Task")
	public void user_should_be_able_to_click_on_task_of_the_company_at_users_page_important_task() throws InterruptedException {
	   usersPage.clickonTask();
	}
	
	@And("User should be able to update fields at recurring tab in the  company task tab for the users")
	public void user_should_be_able_to_update_fields_at_recurring_tab_in_the_company_task_tab_for_the_users(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> taskInfo = dataTable.asMaps();
		String taskName = taskInfo.get(0).get("taskname");
		String date = taskInfo.get(0).get("date");

		usersPage.UpdateFieldsInAddTaskPopup(taskName, date);
		
	}
	@Then("user should be able to see the task recurring tab in the  company task tab for the users{string}")
	public void user_should_be_able_to_see_the_task_recurring_tab_in_the_company_task_tab(String ext) throws InterruptedException {
	   String act = usersPage.gettaskStatusCompanyTaskRecurringTab();
	   Assert.assertEquals(act, ext);
	}
	
	@When("user should be able to click on recurring tab of the task tab")
	public void user_should_be_able_to_click_on_recurring_tab_of_the_task_tab() {
	   usersPage.clickRecurringTab();
	}


	@And("User should be able to edit fields in the edit task popup at recurring tab in the  company task tab for the users{string}")
	public void user_should_be_able_to_edit_fields_at_recurring_tab_in_the_company_task_tab(String task) {
	    usersPage.EditTaskDetails(task);
	}

	@Then("user should be able to see the updated task in the task of the company at tasks reoccurring page for the users{string}")
	public void user_should_be_able_to_see_the_updated_task_in_the_task_of_the_company_at_tasks_reoccurring_page(String ext) {
	 String act =  usersPage.getEditTaskStatus();
	 Assert.assertEquals(act, ext);
	}
	
	@And("User should be able to delete task at recurring tab in the  company task tab for the users")
	public void user_should_be_able_to_delete_task_at_recurring_tab_in_the_company_task_tab() throws InterruptedException {
	    usersPage.deleteTask();
	    
	}
	
	 @And ("user should be able to delete the company in the company page")
	  public void user_should_be_able_to_delete_the_company() throws InterruptedException {
		  usersPage.deletecompanyCompanyPage();
	  }

	 
	 @When("user should be logout the application")
	 public void user_should_be_logout_the_application() {
	    usersPage.clickLogoutBtn();
	 }

	 @Then("user should be on application login page")
	 public void user_should_be_on_application_login_page_https_beta_cisin_com_users_sign_in() {
	     usersPage.getApplicationLoginPage();
	 }
	    

	 @Then("user should be able to delete compnay successfully{string}")
	 public void user_should_be_able_to_delete_compnay_successfully_company_was_successfully_deleted(String ext) {
	    String act = usersPage.getCompanyDeleteMSg();
	    Assert.assertEquals(act, ext);
	 }
	 
	 @When("user should be enter fields for adding user in the user page")
	 public void user_should_be_enter_fields_for_adding_user_in_the_user_page(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		 List<Map<String, String>> usersInfo = dataTable.asMaps();
			String fn = usersInfo.get(0).get("fullname");
			String t = usersInfo.get(0).get("title");
			String date = usersInfo.get(0).get("bdate");
			String role = usersInfo.get(0).get("role");
			String email = usersInfo.get(0).get("email");
			String sdate = usersInfo.get(0).get("sdate");
			usersPage.enterFieldsForUsers(fn, t, date, role, email, sdate);
	 }

	 @Then("user should be able to see the user in the user page{string}")
	 public void user_should_be_able_to_see_the_user_in_the_user_page_automate_test_admin(String ext) {
			String act = usersPage.getAddUserStatus();
			Assert.assertEquals(act, ext);
	 }
	 
	 
	 @When("user should be able to click on Settings for the user")
	 public void user_should_be_able_to_click_on_settings_for_the_user() {
	     usersPage.clickSettingTab();
	 }

	 @When("user should be able to click on add title button in staff title widget for the user")
	 public void user_should_be_able_to_click_on_add_title_button_in_staff_title_widget_for_the_user() {
	   usersPage.clickonAddTitleStaffTitleWidget();
	 }

	 @When("user should enter the title in add title popup of staff title widget for the user{string}")
	 public void user_should_enter_the_title_in_add_title_popup_of_staff_title_widget_for_the_user_automate_admin(String title) {
	   usersPage.enterTitleStaffTitleWidget(title);
	 }

	 @Then("user should be able to see the title on staff title widget for the user{string}")
	 public void user_should_be_able_to_see_the_title_on_staff_title_widget_for_the_user_automate_admin(String ext) {
		 String act = usersPage.getAddTitleStatusStaffTitleWidget();
			Assert.assertEquals(act, ext);
	 }

	 @When("user should be able to select company in the company page for the user")
	 public void user_should_be_able_to_select_company_in_the_company_page_for_the_user() {
	    usersPage.clickOnCompany();
	 }

	 @When("user should be clicked on Details Tab for the user")
	 public void user_should_be_clicked_on_details_tab_for_the_user() {
	    usersPage.click_Detils_Tab();
	 }

	 @Then("staff member details should be displayed on staff detail section for the user{string}")
	 public void staff_member_details_should_be_displayed_on_staff_detail_section_for_the_user_arjay_mc_cann(String ext) {
	    String act = usersPage.getStaffMemeberStatus();
	    Assert.assertEquals(act, ext);
	 }


	 @When("user should be click on tasks template tab for the user")
	 public void user_should_be_click_on_tasks_template_tab_for_the_user() {
	     usersPage.clickTasksTemplateTab();
	 }

	 @When("user should be click on create template button for the user")
	 public void user_should_be_click_on_create_template_button_for_the_user() {
	    usersPage.clickCreateTemplateBtn();
	 }

	 @When("user should be enter the {string} in the name field at add task template pop up for the user")
	 public void user_should_be_enter_the_in_the_name_field_at_add_task_template_pop_up_for_the_user(String taskTemp) {
	    usersPage.enterNameInCreateTemplatePopup(taskTemp);
	 }

	 @When("user should be click on add button of task template popup for the user")
	 public void user_should_be_click_on_add_button_of_task_template_popup_for_the_user() {
	    usersPage.clickAddBtnOfCreateTemplatePopup();
	 }

	 @Then("user should be able to see the template {string} at template page for the user")
	 public void user_should_be_able_to_see_the_template_at_template_page_for_the_user(String actTempName) {
		 String expTempName = usersPage.getActTempName();
			Assert.assertEquals(expTempName, actTempName);

	 }

	 @Then("user should be able to see valdation message of created template for the user{string}")
	 public void user_should_be_able_to_see_valdation_message_of_created_template_for_the_user_task_template_was_created_successfully(String ext) {
		  String act = usersPage.getMsgAfterCreatedTaskTemplate();
		   Assert.assertEquals(act, ext);
	 }

	 @When("user should be able to select user in the user for the user{string}")
	 public void user_should_be_able_to_select_user_in_the_user_for_the_user_automate_test_admin(String user) throws InterruptedException {
	     usersPage.selectUser(user);
	 }

	 @And("user should be click on edit button in the user page for the user")
	 public void user_should_be_click_on_edit_button_in_the_user_page_for_the_user() throws InterruptedException {
	    usersPage.clickEditbutton();
	 }

	 @And("user should be delete the user in the user page for the user")
	 public void user_should_be_delete_the_user_in_the_user_page_for_the_user() throws InterruptedException {
		 usersPage.clickDeleteButtonUser();
	 }
	 
	 @When("User should be able to delete title in staff title widget for the user")
	 public void user_should_be_able_to_delete_title_in_staff_title_widget_for_the_user() throws InterruptedException {
	   usersPage.deleteTitleStaffTitleWidget();
	 }

	 @Then("user should be able to delete contact title successfully in the staff title widget for the user{string}")
	 public void user_should_be_able_to_delete_contact_title_successfully_in_the_staff_title_widget_for_the_user_title_was_successfully_deleted(String ext) {
		 String act = usersPage.deleteTitleSuccessfullyStaffTitleWidget();
			Assert.assertEquals(act, ext);
	 }
	 
	 @When("user should click on QA Automation Template link for the user")
	 public void user_should_click_on_qa_automation_template_link_for_the_user() {
	    usersPage.clickCreatedTemplateLink();
	 }

	 @When("user should click on delete button at the QA Automation Template Page to delete the template for the user")
	 public void user_should_click_on_delete_button_at_the_qa_automation_template_page_to_delete_the_template_for_the_user() throws InterruptedException {
	    usersPage.clickOnDeleteBtnOfTemplate();
	    
	 }

	 @Then("user should able to delete QA Automation Template Successfully for the user{string}")
	 public void user_should_able_to_delete_qa_automation_template_successfully_for_the_user_task_template_was_deleted_successfully(String ext) throws InterruptedException {
		  String act = usersPage.getDeleteTaskTemplate();
		   Assert.assertEquals(act, ext);
	 }



}
