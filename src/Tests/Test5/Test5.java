package Tests.Test5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webDriver.chrome.driver", "drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.get("https://exelentersdet.com/symfony/web/index.php/auth/login");
    driver.manage().window().maximize();

    String title = "Exelenter Project";
    try {
        title.equals(driver.getTitle());
        System.out.println("Successfully verified login page");
    }catch (Exception exception){
        System.out.println("Error. Please verify login paga");
    }

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Exelent2022Sdet!");

        driver.findElement(By.className("button")).click();

    boolean displayed = driver.findElement(By.xpath("//div/h1[contains(text(),'Dashboard')]")).isDisplayed();
        try {
        boolean loggedIn = displayed;
        System.out.println("Successfully logged in");
    }catch (Exception ex){
        System.out.println("Please use valid credentials");
    }
        driver.close();
    String s = generateEmail();
        System.out.println(s);

}

    public static String generateEmail(){
        Random random = new Random();

        String email = "";
        for (int i = 0; i < 7; i++) {
            int charRandom = random.nextInt(97, 123);
            email +=(char)charRandom;
        }
        return email +"@gmail.com";
    }
}
