package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static utils.BaseClass.*;

public class CheckboxesRadioButtons2ndWay {
    public static void main(String[] args) throws IOException, InterruptedException {
        setUp();        //url=https://the-internet.herokuapp.com/

        driver.manage().window().maximize();
        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a[href='/checkboxes']")).click();
        driver.findElement(By.linkText("Checkboxes")).click();
        Thread.sleep(2000);

        System.out.println("============== Checkboxes 1 ================");
        WebElement checkbox1 = driver.findElement(By.xpath("//form/input [1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//form/input [2]"));

        System.out.println("Checkboxes1 is displayed = " + checkbox1.isDisplayed()
                            +"\nCheckboxes1 is enabled = " + checkbox1.isEnabled()
                            +"\nCheckboxes1 is selected = " + checkbox1.isSelected());

        System.out.println("============== Checkboxes 2 ===============");
        System.out.println("Checkboxes2 is displayed = " + checkbox2.isDisplayed()
                        +"\nCheckboxes2 is enabled = " + checkbox2.isEnabled()
                        +"\nCheckboxes2 is selected = " + checkbox2.isSelected());
        Thread.sleep(2000);
        tearDown();
    }
}
