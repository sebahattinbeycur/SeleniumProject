package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class HW_Modal_Dialog_Popup {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://demoqa.com/modal-dialogs");

        WebElement largeModalText = driver.findElement(By.cssSelector("button#showLargeModal"));
        largeModalText.click();
        System.out.println(largeModalText.getText());
        Thread.sleep(2000);

        String modalLargeText = driver.findElement(By.cssSelector("div#example-modal-sizes-title-lg")).getText();
        System.out.println("modalLargeText: " + modalLargeText);

        System.out.println("modalLargeBodyText: " + driver.findElement(By.cssSelector("div.modal-body")).getText());

        driver.findElement(By.id("closeLargeModal")).click();
        Thread.sleep(2000);

        tearDown();
    }
}
