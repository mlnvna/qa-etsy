package pages;

import org.openqa.selenium.WebElement;

public class InfoItemPage extends BasePage {

    private String getAddToCartButtonPath() {
        return "/html/body/div[5]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[3]/div[3]/div/form/button";
    }

    public WebElement getAddToCartButton() {
        return findElementByXpath(this.getAddToCartButtonPath());
    }

}
