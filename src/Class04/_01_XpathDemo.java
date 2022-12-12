package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constants;

public class _01_XpathDemo extends Constants {
    private static String url = "https://exelentersdet.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("Exelent2022Sdet!");
//        driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
//        Thread.sleep(5000);
        //a[contains(@class,"panel")]
        //a[contains(text(),'Welcome')]
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='welcome-menu']//a")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
