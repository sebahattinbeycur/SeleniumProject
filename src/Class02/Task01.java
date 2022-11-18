package Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.navigate().to("https://www.exelenter.com");
        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        String strUrl = driver.getCurrentUrl();
        if (strUrl.contains("exelenter")){
            System.out.println("Test Passed. URL does contain word \"exelenter\"");
        }else {
            System.out.println("Test Failed");
        }

        boolean exelenter = driver.getCurrentUrl().contains("exelenter");
        System.out.println(exelenter);

        driver.close();
    }
}
