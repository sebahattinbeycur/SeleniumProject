package Tests.Test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com/index.php?route=common/home");

        Thread.sleep(1000);
        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.id("input-email")).sendKeys("jonisherin@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("qwertyu2022"); //type but not as a locator
        Thread.sleep(2000);
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("password?")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("input-pin")).sendKeys("1590");

    }
}
