package pages;

import org.openqa.selenium.WebElement;

public class FiltersPage extends BasePage {

    private String getCheckBoxButtonPath() {
        return "//body[1]/div[8]/div[3]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/label[1]";
    }

    private String getRadioButtonPath() {
        return "//body[1]/div[8]/div[3]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/fieldset[1]/div[1]/div[1]/div[2]/label[1]";
    }

    private String getApplyButtonPath() {
        return "//body[1]/div[8]/div[3]/div[1]/div[1]/div[2]/button[2]";
    }

    private String getFilter1Path() {
        return "//body/div[@id='content']/div[1]/div[1]/div[1]/div[4]/div[5]/div[3]/div[7]/ul[1]/li[1]/ul[1]/li[1]";
    }

    private String getFilter2Path() {
        return "//body/div[@id='content']/div[1]/div[1]/div[1]/div[4]/div[5]/div[3]/div[7]/ul[1]/li[2]/ul[1]/li[1]";
    }

    public WebElement getCheckBoxButton() {
        return findElementByXpath(this.getCheckBoxButtonPath());
    }

    public WebElement getRadioButton() {
        return findElementByXpath(this.getRadioButtonPath());
    }

    public WebElement getApplyButton() {
        return findElementByXpath(this.getApplyButtonPath());
    }

    public WebElement getFilter1() {
        return findElementByXpath(this.getFilter1Path());
    }

    public WebElement getFilter2() {
        return findElementByXpath(this.getFilter2Path());
    }
}
