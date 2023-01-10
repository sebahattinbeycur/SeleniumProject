package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.*;

public class _04_ExplicitWait_HW {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/dynamic_loading/2");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"true");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40)); // Implicit wait, dynamic wait.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try{
            driver.findElement(By.xpath("//button[text()='Start']")).click();       // div#start button
            wait.until(ExpectedConditions.textToBe(By.xpath("//h4[text()='Hello World!']"), "Hello World!"));
            System.out.println(driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText());
        }catch(NoSuchElementException e){       //Note: if you get this type of exception, just replace with this: TimeOutException
            e.printStackTrace();
            System.out.println("Element is not found. Wait longer for the element to become visible on the UI");
        }

        tearDown();
    }
}
