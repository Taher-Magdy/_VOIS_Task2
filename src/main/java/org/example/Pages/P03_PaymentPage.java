package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.Utilities.Utility.clicking;
import static org.example.Utilities.Utility.sendData;
import static org.example.Utilities.WaitsUtils.implicitlyWait;

public class P03_PaymentPage {

    private final WebDriver driver;

    public P03_PaymentPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By paymentByCard = By.xpath("//*[@id=\"form-common\"]/div[1]/div[1]/div/div/div[2]/div/button[2]");
    private final By cardNumber = By.id("card_number");
    private final By cardExpiry = By.id("card_expiry");
    private final By cardCvv = By.id("card_cvv");
    //razorpay-checkout-frame
    private final By Frame = By.xpath("//iframe[@class='razorpay-checkout-frame']");


    public P03_PaymentPage pressOnCard() {
        driver.switchTo().frame(driver.findElement(Frame));
        implicitlyWait();
        clicking(driver, paymentByCard);
        return this;
    }
    public P03_PaymentPage sendDataToCardNumber(String data) {
        clicking(driver, cardNumber);
        return this;
    }
    public P03_PaymentPage sendDataToCardExpiry(String data) {
        sendData(driver, cardExpiry, data);
        return this;
    }
    public P03_PaymentPage sendDataToCardCvv(String data) {
        sendData(driver, cardCvv, data);
        return this;
    }
}
