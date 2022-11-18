package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Sebahattin");
        driver.findElement(By.id("last-name")).sendKeys("Beycur");
        driver.findElement(By.id("postal-code")).sendKeys("23050");
        Thread.sleep(3000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
