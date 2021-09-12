package test;

import browser.Browser;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestingEtsy extends BaseTest {


    //	This test is used to check if we will get relevant products in the search by brand name.
    @Test
    public void testSearchingItemsByBrandName() throws InterruptedException {
        etsy.homePage().getSearchBar().sendKeys("ikea");
        Thread.sleep(2000);
        etsy.homePage().getDropDownFirstElement().click();
        Thread.sleep(2000);
        assertTrue(
                etsy.loggedInPage().parseString(etsy.loggedInPage().getSearchResultString().getText()) > 0);
    }


    //	This test is used to verify the status of the Cart in case the user removes all items from it.
    @Test
    public void emptyingCartTest() throws InterruptedException {
        etsy.homePage().getSearchBar().sendKeys("supreme pizza coin");
        etsy.homePage().getSearchBar().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        etsy.searchResultsPage().getfirstResultItem().click();
        etsy.searchResultsPage().switchBrowserTab(1);
        etsy.infoItemPage().getAddToCartButton().click();
        Thread.sleep(1000);
        etsy.cartPage().getRemoveItemButton().click();
        Thread.sleep(1000);
        assertEquals("Your cart is empty.", etsy.cartPage().getEmptyCartMessage().getText());
    }


    //	This test is used to check whether the selected filters have been applied to the search.
    @Test
    public void filteringTest() throws InterruptedException {
        etsy.homePage().getSearchBar().sendKeys("lunchbox");
        Thread.sleep(1000);
        etsy.homePage().getSearchButton().click();
        Thread.sleep(1000);
        etsy.searchResultsPage().getAddFilters().click();
        Thread.sleep(1000);
        etsy.filtersPage().getCheckBoxButton().click();
        etsy.filtersPage().getRadioButton().click();
        Thread.sleep(1000);
        etsy.filtersPage().getApplyButton().click();
        Thread.sleep(1000);
        etsy.filtersPage().refreshPage();
        assertEquals("At Most USD 25", etsy.filtersPage().getFilter1().getText());
        Thread.sleep(3000);
        assertEquals("FREE shipping", etsy.filtersPage().getFilter2().getText());
    }


    //	Check the password for less value than minimum.
    @Test
    public void invalidPasswordTest() throws InterruptedException {
        etsy.homePage().getSignInButton().click();
        WebDriverWait wait_email = new WebDriverWait(Browser.getBrowser(), 5);
        wait_email.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(etsy.signInPage().getEmailAddressFieldPath())));
        etsy.signInPage().getEmailAddressField().sendKeys(etsy.signInPage().generateRandomEmail(10));
        etsy.signInPage().getContinueButton().click();
        WebDriverWait wait_name = new WebDriverWait(Browser.getBrowser(), 5);
        wait_name.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(etsy.signInPage().getFirstNamePath())));
        etsy.signInPage().getFirstName().sendKeys(etsy.signInPage().generateRandomName(10));
        etsy.signInPage().getPasswordField().sendKeys(etsy.signInPage().generateRandomPassword(4));
        etsy.signInPage().getRegisterButton().click();
        Thread.sleep(1000);
        assertEquals("Must be at least 6 characters.", etsy.signInPage().getErrorMessage().getText());
    }


    //This test is used to verify login with valid credentials.
    @Test
    public void successfullyLoginTest() throws InterruptedException {
        etsy.homePage().getSignInButton().click();
        Thread.sleep(1000);
        etsy.signInPage().getEmailAddressField().sendKeys("testingbyNevena@gmail.com");
        etsy.signInPage().getContinueButton().click();
        Thread.sleep(1000);
        etsy.signInPage().getPasswordField().sendKeys("t3stinG");
        etsy.signInPage().getSignInButton().click();
        Thread.sleep(1000);
        etsy.signInPage().refreshPage();
        etsy.loggedInPage().getAccountButton().click();
        Thread.sleep(1000);
        assertEquals("Sign out", etsy.loggedInPage().getSignOutButton().getText());
        etsy.loggedInPage().getSignOutButton().click();
    }

}
