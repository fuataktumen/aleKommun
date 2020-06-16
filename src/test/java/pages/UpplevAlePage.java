package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpplevAlePage extends BasePage{




    @FindBy(css = " a[href='/upplev-ale/upplev-ale.html']")
    public WebElement UpplevAle;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[1]")
    public WebElement Alevikingagård;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[2]")
    public WebElement Alvhemskungsgård;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[3]")
    public WebElement FågeldammarnaSurte;

    @FindBy(id = "svid10_78d41a6515983dfe8433bd89")
    public WebElement GlasbruksmuseetiSurte;

    @FindBy(css = "a[href='http://www.glasbruksmuseet.se/']")
    public WebElement GlasbruksmuseetiSurteNewePage;


    @FindBy(xpath = "//div[@class='navigation']/ul/li[5]")
    public WebElement Kilanda;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[6]")
    public WebElement KvarnsjöarnaRisveden;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[7]")
    public WebElement PrästalundStarrkärr;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[1]")
    public WebElement RannebergetÄlvängen;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[8]")
    public WebElement Rapenskårslövskogar;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[9]")
    public WebElement RepslagarmuseetÄlvängen;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[10]")
    public WebElement Skepplandagravfält;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[11]")
    public WebElement StoraKroksjönRisveden;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[12]")
    public WebElement Stugåsberget;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[13]")
    public WebElement Vadbacka;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[14]")
    public WebElement Verleskogen;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[15]")
    public WebElement VinningsbodalaochBjörkärrsäng;

}
