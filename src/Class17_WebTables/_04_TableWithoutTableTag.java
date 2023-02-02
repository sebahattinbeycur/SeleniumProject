package Class17_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

import java.util.List;

public class _04_TableWithoutTableTag extends BaseClass {
    public static void main(String[] args) {
        setUp("https://demoqa.com/webtables");

        // Print columns:
        List<WebElement> columns = driver.findElements(By.cssSelector("div[class='rt-thead -header'] div div div:nth-child(1)"));
        System.out.println("Number of columns: " + columns.size());
        for (WebElement column : columns) {
            System.out.print(column.getText() + " | ");
        }

        // Print rows
        List<WebElement> rows = driver.findElements(By.cssSelector("div.rt-tr-group"));
        System.out.println("\nNumber of rows: " + rows.size());

        int count = 0;
        for (int i = 0; i < rows.size(); i++) {
            if (!rows.get(i).getText().isEmpty() && !rows.get(i).getText().isBlank()) {
                count++;
            }
        }
        System.out.println("Number of rows not blank: " + count);

        //Adding one row
        driver.findElement(By.id("addNewRecordButton")).click();
        wait(1);
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Sebahattin");
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Beycur");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("beycur@gmail.com");
        driver.findElement(By.cssSelector("#age")).sendKeys("43");
        driver.findElement(By.cssSelector("#salary")).sendKeys("120000");
        driver.findElement(By.cssSelector("#department")).sendKeys("IT");
        wait(1);
        driver.findElement(By.cssSelector("#submit")).click();
        wait(1);


        System.out.println("=== ALL ROWS ===");

        int countRows = 0;
        rows = driver.findElements(By.cssSelector("div.rt-tr-group"));
        for (int i = 0; i < rows.size(); i++) {
            countRows++;
            System.out.println("--- Row "+ countRows + " ---");
            System.out.println(rows.get(i).getText());
        }

        tearDown();
    }
}
