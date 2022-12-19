package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static utils.BaseClass.*;

public class _04_DropdownArrayList {
    public static void main(String[] args) {
        setUp();        //https://selenium08.blogspot.com/2019/11/dropdown.html

        WebElement months = driver.findElement(By.cssSelector("select[name='Month']"));
        Select select = new Select(months);

        List<WebElement> listOfMonths = select.getOptions();
        int totalMonths = listOfMonths.size();
        System.out.println("totalMonths = " + totalMonths);

        List<String> expectedList = new ArrayList<>();
        expectedList.add("March");
        expectedList.add("June");
        expectedList.add("November");
        expectedList.add("July");
        expectedList.add("December");

        if (expectedList.containsAll(listOfMonths))
            System.out.println("The list does match. Test Passed.");
        else
            System.err.println("The list does NOT match. Test failed.");

        List<String> actualList = new ArrayList<>();
        for (WebElement month : listOfMonths){
            actualList.add(month.getText());
        }
        if (actualList.containsAll(expectedList))
            System.out.println("THE LIST DOES MATCH");
        else
            System.err.println("THE LIST DOES NOT MATCH");

        // Let's verify - print both expectedList AND actualList to the console.
        System.out.println("=== ACTUAL LIST ===");
        for (String actual : actualList) {
            System.out.println(actual);
        }

        System.out.println("=== EXPECTED LIST ===");
        for (String expected : expectedList) {
            System.out.println(expected);
        }

        tearDown();
    }
}
