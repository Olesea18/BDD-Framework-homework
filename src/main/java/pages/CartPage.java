package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement phoneItem = $(By.xpath("//td[contains(text(),'Samsung galaxy s6')]"));
    private final SelenideElement placeOrderButton = $(By.xpath("//button[@class=\"btn btn-success\"]"));
    private final SelenideElement nameField = $(By.xpath("//input[@id=\"name\"]"));
    private final SelenideElement countryField = $(By.xpath("//input[@id=\"country\"]"));
    private final SelenideElement cityField = $(By.xpath("//input[@id=\"city\"]"));
    private final SelenideElement creditCardField = $(By.xpath("//input[@id=\"card\"]"));
    private final SelenideElement monthField = $(By.xpath("//input[@id=\"month\"]"));
    private final SelenideElement yearField = $(By.xpath("//input[@id=\"year\"]"));
    private final SelenideElement purchaseButton = $(By.xpath("//button[@onclick=\"purchaseOrder()\"]"));
    private final SelenideElement successMessage = $(By.xpath("/html/body/div[10]/h2"));

    public void checkPhoneIsPresent() {
        phoneItem.should(Condition.appear);
    }

    public void clickOnPlaceOrderButton() {
        placeOrderButton.should(Condition.visible);
        placeOrderButton.should(Condition.clickable);
        placeOrderButton.click();
    }

    public void fillInForm() {
        nameField.should(Condition.appear).sendKeys("Olesea Gamurari");
        countryField.should(Condition.appear).sendKeys("Moldova");
        cityField.should(Condition.appear).sendKeys("Chisinau");
        creditCardField.should(Condition.appear).sendKeys("1111 2222 3333 4444");
        monthField.should(Condition.appear).sendKeys("01");
        yearField.should(Condition.appear).sendKeys("25");
    }

    public void clickOnPurchaseButton() {
        purchaseButton.should(Condition.visible);
        purchaseButton.should(Condition.clickable);
        purchaseButton.click();

    }

    public void checkSuccessMessageIsDisplayed() {
        successMessage.should(Condition.visible);
        successMessage.shouldHave(text("Thank you for your purchase!"));
    }
}
