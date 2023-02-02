package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

import java.time.Duration;
import java.util.List;

/**
 *   Test Case 1: Calendars - Delta Airlines
 *      1. Open Chrome Browser
 *      2. Navigate to URL: https://www.delta.com/flight-search/book-a-flight
 *      3. Select Depart - Return
 *      4. Select departure as April 13, 2023
 *      5. Select return/arrival as August 15, 2023
 *      6. Print itinerary details in the console
 *      7. Close the browser.
 */

public class TestCase1_Delta_Airlines extends BaseClass {
    public static void main(String[] args) {
        setUp("https://www.delta.com/flight-search/book-a-flight");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String departMonthAndYear = "April 2023";
        String departDay = "13";
        String returnMonthAndYear = "August 2023";
        String returnDay = "15";

        driver.findElement(By.cssSelector("span.calenderDepartSpan")).click();
        String monthAndYear = driver.findElement(By.xpath("(//div[@class='dl-datepicker-title'])[1]")).getText();
        departMonthAndYear = departMonthAndYear.replaceAll(" ","");
        returnMonthAndYear = returnMonthAndYear.replaceAll(" ","");

        while (!monthAndYear.equals(departMonthAndYear)) {
            driver.findElement(By.xpath("(//span[@class='monthSelector'])[2]")).click();
            wait(1);
            monthAndYear = driver.findElement(By.xpath("(//div[@class='dl-datepicker-title'])[1]")).getText();
        }
            List<WebElement> days = driver.findElements(By.xpath("(//tbody[@class='dl-datepicker-tbody-0'])//a"));
            for (WebElement day : days){
                if (day.getAttribute("text").equals(departDay)){
                    System.out.println("Your itinerary details:");
                    System.out.println("Departure: " + day.getAttribute("text") + " of " + monthAndYear);  // Departing: 15 of August 2023
                    day.click();
                    break;
                }
            }
        wait(1);

        while (!monthAndYear.equals(returnMonthAndYear)) {
            driver.findElement(By.xpath("(//span[@class='monthSelector'])[2]")).click();
            wait(1);
            monthAndYear = driver.findElement(By.xpath("(//div[@class='dl-datepicker-title'])[1]")).getText();
        }
        days = driver.findElements(By.xpath("(//tbody[@class='dl-datepicker-tbody-0'])//a"));
        for (WebElement day : days){
            if (day.getAttribute("text").equals(returnDay)){
                System.out.println("Return: " + day.getAttribute("text") + " of " + monthAndYear);  // Departing: 15 of August 2023
                day.click();
                driver.findElement(By.xpath("//button[@value='done']")).click();
                break;
            }
        }
        wait(2);


//        tearDown();
    }
}
