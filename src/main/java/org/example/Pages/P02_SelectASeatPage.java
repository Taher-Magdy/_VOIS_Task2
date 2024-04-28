package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.Utilities.Utility.*;
import static org.example.Utilities.WaitsUtils.implicitlyWait;

public class P02_SelectASeatPage {
    private final WebDriver driver;

    public P02_SelectASeatPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By selectSeat = By.xpath("(//input[@id=\"SrvcSelectBtnForward0\"])[2]");
    private final By boardingPoint = By.xpath("//li[@id=\"Forward-1467469338690\"]");
    private final By droppingPoint = By.xpath("//a[@id=\"Forwarddroping-tab\"]");
    private final By droppingArea = By.xpath("//li[@id=\"Forward-1467467616730\"]");
    private final By customerDetails = By.xpath("//a[@id=\"Forwardprofile-tab\"]");
    private final By selectSeat25 = By.xpath("//span[@class=\"seatNumber\"][contains(.,'20')]");
    private final By mobileNumber = By.id("mobileNo");
    private final By email = By.id("email");
    private final By passengerDetails = By.xpath("//*[@id=\"passenger-details\"]/div/p/a");//
    private final By name = By.xpath("//*[@id=\"passengerNameForward0\"]");
    private final By selectGender = By.name("genderCodeId");
    private final By selectAge = By.name("passengerAge");
    private final By selectConcession = By.name("concessionIds");
    private final By nationality = By.name("nationality");
    private final By termsChk = By.name("termsChk");
    // //*[@id="termsChk"]
    private final By PgBtn = By.id("PgBtn");

    public P02_SelectASeatPage pressOnSelectSeat() {
        clicking(driver, selectSeat);
        return this;
    }
    public P02_SelectASeatPage pressOnBoardingPoint() {
        clicking(driver, boardingPoint);
        return this;
    }
    public P02_SelectASeatPage pressOnDroppingPoint() {
        clicking(driver, droppingPoint);
        return this;
    }
    public P02_SelectASeatPage pressOnDroppingArea() {
        clicking(driver, droppingArea);
        return this;
    }
    public P02_SelectASeatPage pressOnCustomerDetails() {
        clicking(driver, customerDetails);
        return this;
    }
    public P02_SelectASeatPage pressOnSelectSeat25() {
        clicking(driver, selectSeat25);
        return this;
    }
    public P02_SelectASeatPage sendDataToMobileNumber(String data) {
        sendData(driver, mobileNumber, data);
        return this;
    }
    public P02_SelectASeatPage pressOnPassengerDetails() {
        implicitlyWait();
        clicking(driver, passengerDetails);
        return this;
    }
    public P02_SelectASeatPage sendDataToEmail(String data) {
        sendData(driver, email, data);
        return this;
    }
    public P02_SelectASeatPage sendDataToName(String data) {
        sendData(driver, name, data);
        return this;
    }
public P02_SelectASeatPage selectGender(String data) {
        selectFromDropDown(driver, selectGender, data);
        return this;
    }
    public P02_SelectASeatPage selectAge(String data) {
        sendData(driver, selectAge, data);
        return this;
    }
    public P02_SelectASeatPage selectConcession(String data) {
        selectFromDropDown(driver, selectConcession, data);
        return this;
    }
    public P02_SelectASeatPage selectNationality(String data) {
        selectFromDropDown(driver,nationality, data);
        return this;
    }
    public P02_SelectASeatPage pressOnTermsChk() {
        clicking(driver, termsChk);
        return this;
    }
    public P03_PaymentPage pressOnPgBtn() {
        clicking(driver, PgBtn);
        return new P03_PaymentPage(driver);
    }


}
