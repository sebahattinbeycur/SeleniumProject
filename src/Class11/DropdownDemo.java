package Class11;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class DropdownDemo {
    public static void main(String[] args) throws InterruptedException{
        // 1st way: Without using Select Class
        setUp();
//        List<WebElement> countries = driver.findElements(By.cssSelector("select[name='country'] option"));
//        for (WebElement country : countries){
//            System.out.println(country.getText());
//        }

        // 2nd way: Using the Select class provided by Selenium
        WebElement countryDD = driver.findElement(By.cssSelector("select[name='country']"));
        Select select = new Select(countryDD);

        List<WebElement> countries = select.getOptions();
        System.out.println("Total number of countriesList = " + countries.size());

        // Loop through all countries using their index
        for (WebElement country : countries){
            country.click();
            if (country.getText().equals("Turkey")) {
                country.click();
                break;
            }
        }

//        for (int i = 0; i < countries.size(); i++) {
//            countries.get(i).click();
//            Thread.sleep(10);
//        }
        tearDown();
    }
}
