package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserUtil {

    public static WebDriver browserSetup(String browser) {

        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/browserfiles/chromedriver.exe");
            return new ChromeDriver();
        } else if (browser.equals("firefox")) {
            return new FirefoxDriver();
        } else if (browser.equals("ie")) {
            return new InternetExplorerDriver();
        } else if (browser.equals("edge")) {
            return new EdgeDriver();
        } else {
            return null;
        }
    }
}
