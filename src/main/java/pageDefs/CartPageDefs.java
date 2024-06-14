package pageDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CartPage;

public class CartPageDefs {

    CartPage cartPage = new CartPage();

    @And("checks that the phone is in the cart")
    public void checkPhoneIsPresent(){
        cartPage.checkPhoneIsPresent();
    }

    @And("clicks on place order button")
    public void clicksOnPlaceOrderButton() { cartPage.clickOnPlaceOrderButton();

    }
    @And("fills in the form")
    public void fillsInTheForm() { cartPage.fillInForm();
    }

    @And("clicks on purchase button")
    public void clicksOnPurchaseButton() { cartPage.clickOnPurchaseButton();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() { cartPage.checkSuccessMessageIsDisplayed();
    }
}
