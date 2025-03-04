package hu.robertszujo.seleniumproject.pages;

import com.aventstack.extentreports.ExtentTest;
import hu.robertszujo.seleniumproject.utils.ElementActions;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoanCalculatorPage extends BasePageObject {

    public LoanCalculatorPage(WebDriver driver, ExtentTest reporter) {
        super(driver, reporter);
    }

    // *** Elements ***

    @FindBy(css = "div[class='content_hitelmaximum']")
    private WebElement calculatorForm;

    // *** Element methods ***

    public void waitForCalculatorFormToBeDisplayed() {
        reporter.info("Waiting for calculator form to be displayed");
        ElementActions.waitForElementToBeDisplayed(calculatorForm, driver);
    }

    public boolean isCalculatorFormDisplayedAfterWaiting() {
        try {
            waitForCalculatorFormToBeDisplayed();
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

}
