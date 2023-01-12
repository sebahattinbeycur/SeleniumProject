package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import static utils.BaseClass.driver;

public class CommonMethods {
    public static void switchToWindow(String windowTitle){
        Set<String> windows  = driver.getWindowHandles();
        for (String windowOrTab : windows){
            String title = driver.switchTo().window(windowOrTab).getTitle();
            if (title.contains(windowTitle)){
                System.out.println("Window is found: " + driver.getTitle() +  " URL: " + driver.getCurrentUrl());
                break;
            }
        }
    }
    public static void sendText(WebElement element, String value) {
        element.sendKeys(value);
    }
    public static void click(WebElement element){
        element.click();
    }
    public static WebDriverWait waitForElement (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
        return wait;
    }
    public static void waitForClickability(WebElement element){
        waitForElement().until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void clickButWaitForClickability(WebElement element){
        waitForClickability(element);
        element.click();
    }
    public static void waitForVisibility(WebElement element){
        waitForElement().until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitForVisibility(By by){
        waitForElement().until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void clickButWaitForVisibility(WebElement element){
        waitForVisibility(element);
        element.click();
    }
    public static void clickRadioOrCheckbox(List<WebElement> radioOrCheckbox, String expextedValue){
        for (WebElement element : radioOrCheckbox){
            String actualValue = element.getAttribute("value");
            if (actualValue.equals(expextedValue)){
                element.click();
                break;
            }
        }
    }
}
