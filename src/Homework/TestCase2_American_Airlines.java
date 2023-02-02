package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;

import java.time.Duration;
import java.util.List;

public class TestCase2_American_Airlines extends BaseClass {
    /**
     *  Test Case 2: Calendars - American Airlines
     *     1. Open Chrome Browser
     *     2. Navigate to URL: https://www.aa.com/
     *     3. Select From → (LAX)
     *     4. Select To → (JFK)
     *     5. Number of passengers → 2
     *     6. Select Depart → March 01, 2023
     *     7. Select Return → April 15, 2023
     *     8. Click ‘Search’ to see ticket prices
     *     9. Optionally, print ticket price.
     *     10. Close the browser.
     */
    public static void main(String[] args) {
        setUp("https://www.aa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//*[@class='icon-close']")).click();

        String from = "LAX";
        String to = "JFK";
        String passengers = "2";
        String departMonthAndYear = "March 2023";
        String departDay = "01";
        String returnMonthAndYear = "April 2023";
        String returnDay = "15";

        WebElement fromAirport = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
        sendText(fromAirport,from);
        WebElement toAirport = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
        sendText(toAirport,to);
        WebElement passengersAdd = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
        Select select = new Select(passengersAdd);
        select.selectByVisibleText(passengers);

        driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
        wait(1);
        String monthAndYear = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();

        while (!monthAndYear.equals(departMonthAndYear)) {
            driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
            wait(1);
            monthAndYear = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
        }
        wait(1);
        List<WebElement> days = driver.findElements(By.xpath("(//tbody)[1]//a"));
        for (WebElement day : days){
            wait(1);
            if (day.getText().equals(departDay)){
                System.out.println("Your itinerary details:");
                System.out.println("Departure: " + day.getAttribute("text") + " of " + monthAndYear);  // Departing: 15 of August 2023
                day.click();
                break;
            }
        }
        wait(1);

//        while (!monthAndYear.equals(returnMonthAndYear)) {
//            driver.findElement(By.xpath("(//span[@class='monthSelector'])[2]")).click();
//            wait(1);
//            monthAndYear = driver.findElement(By.xpath("(//div[@class='dl-datepicker-title'])[1]")).getText();
//        }
//        days = driver.findElements(By.xpath("(//tbody[@class='dl-datepicker-tbody-0'])//a"));
//        for (WebElement day : days){
//            if (day.getAttribute("text").equals(returnDay)){
//                System.out.println("Return: " + day.getAttribute("text") + " of " + monthAndYear);  // Departing: 15 of August 2023
//                day.click();
//                break;
//            }
//        }
//        wait(1);


//        tearDown();
    }
}
