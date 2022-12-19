package Homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class HW_JsAlerts {
    public static void main(String[] args) throws InterruptedException {
        setUp();

        driver.findElement(By.cssSelector("a[onclick='window.alert(\"Sample alert\")']")).click();
        Thread.sleep(2000);
        Alert alertSample = driver.switchTo().alert();
        String alertSampleText = alertSample.getText();
        System.out.println("alertSampleText = " + alertSampleText);
        alertSample.accept();

        driver.findElement(By.xpath("//a[@onclick='window.confirm(\"Are you sure?\")']")).click();
        Thread.sleep(2000);
        Alert alertConfirm = driver.switchTo().alert();
        String alertConfirmText = alertConfirm.getText();
        System.out.println("alertConfirmText = " + alertConfirmText);
        alertConfirm.accept();

        driver.findElement(By.cssSelector("a[onclick='window.prompt(\"What is your tool of choice?\",navigator.appName)']")).click();
        Thread.sleep(2000);
        Alert alertPrompt = driver.switchTo().alert();
        String alertPromptText = alertPrompt.getText();
        System.out.println("alertPromptText = " + alertPromptText);
        alertPrompt.sendKeys("See a sample prompt");
        Thread.sleep(2000);
        alertPrompt.accept();

        tearDown();
    }
}
