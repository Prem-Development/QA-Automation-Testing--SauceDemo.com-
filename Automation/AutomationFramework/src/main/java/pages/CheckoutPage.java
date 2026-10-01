package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");

    By continueBtn = By.id("continue");
    By finishBtn = By.id("finish");

    public void enterDetails(String fn,
                             String ln,
                             String zip) {

        driver.findElement(firstName).sendKeys(fn);

        driver.findElement(lastName).sendKeys(ln);

        driver.findElement(postalCode).sendKeys(zip);

        driver.findElement(continueBtn).click();
    }

    public void finishOrder() {

        driver.findElement(finishBtn).click();
    }
}