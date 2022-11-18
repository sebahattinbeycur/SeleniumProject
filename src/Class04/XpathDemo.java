package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static String url = "https://exelentersdet.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("Exelent2022Sdet!");
        driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
        Thread.sleep(5000);
        //a[contains(@class,"panel")]
        //a[contains(text(),'Welcome')]
        driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).click();
//        driver.close();
    }
}
