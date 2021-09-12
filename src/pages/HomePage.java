package pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private String getSignInButtonPath() {
        return "//button[contains(text(),'Sign in')]";
    }

    private String getSearchBarPath() {
        return "//input[@id='global-enhancements-search-query']";
    }

    private String getSearchButtonClass() {
        return "global-enhancements-search-input-btn-group__btn";
    }

    private String getDropDownFirstElementPath() {
        return "//header/div[2]/div[1]/form[1]/div[1]/div[2]/ul[1]/div[1]/li[1]";
    }

    public WebElement getSignInButton() {
        return findElementByXpath(this.getSignInButtonPath());
    }

    public WebElement getSearchBar() {
        return findElementByXpath(this.getSearchBarPath());
    }

    public WebElement getSearchButton() {
        return findElementByClass(this.getSearchButtonClass());
    }

    public WebElement getDropDownFirstElement() {
        return findElementByXpath(this.getDropDownFirstElementPath());
    }

}
