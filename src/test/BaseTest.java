package test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import browser.Browser;
import pages.Etsy;

public class BaseTest {

    protected static Etsy etsy;

    @BeforeClass
    public static void setUp() {
        etsy = new Etsy();
    }

    @AfterClass
    public static void cleanUp() {
        Browser.getBrowser().quit();
    }

    @Before
    public void before() {
        Browser.getBrowser().manage().window().maximize();
        Browser.getBrowser().get("https://www.etsy.com/");
    }

}
