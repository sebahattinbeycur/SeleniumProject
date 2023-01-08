package Class14;

import org.openqa.selenium.WindowType;
import utils.ConfigsReader;

import java.util.Iterator;
import java.util.Set;

import static utils.BaseClass.*;

public class _02_WindowHandle2 {
    static String expectedTitle = "Change";
    public static void main(String[] args) {
        setUp("https://google.com");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window: " + parentWindow);

        driver.switchTo().newWindow(WindowType.TAB);           // This will open a new BLANK TAB and switch (the focus) to it
        driver.get("https://about.google/");                   // This will open given URL in our new blank tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://store.google.com");
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://exelenter.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");

        Set<String> allWindows  = driver.getWindowHandles();                        // This will store all TABS in a Set of Strings
//        allWindows.forEach(System.out::println);

//        We are printing switchToWindow() in three different ways in below examples
//        switchToWindow("Change",allWindows);
//        switchToWindow(expectedTitle,allWindows);
        switchToWindow(ConfigsReader.getProperties("expectedTitle"),allWindows);

        // I am printing ALL children Tabs/Window except parent window:
        for (String window : allWindows) {
            if (!window.contains(parentWindow)) {
                System.out.println("This is a child window: " + driver.switchTo().window(window).getTitle());
            }
        }

//        tearDown();
    }
    public static void switchToWindow(String windowTitle, Set<String> windows){
        for (String windowOrTab : windows){
            String title = driver.switchTo().window(windowOrTab).getTitle();
            if (title.contains(windowTitle)){
                System.out.println("Window is found: " + driver.getTitle() +  " URL: " + driver.getCurrentUrl());
            }
        }

    }
}
