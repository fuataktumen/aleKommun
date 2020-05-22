package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.GlasBruksmuseetMainPage;
import pages.UpplevAlePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.Set;

public class HyraLokalStepDef {

    @Given("The user should be able to be main page of www.glasbruksmuseet.se")
    public void the_user_should_be_able_to_be_main_page_of_www_glasbruksmuseet_se() {

        String url = ConfigurationReader.get("url");

        Driver.get().get(url);
        UpplevAlePage upplevAlePage= new UpplevAlePage();
        upplevAlePage.UpplevAle.click();

        upplevAlePage.GlasbruksmuseetiSurte.click();

        upplevAlePage.GlasbruksmuseetiSurteNewePage.click();
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


    }

    @Given("The user should be able to click Hyra Lokal under Boka Hyr module")
    public void the_user_should_be_able_to_click_Hyra_Lokal_under_Boka_Hyr_module() {

        System.out.println(Driver.get().getTitle());
        //BrowserUtils.waitFor(5);
        GlasBruksmuseetMainPage glasBruksmuseetMainPage= new GlasBruksmuseetMainPage();
         //BrowserUtils.waitFor(10);
        //glasBruksmuseetMainPage.bokaHyr.click();
       // glasBruksmuseetMainPage.hyraLokalMain.click();

        BrowserUtils.waitFor(5);

        WebElement BokaHyr = Driver.get().findElement(By.xpath("//ul[@id='menu-primary-menu']/li[3]/a"));

        WebElement HyraBoka = Driver.get().findElement(By.xpath("//a[text()='Hyra lokal']"));

       Actions actions = new Actions(Driver.get());
        BrowserUtils.waitFor(3);
        actions.moveToElement(BokaHyr).moveToElement(HyraBoka).build().perform();
        BrowserUtils.waitFor(2);
        HyraBoka.click();


BrowserUtils.waitFor(5);



    }


    @Given("The user should click skapaFörfrogan")
    public void the_user_should_click_skapaFörfrogan() {

        GlasBruksmuseetMainPage glasBruksmuseetMainPage= new GlasBruksmuseetMainPage();
        BrowserUtils.waitFor(5);
        glasBruksmuseetMainPage.hyraLokal1.click();



    }
    @When("The user should be able to select one option under the Välj lokal att hyra")
    public void the_user_should_be_able_to_select_one_option_under_the_Välj_lokal_att_hyra() {


        GlasBruksmuseetMainPage glasBruksmuseetMainPage= new GlasBruksmuseetMainPage();
        Select select = new Select(glasBruksmuseetMainPage.Väljlokalatthyra);

        select.selectByIndex(2);
        System.out.println(select.getFirstSelectedOption().getText());
    }

    @When("The user should be able to select the date of reservation")
    public void the_user_should_be_able_to_select_the_date_of_reservation() {

        GlasBruksmuseetMainPage glasBruksmuseetMainPage= new GlasBruksmuseetMainPage();
        glasBruksmuseetMainPage.Väljvilkendagdåduvillhyralokalen.click();

        glasBruksmuseetMainPage.prevDate.click();
        glasBruksmuseetMainPage.prevDay.click();

    }

    @When("the user should fill required blanks")
    public void the_user_should_fill_required_blanks() {

        GlasBruksmuseetMainPage glasBruksmuseetMainPage = new GlasBruksmuseetMainPage();
        glasBruksmuseetMainPage.antalDagar.sendKeys("3");
        BrowserUtils.waitFor(3);

        glasBruksmuseetMainPage.name.sendKeys("Mike");
        glasBruksmuseetMainPage.lastname.sendKeys("Smith");
        glasBruksmuseetMainPage.telefonnumber.sendKeys("3456");
        glasBruksmuseetMainPage.email.sendKeys("asd@dmail.com");
        glasBruksmuseetMainPage.button.click();
        Assert.assertTrue(glasBruksmuseetMainPage.button.isSelected());
        glasBruksmuseetMainPage.skicka.click();
        BrowserUtils.waitFor(4);
        Assert.assertEquals(glasBruksmuseetMainPage.verifyMessage.getText(),"Tack för fin förfrågan! Vi hör av oss snart.");
        System.out.println(glasBruksmuseetMainPage.verifyMessage.getText());


    }

    @Then("The user should click SKİCKA")
    public void the_user_should_click_SKİCKA() {

    }



}
