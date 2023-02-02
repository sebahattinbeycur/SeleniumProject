package Class16_DevelopFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class _02_RadioOrCheckboxTest2 {
    public static void main(String[] args) {
        setUp("https://demoqa.com/radio-button");

        WebElement noRadioBtn = driver.findElement(By.id("noRadio"));
        WebElement yesRadioBtn = driver.findElement(By.id("yesRadio"));

        boolean radioBtnEnabled = noRadioBtn.isEnabled();
        System.out.println("radioBtnEnabled = " + radioBtnEnabled);

//        clickRadioOrCheckbox(noRadioBtn);
//        clickButWaitForClickability(yesRadioBtn);
//        clickRadioOrCheckbox(yesRadioBtn);




//        tearDown();
    }
}
