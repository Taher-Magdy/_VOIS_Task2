package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.Utilities.Utility.*;
public class P01_HomePage {


    private final WebDriver driver;

    private final By ProductButton = By.xpath("//a[@href=\"/products\"]");

    //  Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    private final By SubscriptionText = By.xpath("//h2[contains(text(),'Subscription')]");
    private final By ScrollUpButton = By.cssSelector("[id=\"scrollUp\"]");
    private final By HeaderText = By.cssSelector("div[class='item active'] div[class='col-sm-6'] h2");

    private final By SearchField = By.name("field-keywords");
    private final By SearchButton = By.id("nav-search-submit-button");
    private final By AllButton = By.className("hm-icon-label");
    //*[@id="hmenu-content"]/ul[1]/li[7]/a
    // nav-sprite hmenu-arrow-next
    // (//a[@class="hmenu-item"])[4]

    private final By popularRoute = By.xpath("//a[contains(.,'Chikkamagaluru - Bengaluru')]");
    // //*[@id="routeSlider"]/div/div[2]/div/div/ul/li[1]/a
    private final By NextArrow = By.xpath("(//span[@aria-hidden='true'])[5]");
    private final By leftArrow = By.xpath("//*[contains(@class, 'carousel-item')]");
    private final By arrivalDate = By.xpath("//input[@id=\"txtReturnJourneyDate\"]");
    private final By date = By.xpath("(//a[@href='#'])[28]");
    private final By searchButton = By.xpath("(//button[@type=\"button\"])[2]");


    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public P01_HomePage pressTheArrow() {
        clicking(driver, NextArrow);
        return this;
    }
    public P01_HomePage pressOnCHIKKAMAGALURU() {
        clicking(driver, popularRoute);
        return this;
    }

    public P01_HomePage pressOnArrivalDate() {
        clicking(driver, arrivalDate);
        return this;
    }

    public P01_HomePage pressOnDate() {
        clicking(driver, date);
        return this;
    }

    public P02_SelectASeatPage pressOnSearch() {
        clicking(driver, searchButton);
        return new P02_SelectASeatPage(driver);
    }


//    public P01_HomePage pressOnSearch() {
//        clicking(driver, searchButton);
//        return this;
//    }


}