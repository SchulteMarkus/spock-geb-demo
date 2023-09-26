import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions

driver = {
  WebDriverManager.firefoxdriver().setup()

  def headless = !Boolean.valueOf(System.getProperty('showBrowser'))

  def firefoxOptions = new FirefoxOptions()
  if (headless) {
    firefoxOptions.addArguments("-headless")
  }
  new FirefoxDriver(firefoxOptions)
}
