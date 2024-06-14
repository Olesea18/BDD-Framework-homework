package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.confirm;

public class ProductPage {


    private final SelenideElement addToCartButton = $(By.xpath("//a[@class=\"btn btn-success btn-lg\"]"));
    private final SelenideElement goToCart = $(By.xpath("//a[@id=\"cartur\"]"));

    public void addPhone() {
        addToCartButton.should(Condition.visible);
        addToCartButton.should(Condition.clickable);
        addToCartButton.click();
    }

    public void confirmAction() {
        confirm();
    }

    public void goCart() {
        goToCart.should(Condition.visible);
        goToCart.should(Condition.clickable);
        goToCart.click();

    }
}
