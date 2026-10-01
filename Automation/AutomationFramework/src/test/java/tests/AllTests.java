package tests;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;
import pages.CartPage;
import pages.CheckoutPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllTests extends BaseTest {

    @Test(priority = 1)
    public void invalidLoginTest() {

        LoginPage login =
                new LoginPage(driver);

        login.login("wrong","wrong");

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Epic sadface"));

        driver.navigate().refresh();
    }

    @Test(priority = 2)
    public void invalidUsernameTest() {

        LoginPage login =
                new LoginPage(driver);

        login.login("wrong_user",
                "secret_sauce");

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Epic sadface"));

        driver.navigate().refresh();
    }

    @Test(priority = 3)
    public void invalidPasswordTest() {

        LoginPage login =
                new LoginPage(driver);

        login.login("standard_user",
                "wrong");

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Epic sadface"));

        driver.navigate().refresh();
    }

    @Test(priority = 4)
    public void emptyLoginTest() {

        LoginPage login =
                new LoginPage(driver);

        login.login("","");

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Epic sadface"));

        driver.navigate().refresh();
    }

    @Test(priority = 5)
    public void lockedUserTest() {

        LoginPage login =
                new LoginPage(driver);

        login.login("locked_out_user",
                "secret_sauce");

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("locked out"));

        driver.navigate().refresh();
    }

    @Test(priority = 6)
    public void validLoginTest() {

        LoginPage login =
                new LoginPage(driver);

        login.login("standard_user",
                "secret_sauce");

        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("inventory"));
    }

    @Test(priority = 7)
    public void inventoryVisibleTest() {

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Products"));
    }

    @Test(priority = 8)
    public void addBackpackTest() {

        ProductPage product =
                new ProductPage(driver);

        product.addBackpack();

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Remove"));
    }

    @Test(priority = 9)
    public void addBikeLightTest() {

        ProductPage product =
                new ProductPage(driver);

        product.addBikeLight();

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Remove"));
    }

    @Test(priority = 10)
    public void openCartTest() {

        ProductPage product =
                new ProductPage(driver);

        product.openCart();

        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("cart"));
    }

    @Test(priority = 11)
    public void verifyBackpackInCartTest() {

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Sauce Labs Backpack"));
    }

    @Test(priority = 12)
    public void checkoutNavigationTest() {

        CartPage cart =
                new CartPage(driver);

        cart.clickCheckout();

        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("checkout-step-one"));
    }

    @Test(priority = 13)
    public void enterCheckoutDetailsTest() {
        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.enterDetails("Prem", "Kumar", "30000");
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-step-two"));
    }

    @Test(priority = 14)
    public void completeOrderTest() {

        CheckoutPage checkout = new CheckoutPage(driver);

        checkout.finishOrder();

        Assert.assertTrue(driver.getPageSource().contains("Thank you"));
    }

    @Test(priority = 15)
    public void logoutTest() {

        driver.findElement(
                        By.id("back-to-products"))
                .click();

        driver.findElement(
                        By.id("react-burger-menu-btn"))
                .click();

        driver.findElement(
                        By.id("logout_sidebar_link"))
                .click();

        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("saucedemo"));
    }
}