package Class16_DevelopFunctions;

import org.openqa.selenium.By;
import utils.CommonMethods;

import static utils.BaseClass.*;

public class _06_AlertTest {
    public void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/07/alert-test.html");

        driver.findElement(By.id("simple")).click();
        //driver.findElement(By.cssSelector(".header-widget div a")).click();  // Clicks on Selenium menu, which will cause NoAlertException.
        CommonMethods.wait(1);
        System.out.println(getAlertText());
        acceptAlert();

        CommonMethods.wait(1);

        driver.findElement(By.id("confirm")).click();
        CommonMethods.wait(1);
        System.out.println(getAlertText());
        dismissAlert();

        CommonMethods.wait(1);

        driver.findElement(By.id("prompt")).click();
        CommonMethods.wait(1);
        System.out.println(getAlertText());
        sendAlertText("Sebahattin");
        CommonMethods.wait(1);
        acceptAlert();


        tearDown();
    }
}
