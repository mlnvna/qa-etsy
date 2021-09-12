package pages;

import org.openqa.selenium.WebElement;

public class LoggedInPage extends BasePage {

    private String getSearchResultStringPath() {
        return "//span[contains(text(),' results,')]";
    }

    private String getAccountButtonPath() {
        return "//header/div[4]/nav[1]/ul[1]/li[3]/div[1]/button[1]";
    }

    private String getSignOutButtonPath() {
        return "//p[contains(text(),'Sign out')]";
    }

    public WebElement getAccountButton() {
        return findElementByXpath(this.getAccountButtonPath());
    }

    public WebElement getSignOutButton() {
        return findElementByXpath(this.getSignOutButtonPath());
    }

    public WebElement getSearchResultString() {
        return findElementByXpath(getSearchResultStringPath());
    }

}
