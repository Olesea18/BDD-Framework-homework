package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final SelenideElement phoneItem = $(By.xpath("//a[text()='Samsung galaxy s6']"));

    public void clickPhone() {
        phoneItem.should(Condition.appear).click();
    }
}
