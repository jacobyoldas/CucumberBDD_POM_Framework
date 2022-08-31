package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_CountriesSteps {

  NavigationBarElements nb =new NavigationBarElements();
  DialogContentElements dc =new DialogContentElements();

  @When("User create country")
  public void userCreateCountry() {
  nb.userCreateCountryClick();
  dc.userCreateCountrySendKey();
  }
  @Then("Success message should be displayed")
  public void successMessageShouldBeDisplayed() {
    dc.successMessageShouldBeDisplayed();
  }
  @When("User edit country")
  public void userEditCountry() {
    nb.userCreateCountryClick();
    dc.userEditCountry();
  }

  @When("User delete country")
  public void userDeleteCountry() {
    nb.userCreateCountryClick();
    dc.userDeleteCountry();
  }
}
