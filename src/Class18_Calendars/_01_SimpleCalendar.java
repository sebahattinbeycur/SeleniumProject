package Class18_Calendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

import java.util.List;

public class _01_SimpleCalendar extends BaseClass {
    public static void main(String[] args) {
        setUp("https://demoqa.com/date-picker");

        driver.findElement(By.id("datePickerMonthYearInput")).click();

        WebElement monthDD = driver.findElement(By.cssSelector("select[class='react-datepicker__month-select']"));
        selectDdValue(monthDD, "May");

        WebElement yearDD = driver.findElement(By.cssSelector("select[class='react-datepicker__year-select']"));
        selectDdValue(yearDD, "1980");

        List<WebElement> daysDD = driver.findElements(By.cssSelector("div.react-datepicker__week div"));
        selectDdValue(daysDD, "1");
        wait(1);

        WebElement datePickerField = driver.findElement(By.id("datePickerMonthYearInput"));
        String pickerFieldText = datePickerField.getAttribute("value");
        System.out.println("pickerFieldText = " + pickerFieldText);

        tearDown();
    }
}
