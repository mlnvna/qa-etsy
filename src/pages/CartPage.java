package pages;

import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    private String getRemoveItemButtonPath() {
        return "//span[contains(text(),'Remove')]";
    }

    private String getEmptyCartMessageClass() {
        return "wt-text-center-xs";
    }

    public WebElement getRemoveItemButton() {
        return findElementByXpath(this.getRemoveItemButtonPath());
    }

    public WebElement getEmptyCartMessage() {
        return findElementByClass(this.getEmptyCartMessageClass());
    }

}
