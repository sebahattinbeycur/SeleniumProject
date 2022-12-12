package Examps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MultiBrowser {
    public static WebDriver driver;
    public Properties properties;
    @BeforeMethod
    void drivers() throws IOException {
        String filePath = System.getProperty("user.dir") + "/config/config.properties";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        properties = new Properties();
        properties.load(fileInputStream);
    }
    @Test(priority = 1)
    void testChrome(){

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(properties.getProperty("url"));

        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys(properties.getProperty("username"));
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys(properties.getProperty("password"));
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        driver.close();
    }

    @Test(priority = 2)
    void testEdge(){

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        driver = new EdgeDriver();

        driver.get(properties.getProperty("url"));
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys(properties.getProperty("username"));
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys(properties.getProperty("password"));
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        driver.close();
    }
}
