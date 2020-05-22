package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.DashBoardPage;
import pages.UtbildningbarnomsorgPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class startsidaUtbilBarnStepDef {

    @Given("The user should be on mainpage as an user")
    public void the_user_should_be_on_mainpage_as_an_user() {

    String url = ConfigurationReader.get("url");

        Driver.get().get(url);



    }

    @When("The user should click {string} module and {string} submodule")
    public void the_user_should_click_module_and_submodule(String module, String submodel) {

DashBoardPage dashBoardPage = new DashBoardPage();

dashBoardPage.navigateToModule("Startsida","Utbildning & barnomsorg");





    }

    @Then("The user should click  Förskolaochbarnomsorg option on the webpage")
    public void the_user_should_click_Förskolaochbarnomsorg_option_on_the_webpage() {

        UtbildningbarnomsorgPage utbildningbarnomsorgPage= new UtbildningbarnomsorgPage();
        utbildningbarnomsorgPage.FörskolaOchBarnomsorg.click();
    }

    @Then("The user should click   Grundskola, grundsärskola option on the webpage")
    public void the_user_should_click_Grundskola_grundsärskola_option_on_the_webpage() {
       UtbildningbarnomsorgPage utbildningbarnomsorgPage= new UtbildningbarnomsorgPage();
       utbildningbarnomsorgPage.GrundskolaGrundsärskola.click();
    }

    @Then("The user should click Gymnasium option on the webpage")
    public void the_user_should_click_Gymnasium_option_on_the_webpage() {
       UtbildningbarnomsorgPage utbildningbarnomsorgPage= new UtbildningbarnomsorgPage();
       utbildningbarnomsorgPage.Gymnasium.click();
    }

    @Then("The user should click Kulturskola option on the webpage")
    public void the_user_should_click_Kulturskola_option_on_the_webpage() {
        UtbildningbarnomsorgPage utbildningbarnomsorgPage= new UtbildningbarnomsorgPage();
        utbildningbarnomsorgPage.Kulturskola.click();
    }

    @Then("The user should click Komvux option on the webpage")
    public void the_user_should_click_Komvux_option_on_the_webpage() {
      UtbildningbarnomsorgPage utbildningbarnomsorgPage= new UtbildningbarnomsorgPage();
      utbildningbarnomsorgPage.Komvux.click();
    }

    @Then("The user should click  Välkomsten – för dig som är nyanländ option on the webpage")
    public void the_user_should_click_Välkomsten_för_dig_som_är_nyanländ_option_on_the_webpage() {
       UtbildningbarnomsorgPage utbildningbarnomsorgPage= new UtbildningbarnomsorgPage();
       utbildningbarnomsorgPage.VälkomstenFörDigSomArNyanländ.click();
    }



}
