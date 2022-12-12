package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_RAdioDemo {
    public static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.xpath("//input[@name='browser'][2]"));
        boolean displayed = driver.findElement(By.xpath("//input[@name='browser'][2]")).isDisplayed();
        boolean enabled = driver.findElement(By.xpath("//input[@name='browser'][2]")).isEnabled();
        boolean selected = driver.findElement(By.xpath("//input[@name='browser'][2]")).isSelected();

        System.out.println("displayed = "+displayed);
        System.out.println("enabled = "+enabled);
        System.out.println("selected = "+selected);

        boolean ieDisplayed = driver.findElement(By.xpath("//input[@name='browser'][1]")).isDisplayed();
        boolean ieEnabled = driver.findElement(By.xpath("//input[@name='browser'][1]")).isEnabled();
        boolean ieSelected = driver.findElement(By.xpath("//input[@name='browser'][1]")).isSelected();
        System.out.println("ieDisplayed = " +ieDisplayed);
        System.out.println("ieEnabled = " +ieEnabled);
        System.out.println("ieSelected = " +ieSelected);
        Thread.sleep(2000);

    }
}
