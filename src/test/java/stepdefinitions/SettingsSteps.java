package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import com.pages.LoginPage;
import com.pages.SettingsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;

public class SettingsSteps {
	DriverFactory driverFactory;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private SettingsPage settingsPage;
	
	@Given("User has already logged in to application for settings")
	public void user_has_already_logged_in_to_application_for_settings(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("username");
		String passWord = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://beta.cisin.com:4991/users/sign_in");
		settingsPage = loginPage.loginForSettings(userName, passWord);
	}
	
	@When("user should be able to click on Settings")
	public void user_should_be_able_to_click_on_settings() {
	    settingsPage.clickSettingTab();
	}

	@Then("user should be on settings page{string}")
	public void user_should_be_on_settings_page_contact_title(String ext) {
		String act = settingsPage.settingsPage();
	    Assert.assertEquals(act, ext);
	}
	

	@And("click on add button in the contact title widget")
	public void click_on_add_button_in_the_contact_title_widget() {
	   settingsPage.addBtnContactTitleWidget();
	}

	@And("User should be clicked on add button in the title popup in the contact title widget")
	public void user_should_be_clicked_on_add_button_in_the_title_popup_in_the_contact_title_widget() {
	    settingsPage.addButtonTitlePoupContactTitle();
	}

	@Then("User should see an validation message for Title fieled in the contact title widget{string}")
	public void user_should_see_an_validation_message_for_title_filed_in_the_contact_title_widget_title_can_t_be_blank(String ext) {
		String act = settingsPage.getValidationStatusTitleContactTitle();
	    Assert.assertEquals(act, ext);
	}
	
	@When("User should be able to close add title popup for contact title widget")
	public void user_should_be_able_to_close_add_title_popup_for_contact_title_widget() {
	    settingsPage.closeAddTitlePopupContactTitle();
	}

	@Then("close add title popup for contact title widget successfully{string}")
	public void close_add_title_popup_for_contact_title_widget_successfully_contact_title(String ext) {
		String act = settingsPage.closeAddTitlePopupContactTitleSuccess();
	    Assert.assertEquals(act, ext);
	   
	}
	
	
	@And("User should be able to edit title for contact title widget{string}")
	public void user_should_be_able_to_edit_title_for_contact_title_widget_contact1(String title) throws InterruptedException {
			settingsPage.editTitleContactTitle(title);
	}

	@Then("user should be able to see contact title in the contact title widget{string}")
	public void user_should_be_able_to_see_contact_title_in_the_contact_title_widget_contact1(String ext) {
		String act = settingsPage.getContactTitleStatus();
	    Assert.assertEquals(act, ext);
	}
	
	@When("User should be able to change title for contact title widget{string}")
	public void user_should_be_able_to_change_title_for_contact_title_widget_abhey(String t) throws InterruptedException {
	    settingsPage.changeContactTilte(t);
	}
	
	
	@And("click on add button in the staff title widget")
	public void click_on_add_button_in_the_staff_title_widget() {
	    settingsPage.addBtnStaffTitleWidget();
	}

	@And("User should be clicked on add button in the title popup in the staff title widget")
	public void user_should_be_clicked_on_add_button_in_the_title_popup_in_the_staff_title_widget() {
	   settingsPage.addButtonTitlePoupStaffTitle();
	}

	@Then("User should see an validation message for Title fieled in the staff title widget{string}")
	public void user_should_see_an_validation_message_for_title_filed_in_the_staff_title_widget_title_can_t_be_blank(String ext) {
		String act = settingsPage.getValidationStatusTitleStaffTitle();
	    Assert.assertEquals(act, ext);
	}
	
	@And("User should be able to close add title popup for staff title widget")
	public void user_should_be_able_to_close_add_title_popup_for_staff_title_widget() {
	   settingsPage.closeAddTitlePopupStaffTitle();
	   }

	@Then("close add title popup for staff title widget successfully{string}")
	public void close_add_title_popup_for_staff_title_widget_successfully_staff_title(String ext) {
		String act = settingsPage.closeAddTitlePopupStaffTitleSuccess();
	    Assert.assertEquals(act, ext);
	}
	
	@And("User should be able to edit title for staff title widget{string}")
	public void user_should_be_able_to_edit_title_for_staff_title_widget(String t) {
	    settingsPage.editTitleStaffTitle(t);
	}

	@Then("user should be able to see staff title in the staff title widget{string}")
	public void user_should_be_able_to_see_staff_title_in_the_staff_title_widget(String ext) {
		String act = settingsPage.getStaffTitleStatus();
	    Assert.assertEquals(act, ext);
	}

	@And("User should be able to change staff for contact title widget{string}")
	public void user_should_be_able_to_change_staff_for_contact_title_widget(String t) {
	   settingsPage.changeTitleStaffTitle(t);
	}

