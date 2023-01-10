package Class14;

import org.openqa.selenium.By;

import java.util.Set;

import static utils.BaseClass.*;

public class WindowHW {
    /**
     * Task: Go to this URL: https://the-internet.herokuapp.com/windows
     *     1. Identify and print parent window ID and Title
     *     2. Click on the link where it says 'Click Here' three times
     *     3. Switch to new tabs and print their title to the console as well.
     *        Bonus: Load facebook website in all children pages.
     */
    public static void main(String[] args) throws InterruptedException {
        setUp("https://the-internet.herokuapp.com/windows");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window ID : " + parentWindow);
        System.out.println("Parent window title : " + driver.getTitle());

        for (int i = 0; i < 3; i++) {
            driver.findElement(By.linkText("Click Here")).click();
            Thread.sleep(500);
        }
        Set<String> allWindows = driver.getWindowHandles();

        for (String tab: allWindows) {
            if (!tab.contains(parentWindow)){
                driver.switchTo().window(tab);
                driver.get("https://fb.com");                     // Once you make the switch, load the given URL to this new tab.
                System.out.println("Child page title: " + driver.getTitle());   // grab its title and print it, after the switch.
                Thread.sleep(500);
            }
        }


        //tearDown();
    }
}
