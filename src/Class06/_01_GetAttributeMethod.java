package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetAttributeMethod {
    public static String url = "https://exelentersdet.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.name("txtUsername"));

        String id = username.getAttribute("id");
        System.out.println("id = " + id);

        System.out.println("type Attribute value = "+ username.getAttribute("type"));

        username.sendKeys("Tester");
        String value = username.getAttribute("value");
        System.out.println("value = "+value);

        Thread.sleep(2000);
//        driver.close();
    }
}
