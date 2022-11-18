package Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _00_Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
//        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        String title = driver.getTitle();
        System.out.println("Title: "+title);
        driver.close();
    }
}
