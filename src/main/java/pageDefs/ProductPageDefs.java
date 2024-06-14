package pageDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.MainPage;
import pages.ProductPage;

public class ProductPageDefs {
    ProductPage productPage = new ProductPage();


    @And("adds it to the cart")
    public void addPhone(){
        productPage.addPhone();
    }

    @And("confirms the action")
    public void confirmsTheAction() {
        productPage.confirmAction();
    }

    @And("navigates to cart")
    public void goCart(){
        productPage.goCart();
    }

}
