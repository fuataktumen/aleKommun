package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UtbildningbarnomsorgPage extends BasePage {


    @FindBy(xpath = "//div[@class='navigation']/ul/li[1]")
    public WebElement FörskolaOchBarnomsorg;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[2]")
    public WebElement GrundskolaGrundsärskola;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[3]")
    public WebElement Gymnasium;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[4]")
    public WebElement Kulturskola;


    @FindBy(xpath = "//div[@class='navigation']/ul/li[5]")
    public WebElement Komvux;

    @FindBy(xpath = "//div[@class='navigation']/ul/li[6]")
    public WebElement VälkomstenFörDigSomArNyanländ;



}
