package Homework;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import utils.BaseClass;

import java.time.Duration;
import java.util.List;

public class TestCase3_ActionsClass extends BaseClass {
    public static void main(String[] args) {
        setUp("https://exelenter.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement courses = driver.findElement(By.xpath("//*[@id='menu-item-8674']/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(courses).perform();
        wait(1);

        driver.findElement(By.linkText("Java-sdet")).click();
        wait(1);
        String sdetCourse = driver.findElement(By.linkText("SDET Automation Course")).getText();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.google.com");
        wait(1);
        WebElement googleSearch = driver.findElement(By.xpath("//input[@name='q']"));
        sendText(googleSearch, sdetCourse);
        wait(1);
        googleSearch.sendKeys(Keys.ENTER);
        wait(1);

        String search = "Exelenter";
        List<WebElement> titleList = driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
        quit:
        for (int i = 0; i < titleList.size(); i++) {
            titleList = driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
            for (WebElement title : titleList){
                String text = title.getText();
                if (text.contains(search)){
                    title.click();
                    break quit;
                }
            }
            var jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            wait(2);
        }
        String newTitleSdetCourse = driver.findElement(By.linkText("SDET Automation Course")).getText();
        if (sdetCourse.equals(newTitleSdetCourse)){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }
        wait(1);
        tearDown();
    }
}