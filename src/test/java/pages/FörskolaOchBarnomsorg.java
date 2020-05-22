package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FörskolaOchBarnomsorg extends BasePage {


    @FindBy (xpath = "//div[@class='navigation']/ul/li[1]")
    public WebElement alesFörskolar;

    @FindBy (xpath = "//div[@class='navigation']/ul/li[2]")
    public WebElement Ansökellersäguppplats;

    @FindBy (xpath = "//div[@class='navigation']/ul/li[3]")
    public WebElement Avgifter;

    @FindBy (xpath = "//div[@class='navigation']/ul/li[4]")
    public WebElement Avgiftsfriallmänförskola;

    @FindBy (xpath = "//div[@class='navigation']/ul/li[5]")
    public WebElement Barnibehovavsärskiltstöd;

    @FindBy (xpath = "//div[@class='navigation']/ul/li[6]")
    public WebElement  Familjedaghemdagbarnvårdare;

    @FindBy (xpath = "//div[@class='navigation']/ul/li[7]")
    public WebElement Fritidshem;

    @FindBy (xpath = "//div[@class='navigation']/ul/li[8]")
    public WebElement Jämförförskolor;

    @FindBy (xpath = "//div[@class='navigation']/ul/li[9]")
    public WebElement Mobbningochkränkandebehandling;

    @FindBy (xpath = "//div[@class='navigation']/ul/li[10]")
    public WebElement NyförskolaiNol;

    @FindBy (xpath = "//div[@class='navigation']/ul/li[11]")
    public WebElement NyförskolaiÄlvängen;

    @FindBy (xpath = "//div[@class='navigation']/ul/li[12]")
    public WebElement Vistelsetidochschema;
    @FindBy (xpath = "//div[@class='navigation']/ul/li[13]")
    public WebElement Öppettider;

    @FindBy (xpath = "//div[@class='navigation']/ul/li[14]")
    public WebElement Öppnaförskolan;
}
