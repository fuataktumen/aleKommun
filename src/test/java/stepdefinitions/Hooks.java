package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;


public class Hooks {

    @Before

    public void setuP(){

        Driver.get().manage().window().maximize();

        System.out.println("This is from BEFORE");
    }


    @After
    public void tearDown(Scenario scenario){
        //if the scenario fails take the screenshot
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }

        Driver.closeDriver();

    }

    @After("@Fleet")

    public void TearDownStoreManager(){


        System.out.println("This is from AFTER SPECİAL");
    }

}
