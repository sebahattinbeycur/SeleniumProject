package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_RAdioDemo {
    public static String url = "https://formstone.it/components/checkbox/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement checkboxOne = driver.findElement(By.cssSelector("input#checkbox-1"));
        boolean checkboxOneSelected = checkboxOne.isSelected();
        System.out.println("checkboxOneSelected = " + checkboxOneSelected);

        WebElement checkboxTwo = driver.findElement(By.xpath("(//input[@class='fs-checkbox-element'])[2]"));
        boolean checkboxTwoEnabled = checkboxTwo.isEnabled();
        System.out.println("checkboxTwoEnabled = " + checkboxTwoEnabled);

        WebElement checkboxThree = driver.findElement(By.cssSelector("input#checkbox-3"));
        boolean checkboxThreeEnabled = checkboxThree.isEnabled();
        System.out.println("checkboxThreeEnabled = " + checkboxThreeEnabled);
        Thread.sleep(2000);

    }
}
