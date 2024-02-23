package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.pages.ContactPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;


public class ContactSteps  {

	DriverFactory driverFactory;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private ContactPage contactPage;
	
	@Given("User has already logged in to application for contact page")
	public void user_has_already_on_the_companies_page(DataTable dataTable) {
		 List <Map<String,String>>  credList = dataTable.asMaps();
		   String userName = credList.get(0).get("username");
		   String passWord = credList.get(0).get("password");
		   DriverFactory.getDriver().get("https://beta.cisin.com:4991/users/sign_in");
		   contactPage =  loginPage.doLoginAgain(userName, passWord);
	}
	
	@And("User is on Companies page url for contact page {string}")
	public void user_is_on_companies_page(String acUrl) throws InterruptedException   {
		String expUrl = contactPage.CompaniesPageURL();
		Assert.assertEquals(expUrl, acUrl);
		
	}
	
	@When("user should be able to click on contact tab")
	public void user_should_be_able_to_click_on_contact_tab() throws InterruptedException  {
		
		contactPage.clickOnContactTab();

		
	}
	
	@Then("User is on Contact page url {string}")
	public void user_is_on_contact_page_url(String acUrl) throws InterruptedException   {
		String expUrl = contactPage.ContactPageURL();
		Assert.assertEquals(expUrl, acUrl);
	}
	
	@Then("Admin Email is displayed")
	public void admin_email_is_displayed() {
		Assert.assertTrue(contactPage.getUserEmailAddressStatus());
	}
	
	@Then("Add Contact button should be displayed")
	public void add_contact_button_should_be_displayed() {
		Assert.assertTrue(contactPage.getAddContactBtnStatus());

	}
	
	@Then("Searchbox field should be displayed")
	public void searchbox_field_should_be_displayed() {
		Assert.assertTrue(contactPage.getSearchFieldStatus());
	}
	
	@Then("Edit button should be displayed")
	public void edit_button_should_be_displayed() {
		Assert.assertTrue(contactPage.getEditBtnStatus());
	}
	
	@Then("Contact list should be displayed")
	public void contact_list_should_be_displayed() {
		Assert.assertTrue(contactPage.getContactListStatus());
	}
	
	@Then("User details should be displayed")
	public void user_details_should_be_displayed() {
		Assert.assertTrue(contactPage.getUserDetailStatus());
	}
			
	@Then("Upload photo button should be displayed")
	public void upload_photo_button_should_be_displayed() {
		contactPage.getUploadPhotoBtnStatus();
	}
	
	@And("click on add contact button in the contact page")
	public void click_on_add_contact_button_in_the_contact_page() {
	   contactPage.clickAddContactButton();
	}

	@Then("user should be able to close add contact popup successfully")
	public void user_should_be_able_to_close_add_contact_popup_successfully() throws InterruptedException {
	  contactPage.closeAddContactPopup();
	}
	
	
	@And("User should be clicked on add button in the add contact popup of the contact")
	public void user_should_be_clicked_on_add_button_in_the_add_contact_popup_of_the_contact() {
	   contactPage.clickAddButtonContactPagePopup();
	}

	@Then("User should see an validation message for First Name for contact{string}")
	public void user_should_see_an_validation_message_for_first_name_for_contact_first_name_can_t_be_blank(String errMsg) {
		String actErrMsg = contactPage.getFirstNameErrorMsg();
		Assert.assertEquals(actErrMsg, errMsg);
		
	}
	
	@Then("User should see an validation message for Last Name for contact{string}")
	public void user_should_see_an_validation_message_for_last_name_for_contact_last_name_can_t_be_blank(String errMsg) {
		String actErrMsg = contactPage.getLasttNameErrorMsg();
		Assert.assertEquals(actErrMsg, errMsg);
		
	
	}

	@Then("User should see an validation message for Title Name for contact{string}")
	public void user_should_see_an_validation_message_for_title_name_for_contact_title_must_exist(String errMsg) {
		String actErrMsg = 	    contactPage.getTitleErrorMsg();
		Assert.assertEquals(actErrMsg, errMsg);
		
	}


	@Then("User should see an validation message for Phone Number Name for contact{string}")
	public void user_should_see_an_validation_message_for_phone_number_name_for_contact_phone_number_can_t_be_blank(String errMsg) {
		String actErrMsg = contactPage.getPhoneNumberErrorMsg();
		Assert.assertEquals(actErrMsg, errMsg);
		
	}

	@Then("User should see an validation message for Company Name for contact{string}")
	public void user_should_see_an_validation_message_for_company_name_for_contact_company_ids_can_t_be_blank(String errMsg) {
		String actErrMsg = contactPage.getCompanyIdErrorMsg();
		Assert.assertEquals(actErrMsg, errMsg);
		
	    
	}
	
	@When("user should be click on add contact btn in the contact tab")
	public void user_should_be_click_on_add_contact_btn_in_the_contact_tab() {
	   contactPage.clickADDContactBtn();
	}

