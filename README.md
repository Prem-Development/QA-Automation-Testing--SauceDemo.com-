# SauceDemo Automation Testing Framework

## Project Overview

This project is a Selenium WebDriver Automation Framework developed using Java, Maven, and TestNG.

The framework automates the SauceDemo web application and validates complete end-to-end user workflows.

The project follows the Page Object Model (POM) design pattern to improve maintainability, reusability, and scalability.

## Technologies Used

- Java JDK 21
- Selenium WebDriver 4.21.0
- TestNG 7.10.2
- Extent Reports 5.1.1
- Apache Maven
- Page Object Model (POM)
- IntelliJ IDEA Community Edition

## Automated Workflows

- Login Validation
  - Valid Login
  - Invalid Username
  - Invalid Password
  - Empty Login
  - Locked User

- Product Selection
  - Inventory Validation
  - Add Products to Cart

- Cart Operations
  - Verify Cart Contents
  - Cart Navigation

- Checkout Process
  - Enter Customer Details
  - Checkout Navigation

- Order Completion
  - Complete Order
  - Validate Order Success

- Logout
  - Verify Logout Functionality

## Test Cases

The framework contains 15 automated test scenarios.

| Test ID | Scenario | Module |
|---|---|---|
| TC001 | Invalid Login | Login |
| TC002 | Invalid Username | Login |
| TC003 | Invalid Password | Login |
| TC004 | Empty Login | Login |
| TC005 | Locked User | Login |
| TC006 | Valid Login | Login |
| TC007 | Inventory Validation | Product |
| TC008 | Add Backpack Product | Product |
| TC009 | Add Bike Light Product | Product |
| TC010 | Open Cart | Cart |
| TC011 | Verify Cart | Cart |
| TC012 | Checkout Navigation | Checkout |
| TC013 | Enter Details | Checkout |
| TC014 | Complete Order | Checkout |
| TC015 | Logout | Logout |

## Framework Structure

```text
AutomationFramework/
│
├── src/
│   ├── main/java/
│   │   ├── base/
│   │   │   └── BaseTest.java
│   │   │
│   │   └── pages/
│   │       ├── LoginPage.java
│   │       ├── ProductPage.java
│   │       ├── CartPage.java
│   │       └── CheckoutPage.java
│   │
│   └── test/java/
│       └── tests/
│           └── AllTests.java
│
├── reports/
│   └── ExtentReport.html
│
├── screenshots/
│
├── testng.xml
├── pom.xml
└── README.md
