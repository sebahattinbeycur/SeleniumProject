package Homework;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CheckboxesRadioButtons {
    public static void main(String[] args) throws IOException, InterruptedException {
        String filePath = System.getProperty("user.dir")+"/configs/configuration.properties";
        FileInputStream fis = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fis);
        String url = properties.getProperty("url");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='/checkboxes']")).click();
        Thread.sleep(2000);

        System.out.println("============== Checkboxes 1 ================");
        boolean displayed1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isDisplayed();
        boolean enabled1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isEnabled();
        boolean selected1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected();

        System.out.println("Checkboxes1 displayed = "+displayed1);
        System.out.println("Checkboxes1 enabled = "+enabled1);
        System.out.println("Checkboxes1 selected = "+selected1);

        System.out.println("============== Checkboxes 2 ===============");
        boolean displayed2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isDisplayed();
        boolean enabled2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isEnabled();
        boolean selected2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isSelected();

        System.out.println("Checkboxes1 displayed = "+displayed2);
        System.out.println("Checkboxes1 enabled = "+enabled2);
        System.out.println("Checkboxes1 selected = "+selected2);
        Thread.sleep(2000);
        driver.close();
    }
}
