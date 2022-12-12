package Class10;

import utils.BaseClass;
import static utils.BaseClass.*;

public class TestClass {
    public static void main(String[] args) {
        setUp();

        System.out.println(driver.getTitle());

        tearDown();
    }
}
