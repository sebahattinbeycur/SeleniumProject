package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _04_NestedFrames {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://ui.vision/demo/webtest/frames/");

        // First switch to parent frame which is Frame 3
        WebElement frame3 = driver.findElement(By.cssSelector("frame[src='frame_3.html']"));    // locate frame 3
        driver.switchTo().frame(frame3);         // switching to frame 3
        driver.findElement(By.name("mytext3")).sendKeys("Frame three");     // Locate element for input texBox and send keyword "Frame Three"
        Thread.sleep(2000);

        // Print Form (Demo Page) title Text
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'docs')]")));       // Switching to Child frame / inner frame
        String frameText = driver.findElement(By.cssSelector("div[class='F9yp7e ikZYwf LgNcQe']")).getText();
        System.out.println("Form title text: " + frameText);

        // Switch to Frame Four: Before we can switch to another frame, we need to go back to default browser
        driver.switchTo().defaultContent();                                                                                     // We are switching back to main browser
        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_4.html']")));   // we switch back to Frame 4
        driver.findElement(By.name("mytext4")).sendKeys("Frame Four");

        tearDown();
    }
}
