package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        String title = driver.getTitle();
        System.out.println("Title: "+title);
//        System.out.println(driver.getTitle());

        System.out.println("getCurrentUrl: "+ driver.getCurrentUrl());
        driver.quit();
    }
}
