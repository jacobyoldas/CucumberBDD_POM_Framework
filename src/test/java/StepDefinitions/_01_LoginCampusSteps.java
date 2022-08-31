package StepDefinitions;

import POM.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginCampusSteps {

  LoginPage loginPage  =new LoginPage();

  @Given("User is on login page")
  public void user_is_on_login_page() {
    loginPage.validateUserOnLoginPage();
  }

  @When("User enter admin credentials")
  public void user_enter_admin_credentials() {
    loginPage.userEnterAdminCredentials();
  }

  @Then("User should login successfully")
  public void user_should_login_successfully() {
    loginPage.validateUserSuccessfullyLoggedIn();
  }

}
