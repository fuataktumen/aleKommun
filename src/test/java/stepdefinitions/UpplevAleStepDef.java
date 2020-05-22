package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashBoardPage;
import pages.UpplevAlePage;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.Set;

public class UpplevAleStepDef {

    @When("The user should be able to click {string} module")
    public void the_user_should_be_able_to_click_module(String string) {
UpplevAlePage upplevAlePage= new UpplevAlePage();
upplevAlePage.UpplevAle.click();
    }

    @Then("The user should be able to click  Glasbruksmuseet i Surte option")
    public void the_user_should_be_able_to_click_Glasbruksmuseet_i_Surte_option() {

UpplevAlePage upplevAlePage= new UpplevAlePage();
upplevAlePage.GlasbruksmuseetiSurte.click();
        String currentWindowHandle = Driver.get().getWindowHandle();
        System.out.println("currentWindowHandle = " + currentWindowHandle);

    }

    @Then("The user should be able to click www.glasbruksmuseet.se on the webpage")
    public void the_user_should_be_able_to_click_www_glasbruksmuseet_se_on_the_webpage() {

        UpplevAlePage upplevAlePage = new UpplevAlePage();
        upplevAlePage.GlasbruksmuseetiSurteNewePage.click();

        BrowserUtils.waitFor(5);


        String currentWindowHandle = Driver.get().getWindowHandle();


        //Set is just like arraylist but without duplicate values
        Set<String> windowHandles = Driver.get().getWindowHandles();
        BrowserUtils.waitFor(5);
        //how many different handles it is keeping
        System.out.println(windowHandles.size());

        for (String handle : windowHandles) {
            //checking handle is not equal to current page
            if (!currentWindowHandle.equals(handle)) {
                System.out.println(handle);
                //switching to new window
                Driver.get().switchTo().window(handle);
            }


        }
        System.out.println(Driver.get().getTitle());


    }}