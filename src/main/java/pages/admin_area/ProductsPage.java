package pages.admin_area;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Browser;

public class ProductsPage {

     @FindBy(xpath = "//h1 [text() = 'Products']")
     private static WebElement productsBar;

     static {
         PageFactory.initElements(Browser.driver, ProductsPage.class);
     }

     public static void verifyProductsPageName(String ExpectedName){
         Assert.assertEquals(productsBar.getText(),"ExpectedName");

     }
}
