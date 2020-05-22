package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class GlasBruksmuseetMainPage extends BasePage {


    @FindBy(xpath = "//ul[@id='menu-primary-menu']/li[1]")
    public WebElement museet;

    @FindBy(xpath = "//ul[@id='menu-primary-menu']/li[2]")
    public WebElement besökOss;

    @FindBy(xpath = "//ul[@id='menu-primary-menu']/li[3]")
    public WebElement bokaHyr;

    @FindBy(xpath = "//ul[@id='menu-primary-menu']/li[4]")
    public WebElement bliİnvelverad;

    @FindBy(xpath = "//ul[@id='menu-primary-menu']/li[5]")
    public WebElement forrskning;

    @FindBy(xpath = "//ul[@id='menu-primary-menu']/li[6]")
    public WebElement kontakt;

    @FindBy(xpath = "//a[text()='Hyra lokal']")
    public WebElement hyraLokalMain;

    @FindBy(xpath = "(//a[@class='btn btn-rounded btn-primary btn-sm'])[1]")
    public WebElement hyraLokal1;

    @FindBy(xpath = "(//a[@class='btn btn-rounded btn-primary btn-sm'])[2]")
    public WebElement hyraLokal2;

    @FindBy(xpath = "(//a[@class='btn btn-rounded btn-primary btn-sm'])[3]")
    public WebElement hyraLokal3;

    @FindBy(id = "input_3_1")
    public WebElement Väljlokalatthyra;

    @FindBy(id = "input_3_2")
    public WebElement Väljvilkendagdåduvillhyralokalen;

    @FindBy(xpath = "(//th[@class='prev']//i)[1]")
    public WebElement prevDate;

    @FindBy(xpath = "(//td[text()='8'])[1]")
    public WebElement prevDay;

    @FindBy(id = "input_3_3")
    public WebElement antalDagar;

    @FindBy(id = "input_3_8_3")
    public WebElement name;

    @FindBy(id = "input_3_8_6")
    public WebElement lastname;


    @FindBy(id = "input_3_10")
    public WebElement telefonnumber;

    @FindBy(id = "input_3_9")
    public WebElement email;


    @FindBy(id ="input_3_13_1")
    public WebElement button;

    @FindBy(id = "gform_submit_button_3")
    public WebElement skicka;


    @FindBy(id = "gform_confirmation_message_3")
    public WebElement verifyMessage;



















}
