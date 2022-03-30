package admin_area.positive;

import pages.admin_area.DashBoardPage;
import pages.admin_area.LoginPage;
import core.BaseTest;
import org.testng.annotations.Test;
import pages.admin_area.NavigationBarPage;
import pages.admin_area.ProductsPage;

public class LoginTests extends BaseTest {

    @Test
    public void loginSuccessfully() {
        LoginPage.goTo();
        LoginPage.login("admin", "parola123!");
        DashBoardPage.verifyUserInfoText("Milen Strahinski");
    }

    public void catalogButtonEntry() {
        NavigationBarPage.catalogButtonClick();
    }

    public void productsCatalogEntry() {

        NavigationBarPage.productButtonClick();
    }

    public void verifyProductsText() {

        ProductsPage.verifyProductsPageName("Products");
    }
}
