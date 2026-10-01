package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By backpack =
            By.id("add-to-cart-sauce-labs-backpack");

    By bikeLight =
            By.id("add-to-cart-sauce-labs-bike-light");

    By cart =
            By.className("shopping_cart_link");

    public void addBackpack() {

        driver.findElement(backpack).click();
    }

    public void addBikeLight() {

        driver.findElement(bikeLight).click();
    }

    public void openCart() {

        driver.findElement(cart).click();
    }
}