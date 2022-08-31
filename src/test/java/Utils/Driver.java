package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Driver { //This concept called "Singleton Driver" (we need  one driver for every class thats why its called it)

 private static WebDriver driver;

  public static WebDriver getDriver() {

    if (driver == null) { // always open clean browser we dont wanna open new driver again again
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    }
    return driver;

  }
  public static void quitDriver() {
    if (driver != null) { // if there is driver the quit
      driver.quit();
      driver=null; // if there is not this line then failed coz after quit driver must be null again to open
    }
  }
}


