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
	
	@And("user should be click on final check user")
	public void user_should_be_click_on_final_check_user() {
	  usersPage.clickOnUserse();
	}

	
	@And("user clear the filed and enter the updates values in the fields")
	public void user_clear_the_filed_and_enter_the_updates_values_in_the_fields(io.cucumber.datatable.DataTable dataTable)  {
		List<Map<String, String>> companyInfo = dataTable.asMaps();
		String title = companyInfo.get(0).get("Select a Title");
		//String date = companyInfo.get(0).get("date");
		String email = companyInfo.get(0).get("Email");
		usersPage.enterUsersInfo(title, email);
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
	    

	 @When("user should be able to create user")
	 public void user_should_be_able_to_create_user(io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String, String>> userInfo = dataTable.asMaps();
			String fn = userInfo.get(0).get("fullname");
			String t = userInfo.get(0).get("title");
			String bDate =  userInfo.get(0).get("date");
			String r = userInfo.get(0).get("role");
			String email =  userInfo.get(0).get("email");
			String date =  userInfo.get(0).get("bdate");
			usersPage.createUser(fn,t,bDate,r,email,date);
	 }

	 @Then("user should be able to delete compnay successfully{string}")
	 public void user_should_be_able_to_delete_compnay_successfully_company_was_successfully_deleted(String ext) {
	    String act = usersPage.getCompanyDeleteMSg();
	    Assert.assertEquals(act, ext);
	 }
}
