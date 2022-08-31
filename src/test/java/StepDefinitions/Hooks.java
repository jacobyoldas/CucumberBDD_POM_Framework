package StepDefinitions;

import Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.nio.file.WatchEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class Hooks {
  WebDriver driver = Driver.getDriver();
  @Before
  public void setup(){
    driver.get("https://demo.mersys.io/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  }
  @After
  public void tearDown(){
    Driver.quitDriver();

  }

}
