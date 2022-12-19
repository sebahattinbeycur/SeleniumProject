package Class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _02_ModalAlert {
    public static void main(String[] args) throws InterruptedException {
        setUp();        //  https://demoqa.com/modal-dialogs

        WebElement modalAlert = driver.findElement(By.id("showSmallModal"));
        modalAlert.click();
        Thread.sleep(2000);
        System.out.println(modalAlert.getText());

        // Print in two lines (Title of Modal)
        String modalTitleText = driver.findElement(By.xpath("//div[@class='modal-title h4']")).getText();
        System.out.println("modalTitleText: " + modalTitleText);

        // Print in one line (Body content of Modal)
        System.out.println("modalBodyText: " + driver.findElement(By.xpath("//div[@class='modal-body']")).getText());

        driver.findElement(By.id("closeSmallModal")).click();
        Thread.sleep(2000);

        tearDown();
    }
}
