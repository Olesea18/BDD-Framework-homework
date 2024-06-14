package pageDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageDefs {

    MainPage mainPage = new MainPage();

    @Given("the online store is open")
    public void openApp(){

    }

    @When("user clicks on the phone")
    public void clickPhone(){
        mainPage.clickPhone();
    }

}
