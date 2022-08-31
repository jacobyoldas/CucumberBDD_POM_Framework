package POM;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigationBarElements extends BasePOM{

  public NavigationBarElements(){
    PageFactory.initElements(driver,this);
  }

  @FindBy(xpath="(//span[text()='Setup'])[1]")
  private WebElement setupOne;

  @FindBy(xpath = "//span[text()='Parameters']")
  private WebElement parameters;

  @FindBy(xpath = "//span[text()='Countries']")
  private WebElement countries;

  @FindBy(xpath = "//span[text()='Citizenships']")
  private WebElement citizenShip;

  @FindBy(xpath = "//span[text()='Nationalities']")
  private WebElement nationalities;

  @FindBy(xpath = "//span[text()='Fees']")
  private WebElement fees;


  public void userCreateCountryClick() {
    setupOne.click();
    parameters.click();
    countries.click();
  }

}