	@When("click on add button in the email signature widget")
	public void click_on_add_button_in_the_emial_signature_widget() {
	   settingsPage.addButtonSignaturePoupEmailSignature();
	}

	@And("User should be able to close add signature popup for email signature widget")
	public void user_should_be_able_to_close_add_signature_popup_for_email_signature_widget() throws InterruptedException {
	   settingsPage.closeBtnEmailSignature();
	}

	@Then("close add title popup for email signature widget successfully{string}")
	public void close_add_title_popup_for_email_signature_widget_successfully_email_signature(String ext) throws InterruptedException {
		String act = settingsPage.getCloseSignaturePopupStatus();
	    Assert.assertEquals(act, ext);
	}

	@And("User should be clicked on add button in the email signature popup in the email signature widget")
	public void user_should_be_clicked_on_add_button_in_the_email_signature_popup_in_the_email_signature_widget() {
	   settingsPage.addBtnEmailSignaturePopup();
	}

	@Then("User should see an validation message for signature name fieled in the email signature widget{string}")
	public void user_should_see_an_validation_message_for_signature_name_fieled_in_the_email_signature_widget_name_can_t_be_blank(String ext) {
		String act = settingsPage.getValidationStatusEmailSignatureName();
	    Assert.assertEquals(act, ext);
	}
	
	@And("User should be able to add signature for email signature widget{string},{string}")
	public void user_should_be_able_to_add_signature_for_email_signature_widget_automate_email_signature(String s, String m) throws InterruptedException {
	  settingsPage.addSignatureEmail(s,m);
	}

	@Then("user should be able to see signature in the email signaturewidget{string}")
	public void user_should_be_able_to_see_signature_in_the_email_signaturewidget_automate_email_signature(String ext) {
		String act = settingsPage.getEmailSignatureStatus();
	    Assert.assertEquals(act, ext);
	}
	
	@And("click on edit button in the email signature widget")
	public void click_on_edit_button_in_the_email_signature_widget() {
	   settingsPage.clickEditBtnEmailSignature();
	}

	@And("User should be able to update signature for email signature widget{string},{string}")
	public void user_should_be_able_to_update_signature_for_email_signature_widget_automate_signature(String s, String m) {
	   settingsPage.editSignatureEmail(s, m);
	}

	@Then("user should be able to see updated signature in the email signaturewidget{string},{string}")
	public void user_should_be_able_to_see_updated_signature_in_the_email_signaturewidget_automate_signature(String ext, String extMsg) {
		String act = settingsPage.getUpdatedEmailSignatureStatus();
	    Assert.assertEquals(act, ext);
	    String actMsg = settingsPage.getUpdatedEmailSignatureMsgStatus();
	    Assert.assertEquals(actMsg, extMsg);
	}
	
	@And("User should be able to delete signature for email signature widget")
	public void user_should_be_able_to_delete_signature_for_email_signature_widget_automate_signature() throws InterruptedException {
		settingsPage.deleteEmailSignature();
	    
	  
	}
	
	@And("click on add button in the Reports widget")
	public void click_on_add_button_in_the_reports_widget() {
	  settingsPage.clickAddBtnReportWidget();
	}

	@And("User should be clicked on add button in the title popup in the Reports widget")
	public void user_should_be_clicked_on_add_button_in_the_title_popup_in_the_reports_widget() throws InterruptedException {
	   settingsPage.clickAddBtnTitlePopupReport();
	}

	@Then("User should see an validation message for Title field in the Reports widget{string}")
	public void user_should_see_an_validation_message_for_title_field_in_the_reports_widget_title_can_t_be_blank(String ext) {
		String act = settingsPage.getValidationStatusTitleReports();
	    Assert.assertEquals(act, ext);
	}
	@And("User should be able to close add title popup for reports widget")
	public void user_should_be_able_to_close_add_title_popup_for_reports_widget() {
	    settingsPage.closeAddTitlePopupReports();
	}

	@Then("close add title popup for reports widget successfully{string}")
	public void close_add_title_popup_for_reports_widget_successfully_reports(String ext) {
		String act = settingsPage.getcloseReportsPopupStatus();
	    Assert.assertEquals(act, ext);
	}
	
	@And("User should be able to edit title for Reports widget{string}")
	public void user_should_be_able_to_edit_title_for_reports_widget_automate_report(String r) throws InterruptedException {
	   settingsPage.editTitleReports(r);
	}

	@Then("user should be able to see report title in the reports widget{string}")
	public void user_should_be_able_to_see_report_title_in_the_reports_widget_automate_report(String ext) {
		String act = settingsPage.getReportsStatus();
	    Assert.assertEquals(act, ext);
	}

	@And("User should be able to change report title for reports widget{string}")
	public void user_should_be_able_to_change_report_title_for_reports_widget_automate_report(String r) throws InterruptedException {
	   settingsPage.changeTitleReports(r);
	}


}
