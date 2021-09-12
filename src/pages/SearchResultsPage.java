package pages;

import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BasePage {

    private String getFirstresultItemPath() {
        return "//body/div[@id='content']/div[1]/div[1]/div[1]/div[4]/div[5]/div[3]/div[9]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]";
    }

    private String getAddFiltersPath() {
        return "//button[@id='search-filter-button']";
    }

    public WebElement getfirstResultItem() {
        return findElementByXpath(this.getFirstresultItemPath());
    }

    public WebElement getAddFilters() {
        return findElementByXpath(this.getAddFiltersPath());
    }
}
