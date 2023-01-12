package Class15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;

import static utils.BaseClass.setUp;
import static utils.BaseClass.tearDown;

public class _07_PageLoadTimeOut {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /**
         *  I am telling the browser, stop looking after given time, in this case, stop loading after 3 seconds.
         *  In other words, I am telling the webpage = "you got 1 sec to load OR I will throw an exception"
         */

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));     // <== This is PageLoadTimeOut Wait.

        Instant starTime = Instant.now();
        System.out.println("starTime = " + starTime);

        try{
            driver.get("https://amazon.com");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("===> TOO SLOW TO LOAD... ADD MORE TIME <===");
        }

        Instant endTime = Instant.now();
        System.out.println("endTime = " + endTime);

        Duration pageLoadTime = Duration.between(starTime,endTime);
        System.out.println("pageLoadTime = " + pageLoadTime.toMillis());

        System.out.println(driver.getTitle());

        //driver.close();
    }
}
