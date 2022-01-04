import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions

driver = {
  WebDriverManager.firefoxdriver().setup()

  def headless = !Boolean.valueOf(System.getProperty('showBrowser'))
  new FirefoxDriver(new FirefoxOptions().setHeadless(headless))
}

baseUrl = 'https://duckduckgo.com'
