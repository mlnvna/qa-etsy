package pages;

import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage {

    public String getEmailAddressFieldPath() {
        return "//input[@id='join_neu_email_field']";
    }

    public String getFirstNamePath() {
        return "//input[@id='join_neu_first_name_field']";
    }

    private String getContinueButtonPath() {
        return "//button[contains(text(),'Continue')]";
    }

    private String getPasswordFieldPath() {
        return "//input[@id='join_neu_password_field']";
    }

    private String getSignInButtonPath() {
        return "//body/div[@id='wt-modal-container']/div[@id='join-neu-overlay']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[6]/div[1]/button[1]";
    }

    private String getErrorMessagePath() {
        return "//div[@id='aria-join_neu_password_field-error']";
    }

    private String getRegisterButtonPath() {
        return "//button[contains(text(),'Register')]";
    }

    public WebElement getEmailAddressField() {
        return findElementByXpath(this.getEmailAddressFieldPath());
    }

    public WebElement getContinueButton() {
        return findElementByXpath(this.getContinueButtonPath());
    }

    public WebElement getFirstName() {
        return findElementByXpath(this.getFirstNamePath());
    }

    public WebElement getPasswordField() {
        return findElementByXpath(this.getPasswordFieldPath());
    }

    public WebElement getSignInButton() {
        return findElementByXpath(this.getSignInButtonPath());
    }

    public WebElement getErrorMessage() {
        return findElementByXpath(this.getErrorMessagePath());
    }

    public WebElement getRegisterButton() {
        return findElementByXpath(this.getRegisterButtonPath());
    }

    public String generateRandomEmail(int lenght) {
        return generateRandomString(lenght) + "@gmail.com";
    }

    public String generateRandomName(int lenght) {
        return generateRandomString(lenght);
    }

    public String generateRandomPassword(int lenght) {
        return generateRandomString(lenght);
    }
}
