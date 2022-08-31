package POM;

import Utils.Driver;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePOM   {
  WebDriver driver = Driver.getDriver();
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

}
