package Class20_POM.test;

import Class20_POM.pages._01_LoginPageWithoutPageFactory;
import Class20_POM.pages._02_LoginPageWithPageFactory;
import utils.BaseClass;

import static utils.BaseClass.setUp;

public class _02_LogoTest_Task extends BaseClass {
    public static void main(String[] args) {
        setUp("https://exelentersdet.com/");

        // without page factory
//        var loginPage = new _01_LoginPageWithoutPageFactory();
//        boolean homepageLogoDisplayed = loginPage.homepageLogo.isDisplayed();
//        if (homepageLogoDisplayed)
//            System.out.println("Logo is displayed");
//        else
//            System.out.println("Logo is not displayed");

        // with PageFactory
        var loginWithPF = new _02_LoginPageWithPageFactory();
        boolean logoDisplayed = loginWithPF.homepageLogo.isDisplayed();
        if (logoDisplayed)
            System.out.println("Logo is displayed");
        else
            System.out.println("Logo is not displayed");


        tearDown();
    }
}
