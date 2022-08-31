package POM;

import Utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContentElements extends  BasePOM{
  public DialogContentElements(){
    PageFactory.initElements(Driver.getDriver(),this);
  }
  @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
  private WebElement addButton;
  @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
  private WebElement nameInput;
  @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
  private WebElement codeInput;

  @FindBy(xpath="//ms-save-button//button")
  private WebElement saveButton;

  @FindBy(xpath = "//div[contains(text(),'successfully')]")
  private WebElement successMessage;

  @FindBy(xpath = "//div[contains(text(),'already exists')]")
  private WebElement alreadyExist;

  @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
  private WebElement searchInput;

  @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[2]")
  private WebElement codeSearchInput;

  @FindBy(xpath = "//ms-search-button//button")
  private WebElement searchButton;

  @FindBy(xpath = "(//ms-edit-button//button)[3]")
  private WebElement edit;

  @FindBy(xpath = "(//ms-delete-button//button)[4]")
  private WebElement deleteButton;

  @FindBy(xpath = "//span[contains(text(),'Delete')]")
  private WebElement deleteDialogBtn;


  public void userCreateCountrySendKey(){
    addButton.click();
    nameInput.sendKeys("TurUSAHind");
    codeInput.sendKeys("66");
    saveButton.click();
  }

  public void successMessageShouldBeDisplayed() {
    wait.until(ExpectedConditions.elementToBeClickable(successMessage));
    Assert.assertTrue(successMessage.isDisplayed());
  }

  public void userEditCountry() {
    searchInput.clear();
    searchInput.sendKeys("TurUSAHind");
    wait.until(ExpectedConditions.visibilityOfAllElements(searchButton));
    searchButton.click();
    wait.until(ExpectedConditions.visibilityOfAllElements(edit));
    edit.click();
    nameInput.sendKeys("TUR&Hind&USA");
    codeInput.sendKeys("66");
    saveButton.click();

  }

  public void userDeleteCountry() {
    searchInput.clear();
    searchInput.sendKeys("TurUSAHind");
    wait.until(ExpectedConditions.visibilityOfAllElements(searchButton));
    searchButton.click();
    wait.until(ExpectedConditions.visibilityOfAllElements(deleteButton));
    deleteButton.click();
    deleteDialogBtn.click();
  }










}
