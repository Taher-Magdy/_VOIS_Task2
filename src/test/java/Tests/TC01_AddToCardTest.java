package Tests;

import org.example.Pages.P01_HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.example.DriverManager.DriverFactory.createInstance;
import static org.example.DriverManager.DriverManager.getDriver;
import static org.example.Utilities.DataUtils.getEnvironmentPropertyValue;
import static org.example.Utilities.DataUtils.getJsonData;
import static org.example.Utilities.Utility.openWebsite;

public class TC01_AddToCardTest {

    private final String NAME = getJsonData("DataToSelectAseat", "name");
    private final String EMAIL = getJsonData("DataToSelectAseat", "email");
    private final String MobileNumber = getJsonData("DataToSelectAseat", "mobile number");
    private final String Gender = getJsonData("DataToSelectAseat", "gender");
    private final String Age = getJsonData("DataToSelectAseat", "age");
    private final String Concession = getJsonData("DataToSelectAseat", "concession");
    private final String Nationality = getJsonData("DataToSelectAseat", "nationality");
    private final String CardNumber = getJsonData("PaymentData", "card number");
    private final String CardExpiry = getJsonData("PaymentData", "expiration date");
    private final String CardCvv = getJsonData("PaymentData", "cvv");




    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        createInstance(getEnvironmentPropertyValue("BROWSER"));
        openWebsite(getEnvironmentPropertyValue("BASE_URL"));

}
    @Test
 public void AddToCard() {
     new P01_HomePage(getDriver())
             .pressTheArrow()
             .pressOnCHIKKAMAGALURU()
             .pressOnDate()
             .pressOnSearch()
             .pressOnSelectSeat()
             .pressOnCustomerDetails()
             .pressOnSelectSeat25()
             .sendDataToEmail(EMAIL)
             .sendDataToMobileNumber(MobileNumber)
             .pressOnPassengerDetails()
             .sendDataToName(NAME)
             .selectGender(Gender)
             .selectAge(Age)
             .selectConcession(Concession)
             .selectNationality(Nationality)
             .pressOnTermsChk()
             .pressOnPgBtn()
             .pressOnCard()
             .sendDataToCardNumber(CardNumber)
             .sendDataToCardExpiry(CardExpiry)
             .sendDataToCardCvv(CardCvv);
 }

}

