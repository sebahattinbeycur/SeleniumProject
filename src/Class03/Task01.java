package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://demo.guru99.com/test/newtours/");
            Thread.sleep(3000);
            driver.findElement(By.linkText("REGISTER")).click();
            driver.findElement(By.name("firstName")).sendKeys("John");
            driver.findElement(By.name("lastName")).sendKeys("Doe");
            driver.findElement(By.name("phone")).sendKeys("123-4567892");
            driver.findElement(By.name("userName")).sendKeys("test@gmail.com");
            driver.findElement(By.name("email")).sendKeys("johndoe");
            Thread.sleep(3000);
            driver.findElement(By.name("submit")).click();
            Thread.sleep(3000);

    }
}
