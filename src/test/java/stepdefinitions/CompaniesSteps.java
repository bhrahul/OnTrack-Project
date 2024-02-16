package stepdefinitions;

import java.awt.AWTException;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.pages.CompaniesPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompaniesSteps {
	DriverFactory driverFactory;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private CompaniesPage companiesPage;

	@Given("User has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("username");
		String passWord = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://beta.cisin.com:4991/users/sign_in");
		companiesPage = loginPage.doLogin(userName, passWord);
		Thread.sleep(1000);
	}

	@Given("User is on Companies page url {string}")
	public void user_is_on_companies_page(String acUrl) throws InterruptedException {
		Thread.sleep(2000);
		String expUrl = companiesPage.CompaniesPageURL();
		Assert.assertEquals(expUrl, acUrl);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String actTitle) {
		String expTitle = companiesPage.CompaniesPageTitle();
		Assert.assertEquals(expTitle, actTitle);
	}

	@Then("{string} link should be displayed on sidebar in the company page")
	public void companies_link_should_be_displayed_on_sidebar(String link) {
		Assert.assertTrue(companiesPage.getSideNavLinkStatus(link));

	}

	@Then("profile icon should be displayed on sidebar in the company page")
	public void profile_icon_should_be_displayed_on_sidebar() {
		Assert.assertTrue(companiesPage.getProfileIconStatus());

	}

	@Then("setting link should be displayed on sidebar in the company page")
	public void setting_link_should_be_displayed_on_sidebar() {
		Assert.assertTrue(companiesPage.getSettingLinkStatus());

	}

	@Then("{string} tab should be displayed in the company page")
	public void tab_should_be_displayed(String tab) {
		Assert.assertTrue(companiesPage.getTabLinkStatus(tab));
	}

	@Then("Search field should be displayed in the company page")
	public void search_field_should_be_displayed() {
		Assert.assertTrue(companiesPage.getSearchFieldStatus());
	}

	@Then("add contact button should be displayed in the company page")
	public void add_contact_button_should_be_displayed() {
		Assert.assertTrue(companiesPage.getAddContactBtnStatus());
	}

	@When("user should be clicked on AddContact button in the company page")
	public void user_should_be_clicked_on_add_contact_button() throws InterruptedException {
		companiesPage.clickedOnAddContactBtn();
		Thread.sleep(2000);
	}

	@And("User should be clicked on Add contact button of company")
	public void user_should_be_clicked_on_add_contact_button_of_company() throws InterruptedException {
		companiesPage.clickAddContactButtonOfCompany();
		Thread.sleep(1000);
	}

	@Then("{string} title should be displayed in the add contact popup")
	public void add_contact_title_should_be_displayed_on_pop_up(String actTitle) {
		String expTitle = companiesPage.getAddContactTitleStatus();
		Assert.assertEquals(expTitle, actTitle);
	}

	@Then("Add company button should be displayed in the add contact popup")
	public void add_company_button_should_be_displayed_on_pop_up() {
		Assert.assertTrue(companiesPage.getAddCompanyBtnStatus());
	}

	@Then("Add contact button should be displayed in the add contact popup")
	public void add_contact_button_should_be_displayed_on_pop_up() {
		Assert.assertTrue(companiesPage.getAddContactBtnPopUpStatus());
	}

	@Then("Reset button should be displayed in the add contact popup")
	public void reset_button_should_be_displayed_on_pop_up() {
		Assert.assertTrue(companiesPage.getResetBtnStatus());

	}

	@And("user should be clicked on Reset button in the add contact popup")
	public void user_should_be_clicked_on_reset_button() {
		companiesPage.clickOnResetBtn();
	}

	@Then("Add contact popup close successfully in the company page")
	public void add_contact_popup_close_successfully() {
		companiesPage.addContactPopupCloseSuccessfully();
	}

	@And("User should be closed the add contact popup in the company page")
	public void user_should_be_closed_the_pop_up() {
		companiesPage.clickOnCloseBtn();
	}

	@Then("add contact popup close successfully by click on close Icon in the company page")
	public void add_contact_popup_close_successfully_by_click_on_close_icon() {
		companiesPage.addContactPopupCloseSuccessfully();
	}

	@And("User should be clicked on Add Company button in the add contact popup of the company page")
	public void user_should_be_clicked_on_add_company_button() throws InterruptedException {
		companiesPage.clickOnAddCompanyBtn();
	}

	@Then("user should able to see the add company popup in the company page")
	public void user_should_able_to_see_the_add_company_popup_in_the_company_page() {
		companiesPage.getAddCompanyStatus();
	}

	@And("User should be enter the fields for the company in the add company popup")
	public void user_should_be_enter_the_fields_for_the_company(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> companyInfo = dataTable.asMaps();
		String cName = companyInfo.get(0).get("companyname");
		String pName = companyInfo.get(0).get("phonenumber");
		// String ext = companyInfo.get(0).get("extention");
		String ws = companyInfo.get(0).get("website");
		String email = companyInfo.get(0).get("email");
		String ad = companyInfo.get(0).get("address");
		String city = companyInfo.get(0).get("city");
		String state = companyInfo.get(0).get("state");
		String zipCode = companyInfo.get(0).get("zipcode");
		String date = companyInfo.get(0).get("sdate");
		companiesPage.enterCompanyInfo(cName, pName, ws, email, ad, city, state, zipCode, date);
	}

	@Then("User should be able to see the company from company list{string}")
	public void user_should_be_able_to_see_the_company_from_company_list_amdocs(String actCn) {
		String expCn = companiesPage.companyNameCompaniesList();
		Assert.assertEquals(expCn, actCn);
	}

	@And("User should be searched a company {string} in the company page")
	public void user_should_be_searched_a_compnay(String comName) {
		companiesPage.searchCompany(comName);
	}

	@And("User click on search button in the company page")
	public void user_click_on_search_button() throws InterruptedException {
		companiesPage.clickOnSearch();
		Thread.sleep(3000);
	}

	@Then("User should be searched a company in the company page")
	public void user_should_be_searched_a_company_in_the_company_page() {
		companiesPage.getSearchCompanyStatus();
	}

	@Then("User should be click on edit button in the company page")
	public void user_should_be_click_on_edit_button() throws InterruptedException {
		companiesPage.clickOnEditButton();
		Thread.sleep(1000);
	}

	@And("user should be upadted company name{string} in the edit item popup")
	public void user_should_be_upadted_company_name_amd(String name) {
		companiesPage.updateCompanyname(name);
	}

	@And("User should be click on update button in the edit item popup")
	public void user_should_be_click_on_update_button() {
		companiesPage.clickOnUpdateBtn();
	}

	@Then("user should see the updated company in the company page{string}")
	public void user_should_see_the_updated_company(String ext) throws InterruptedException {
		String act = companiesPage.getUpdatedCompanyNameStatus();
		Assert.assertEquals(act, ext);
	}

	@When("User should click on delete button in the company page")
	public void user_should_click_on_delete_button() {
		companiesPage.clickOnDeleteBtn();
	}

	@Then("company should deleted successfully from the company page{string}")
	public void amd_company_should_deleted_successfully_from_the_company_page(String err) {
		String act = companiesPage.deleteCompany();
		Assert.assertNotEquals(act, err);
	}

	@And("User should be clicked on Close button in the add company popup")
	public void user_should_be_clicked_on_close_button() {
		companiesPage.clickOnCloseButton();
	}

	@Then("user should be able to close the add company popup successfully")
	public void user_should_be_able_to_close_the_add_company_popup_successfully() throws InterruptedException {
		companiesPage.addCompanyPopupCloseSuccessfully();
	}

	@And("click on add button in the add company popup")
	public void click_on_add_button() throws InterruptedException {
		companiesPage.clickOnAddButtonPopup();
	}

	@Then("User should see an validation message on company name field {string}")
	public void user_should_see_an_validation_message(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextCompnayName();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should see an validation message on phone number field{string}")
	public void user_should_see_an_validation_message_on_phone_number(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextPhoneNumber();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should see an validation message on website {string}")
	public void user_should_see_an_validation_message_on_website(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextWebsite();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should see an validation message on address {string}")
	public void user_should_see_an_validation_message_on_address(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextAddress();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should see an validation message on city {string}")
	public void user_should_see_an_validation_message_on_city(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextCity();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should see an validation message on state {string}")
	public void user_should_see_an_validation_message_on_state(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextState();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should see an validation message on zipcode {string}")
	public void user_should_see_an_validation_message_on_zipcode(String errMsg) throws InterruptedException {
		String actErrMsg = companiesPage.getInvalidCredTextZipCode();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should see an validation message on start date {string}")
	public void user_should_see_an_validation_message_on_start_date(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextStartDate();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should see an validation message on report time {string}")
	public void user_should_see_an_validation_message_on_report_time(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextReportingTime();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should be able to see Add Contact popup title in the add contact popup")
	public void user_should_be_see_on_add_contact_Popup_Title_of_company() throws InterruptedException {
		companiesPage.getAddContactPopupTitleContactStatus();
		Thread.sleep(3000);
	}

	@And("User should be clicked on add button in the add contact popup")
	public void user_should_be_clicked_on_add_button() {
		companiesPage.clickContactAddBtn();
	}

	@And("User should be clicked on add button in the add contact popup of the company")
	public void user_should_be_clicked_on_add_button_in_the_add_contact_popup_of_the_company() {
		companiesPage.clickContactAddBtn();
	}

	@Then("User should see an validation message for First Name{string}")
	public void user_should_see_an_validation_message_for_first_name_first_name_can_t_be_blank(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextFristName();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should see an validation message for Last Name{string}")
	public void user_should_see_an_validation_message_for_last_name_last_name_can_t_be_blank(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextLastName();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should see an validation message for Title Name{string}")
	public void user_should_see_an_validation_message_for_title_name_title_can_t_be_blank(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextTitle();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should see an validation message for Phone Number Name{string}")
	public void user_should_see_an_validation_message_for_phone_number_name_phone_number_can_t_be_blank(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextPhone();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@Then("User should see an validation message for Company Name{string}")
	public void user_should_see_an_validation_message_for_company_name_company_can_t_be_blank(String errMsg) {
		String actErrMsg = companiesPage.getInvalidCredTextCompany();
		Assert.assertEquals(actErrMsg, errMsg);
	}

	@And("User should be enter the fields for the contact")
	public void user_should_be_enter_the_fields_for_the_contact(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> contactInfo = dataTable.asMaps();
		String fName = contactInfo.get(0).get("firstname");
		String lName = contactInfo.get(0).get("lastname");
		String email = contactInfo.get(0).get("email");
		String pn = contactInfo.get(0).get("phonenumber");
		String company = contactInfo.get(0).get("company");
		companiesPage.enterContactInfo(fName, lName, email, pn, company);
		Thread.sleep(3000);
	}

	@Then("user should be see the contact name in the company list page{string}")
	public void user_should_be_see_the_contact_name_in_the_company_list_page(String ext) throws InterruptedException {
		String act = companiesPage.getContactNameStatusCompanyList();
		Assert.assertEquals(act, ext);
	}

	@And("user should be filtered company in the company page")
	public void user_should_be_filtered_company_in_the_company_page(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> companyInfo = dataTable.asMaps();
		String company = companyInfo.get(0).get("company");
		String contact = companyInfo.get(0).get("contact");
		companiesPage.fiteredCompany(company,contact);
		Thread.sleep(1000);
	}

	@Then("user should be able to see the company which is filtered{string}")
	public void user_should_be_able_to_see_the_company_which_is_filtered(String ext) {
		String act = companiesPage.getFilteredCompanyStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to click the reset button.")
	public void user_should_be_able_to_click_the_reset_button() {
		companiesPage.resetFilteredCompany();

	}

	@And("user should be click on Tasks at sidebar menu for the company task")
	public void user_should_be_click_on_tasks_at_sidebar_menu_for_the_company_task() throws InterruptedException {
		companiesPage.tasksSidebarMenu();
		Thread.sleep(1000);
	}

	@And("user should be click on tasks template tab for the company task")
	public void user_should_be_click_on_tasks_template_tab_for_the_compnay_task() throws InterruptedException {
		companiesPage.clickTasksTemplateTab();
		Thread.sleep(1000);
	}

	@And("user should be click on create template button for the compnay task")
	public void user_should_be_click_on_create_template_button_for_the_compnay_task() throws InterruptedException {
		companiesPage.clickCreateTemplateBtn();
		Thread.sleep(1000);
	}

	@And("user should be enter the {string} in the name field at add task template pop up for the compnay task")
	public void user_should_be_enter_the_in_the_name_field_at_add_task_template_pop_up_for_the_compnay_task(
			String tempName) {
		companiesPage.enterNameInCreateTemplatePopup(tempName);
	}

	@And("user should be click on add button of task template popup for the company task")
	public void user_should_be_click_on_add_button_of_task_template_popup_for_the_company_task()
			throws InterruptedException {
		companiesPage.clickAddBtnOfCreateTemplatePopup();
		Thread.sleep(1000);
	}

	@And("user should be able to select company in the company page")
	public void user_should_be_able_to_select_company() throws InterruptedException {
		companiesPage.clickOnCompany();
		Thread.sleep(1000);

	}

	@Then("User should see the Company Name {string}")
	public void user_should_see_the_company_name(String cn) {
		String actCn = companiesPage.getCompanyName();
		Assert.assertEquals(actCn, cn);

	}

	@Then("user should be on Statistics tab in the company{string}")
	public void user_should_be_on_statistics_tab_in_the_company_https_beta_cisin_com_companies_dashboard_statistics(
			String exp) {
		String act = companiesPage.getStatistics();
		Assert.assertEquals(act, exp);
	}

	@Then("{string} widget should be displayed")
	public void widget_should_be_displayed(String rAndF) {
		String actrAndF = companiesPage.getRoyaltyAndFidesic();
		Assert.assertEquals(actrAndF, rAndF);
	}

	@Then("Add button should be displayed")
	public void add_button_should_be_displayed() {
		companiesPage.getRoyaltyAndFidesicAddBtnStatus();
	}

	@And("user should be clicked on add button of Royalty & Fidesic record")
	public void user_should_be_clicked_on_add_button_of_royalty_fidesic_record() throws InterruptedException {
		companiesPage.addButtonOfRoyaltyAndFidesicRecord();
		Thread.sleep(3000);
	}

	@Then("{string} title should be displayed")
	public void title_should_be_displayed(String Raf) {
		String actRaf = companiesPage.getRoyaltyAndFidesicTitleStatus();
		Assert.assertEquals(actRaf, Raf);
	}

	@Then("add button should be displayed on Royalty & Fidesic PopUp")
	public void add_button_should_be_displayed_on_royalty_fidesic_pop_up() {
		companiesPage.addBbuttonRoyaltyAndFidesicPopUp();
	}

	@Then("close button should be displayed on Royalty & Fidesic PopUp")
	public void close_button_should_be_displayed_on_royalty_fidesic_pop_up() {
		companiesPage.closeBbuttonRoyaltyAndFidesicPopUp();
	}

	@And("user should be clicked add button on Royalty & Fidesic PopUp")
	public void user_should_be_clicked_add_button_on_royalty_fidesic_pop_up() {
		companiesPage.clickAddBbuttonRoyaltyAndFidesicPopUp();
	}

	@Then("user should be able to see the licence error message\"License number can't be blank.License number is not a number\"")
	public void user_should_be_able_to_see_the_licence_error_message_license_number_can_t_be_blank_license_number_is_not_a_number() {
		companiesPage.getLicenceNumberErrorMsg();
		companiesPage.getLicenceNotNumber();
	}

//	@When("user should be able to enter all the fields of Royalty & Fidesic record{string}")
//	public void user_should_be_able_to_enter_all_the_fields_of_royalty_fidesic_record(String LicenceNo, String rdate) throws InterruptedException {
//		companiesPage.FieldsOfRoyaltyAndFidesicInfo(LicenceNo,rdate);
//	}

	@When("user should be able to enter all the fields of Royalty & Fidesic record")
	public void user_should_be_able_to_enter_all_the_fields_of_royalty_fidesic_record(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> rInfo = dataTable.asMaps();
		String ln = rInfo.get(0).get("title");
		String rdate = rInfo.get(0).get("royalty filed date");
		String adate = rInfo.get(0).get("royalty audit date");
		String rpdate = rInfo.get(0).get("royaly paid date");
		String ipdate = rInfo.get(0).get("royalty invoice date");
		companiesPage.FieldsOfRoyaltyAndFidesicInfo(ln, rdate, adate, rpdate, ipdate);
	}

	@Then("Royalty & Fidesic record should be displayed on Royalty & Fidesic widget")
	public void royalty_fidesic_record_should_be_displayed_on_royalty_fidesic_widget() {
		companiesPage.getRoyaltyAndFidesicRecordStatus();
	}

	@When("user should be clicked on edit button")
	public void user_should_be_clicked_on_edit_button() {
		companiesPage.click_EditButton_RoyaltyAndFidesicWidget();
	}

	@When("user should be able to update Royalty & Fidesic record")
	public void user_should_be_able_to_update_royalty_fidesic_record(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> rInfo = dataTable.asMaps();
		String ln = rInfo.get(0).get("title");
		String rdate = rInfo.get(0).get("royalty filed date");
		String adate = rInfo.get(0).get("royalty audit date");
		String rpdate = rInfo.get(0).get("royaly paid date");
		String ipdate = rInfo.get(0).get("royalty invoice date");
		companiesPage.FieldsOfRoyaltyAndFidesicUpdateInfo(ln, rdate, adate, rpdate, ipdate);
	}

	@Then("user should be able to see the update Royalty & Fidesic record")
	public void user_should_be_able_to_see_the_update_royalty_fidesic_record() {
		companiesPage.getUpdateRoyaltyAndFidesicRecordStatus();
	}

	@When("user should be able to delete Royalty & Fidesic record")
	public void user_should_be_able_to_delete_royalty_fidesic_record() throws InterruptedException {
		companiesPage.DeleteRoyaltyAndFidesicRecord();
	}

	///////////////////// companies>>Dashboard>>Statistics>>Check off list widget

	@And("user should be clicked on add button of check of list")
	public void user_should_be_clicked_on_add_button_of_check_of_list() {
		companiesPage.addBtnCheckOFList();
	}

	@And("user shoudl be clicked on add button of check of list popup")
	public void user_shoudl_be_clicked_on_add_button_of_check_of_list_popup() {
		companiesPage.addBtnCheckListPopup();
	}

	@And("user should be able to close Check Off List PopUp")
	public void user_should_be_able_to_close_check_off_list_pop_up() {
		companiesPage.clickCloseButtonReconciledDate();
	}

	@Then("user should be close check off list popup successfully")
	public void user_should_be_close_check_off_list_popup_successfully() throws InterruptedException {
		companiesPage.closeButtonReconciledDate();
	}

	@Then("User should see an validation message for Name{string}")
	public void user_should_see_an_validation_message_for_name_name_can_t_be_blank(String exterror) {
		String acterrorMSg = companiesPage.getNameCheckListErrorMsg();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@Then("User should see an validation message for Date{string}")
	public void user_should_see_an_validation_message_for_date_date_can_t_be_blank(String exterror) {
		String acterrorMSg = companiesPage.getDateCheckListErrorMsg();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@And("user should be able to enter all the fields of Check Off List")
	public void user_should_be_able_to_enter_all_the_fields_of_check_off_list(DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> rInfo = dataTable.asMaps();
		String n = rInfo.get(0).get("name");
		String date = rInfo.get(0).get("date");
		companiesPage.enterFieldsOfCheckList(n, date);
	}

	@Then("user should be able to see the check off list{string}")
	public void user_should_be_able_to_see_the_check_off_list(String ext) throws InterruptedException {
		String act = companiesPage.getCheckOffListRecordStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user should be clicked on edit button of Check Off List")
	public void user_should_be_clicked_on_edit_button_of_check_off_list() {
		companiesPage.clickOnEditButtonCheckOffList();
	}

	@And("user should be able to update Check Off List record")
	public void user_should_be_able_to_update_check_off_list_record(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> rInfo = dataTable.asMaps();
		String n = rInfo.get(0).get("name");
		String date = rInfo.get(0).get("date");
		companiesPage.EditCheckListRecord(n, date);
	}

	@Then("user should be able to see the update Check Off Listc record{string}")
	public void user_should_be_able_to_see_the_update_check_off_listc_record(String ext) throws InterruptedException {
		String act = companiesPage.getUpdateCheckOffListRecordStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to delete check off list record")
	public void user_should_be_able_to_delete_check_off_list_record() throws InterruptedException {
		companiesPage.DeleteCheckOffListRecord();
	}

/////////////////////companies>>Dashboard>>Statistics>>Reconciled Date widget

	@And("user should be clicked on add button of Reconciled Date")
	public void user_should_be_clicked_on_add_button_of_reconciled_date() {
		companiesPage.clickAddButtonReconciledDate();
	}

	@And("user should be able to close Reconciled Date PopUp")
	public void user_should_be_able_to_close_reconciled_date_pop_up() {
		companiesPage.clickCloseButtonReconciledDatePopup();
	}

	@Then("user should be close Reconciled Date popup successfully")
	public void user_should_be_close_reconciled_date_popup_successfully() throws InterruptedException {
		companiesPage.closeReconciledDatePopup();
	}

	@And("user shoudl be clicked on add button of Reconciled Date popup")
	public void user_shoudl_be_clicked_on_add_button_of_reconciled_date_popup() {
		companiesPage.clickAddButtonReconciledDatePopup();
	}

	@Then("User should see an validation message for Account Name{string}")
	public void user_should_see_an_validation_message_for_account_name(String exterror) {
		String acterrorMSg = companiesPage.getAccountNameReconciledDateErrorMsg();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@And("User should be able to create Reconciled Dates record")
	public void user_should_be_able_to_create_reconciled_dates_record(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> rdInfo = dataTable.asMaps();
		String ln = rdInfo.get(0).get("AccountName");
		String rdate = rdInfo.get(0).get("report date");
		String adate = rdInfo.get(0).get("auditor date");
		companiesPage.createReconciledDatesRecord(ln, rdate, adate);
	}

	@Then("user should be able to see the Reconciled Dates record{string}")
	public void user_should_be_able_to_see_the_reconciled_dates_record(String ect) {
		String act = companiesPage.getCreatedReconciledDateRecord();
		Assert.assertEquals(act, ect);
	}

	@And("user should be clicked on edit button of Reconciled Date")
	public void user_should_be_clicked_on_edit_button_of_reconciled_date() throws InterruptedException {
		companiesPage.clickEditButtonReconciledDateRecord();
	}

	@And("User should be able to edit Reconciled Dates record")
	public void user_should_be_able_to_edit_reconciled_dates_record(DataTable dataTable) {
		List<Map<String, String>> rdInfo = dataTable.asMaps();
		String ln = rdInfo.get(0).get("AccountName");
		String rdate = rdInfo.get(0).get("report date");
		String adate = rdInfo.get(0).get("auditor date");
		companiesPage.editReconciledDateRecord(ln, rdate, adate);
	}

	@Then("user should be able to see the update Reconciled Dates record{string}")
	public void user_should_be_able_to_see_the_update_reconciled_dates_record(String ext) {
		String act = companiesPage.getEditReconciledDateRecordStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to delete Reconciled Date record")
	public void user_should_be_able_to_delete_reconciled_date_record() throws InterruptedException {
		companiesPage.deleteReconciledDateRecord();
	}

/////////////////////companies>>Dashboard>>Statistics>>Loan Payment widget

	@And("user should be clicked on add button of New Loan Payment")
	public void user_should_be_clicked_on_add_button_of_new_loan_payment() {
		companiesPage.clickAddButtonLoanPayment();
	}

	@And("user should be able to close New Loan Payment PopUp")
	public void user_should_be_able_to_close_new_loan_payment_pop_up() {
		companiesPage.clickCloseButtonLoanPaymentPopup();

	}

	@Then("user should be close New Loan Payment popup successfully")
	public void user_should_be_close_new_loan_payment_popup_successfully() throws InterruptedException {
		companiesPage.closeLoanPaymentPopup();
	}

	@And("user should be clicked on add button of New Loan Payment popup")
	public void user_shoudl_be_clicked_on_add_button_of_new_loan_payment_popup() {
		companiesPage.clickAddButtonNewLoanPaymentPopup();
	}

	@Then("User should see an validation message for Loan Name{string}")
	public void user_should_see_an_validation_message_for_loan_name(String exterror) {
		String acterrorMSg = companiesPage.getLoanNameErrorMsg();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@Then("User should see an validation message for Payment Date{string}")
	public void user_should_see_an_validation_message_for_Payment_Date(String exterror) {
		String acterrorMSg = companiesPage.getPaymentDateErrorMsg();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@Then("User should see an validation message for Amount{string}")
	public void user_should_see_an_validation_message_for_amount(String ext) {
		String act = companiesPage.amountCanNotBeBlankErrorMsg();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to enter all the fields of new loan payment")
	public void user_should_be_able_to_enter_all_the_fields_of_new_loan_payment(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> loanInfo = dataTable.asMaps();
		String lName = loanInfo.get(0).get("loan name");
		String pdate = loanInfo.get(0).get("payment date");
		String aName = loanInfo.get(0).get("loan amount");

		companiesPage.enterLoanInfo(lName, pdate, aName);
	}

	@Then("user should be able to see the loan payment")
	public void user_should_be_able_to_see_the_loan_payment() throws InterruptedException {
		companiesPage.getLoanPaymentRecordStatus();
	}

	@And("user should be clicked on edit button of New Loan Payment")
	public void user_should_be_clicked_on_edit_button_of_new_loan_payment() {
		companiesPage.clickEditButtonLoanPayment();
	}

	@And("user should be able to edit all the fields of new loan payment")
	public void user_should_be_able_to_edit_all_the_fields_of_new_loan_payment(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> loanInfo = dataTable.asMaps();
		String lName = loanInfo.get(0).get("loan name");
		String pdate = loanInfo.get(0).get("payment date");
		String aName = loanInfo.get(0).get("loan amount");

		companiesPage.editLoanInfo(lName, pdate, aName);
	}

	@Then("user should be able to see the edit loan payment")
	public void user_should_be_able_to_see_the_edit_loan_payment() throws InterruptedException {
		companiesPage.getEditLoanPaymentRecordStatus();
	}

	@And("user should be able to delete Loan payment record")
	public void user_should_be_able_to_delete_loan_payment_record() throws InterruptedException {
		companiesPage.deleteLoanPaymentRecord();
	}

	////////////////// Daily Reconciled///////////////////////////

	@And("user should be clicked on Daily Reconciled Tab")
	public void user_should_be_clicked_on_daily_reconciled_tab() throws InterruptedException {
		companiesPage.click_Daily_Reconciled_Tab();
		Thread.sleep(1000);
	}

	@Then("user should be on daily reconciled page of company page{string}")
	public void user_should_be_on_daily_reconciled_page_of_company_page_https_beta_cisin_com_companies_dashboard_daily_reconciled_transactions(
			String ect) {
		String act = companiesPage.getDailyReconciled();
		Assert.assertEquals(act, ect);
	}

	@And("user should be clicked on add account button in the Daily Reconciled Tab")
	public void user_should_be_clicked_on_add_account_button() {
		companiesPage.click_Add_Account_Button();
	}

	@And("user should be able to click add button on Add Account PopUp")
	public void user_should_be_able_to_click_add_button_on_add_account_pop_up() {
		companiesPage.click_Add_Button_Popup();
	}

	@Then("{string} Error message should be displayed")
	public void error_message_should_be_displayed(String errorMsg) {
		String actErrorMsg = companiesPage.addAccountErrorMsg();
		Assert.assertEquals(actErrorMsg, errorMsg);
	}

	@When("user should be able to add account name{string}")
	public void user_should_be_able_to_add_account_name_automate_dr(String acc) throws InterruptedException {
		companiesPage.enterAccountName(acc);

	}

	@Then("user should be able to see add Account name in the daily reconciled page")
	public void user_should_be_able_to_see_update_account_name_in_the_daily_reconciled_page_automate_dr()
			throws InterruptedException {
		companiesPage.getAccountStatusDr();

	}

	@And("user should be click on edit button on Daily Reconciled page")
	public void user_should_be_click_on_edit_button_on_daily_reconciled() {
		companiesPage.click_EditButton_Account();
	}

	@And("user should be able to update account name")
	public void user_should_be_able_to_update_account_name(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> editAccountInfo = dataTable.asMaps();
		String accName = editAccountInfo.get(0).get("Update Account Name");
		companiesPage.update_Account(accName);
	}

	@Then("user should be able to see Update Account name in the daily reconciled page")
	public void user_should_be_able_to_see_update_account_name() {
		Assert.assertTrue(companiesPage.getupdateAccountStatus());
	}

	@When("user should be change the account in the daily reconciled Page{string}")
	public void user_should_be_change_the_account_in_the_daily_reconciled_page_dr00(String ac)
			throws InterruptedException {
		companiesPage.change_Account(ac);
	}

	@And("user should be able to click on add button in the account at daily reconciled page")
	public void user_should_be_able_to_click_on_add_button() throws InterruptedException {
		companiesPage.click_On_AddButton_For_Payment();
	}

	@And("user should be able to enter the field for new payment at add new payment popup")
	public void user_should_be_able_to_enter_the_field_for_new_payment(DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> drInfo = dataTable.asMaps();
		String pn = drInfo.get(0).get("payee");
		String date = drInfo.get(0).get("date");
		String a = drInfo.get(0).get("amount");
		companiesPage.enter_The_Fields_New_Payment(pn, date, a);
	}

	@Then("user should be able to see the Transaction at the account in the daily reconciled page{string}")
	public void user_should_be_able_to_see_the_transaction_at_the_account_in_the_daily_reconciled_page(String ext) {
		String act = companiesPage.getTransactionStatus();
		Assert.assertEquals(act, ext);
	}

	@Then("user should be able to see the count of Unclreared Transactionsin statistics page{string}")
	public void user_should_be_able_to_see_the_count_of_unclreared_transactionsin_statistics_page(String ext) {
	    String act = companiesPage.getUnclearedTransaction();
	    Assert.assertEquals(act, ext);
	}
	
	@Then("user should be able to  close New Payment popup in the account at daily reconciled page")
	public void user_should_be_able_to_close_new_payment_popup_in_the_account_at_daily_reconciled_page() throws InterruptedException {
		companiesPage.getAddPaymentPoupCloseStatus();
	}

	@And("user should be able to click on edit button in the account at daily reconciled page")
	public void user_should_be_able_to_click_on_edit_button_in_the_account_at_daily_reconciled_page() {
		companiesPage.clickOnEditButtonOfDailyReconciled();
	}

	@And("user should be able to update the field for new payment at add new payment popup")
	public void user_should_be_able_to_update_the_field_for_new_payment_at_add_new_payment_popup_p01(
			DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> drInfo = dataTable.asMaps();
		String pn = drInfo.get(0).get("payee");
		String date = drInfo.get(0).get("date");
		String a = drInfo.get(0).get("amount");
		companiesPage.enter_update_Fields_New_Payment(pn, date, a);
	}

	@Then("user should be able to see the update Transaction at the account in the daily reconciled page{string}")
	public void user_should_be_able_to_see_the_update_transaction_at_the_account_in_the_daily_reconciled_page(String ext) throws InterruptedException {
		String act = companiesPage.getUpdateTransactionStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to delete the payment in the account at daily reconciled page")
	public void user_should_be_able_to_delete_the_payment_in_the_account_at_daily_reconciled_page()
			throws InterruptedException {
		companiesPage.deletePayment();
	}
	
	@Then("user should be able to see the count of Unclreared Transactions after delete in statistics page{string}")
	public void user_should_be_able_to_see_the_count_of_unclreared_transactions_after_delete_in_statistics_page(String ext) {
		String act = companiesPage.getUnclearedTransaction();
	    Assert.assertEquals(act, ext);
	}



	@And("user should be able to delete the account in the daily reconciled page")
	public void user_should_be_able_to_delete_the_account_in_the_daily_reconciled_page() throws InterruptedException {
		companiesPage.deleteAccount();
	}
////////////////////Companies>>Dashboard>>Transaction////////////////////////////////////////////////////

	@When("user should be clicked on Transaction Tab")
	public void user_should_be_clicked_on_transaction_tab() throws InterruptedException {
		companiesPage.clickTrasactionTab();
		Thread.sleep(1000);
	}

	@Then("user should be on transaction page of company page{string}")
	public void user_should_be_on_transaction_page_of_company_page(String ect) {
		String act = companiesPage.getTrsanction();
		Assert.assertEquals(act, ect);
	}

	@And("user should be able to click on add button in the Payment Deposited but not Received widget")
	public void user_should_be_able_to_click_on_add_button_in_the_payment_deposited_but_not_received_widget() {
		companiesPage.clickAddButtonPaymentDeposited();
	}

	@Then("user should be able to close the Add Transaction of Payment Deposited but not Received successfully")
	public void user_should_be_able_to_close_the_add_transaction_of_payment_deposited_but_not_received_successfully() {
		companiesPage.closeAddTransactionPopupPaymentDeposited();
	}

	@And("user should be clicked on add button in add transaction popup of Payment Deposited but not Received widget")
	public void user_should_be_clicked_on_add_button_in_add_transaction_popup_of_payment_deposited_but_not_received_widget() {
		companiesPage.clickAddButtonAddTransactionPaymentDeposited();
	}

	@Then("User should see an validation message for vendor Name{string}")
	public void user_should_see_an_validation_message_for_vendor_name_vendor_name_can_t_be_blank(String exterror) {
		String acterrorMSg = companiesPage.getVendorNameErrorMsg();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@Then("User should see an validation message for date{string}")
	public void user_should_see_an_validation_message_for_date_date_can_t_be_blank1(String exterror) {
		String acterrorMSg = companiesPage.getDateErrorMsg();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@Then("User should see an validation message for amount{string}")
	public void user_should_see_an_validation_message_for_amountPaymentDeposited(String exterror) {
		String acterrorMSg = companiesPage.getAmountCannotBeBlankErrorMsg();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@And("user should be able to enter all the fields in add transaction popup of Payment Deposited but not Received widget")
	public void user_should_be_able_to_enter_all_the_fields_in_add_transaction_popup_of_payment_deposited_but_not_received_widget(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> paymentDepositedInfo = dataTable.asMaps();
		String vName = paymentDepositedInfo.get(0).get("vendor name");
		String bAccount = paymentDepositedInfo.get(0).get("Bank Account");
		String date = paymentDepositedInfo.get(0).get("date");
		String amount = paymentDepositedInfo.get(0).get("Amount");
		companiesPage.addTransactionPaymentDeposited(vName, bAccount, date, amount);
	}

	@Then("user should be able to see record of the Payment Deposited but not Received widget{string}")
	public void user_should_be_able_to_see_record_of_the_payment_deposited_but_not_received_widget(String ext) {
		String act = companiesPage.getTransactionPaymentDeposited();
		Assert.assertEquals(act, ext);
	}

	@Then("user should be able to see the count of Payment Not Received in statistics page{string}")
	public void user_should_be_able_to_see_the_count_of_payment_not_received_in_statistics_page(String ext) {
		String act =companiesPage.getPaymentNotRecievedStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to click on edit button in the Payment Deposited but not Received widget")
	public void user_should_be_able_to_click_on_edit_button_in_the_payment_deposited_but_not_received_widget() {
		companiesPage.clickEditButtonPaymentDeposited();
	}

	@And("user should be able to update all the fields in add transaction popup of Payment Deposited but not Received widget")
	public void user_should_be_able_to_update_all_the_fields_in_add_transaction_popup_of_payment_deposited_but_not_received_widget(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> paymentDepositedInfo = dataTable.asMaps();
		String vName = paymentDepositedInfo.get(0).get("vendor name");
		String bAccount = paymentDepositedInfo.get(0).get("Bank Account");
		String date = paymentDepositedInfo.get(0).get("date");
		String amount = paymentDepositedInfo.get(0).get("Amount");

		companiesPage.editTransactionPaymentDeposited(vName, bAccount, date, amount);
	}

	@Then("user should be able to see updated record of the Payment Deposited but not Received widget{string}")
	public void user_should_be_able_to_see_updated_record_of_the_payment_deposited_but_not_received_widget(String ext) throws InterruptedException {
		String act = companiesPage.getUpdatedTransactionPaymentDeposited();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to  delete  Payment Deposited record")
	public void user_should_be_able_to_delete_payment_deposited_record() throws InterruptedException {
		companiesPage.deletePaymentDeposted();
	}
	
	@Then("user should be able to see the count of Payment Not Received in statistics page after delete{string}")
	public void user_should_be_able_to_see_the_count_of_payment_not_received_in_statistics_page_After_delete(String ext) {
		String act =companiesPage.getPaymentNotRecievedStatus();
		Assert.assertEquals(act, ext);
	}


	@And("user should be able to click on add button in the Payment Received but not Deposited widget")
	public void user_should_be_able_to_click_on_add_button_in_the_payment_received_but_not_deposited_widget() {
		companiesPage.clickAddButtonPaymentRecieved();
	}

	@Then("user should be able to close the Add Transaction of Payment Received but not Deposited successfully")
	public void user_should_be_able_to_close_the_add_transaction_of_payment_received_but_not_deposited_successfully() {
		companiesPage.closeAddTransactionPopupPaymentRecieved();
	}

	@And("user should be clicked on add button in add transaction popup of Payment Received but not Deposited widget")
	public void user_should_be_clicked_on_add_button_in_add_transaction_popup_of_payment_received_but_not_deposited_widget() {
		companiesPage.clickAddButtonAddTransactionPaymentRecieved();
	}

	@Then("User should see an validation message for vendor Name of Payment Received but not Deposited widget{string}")
	public void user_should_see_an_validation_message_for_vendor_name_of_payment_received_but_not_deposited_widget_vendor_name_can_t_be_blank(
			String exterror) {
		String acterrorMSg = companiesPage.getVendorNameErrorMsgAddTransactionPaymentRecieved();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@Then("User should see an validation message for date of Payment Received but not Deposited widget{string}")
	public void user_should_see_an_validation_message_for_date_of_payment_received_but_not_deposited_widget_date_can_t_be_blank(
			String exterror) {
		String acterrorMSg = companiesPage.getDateErrorMsgAddTransactionPaymentRecieved();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@Then("User should see an validation message for amount of Payment Received but not Deposited widget")
	public void user_should_see_an_validation_message_for_amount_of_payment_received_but_not_deposited_widget() {
		companiesPage.getAmountCannotBeBlankErrorMsgPaymentRecieved();

	}

	@When("user should be able to enter all the fields in add transaction popup of Payment Received but not Deposited widget")
	public void user_should_be_able_to_enter_all_the_fields_in_add_transaction_popup_of_payment_received_but_not_deposited_widget(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> paymentDepositedInfo = dataTable.asMaps();
		String vName = paymentDepositedInfo.get(0).get("vendor name");
		String bAccount = paymentDepositedInfo.get(0).get("Bank Account");
		String date = paymentDepositedInfo.get(0).get("date");
		String amount = paymentDepositedInfo.get(0).get("Amount");

		companiesPage.addTransactionPaymentRecieved(vName, bAccount, date, amount);
	}

	@Then("user should be able to see record of the Payment Received but not Deposited widget{string}")
	public void user_should_be_able_to_see_record_of_the_payment_received_but_not_deposited_widget(String ext) {
		String act = companiesPage.getTransactionPaymentRecived();
		Assert.assertEquals(act, ext);

	}

	@Then("user should be able to see the count of Payment Not yet deposited in statistics page{string}")
	public void user_should_be_able_to_see_the_count_of_payment_not_yet_deposited_in_statistics_page(String ext) {
		String act= companiesPage.getPaymentNotYetDeposited();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to click on edit button in the Payment Received but not Deposited widget")
	public void user_should_be_able_to_click_on_edit_button_in_the_payment_received_but_not_deposited_widget() {
		companiesPage.clickEditButtonPaymentRecived();
	}

	@When("user should be able to update all the fields in add transaction popup of Payment Received but not Deposited widget")
	public void user_should_be_able_to_update_all_the_fields_in_add_transaction_popup_of_payment_received_but_not_deposited_widget(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> paymentDepositedInfo = dataTable.asMaps();
		String vName = paymentDepositedInfo.get(0).get("vendor name");
		String bAccount = paymentDepositedInfo.get(0).get("Bank Account");
		String date = paymentDepositedInfo.get(0).get("date");
		String amount = paymentDepositedInfo.get(0).get("Amount");

		companiesPage.editTransactionPaymentRecived(vName, bAccount, date, amount);
	}

	@Then("user should be able to see updated record of the Payment Received but not Deposited widget{string}")
	public void user_should_be_able_to_see_updated_record_of_the_payment_received_but_not_deposited_widget(String ext) {
		String act = companiesPage.getUpdatedTransactionPaymentRecived();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to delete Payment Received record")
	public void user_should_be_able_to_delete_payment_recieved_record() throws InterruptedException {
		companiesPage.deletePaymentRecived();
	}
	
	@Then("user should be able to see the count of Payment Not yet deposited after delete transaction in statistics page{string}")
	public void user_should_be_able_to_see_the_count_of_payment_not_yet_deposited_after_delete_transaction_in_statistics_page(String ext) {
		String act= companiesPage.getPaymentNotYetDeposited();
		Assert.assertEquals(act, ext);
	}

	@When("user should be able to click on add button in the Unknown Transactions widget")
	public void user_should_be_able_to_click_on_add_button_in_the_unknown_transactions_widget() {
		companiesPage.clickAddButtonUnknownTransactions();
	}

	@Then("user should be able to close the Add Transaction of Unknown Transactions successfully")
	public void user_should_be_able_to_close_the_add_transaction_of_unknown_transactions_successfully() {
		companiesPage.closeAddTransactionPopupUnknownTransactions();
	}

	@When("user should be clicked on add button in add transaction popup of Unknown Transactions widget")
	public void user_should_be_clicked_on_add_button_in_add_transaction_popup_of_unknown_transactions_widget() {
		companiesPage.clickAddButtonAddTransactionUnknownTransactions();
	}

	@Then("User should see an validation message for vendor Name of Unknown Transactions widget{string}")
	public void user_should_see_an_validation_message_for_vendor_name_of_unknown_transactions_widget_vendor_name_can_t_be_blank(
			String exterror) {
		String acterrorMSg = companiesPage.getVendorNameErrorMsgAddTransactionUnknownTransactions();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@Then("User should see an validation message for date of Unknown Transactions widget{string}")
	public void user_should_see_an_validation_message_for_date_of_unknown_transactions_widget_date_can_t_be_blank(
			String exterror) {
		String acterrorMSg = companiesPage.getDateErrorMsgAddTransactionUnknownTransactions();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@Then("User should see an validation message for amount of Unknown Transactions widget")
	public void user_should_see_an_validation_message_for_amount_of_unknown_transactions_widget() {
		companiesPage.getAmountCannotBeBlankErrorMsgUnknownTransactions();

	}

	@When("user should be able to enter all the fields in add transaction popup of Unknown Transactions widget")
	public void user_should_be_able_to_enter_all_the_fields_in_add_transaction_popup_of_unknown_transactions_widget(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> paymentDepositedInfo = dataTable.asMaps();
		String vName = paymentDepositedInfo.get(0).get("vendor name");
		String bAccount = paymentDepositedInfo.get(0).get("Bank Account");
		String date = paymentDepositedInfo.get(0).get("date");
		String amount = paymentDepositedInfo.get(0).get("Amount");

		companiesPage.addTransactionUnknownTransactions(vName, bAccount, date, amount);
	}

	@Then("user should be able to see record of the Unknown Transactions widget{string}")
	public void user_should_be_able_to_see_record_of_the_unknown_transactions_widget(String ext) throws InterruptedException {
		String act = companiesPage.getTransactionUnknownTransactions();
		Assert.assertEquals(act, ext);
	}

	@Then("user should be able to see the count of unkown transactions in statistics page{string}")
	public void user_should_be_able_to_see_the_count_of_unkown_transactions_in_statistics_page(String ext) {
		String act = companiesPage.getUnknownTransactions();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to click on edit button in the Unknown Transactions widget")
	public void user_should_be_able_to_click_on_edit_button_in_the_unknown_transactions_widget() {
		companiesPage.clickEditButtonUnknownTransactions();
	}

	@And("user should be able to update all the fields in add transaction popup of Unknown Transactions widget")
	public void user_should_be_able_to_update_all_the_fields_in_add_transaction_popup_of_unknown_transactions_widget(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> paymentDepositedInfo = dataTable.asMaps();
		String vName = paymentDepositedInfo.get(0).get("vendor name");
		String bAccount = paymentDepositedInfo.get(0).get("Bank Account");
		String date = paymentDepositedInfo.get(0).get("date");
		String amount = paymentDepositedInfo.get(0).get("Amount");

		companiesPage.editTransactionUnknownTransactions(vName, bAccount, date, amount);
	}

	@Then("user should be able to see updated record of the Unknown Transactions widget{string}")
	public void user_should_be_able_to_see_updated_record_of_the_unknown_transactions_widget(String ext) {
		String act = companiesPage.getUpdatedTransactionUnknownTransactions();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to delete Unknown Transactions widget record")
	public void user_should_be_able_to_delete_unknown_transactions_widget_record() throws InterruptedException {
		companiesPage.deleteUnknownTransactions();
	}
	
	@Then("user should be able to see the count of unkown transactions after delete transaction in statistics page{string}")
	public void user_should_be_able_to_see_the_count_of_unkown_transactions_after_delete_transaction_in_statistics_page(String ext) {
		String act = companiesPage.getUnknownTransactions();
		Assert.assertEquals(act, ext);
	}



/////////////////////////////BILLS.COM VS QBO/////////////////////////////////////////

	@And("user should be clicked on Bills.com Tab")
	public void user_should_be_clicked_on_bills_com_tab() {
		companiesPage.clickBillsTab();
	}

	@Then("user should be on bills.com page of company page{string}")
	public void user_should_be_on_bills_com_page_of_company_page_transaction(String ext) {
		String act = companiesPage.billsStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to click on add button in the Bills in Bills.com that are not sync in QBO widget")
	public void user_should_be_able_to_click_on_add_button_in_the_bills_in_bills_com_that_are_not_sync_in_qbo_widget() {
		companiesPage.clickAddButtonBillsinBillscomthatarenotsyncinQBO();
	}

	@Then("User should see an validation message for vendor Namein the add transactionPopup{string}")
	public void user_should_see_an_validation_message_for_vendor_namein_the_add_transaction_popup_vendor_name_can_t_be_blank(
			String ext) {
		String act = companiesPage.getVendorNameErrorMsgAddTransactionBillsinBillscomthatarenotsyncinQBO();
		Assert.assertEquals(act, ext);
	}

	@Then("User should see an validation message for date in the add transactionPopup{string}")
	public void user_should_see_an_validation_message_for_date_in_the_add_transaction_popup_date_can_t_be_blank(
			String ext) {
		String act = companiesPage.getDateErrorMsgAddTransactionBillsinBillscomthatarenotsyncinQBO();
		Assert.assertEquals(act, ext);
	}

	@When("user should be able to enter all the fields in add transaction popup ofBills in Bills.com that are not sync in QBO widget widget")
	public void user_should_be_able_to_enter_all_the_fields_in_add_transaction_popup_of_bills_in_bills_com_that_are_not_sync_in_qbo_widget_widget(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> billsInfo = dataTable.asMaps();
		String vName = billsInfo.get(0).get("vendor name");
		String bAccount = billsInfo.get(0).get("Bank Account");
		String date = billsInfo.get(0).get("date");
		String amount = billsInfo.get(0).get("Amount");

		companiesPage.addTransactionBillsinBillscomthatarenotsyncinQBO(vName, bAccount, date, amount);

	}

	@Then("user should be able to see record of the Bills in Bills.com that are not sync in QBO widget{string}")
	public void user_should_be_able_to_see_record_of_the_bills_in_bills_com_that_are_not_sync_in_qbo_widget(
			String ext) {
		String act = companiesPage.getTransactionBillsinBillscomthatarenotsyncinQBO();
		Assert.assertEquals(act, ext);
	}

	@When("user should be able to delete Bills in Bills.com that are not sync in QBO widget record")
	public void user_should_be_able_to_delete_bills_in_bills_com_that_are_not_sync_in_qbo_widget_record()
			throws InterruptedException {
		companiesPage.deleteBillsinBillscomthatarenotsyncinQBO();
	}

	@When("user should be able to click on add button in the Bills in Bills.com that are not outstanding in Bills.com widget")
	public void user_should_be_able_to_click_on_add_button_in_the_bills_in_bills_com_that_are_not_outstanding_in_bills_com_widget() {
		companiesPage.clickAddButtonBillsinBillscomthatarenotoutstandinginBillscom();
	}

	@Then("User should see an validation message for vendor Name in the add transactionPopup Bills in Bills.com that are not outstanding in Bills.com{string}")
	public void user_should_see_an_validation_message_for_vendor_name_in_the_add_transaction_popup_bills_in_bills_com_that_are_not_outstanding_in_bills_com_vendor_name_can_t_be_blank(
			String ext) {
		String act = companiesPage.getVendorNameErrorMsgAddTransactionBillsinBillscomthatarenotoutstandinginBillscom();
		Assert.assertEquals(act, ext);
	}

	@Then("User should see an validation message for date in the add transactionPopup Bills in Bills.com that are not outstanding in Bills.com{string}")
	public void user_should_see_an_validation_message_for_date_in_the_add_transaction_popup_bills_in_bills_com_that_are_not_outstanding_in_bills_com_date_can_t_be_blank(
			String ext) {
		String act = companiesPage.getDateErrorMsgAddTransactionBillsinBillscomthatarenotoutstandinginBillscom();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to enter all the fields in add transaction popup of Bills.com that are not outstanding in Bills.com widget")
	public void user_should_be_able_to_enter_all_the_fields_in_add_transaction_popup_of_bills_com_that_are_not_outstanding_in_bills_com_widget(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> billsInfo = dataTable.asMaps();
		String vName = billsInfo.get(0).get("vendor name");
		String bAccount = billsInfo.get(0).get("Bank Account");
		String date = billsInfo.get(0).get("date");
		String amount = billsInfo.get(0).get("Amount");
		companiesPage.addTransactionBillsinBillscomthatarenotoutstandinginBillscom(vName, bAccount, date, amount);
	}

	@Then("user should be able to see record of Bills.com that are not outstanding in Bills.com widget{string}")
	public void user_should_be_able_to_see_record_of_bills_com_that_are_not_outstanding_in_bills_com_widget_ravi(
			String ext) throws InterruptedException {
		String act = companiesPage.getTransactionBillsinBillscomthatarenotoutstandinginBillscom();
		Assert.assertEquals(act, ext);
	}

	@When("user should be able to delete Bills.com that are not outstanding in Bills.com widget record")
	public void user_should_be_able_to_delete_bills_com_that_are_not_outstanding_in_bills_com_widget_record()
			throws InterruptedException {
		companiesPage.deleteBillsinBillscomthatarenotoutstandinginBillscom();
	}

	@When("user should be enter the amount in bills.com calculate widget{string}")
	public void user_should_be_enter_the_amount_in_bills_com_calculate_widget(String amount)
			throws InterruptedException {
		companiesPage.enterAmountCalculateBillsWidget(amount);
	}

	@When("user should be enter the amount in QBO calculate widget.{string}")
	public void user_should_be_enter_the_amount_in_qbo_calculate_widget(String amount) throws InterruptedException {
		companiesPage.enterAmountCalculateQBOWidget(amount);
	}

	@Then("user should be able to see the difference between bills.com and QBO{string}")
	public void user_should_be_able_to_see_the_difference_between_bills_com_and_qbo(String ext) {
		String act = companiesPage.diffbetweenBillsAndQBO();
		Assert.assertEquals(act, ext);
	}

	///////////////////////////// Royalty
	///////////////////////////// Difference/////////////////////////////////////////

	@And("user should be clicked on Royalty Difference Tab in the company dashboard tab")
	public void getTransactionBillsinBillscomthatarenotsyncinQBO() {
		companiesPage.clickRoyaltyDiffTab();
	}

	@Then("user should be on royalty difference page of company page{string}")
	public void user_should_be_on_royalty_difference_page_of_company_page_royalty_difference(String ect) {
		String act = companiesPage.royaltyDifferenceStatus();
		Assert.assertEquals(act, ect);
	}

	@And("user should be clicked on edit franchise button in Royalty Difference page")
	public void user_should_be_clicked_on_add_franchise_button() {
		companiesPage.clickonaddFranchisebutton();
	}

	@Then("user should be able to see add franchise popup in Royalty Difference page")
	public void user_should_be_able_to_see_add_franchise_popup_in_royalty_difference_page() {
		companiesPage.getAddFranchisePopupStatus();
	}

	@And("User should be click on add button on Royalty and Difference PopUp")
	public void user_should_be_click_on_add_button_on_royalty_and_difference_pop_up() {
		companiesPage.clickAddBtnRoyaltyAndDifferennce();
	}

	@Then("{string} message should be displayed for franchise name in Royalty Difference PopUp")
	public void message_should_be_displayed_for_franchise_name_in_royalty_difference_pop_up(String exterror) {
		String acterrorMSg = companiesPage.getErrorMsgFranchiseName();
		Assert.assertEquals(acterrorMSg, exterror);
	}

	@And("user should be able to clicked on close button in Royalty Difference PopUp")
	public void user_should_be_able_to_clicked_close_button_in_royalty_difference_pop_up() {
		companiesPage.clickcloseBtnRoyaltyDiff();
	}

	@Then("Royalty Difference PopUp closed successfully{string}")
	public void royalty_difference_pop_up_closed_successfully(String ext) {
		String act = companiesPage.getRoyaltyDiffPopupCloseStatus();
		Assert.assertEquals(act, ext);
	}

	@When("User should be enter the fields for franchise in the Royalty Difference page")
	public void user_should_be_enter_the_fields_for_franchise_in_the_royalty_difference_page(DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> royaltyDifferenceInfo = dataTable.asMaps();
		String franchiseName = royaltyDifferenceInfo.get(0).get("franchisenumber");
		String royaltyDiffAmount = royaltyDifferenceInfo.get(0).get("servpronet");
		String rDiffQBO = royaltyDifferenceInfo.get(0).get("QBO");

		companiesPage.addFranciseFields(franchiseName, royaltyDiffAmount, rDiffQBO);
		Thread.sleep(1000);

	}

	@Then("user should be able to see the franchise in the Royalty Difference page")
	public void user_should_be_able_to_see_the_franchise_in_the_royalty_difference_page() throws InterruptedException {
		companiesPage.getaddFranchiseStatus();
	}

	@And("User should be enter the fields for update franchise in the Royalty Difference page")
	public void user_should_be_enter_the_fields_for_add_franchise(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> royaltyDifferenceInfo = dataTable.asMaps();
		String franchiseName = royaltyDifferenceInfo.get(0).get("franchisenumber");
		String royaltyDiffAmount = royaltyDifferenceInfo.get(0).get("servpronet");
		String rDiffQBO = royaltyDifferenceInfo.get(0).get("QBO");

		companiesPage.editFranciseFields(franchiseName, royaltyDiffAmount, rDiffQBO);
		Thread.sleep(1000);
	}

	@Then("user should be able to see the updated franchise in the Royalty Difference page")
	public void user_should_be_able_to_see_the_Updatedfranchise_in_the_royalty_difference_page()
			throws InterruptedException {
		companiesPage.getFranchiseStatus();
	}

	@And("User should be enter the fields for change franchise in the Royalty Difference page")
	public void user_should_be_enter_the_fields_for_change_franchise_in_the_royalty_difference_page(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> royaltyDifferenceInfo = dataTable.asMaps();
		String franchiseName = royaltyDifferenceInfo.get(0).get("franchisenumber");
		String rDiffQBO = royaltyDifferenceInfo.get(0).get("QBO");
		String royaltyDiffAmount = royaltyDifferenceInfo.get(0).get("servpronet");
		companiesPage.changeFranciseFields(franchiseName, rDiffQBO, royaltyDiffAmount);
		Thread.sleep(1000);
	}

	@And("user should be select year from year dropdown in the dashboard Royalty Difference page of the company")
	public void user_should_be_select_year_from_year_dropdown() throws InterruptedException {
		companiesPage.selectYear();
		Thread.sleep(1000);
	}

	@Then("user should be able to see the franchise according to year")
	public void user_should_be_able_to_see_the_franchise_according_to_year() throws InterruptedException {
		companiesPage.getFranchiseStatusAfterSearch();
	}

	////////// Details Tab////////////////////////////////

	@When("user should be clicked on Details Tab")
	public void user_should_be_clicked_on_details_tab() {
		companiesPage.click_Detils_Tab();
	}

	@Then("user should be on details page{string}")
	public void user_should_be_on_details_page_details(String ect) {
		String act = companiesPage.getDetailsPageStatus();
		Assert.assertEquals(act, ect);
	}

	@When("user should be click on edit button of company details")
	public void user_should_be_click_on_edit_button_of_company_details() {
		companiesPage.click_EditButton();
	}

	@When("user should be able to update companies details")
	public void user_should_be_able_to_update_companies_details(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> companyInfo = dataTable.asMaps();
		String ws = companyInfo.get(0).get("website");
		companiesPage.update_CompanyDetails(ws);
	}

	@Then("user should be able to see update website{string}")
	public void user_should_be_able_to_see_update_phone_number(String ext) {
		String act = companiesPage.getupdateWebsiteStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to change companies details")
	public void user_should_be_able_to_change_companies_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> companyInfo = dataTable.asMaps();
		String ws = companyInfo.get(0).get("website");
		companiesPage.changeCompanyDetails(ws);
	}

	@When("user should be click on close btn")
	public void user_should_be_click_on_close_btn() {
		companiesPage.clickCloseBtn();
	}

	@When("user should be able to click on add button on link section")
	public void user_should_be_able_to_click_on_add_button_on_link_section() {
		companiesPage.clickAddButtonLinkSection();
	}

	@When("user should be enter all fields of link popup")
	public void user_should_be_enter_all_fields_of_link_popup(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> linkInfo = dataTable.asMaps();
		String link = linkInfo.get(0).get("link");
		String website = linkInfo.get(0).get("website");
		companiesPage.Add_Links(link, website);
	}

	@Then("links should be displayed on link section{string}")
	public void links_should_be_displayed_on_link_section(String ext) {
		String act = companiesPage.getlinkStatus();
		Assert.assertEquals(act, ext);
	}

	@When("user should click on add button on link popup")
	public void user_should_click_on_add_button_on_link_popup() {
		companiesPage.clickonAddButtonLinkPopup();
	}

	@Then("user should be able to see error message for link")
	public void user_should_be_able_to_see_error_message_for_link() {
		companiesPage.getErrorMsgForLink();
	}

	@Then("user should be able to see error message for website")
	public void user_should_be_able_to_see_error_message_for_website() {
		companiesPage.getErrorMsgForwebsite();
	}

	@When("user should click on close button on link popup")
	public void user_should_click_on_close_button_on_link_popup() {
		companiesPage.click_CloseBtn_Linkpopup();
	}

	@When("user should be click on edit button link section")
	public void user_should_be_click_on_edit_button_link_section() {
		companiesPage.click_EditBtn_Linksection();
	}

	@When("user should be edit website detail on link section")
	public void user_should_be_edit_website_detail_on_link_section(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> linkInfo = dataTable.asMaps();
		String link = linkInfo.get(0).get("link");
		String website = linkInfo.get(0).get("website");
		companiesPage.update_link(website, link);
	}

	@Then("user should able to see edit details on link section{string}")
	public void user_should_able_to_see_edit_details_on_link_section(String ext) throws InterruptedException {
		String act = companiesPage.getUpdateLinkStatus();
		Assert.assertEquals(act, ext);
	}

	@When("user should be able to delete links")
	public void user_should_be_able_to_delete_links() throws InterruptedException {
		companiesPage.clickOnDeleteBtnLink();
	}

	@When("user should be click on add button company detail section")
	public void user_should_be_click_on_add_button_company_detail_section() {
		companiesPage.clickonAddBtnCompanyDetailSection();
	}

	@When("user should be able add contact details")
	public void user_should_be_able_add_contact_details(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> conatctInfo = dataTable.asMaps();
		String contact = conatctInfo.get(0).get("contact");
		String report = conatctInfo.get(0).get("report");
		companiesPage.addContactDetails(contact, report);
	}

	@Then("contact should be displayed on company detail section{string}")
	public void contact_should_be_displayed_on_company_detail_section(String ext) throws InterruptedException {
		String act = companiesPage.getContactStatus();
		Assert.assertEquals(act, ext);
	}

	@When("user should be able close contact detailpopup")
	public void user_should_be_able_close_contact_detailpopup() {
		companiesPage.closebtnContactDetailPopup();
	}

	@When("user should be click on edit button company detail section")
	public void user_should_be_click_on_edit_button_company_detail_section() throws InterruptedException {
		companiesPage.clickOnEditBtnCompanyDetailSection();
	}

	@And("user should be able update contact detail{string}")
	public void user_should_be_able_update_contact_detail(String e) {
		companiesPage.update_companyDetail(e);
	}

	@Then("user should be see the update contact details")
	public void user_should_be_see_the_update_contact_details() throws InterruptedException {
		companiesPage.getcompanyDetailStatus();
	}

	@When("user able to delete company detail")
	public void user_able_to_delete_company_detail() throws InterruptedException {
		companiesPage.clickOnDeleteBtnCompanyDetail();
	}

	@When("user should be able to click on add button on companies contact section")
	public void user_should_be_able_to_click_on_add_button_on_companies_contact_section() {
		companiesPage.clickonAddBtnCompaniesContactSection();
	}

	@When("user should be enter all fields of contacts popup")
	public void user_should_be_enter_all_fields_of_contacts_popup(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> contactInfo = dataTable.asMaps();
		String fName = contactInfo.get(0).get("firstname");
		String lName = contactInfo.get(0).get("lastname");
		String email = contactInfo.get(0).get("email");
		String pn = contactInfo.get(0).get("phonenumber");
		String c = contactInfo.get(0).get("company");
		companiesPage.enterContactInfoForCompaniesContactSection(fName, lName, email, pn, c);
		Thread.sleep(1000);

	}

	@Then("company contact should be displayed on companies contact section{string}")
	public void company_contact_should_be_displayed_on_companies_contact_section(String ext) {
		String act = companiesPage.getCompanyContactStatus();
		Assert.assertEquals(ext, act);
	}

	@When("user should be able to click on edit button on companies contact section")
	public void user_should_be_able_to_click_on_edit_button_on_companies_contact_section() {
		companiesPage.clickonEditBtnCompaniesContactSection();
	}

	@When("user should be update all fields of contacts popup")
	public void user_should_be_update_all_fields_of_contacts_popup(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> contactInfo = dataTable.asMaps();
		String fName = contactInfo.get(0).get("firstname");
		String lName = contactInfo.get(0).get("lastname");
		String email = contactInfo.get(0).get("email");
		String pn = contactInfo.get(0).get("phonenumber");
		String company = contactInfo.get(0).get("company");
		companiesPage.updateContactInfoForCompaniesContactSection(fName, lName, email, pn, company);
		Thread.sleep(1000);

	}

	@Then("update company contact should be displayed on companies contact section{string}")
	public void update_company_contact_should_be_displayed_on_companies_contact_section(String ext) {
		String act = companiesPage.getupdateCompanyContactStatus();
		Assert.assertEquals(act, ext);
	}

	@When("user able to delete company contact detils")
	public void user_able_to_delete_company_contact_detils() throws InterruptedException {
		companiesPage.deleteCompanyContact();
	}

	@When("user should be click on add button staff member section")
	public void user_should_be_click_on_add_button_staff_member_section() throws InterruptedException, AWTException {
		companiesPage.clickonAddBtnStaffSection();
	}

	@When("user should be able add staff details{string}")
	public void user_should_be_able_add_staff_details(String staff) throws InterruptedException {
		companiesPage.addStaffDetails(staff);
	}

	@Then("staff member details should be displayed on staff detail section{string}")
	public void staff_member_details_should_be_displayed_on_staff_detail_section(String ext) {
		String act = companiesPage.getStaffMemberStatus();
		Assert.assertEquals(ext, act);
	}

	@And("user should be click on edit button staff member section")
	public void user_should_be_click_on_edit_button_staff_member_section() {
		companiesPage.clickEditBtnStaffMemeber();
	}

	@And("user should be able update staff details")
	public void user_should_be_able_update_staff_details(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> staffInfo = dataTable.asMaps();
		String t = staffInfo.get(0).get("title");
		String date = staffInfo.get(0).get("date");
		companiesPage.editStaffDetails(t, date);
	}

	@Then("updated staff member details should be displayed on staff detail section{string}")
	public void updated_staff_member_details_should_be_displayed_on_staff_detail_section_admin_on_track(String ext) {
		String act = companiesPage.getUpdatedStaffMemberStatus();
		Assert.assertEquals(act, ext);
	}

	@When("user should be able to change staff details{string}")
	public void user_should_be_able_to_change_staff_details_final_check(String name) {
		companiesPage.changeStaffMemeberName(name);
	}

	@And("user able to delete staff member details")
	public void user_able_to_delete_staff_member_details() throws InterruptedException {
		companiesPage.deleteStaffDetails();
	}

	@And("user should be able to click on add button in the notes section")
	public void user_should_be_able_to_click_on_add_button_in_the_notes_section() throws InterruptedException {
		companiesPage.clickonAddBtnNotesSection();
	}

	@And("user should be enter all fields of notes popup")
	public void user_should_be_enter_all_fields_of_notes_popup_automate_notes(DataTable dataTable) throws InterruptedException {
		
		List<Map<String, String>> staffInfo = dataTable.asMaps();
		String subject = staffInfo.get(0).get("subject");
		String notes = staffInfo.get(0).get("notes");
		companiesPage.addNotesDetails(subject,notes);
	}

	@Then("notes should be displayed in the notes section{string}")
	public void company_contact_should_be_displayed_in_the_notes_section_automate_notes(String ext) {
		String act = companiesPage.getnotesStatus();
		Assert.assertEquals(act, ext);
	}

	@When("user should be able to click on edit button in the notes section")
	public void user_should_be_able_to_click_on_edit_button_in_the_notes_section() throws InterruptedException {
		companiesPage.clickonEditBtnNotesSection();
	}

	@When("user should be edit enter all fields of notes popup{string}")
	public void user_should_be_edit_enter_all_fields_of_notes_popup_automate_notes(String n)
			throws InterruptedException {
		companiesPage.editNotesDetails(n);
	}

	@Then("updated notes should be displayed in the notes section{string}")
	public void updated_notes_should_be_displayed_in_the_notes_section_automate_notes(String ext) {
		String act = companiesPage.getUpdatednotesStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user able to delete notes")
	public void user_able_to_delete_notes() throws InterruptedException {
		companiesPage.deleteNotes();
	}

	////////////////////////// LOGINS Page//////////////////////////////////////

	@When("user should be on logins page")
	public void user_should_be_on_logins_page() throws InterruptedException {
		companiesPage.click_LoginTab();
		Thread.sleep(1000);
	}

	@Then("user should check url of the page {string}")
	public void user_should_check_url_of_the_page(String ext) {
		String act = companiesPage.getLoginsTabUrl();
		Assert.assertEquals(act, ext);
	}

	@When("user should be click on Add logins button")
	public void user_should_be_click_on_add_logins_button() {
		companiesPage.click_AddLogins_Button();

	}

	@When("user should be able to add button on login popup")
	public void user_should_be_able_to_add_button_on_login_popup() {
		companiesPage.click_AddButton_loginpopup();
	}

	@Then("user should be get errormsg on website field {string}")
	public void user_should_be_get_errormsg_on_website_field(String ext) {
		String act = companiesPage.getWebsiteErrorMsg();
		Assert.assertEquals(act, ext);
	}

	@Then("user should be get errormsg on name field {string}")
	public void user_should_be_get_errormsg_on_userid_field(String ext) {
		String act = companiesPage.getNameErrorMsg();
		Assert.assertEquals(act, ext);
	}

	@Then("user should be get errormsg on notes field {string}")
	public void user_should_be_get_errormsg_on_notes_field(String ext) {
		String act = companiesPage.getNotesErrorMsg();
		Assert.assertEquals(act, ext);
	}

	@When("user should be add logins")
	public void user_should_be_add_logins(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> loginsInfo = dataTable.asMaps();
		String name = loginsInfo.get(0).get("name");
		String website = loginsInfo.get(0).get("website");
		String companycode = loginsInfo.get(0).get("companycode");
		String password = loginsInfo.get(0).get("password");
		String notes = loginsInfo.get(0).get("notes");
		String acountNumber = loginsInfo.get(0).get("accountnumber");
		String sq = loginsInfo.get(0).get("securityques");
		String ans = loginsInfo.get(0).get("answer");

		companiesPage.addLoginsDetails(name, website, companycode, password, notes, acountNumber, sq, ans);
	}

	@Then("user should see the logins detials{string}")
	public void user_should_see_the_logins_detials(String ext) throws InterruptedException {
		String act = companiesPage.getNameStatus();
		Assert.assertEquals(act, ext);
	}

	@When("user should be click on edit button on logins list")
	public void user_should_be_click_on_edit_button_on_logins_list() {
		companiesPage.clickEditBtnloginsListPage();
	}

	@When("user should be able to update logins details")
	public void user_should_be_able_to_update_logins_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> loginsInfo = dataTable.asMaps();
		String name = loginsInfo.get(0).get("name");
		String website = loginsInfo.get(0).get("website");
		String companycode = loginsInfo.get(0).get("companycode");
		String notes = loginsInfo.get(0).get("notes");
		String acountNumber = loginsInfo.get(0).get("accountnumber");
		String sq = loginsInfo.get(0).get("securityques");
		String answer = loginsInfo.get(0).get("answer");

		companiesPage.updateLoginsDetails(name, website, companycode, notes, acountNumber, sq, answer);
	}

	@Then("user should see the edit logins detials{string}")
	public void user_should_see_the_edit_logins_detials(String ext) throws InterruptedException {
		String act = companiesPage.getUpdateLoginsStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to delete security ques in the logins details")
	public void user_should_be_able_to_delete_security_ques_in_the_logins_details() {
		companiesPage.deleteSecurityQuesiAddLoginsPopup();
	}

	@Then("user should see the edit logins detials after delete security ques in the logins details{string}")
	public void user_should_see_the_edit_logins_detials_after_delete_security_ques_in_the_logins_details_admin_automate(
			String ext) throws InterruptedException {
		String act = companiesPage.getUpdateLoginsStatus();
		Assert.assertEquals(act, ext);
	}

	@When("user should be able delete logins")
	public void user_should_be_able_delete_logins() throws InterruptedException {
		companiesPage.deleteLogins();
	}

	////////////////////// TASKS PAGE/////////////////////////////////

	@When("user should be on tasks page")
	public void user_should_be_on_tasks_page() throws InterruptedException {
		companiesPage.tasksPage();
	}

	@Then("user should check url of the tasks page {string}")
	public void user_should_check_url_of_the_tasks_page(String ext) {
		String act = companiesPage.getTasksTab();
		Assert.assertEquals(act, ext);
	}

	@When("user should be click on Add tasks button in the tasks page")
	public void user_should_be_click_on_add_tasks_button() throws InterruptedException {
		companiesPage.click_AddTask_Button();
	}

	@When("user should be able to add button on tasks popup")
	public void user_should_be_able_to_add_button_on_tasks_popup() {
		companiesPage.click_AddButton_Taskpopup();
	}

	@Then("user should be get errormsg on task name field {string}")
	public void user_should_be_get_errormsg_on_task_name_field(String ext) {
		String act = companiesPage.getTaskNameErrorMsg();
		Assert.assertEquals(act, ext);
	}

	@Then("user should be get errormsg on asigned to field {string}")
	public void user_should_be_get_errormsg_on_asigned_to_field(String ext) {
		String act = companiesPage.getAssignedToErrorMsg();
		Assert.assertEquals(act, ext);
	}

	@Then("user should be get errormsg on client field {string}")
	public void user_should_be_get_errormsg_on_client_field(String ext) {
		String act = companiesPage.getClientErrorMsg();
		Assert.assertEquals(act, ext);
	}

	@Then("user should be get errormsg on start date field {string}")
	public void user_should_be_get_errormsg_on_start_date_field(String ext) {
		String act = companiesPage.getStartDateErrorMsg();
		Assert.assertEquals(act, ext);
	}

	@When("user should be able to create task in the tasks page")
	public void user_should_be_able_to_create_task(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> TaskInfo = dataTable.asMaps();
		String tt = TaskInfo.get(0).get("task template");
		String name = TaskInfo.get(0).get("name");
		String assign = TaskInfo.get(0).get("assign");

		String company = TaskInfo.get(0).get("company");
		String taskrepeat = TaskInfo.get(0).get("taskrepeat");
		String date = TaskInfo.get(0).get("date");

		companiesPage.createTask(tt, name, assign, company, taskrepeat, date);
	}

	@Then("user should be see the task in the tasks page{string}")
	public void user_should_be_see_the_task(String ext) throws InterruptedException {
		String act = companiesPage.viewTask();
		Assert.assertEquals(act, ext);
	}

	@When("user should be able to click on task in the tasks page")
	public void user_should_be_able_to_click_on_task() throws InterruptedException {
		companiesPage.clickOnTask();
		Thread.sleep(1000);
	}

	@Then("user should be on task page")
	public void user_should_be_on_task_page() {
		companiesPage.taskPage();
	}

	@And("user should be add notes in the task tab")
	public void user_should_be_add_notes_in_the_task_tab(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> notesInfo = dataTable.asMaps();
		String assign = notesInfo.get(0).get("assign");
		String sub = notesInfo.get(0).get("subnotes");
		String notes = notesInfo.get(0).get("notedetail");
		companiesPage.addNotesInTaskTab(assign, sub, notes);
	}

	@Then("Notes should be displayed in the notestab")
	public void notes_should_be_displayed_in_the_notestab() {
		companiesPage.getNotesStatusTask();
	}

	@And("user should be add coachings in the notes of Task tab")
	public void user_should_be_add_coachings_in_the_notes_of_task_tab(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> notesInfo = dataTable.asMaps();
		String assign = notesInfo.get(0).get("assign");
		String sub = notesInfo.get(0).get("subnotes");
		String notes = notesInfo.get(0).get("notedetail");
		companiesPage.addcoachingsInTaskTab(assign, sub, notes);

	}

	@Then("coachings should be displayed in the notestab")
	public void coachings_should_be_displayed_in_the_notestab() {
		companiesPage.getCoachingsStatusTask();
	}

	@And("user should be able to add sections in the task page {string}")
	public void user_should_be_able_to_add_sections_in_the_task_page(String string) {
		companiesPage.addSetionTask(string);
	}

	@Then("Sections should be displayed on task page")
	public void sections_should_be_displayed_on_task_page() {
		companiesPage.getSectonsStatus();
	}

	@And("User should be create subtask of task in the task page{string}")
	public void user_should_be_create_subtask_of_task_in_the_task_page(String subtask) {
		companiesPage.createSubTask(subtask);
	}

	@Then("user should be able to see the subtask of the task{string}")
	public void user_should_be_able_to_see_the_subtask_of_the_task(String ext) throws InterruptedException {
		String act = companiesPage.getSubtaskStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to complete task")
	public void user_should_be_able_to_complete_task() throws InterruptedException {
		companiesPage.completeTask();
	}

	@Then("User should be able to see completed task in the task page{string}")
	public void user_should_be_able_to_see_completed_task_in_the_task_page_task01(String ext) throws InterruptedException {
		String act = companiesPage.getCompletedTaskStatus();
		Assert.assertEquals(act, ext);
	}

	@When("user should be click on edit tasks button in complete in the tasks page")
	public void user_should_be_click_on_edit_tasks_button_in_complete_in_the_tasks_page() {
		companiesPage.editBtnTaskComplete();
	}

	@When("user should be able to Update task in  complete task in the tasks page")
	public void user_should_be_able_to_update_task_in_complete_task_in_the_tasks_page(DataTable dataTable) {
		List<Map<String, String>> TaskInfo = dataTable.asMaps();
		String name = TaskInfo.get(0).get("name");
		String assign = TaskInfo.get(0).get("assign");
		String date = TaskInfo.get(0).get("date");
		companiesPage.updateTaskComplete(name, assign, date);
	}

	@Then("user should be able to see the updated task in complete in the tasks page{string}")
	public void user_should_be_able_to_see_the_updated_task_in_complete_in_the_tasks_page(String ext) {
		String act = companiesPage.getUpdateCompletedTaskStatus();
		Assert.assertEquals(act, ext);
	}

	@When("User should be delete task at complete task in the tasks page")
	public void user_should_be_delete_task_at_complete_task_in_the_tasks_page() throws InterruptedException {
		Thread.sleep(1000);
		companiesPage.deleteCompleteTask();
	}

	@Then("user should be should open task widget count{string}")
	public void user_should_be_should_open_task_widget_count(String ext) {
		String act = companiesPage.getOpenTaskWidget();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to Update task in the tasks page")
	public void user_should_be_able_to_update_task_in_the_tasks_page(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> TaskInfo = dataTable.asMaps();
		String name = TaskInfo.get(0).get("name");
		String assign = TaskInfo.get(0).get("assign");
		String date = TaskInfo.get(0).get("date");
		companiesPage.updateTask(name, assign, date);

	}

	@Then("user should be able to see the updated task in the tasks page")
	public void user_should_be_able_to_see_the_updated_task_in_the_tasks_page() {
		companiesPage.editTask();
	}

	@And("user should be click on delete btn tasks button in the tasks page")
	public void user_should_be_able_ot_delete_task_successfully() throws InterruptedException {
		companiesPage.deleteTask();

	}

	@And("user should click on QA Automation Template link for the company task")
	public void user_should_click_on_qa_automation_template_link_for_the_company_task() {
		companiesPage.clickCreatedTemplateLink();

	}

	@And("user should click on delete button at the QA Automation Template Page to delete the template for the company task")
	public void user_should_click_on_delete_button_at_the_qa_automation_template_page_to_delete_the_template_for_the_company_task()
			throws InterruptedException {
		companiesPage.clickOnDeleteBtnOfTemplate();
	}
	
	@When("user should be click on Add tasks button at recurring tab in the tasks page")
	public void user_should_be_click_on_add_tasks_button_at_recurring_tab_in_the_tasks_page() throws InterruptedException {
		companiesPage.clickAddBtnTaskRecurringTab();
	}

	
	@When("user should be able to create task at task recurring in the tasks page")
	public void user_should_be_able_to_create_task_at_task_recurring_in_the_tasks_page(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> TaskInfo = dataTable.asMaps();
		String tt = TaskInfo.get(0).get("task template");
		String name = TaskInfo.get(0).get("name");
		String assign = TaskInfo.get(0).get("assign");

		String company = TaskInfo.get(0).get("company");
		String taskrepeat = TaskInfo.get(0).get("taskrepeat");
		String date = TaskInfo.get(0).get("date");

		companiesPage.createRecurringTask(tt, name, assign, company, taskrepeat, date);
	}
	@Then("user should be see the task at task recurring tab in the tasks page{string}")
	public void user_should_be_see_the_task_at_task_recurring_tab_in_the_tasks_page_task12(String ext) {
	    String act= companiesPage.getRecurringTAskStatus();
	    Assert.assertEquals(act, ext);
	}
	
	@When("user should be click on edit button on task recurring tab")
	public void user_should_be_click_on_edit_button_on_task_recurring_tab() throws InterruptedException {
	  companiesPage.clickEditBtnTaskRecurringTab();
	}
	
	@When("user should be able to update task at task recurring in the tasks page")
	public void user_should_be_able_to_update_task_at_task_recurring_in_the_tasks_page(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> TaskInfo = dataTable.asMaps();
		String name = TaskInfo.get(0).get("name");
		String assign = TaskInfo.get(0).get("assign");
		String date = TaskInfo.get(0).get("date");
		companiesPage.editRecurringTask(name, assign, date);
	}

	@Then("user should be see the Update task at task recurring tab in the tasks page{string}")
	public void user_should_be_see_the_update_task_at_task_recurring_tab_in_the_tasks_page_task20(String ext) {
	    String act = companiesPage.getUpdateRecurringTAskStatus();
	    Assert.assertEquals(act, ext);
	}

	@When("user should be able to click on client link on a task")
	public void user_should_be_able_to_click_on_client_link_on_a_task() {
	   companiesPage.clickOnClientatTask();
	}

	@Then("user should be able to see company details on detail tab{string}")
	public void user_should_be_able_to_see_company_details_on_detail_tab_audi23automate(String ext) {
	    String act = companiesPage.getCompanyDetailsStatus();
	    Assert.assertEquals(act, ext);
	}
	
	
	@When("user should be able to click on assignee link on a task")
	public void user_should_be_able_to_click_on_assignee_link_on_a_task() {
	   companiesPage.clickOnasignee();
	}

	@Then("user should be able to see user details on detail tab{string}")
	public void user_should_be_able_to_see_user_details_on_detail_tab_final_check(String ext) {
	   String act = companiesPage.getUserStatus();
	   Assert.assertEquals(act, ext);
	}

	@Then("user should be should recurring task widget count{string}")
	public void user_should_be_should_recurring_task_widget_count(String ext) {
	    String act = companiesPage.getRecurringTaskWidget();
	    Assert.assertEquals(act, ext);
	}
	
	@When("user should be able to click on task of the company at tasks reoccurring page Task20")
	public void user_should_be_able_to_click_on_task_of_the_company_at_tasks_reoccurring_page_task() throws InterruptedException {
	   companiesPage.clickonTask();
	}

	@When("User should be able to update fields at recurring tab in the  company task tab for task tab")
	public void user_should_be_able_to_update_fields_at_recurring_tab_in_the_company_task_tab_for_task_tab(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
			List<Map<String, String>> taskInfo = dataTable.asMaps();
			String taskName = taskInfo.get(0).get("taskname");
			String template = taskInfo.get(0).get("template");

			String date = taskInfo.get(0).get("date");

			companiesPage.UpdateFieldsInAddTaskPopup(taskName, template, date);

	}

	@Then("user should be able to see the task recurring tab in the  company task tab for task tab{string}")
	public void user_should_be_able_to_see_the_task_recurring_tab_in_the_company_task_tab_for_task_tab_task21(String ext) {
	   String act = companiesPage.getRecurringUpdateTAskStatus();
	   Assert.assertEquals(act,ext);
	}

	@When("user should be click on delete btn in task recurring tab in the tasks page")
	public void user_should_be_click_on_delete_btn_in_task_recurring_tab_in_the_tasks_page() throws InterruptedException {
	    companiesPage.deleteTaskReccuringTasks();
	}
	//////////// Notes Tab//////////////////////////

	@When("user should be able to click on company notes tab")
	public void user_should_be_able_to_click_on_company_notes_tab() throws InterruptedException {
		companiesPage.click_NotesTab();
		Thread.sleep(1000);
	}

	@Then("user should be on company notes page{string}")
	public void user_should_be_on_company_notes_page_https_beta_cisin_com_companies_notes(String act) {
		String exp = companiesPage.CompanyNotesTab();
		Assert.assertEquals(exp, act);
	}

	@And("user should be able to click on add notes button in the company notes tab")
	public void user_should_be_able_to_click_on_add_notes_button_in_the_company_notes_tab()
			throws InterruptedException {
		companiesPage.clickAddnotes_Button();
		Thread.sleep(1000);
	}

	@Then("user should be able to see the add notes popup")
	public void user_should_be_able_to_see_the_add_notes_popup() {
		companiesPage.getAddNotesPopupStatus();
	}

	@And("user should be able to click on reset button at add notes popup")
	public void user_should_be_able_to_click_on_reset_button_at_add_notes_popup() {
		companiesPage.resetButtonAddNotesPopup();
	}

	@Then("user should be able to close the add notes popup")
	public void user_should_be_able_to_close_the_add_notes_popup() throws InterruptedException {
		companiesPage.closeAddNotesPopup();
	}

	@And("user should be able to click on add button at add notes popup")
	public void user_should_be_able_to_click_on_add_button_at_add_notes_popup() {
		companiesPage.addButtonAddNotesPopup();
	}

	@Then("user should be able to see the error on Assign To field {string}")
	public void user_should_be_able_to_see_the_error_on_assign_to_field(String string) {
		companiesPage.assignToFieldErrrorMsg();
	}

	@And("user should be able to create notes in the company notes page")
	public void user_should_be_able_to_create_notes_in_the_company_notes_page(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> notesInfo = dataTable.asMaps();
		String assign = notesInfo.get(0).get("assign");
		String sub = notesInfo.get(0).get("subject");
		String notes = notesInfo.get(0).get("notes");
		companiesPage.createNotes_NotesTab(assign, sub, notes);
	}

	@Then("user should be see the notes at company notes page")
	public void user_should_be_see_the_notes_at_company_notes_page() {
		companiesPage.getCreatedNotesStatus();
	}

	@And("user should be able to create coaching notes in the company notes page")
	public void user_should_be_able_to_create_coaching_notes_in_the_company_notes_page(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> notesInfo = dataTable.asMaps();
		String assign = notesInfo.get(0).get("assign");
		String sub = notesInfo.get(0).get("subject");
		String notes = notesInfo.get(0).get("notes");
		companiesPage.createCoachingNotes_NotesTab(assign, sub, notes);
	}

	@Then("user should be see the coaching notes at company notes page")
	public void user_should_be_see_the_coaching_notes_at_company_notes_page() {
		companiesPage.getCreatedCoachingNotesStatus();
	}

	@And("user should be able to click on coaching tab in the company notes tab")
	public void user_should_be_able_to_click_on_coaching_link_in_the_company_notes_tab() throws InterruptedException {
		companiesPage.clickCoaching();
		Thread.sleep(1000);
	}

	@Then("user should be able to see the coaching notes at company notes page")
	public void user_should_be_able_to_see_the_coaching_notes_at_company_notes_page() {
		companiesPage.getCoachingNotesStatus();
	}

	@And("user should be able to text in the search field  at company notes page{string}")
	public void user_should_be_able_to_text_in_the_search_field_at_company_notes_page_work(String text) {
		companiesPage.textSearch(text);
	}

	@Then("user should be able to see search notes at company notes page")
	public void user_should_be_able_to_see_search_notes_at_company_notes_page() {
		companiesPage.getSearchnotesStatus();
	}

	@And("user should be able to search notes by filter at company notes page")
	public void user_should_be_able_to_search_notes_by_filter_at_company_notes_page() throws InterruptedException {
		companiesPage.searchNotesWithFilter();
	}

	@Then("user should be able to see search notes by filter at company notes page")
	public void user_should_be_able_to_see_search_notes_by_filter_at_company_notes_page() {
		companiesPage.getSearchNotesFilterStatus();
	}

	@And("user should be able to reset filter at company notes page")
	public void user_should_be_able_to_reset_filter_at_company_notes_page() {
		companiesPage.resetFilter();
	}

	@Then("user should be able to see all notes at company notes page")
	public void user_should_be_able_to_see_all_notes_at_company_notes_page() {
		companiesPage.allnotesDisplayed();
	}

////////////////////////Document Page step definitions///////////////////////////////
	@And("user should be able to click on document page")
	public void user_should_be_able_to_click_on_document_page() {
		companiesPage.clickDocumentTab();
	}

	@Then("user should be on the document page{string}")
	public void user_should_be_on_the_document_page(String exptab) {
		String actab = companiesPage.getDocumentTabStatus();
		Assert.assertEquals(actab, exptab);
	}

	@When("user should be able to create folder in the document{string}")
	public void user_should_be_able_to_create_folder_in_the_document(String fn) {
		companiesPage.clickAddBtnDocumentPage(fn);
	}

	@Then("user should be able to see the folder in the document page{string}")
	public void user_should_be_able_to_see_the_folder_in_the_document_page(String ext) {
		String act = companiesPage.getFolderStatus();
		Assert.assertEquals(act, ext);
	}

	@And("user should be able to click on edit button in the document page")
	public void user_should_be_able_to_click_on_edit_button_in_the_document_page() throws InterruptedException {
		companiesPage.clickEditButtonDocumentPage();
	}

	@And("user should be able to update folder name in the document page{string}")
	public void user_should_be_able_to_update_folder_name_in_the_document_page(String fn) throws InterruptedException {

		companiesPage.updateFoldername(fn);
		Thread.sleep(1000);
	}

	@Then("user should be able to see the updated name of folder in the document page{string}")
	public void user_should_be_able_to_see_the_updated_name_of_folder_in_the_document_page(String expfolder) {
		String acfolder = companiesPage.getUpdateFolderNameStatus();
		Assert.assertEquals(acfolder, expfolder);
	}

	@And("user should be able to change the folder name in the document page{string}")
	public void user_should_be_able_to_change_the_folder_name_in_the_document_page_text(String fn) {
		companiesPage.updateAgainFoldername(fn);
	}

	@When("user should be able to click on folder of document page")
	public void user_should_be_able_to_click_on_folder_of_document_page() {
		companiesPage.clickFolder();
	}

	@Then("user should be able to validate document name at upload documents popup in the folder of document page {string}")
	public void user_should_be_able_to_validate_document_name_at_upload_documents_popup_in_the_folder_of_document_page(
			String ext) {
		String act = companiesPage.getDocumentNameStatusErrorMsg();
		Assert.assertEquals(act, ext);
	}

	@And("User should be able to upload document in the folder of document page{string}")
	public void user_should_be_able_to_upload_document_in_the_folder_of_document_page_document1(String fn) {
		companiesPage.uploadDocument(fn);
	}

	@Then("user should be able to see the upload document in the document folder{string}")
	public void user_should_be_able_to_see_the_upload_document_in_the_document_folder_document1(String ext) {
		String act = companiesPage.uploadedDocumentStatus();
		Assert.assertEquals(act, ext);
	}

	@And("User should be able to upload document in the folder of document page for search{string}")
	public void user_should_be_able_to_upload_document_in_the_folder_of_document_page_for_search_document2(String fn) {
		companiesPage.uploadDocumentForSearch(fn);
	}

	@And("User should be able to search document in the folder of document page{string}")
	public void user_should_be_able_to_search_document_in_the_folder_of_document_page_document2(String fn) {
		companiesPage.searchDocment(fn);
	}

	@Then("user should be able to see the search document in the document folder{string}")
	public void user_should_be_able_to_see_the_search_document_in_the_document_folder_document2(String ext) {
		String act = companiesPage.searchDocumentStatus();
		Assert.assertEquals(act, ext);
	}

	@And("User should be able to edit document in the folder of document page{string}")
	public void user_should_be_able_to_edit_document_in_the_folder_of_document_page_document(String fn) {
		companiesPage.updateDocumentDocument(fn);
	}

	@Then("user should be able to see the updated document in the document folder{string}")
	public void user_should_be_able_to_see_the_updated_document_in_the_document_folder_document(String ext) {
		String act = companiesPage.editDocumentStatus();
		Assert.assertEquals(act, ext);
	}

	@And("User should be able to delete document in the folder of document page")
	public void user_should_be_able_to_delete_document_in_the_folder_of_document_page() throws InterruptedException {
		companiesPage.deleteDocument();
	}
	
	@When("user should click on delete button at the QA Automation Template Page to delete the template for the compnay task")
	public void user_should_click_on_delete_button_at_the_qa_automation_template_page_to_delete_the_template_for_the_compnay_task() throws InterruptedException {
	  companiesPage.clickOnDeleteBtnOfTemplate();
	}

	@Then("user should able to delete QA Automation Template Successfully  for the compnay task{string}")
	public void user_should_able_to_delete_qa_automation_template_successfully_for_the_compnay_task_task_template_was_deleted_successfully(String ext) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}