package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsFacebook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://fb.com");

        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("abc123");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(5000);
//        driver.findElement(By.className("_97w4")).click();
//        driver.findElement(By.linkText("Forgotten password?")).click();
//        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.findElement(By.partialLinkText("pass")).click();

        Thread.sleep(2000);
//        driver.close();

    }

}