	@When("user should be able to enter contact details in the contact popup")
	public void user_should_be_able_to_enter_contact_details_in_the_contact_popup(io.cucumber.datatable.DataTable dataTable) throws InterruptedException  {
		List<Map<String, String>> contactInfo = dataTable.asMaps();
		String fName = contactInfo.get(0).get("firstname");
		String lName = contactInfo.get(0).get("lastname");
		String email = contactInfo.get(0).get("email");
		String pn = contactInfo.get(0).get("phonenumber");
		String company = contactInfo.get(0).get("company");
		contactPage.enterContactInfo(fName, lName, email, pn, company);
		Thread.sleep(3000);
	}

	@Then("user should be able to see contact in the contact page{string}")
	public void user_should_be_able_to_see_contact_in_the_contact_page(String ext) throws InterruptedException {
	   String act = contactPage.getContactStataus();
	   Assert.assertEquals(act, ext);
	}
	
	@And("user able to search the contact {string}")
	public void user_able_to_search_the_contact(String contact)  {
		contactPage.searchContact(contact);
	}

	@And("user click on edit button for the contact")
	public void user_click_on_edit_button_for_the_contact() throws InterruptedException  {
	   contactPage.clickEditBtn();
	}

	
	@When("user clear the filed and enter the updates values in the fields for the contacts")
	public void user_clear_the_filed_and_enter_the_updates_values_in_the_fields_for_the_contacts(io.cucumber.datatable.DataTable dataTable) throws InterruptedException   {
		List<Map<String, String>> contactInfo = dataTable.asMaps();
		
		String email = contactInfo.get(0).get("Email");
		String compnay = contactInfo.get(0).get("company");
		contactPage.enterUsersInfo(email,compnay);
		Thread.sleep(3000);
	}
	
	@And("user click on update button at edit contact popup")
	public void user_click_on_add_button_at_edit_contact_popup() {
	    contactPage.clickUpdateBtnOfEditUserPopUP();
	   
	}
	
	@Then("user should be able to see update contact details{string}")
	public void user_should_be_able_to_see_update_contact_details_final_check(String ext) {
		String act = contactPage.getContactDetailStatus();
		Assert.assertEquals(act, ext);
		
	}

	@Then("user clear the filed and enter the old values in the fields for the contacts")
	public void user_clear_the_filed_and_enter_the_old_values_in_the_fields_for_the_contacts(io.cucumber.datatable.DataTable dataTable) throws InterruptedException  {
		List<Map<String, String>> contactInfo = dataTable.asMaps();
		String title = contactInfo.get(0).get("Select a Title");
		String email = contactInfo.get(0).get("Email");
		contactPage.enterOldUsersInfo(title,email);
		Thread.sleep(3000);
	}

	@And("user should be able to see update profile image")
public void user_should_be_able_to_see_update_profile_image()  {
   contactPage.uploadImage();
}
	
	@When("click on delete button in the conatct popup")
	public void click_on_delete_button_in_the_conatct_popup() throws InterruptedException {
	  contactPage.clickDeleteButton();
	}

	@Then("user should be able to delete contact sucessfully{string}")
	public void user_should_be_able_to_delete_contact_sucessfully_contact_was_successfully_deleted(String ext) throws InterruptedException {
	    String act = contactPage.getContactDeleteStatus();
	    Assert.assertEquals(act, ext);
	}

	
	@When("user should be able to click on Settings fot the contact")
	public void user_should_be_able_to_click_on_settings_fot_the_contact() {
	    contactPage.clickSettingTab();
	}

	@When("user should be able to click on add title button in contact title widget for the contact")
	public void user_should_be_able_to_click_on_add_title_button_in_contact_title_widget_for_the_contact() {
	  contactPage.clickonAddTitleContactTitleWidget();
	}

	@When("user should enter the title in add title popup of contact title widget for the contact{string}")
	public void user_should_enter_the_title_in_add_title_popup_of_contact_title_widget_for_the_contact_automate_contact(String title) {
	    contactPage.enterTitleContactTitleWidget(title);
	}

	@Then("user should be able to see the title on contact title widget for the contact{string}")
	public void user_should_be_able_to_see_the_title_on_contact_title_widget_for_the_contact_automate_contact(String ext) {
		 String act = contactPage.getAddTitleStatusContactTitleWidget();
		   Assert.assertEquals(act, ext);
	}
	@When("User should be able to delete title in contact title widget for the contact")
	public void user_should_be_able_to_delete_title_in_contact_title_widget_for_the_contact() throws InterruptedException {
	   contactPage.deleteTitleContactTitleWidget();
	}

	@Then("user should be able to delete contact title successfully in the contact title widget for the contacts{string}")
	public void user_should_be_able_to_delete_contact_title_successfully_in_the_contact_title_widget_for_the_contacts_title_was_successfully_deleted(String ext) {
		 String act = contactPage.deleteTitleSuccessfullyContactTitleWidget();
		    Assert.assertEquals(act, ext);
	}


}

