package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_RAdioDemo {
    public static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> browsers = driver.findElements(By.xpath("//input[@type='radio']"));

        int browserCount = browsers.size();
        System.out.println("browserCount = " + browserCount);

        System.out.println("===== regular loop =====");
        int count = 1;
        for (int i = 0; i < browsers.size(); i++) {
            String atrrValue = browsers.get(i).getAttribute("value");
            System.out.println(count + " . " + atrrValue);
            count ++;
        }
        System.out.println("===== for each loop =====");
        for (WebElement element : browsers){
            System.out.println(element.getAttribute("value"));
        }
        System.out.println("------------------------------");
        for (WebElement element : browsers){
            if (element.isEnabled() && !element.isSelected()) {
                System.out.println(element.getAttribute("value"));
            }
        }
        System.out.println("--------------------------------");
        // Loop through the list of the web elements and when 'opera' is found, click on it
        for (WebElement browser : browsers){
            String attrValue = browser.getAttribute("value");
            if (attrValue.equals("Opera")){
                browser.click();
                System.out.println("'Opera' is found and selected ");
                break;
            }
            System.out.println(attrValue);
        }


        Thread.sleep(2000);

    }
}
