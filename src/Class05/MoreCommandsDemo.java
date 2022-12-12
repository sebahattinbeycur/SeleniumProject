package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreCommandsDemo {
    private static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
    private static String user = "Tester";
    private static String pwd = "test";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement userName = driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        Thread.sleep(2000);
        userName.sendKeys("Test");
        Thread.sleep(2000);
        userName.clear();
        Thread.sleep(1000);
        userName.sendKeys(user);
        WebElement password = driver.findElement(By.xpath("//input[contains(@name,'ctl00$MainContent$password')]"));
        password.sendKeys(pwd);
        Thread.sleep(1000);
        WebElement loginBtn = driver.findElement(By.cssSelector("input.button"));
        loginBtn.click();

        WebElement webOrdersLogo = driver.findElement(By.xpath("//ul[@id=\"ctl00_menu\"]/preceding-sibling::h1"));
        boolean logoDisplayed = webOrdersLogo.isDisplayed();

        if (logoDisplayed){
            System.out.println("Logo is Displayed. Test case passed");
        }
        else {
            System.out.println("Logo is NOT Displayed. Test case failed");
        }
        WebElement loggedInUser = driver.findElement(By.cssSelector("div.login_info"));
        String loggedInUserText = loggedInUser.getText();

        Thread.sleep(3000);
        driver.close();

        String expectedLoggedInUserText = "Welcome, Tester! | Logout";

        if (loggedInUserText.contains("Test")) {
            System.out.println("Authorized user is able to login successfully. Test passed");
        }
        else {
            System.out.println("Authorized user is NOT able to login successfully. Test failed");
        }
        System.out.println(loggedInUserText);
    }

}
