package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class HW_Birthday {
    public static void main(String[] args) throws InterruptedException {
        setUp();        //https://vitalets.github.io/combodate/

        WebElement days = driver.findElement(By.xpath("(//select[@class='day '])[1]"));
        WebElement month = driver.findElement(By.xpath("(//select[@class='month '])[1]"));
        WebElement year = driver.findElement(By.xpath("(//select[@class='year '])[1]"));

        Select select1 = new Select(days);
        Select select2 = new Select(month);
        Select select3 = new Select(year);
        List<WebElement> birthdayList1 = select1.getOptions();
        List<WebElement> birthdayList2 = select2.getOptions();
        List<WebElement> birthdayList3 = select3.getOptions();

        for (WebElement birthDayMy1 : birthdayList1){
            birthDayMy1.click();
            if (birthDayMy1.getText().equals("1")){
                Thread.sleep(2000);
                break;
            }
        }
        for (WebElement birthDayMy2 : birthdayList2){
            birthDayMy2.click();
            if (birthDayMy2.getText().equals("Jun")){
                Thread.sleep(2000);
                break;
            }
        }
        for (WebElement birthDayMy3 : birthdayList3){
            birthDayMy3.click();
            if (birthDayMy3.getText().equals("1980")){
                Thread.sleep(2000);
                break;
            }
        }
        WebElement showInput = driver.findElement(By.xpath("(//button[text()='show input'])[1]"));
        showInput.click();
        Thread.sleep(3000);

        tearDown();
    }
}
