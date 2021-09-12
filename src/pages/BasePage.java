package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Random;

public class BasePage {

    public static WebElement findElementByXpath(String xpath) {
        return Browser.getBrowser().findElement(By.xpath(xpath));
    }

    public static WebElement findElementByClass(String className) {
        return Browser.getBrowser().findElement(By.className(className));
    }

    public Integer parseString(String string) {
        String[] s = string.split(" ");
        String[] s1 = s[0].split(",");
        StringBuilder resultItems = new StringBuilder();

        int i = 0;
        while (i < s1.length) {
            resultItems.append(s1[i]);
            i++;
        }
        return Integer.parseInt(resultItems.toString());
    }

    public String generateRandomString(int length) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public void switchBrowserTab(Integer tabIndex) {
        ArrayList<String> tabs = new ArrayList<>(Browser.getBrowser().getWindowHandles());
        Browser.getBrowser().switchTo().window(tabs.get(tabIndex));
    }

    public void refreshPage() {
        Browser.getBrowser().navigate().refresh();
    }

}
