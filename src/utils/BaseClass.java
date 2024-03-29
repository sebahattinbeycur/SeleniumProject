package utils;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseClass extends CommonMethods{
    public static WebDriver driver;
    public static void setUp(String url) {
        ConfigsReader.loadProperties(Constants.CONFIGURATION_FILEPATH); // Replaced hard-coded filePath with Constants
        switch (ConfigsReader.getProperties("browser").toLowerCase()) {
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
            }
            case "firefox" -> {
                System.setProperty("web.driver.gecko.driver", Constants.GECKO_DRIVER_PATH);
                driver = new EdgeDriver();
            }
            case "edge" -> {
                System.setProperty("webdriver.edge.driver", Constants.EDGE_DRIVER_PATH);
                driver = new FirefoxDriver();
            }
            default -> throw new RuntimeException("Browser is not supported");
        }

        //driver.get(ConfigsReader.getProperties("url"));
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
    }

    public static void tearDown() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        if (driver != null) {     // This line is optional. We only use it to prevent NullPointerException.
            driver.quit();
        }
    }
}
