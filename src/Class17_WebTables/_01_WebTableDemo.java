package Class17_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

import static utils.BaseClass.*;

public class _01_WebTableDemo {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/tables");

        List<WebElement> rows = driver.findElements(By.cssSelector("table#table1 tbody tr"));
        System.out.println("Number of rows: " + rows.size());

        System.out.println("=== Printing Rows ===");
        Iterator<WebElement> iterator = rows.iterator();
        while (iterator.hasNext()){
            WebElement row = iterator.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }
        System.out.println("=== Printing rows with less line ===");
        Iterator<WebElement> iterator1 = rows.iterator();
        while (iterator1.hasNext()){
            System.out.println("iterator.next().getText() = " + iterator1.next().getText());
        }
        System.out.println("=== Print number of columns ===");
        List<WebElement> colums = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("Number of colums : " + colums.size());

        for (WebElement colum : colums){
            System.out.print(colum.getText() + " | ");
        }

        tearDown();
    }
}
