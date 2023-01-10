package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.*;

public class _05_ExplicitWait {
    public static void main(String[] args) {
        setUp("https://omayo.blogspot.com");
        var wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.findElement(By.cssSelector("button.dropbtn")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));
        driver.findElement(By.partialLinkText("Face")).click();
        tearDown();
    }
}
