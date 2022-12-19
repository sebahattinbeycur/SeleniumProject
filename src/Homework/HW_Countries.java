package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class HW_Countries {
    private static int count;
    public static void main(String[] args) throws InterruptedException {
        setUp();        //https://selenium08.blogspot.com/2019/11/dropdown.html

        //1. way
        WebElement countryDD = driver.findElement(By.cssSelector("select[name='country']"));
        Select select = new Select(countryDD);

        // 1nd way easy
//        select.selectByVisibleText("United States of America");

        List<WebElement> listOfCountries = select.getOptions();
        for (WebElement country : listOfCountries) {
            country.click();
            if (country.getText().equals("United States of America")){
                country.click();
                System.out.println("There is the \'United States of America\'");
                count = 0;
                break;
            }
            else {
                count = 1;
            }
        }
        if (count==1) {
            System.out.println("There is not the \'United States of America\'");
        }

            // 2. way

        for (WebElement country : listOfCountries){
            if (country.getText().equals("Morocco")){
                country.click();
                Thread.sleep(2000);
                System.out.println("There is the \'Morocco\'");
                count = 0;
                break;
            }else {
                count = 1;
            }
        }
        if (count==1){
            System.out.println("There is not the \'Morocco\'");
        }

        tearDown();
    }
}
