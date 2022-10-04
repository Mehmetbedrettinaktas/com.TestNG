package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

public class FacebookPage {
   public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    //
    @FindBy(xpath= "//button[@title='Allow essential and optional cookies']")
    public WebElement cookies;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(name = "pass")
    public WebElement sifre;

    @FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
    public WebElement creatNewAcount;

    @FindBy(className = "_9ay7")
    public WebElement girilmadiYaziElementi;
}
