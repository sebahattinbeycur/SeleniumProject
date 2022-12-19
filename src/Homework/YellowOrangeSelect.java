package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YellowOrangeSelect {
    public static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[value='yellow']")).click();
        driver.findElement(By.cssSelector("input[value='orange']")).click();

        WebElement username1 = driver.findElement(By.cssSelector("input[value='yellow']"));
        WebElement username2 = driver.findElement(By.cssSelector("input[value='orange']"));
        String value1 = username1.getAttribute("value");
        String value2 = username2.getAttribute("value");
        System.out.println("value 1 = " + value1);
        System.out.println("value 2 = " + value2);

        Thread.sleep(2000);
        driver.close();
    }
}
