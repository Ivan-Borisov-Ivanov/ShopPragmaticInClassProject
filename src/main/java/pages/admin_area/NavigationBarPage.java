package pages.admin_area;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class NavigationBarPage {

    @FindBy(xpath = "//a[@href='#collapse1']")
    private static WebElement catalogButton;

    @FindBy(xpath = "#collapse1 .active > a")
    private static WebElement productsButton;

    static {
    PageFactory.initElements(Browser.driver, NavigationBarPage.class);
    }

    /**
     * Clicks the 'Catalog' button.
     */
    public static void catalogButtonClick() {

        catalogButton.click();
    }

    /**
     * Clicks the 'Products' button
     */
    public static void productButtonClick(){

        productsButton.click();
    }

}
