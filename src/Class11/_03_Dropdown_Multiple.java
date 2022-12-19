package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

import static utils.BaseClass.*;

public class _03_Dropdown_Multiple {
    public static void main(String[] args) throws InterruptedException {
        setUp();        //https://selenium08.blogspot.com/2019/11/dropdown.html

        WebElement months = driver.findElement(By.cssSelector("select[name='Month']"));
        Select select = new Select(months);

        List<WebElement> listOfMonths = select.getOptions();
        int totalMonths = listOfMonths.size();
        System.out.println("totalMonths = " + totalMonths);

        System.out.println("===== For Loop =====");
        for (int i = 1; i < listOfMonths.size(); i++) {
            System.out.println(listOfMonths.get(i).getText());
        }
        System.out.println("===== Enhanced Loop =====");
        for(WebElement month : listOfMonths){
            System.out.println(month.getText());
        }
        System.out.println("===== Iterator =====");
        Iterator<WebElement> iterator = listOfMonths.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getText());
        }
        //Task 2 : Print only a specific (selected) months from the list. For example, March, May and September.
        //1st way : without Select
//        for (WebElement month : listOfMonths){
//            if (month.getText().equals("March") || month.getText().equals("May") || month.getText().equals("September")){
//                month.click();
//            }
//        }
        //2nd way : without Select
        if (select.isMultiple())
            select.selectByIndex(3);
            select.selectByVisibleText("May");
            select.selectByValue("Sept");
            Thread.sleep(2000);
            select.deselectByIndex(3);
            Thread.sleep(2000);
            select.deselectAll();



        tearDown();
    }

}
