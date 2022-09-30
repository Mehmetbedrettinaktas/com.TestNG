package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelmycampPage {
    public HotelmycampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//a[text()='Log in']")
    public WebElement logIn;

    @FindBy(id = "UserName")
    public WebElement userName;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "btnSubmit")
    public WebElement btnSubmit;
    @FindBy (xpath = "//span[@class='username username-hide-on-mobile']")
    public WebElement girildiYaziElementi;

    @FindBy (xpath = "//*[text()='Username or password is incorrect, please correct them and try again']")
    public WebElement girisyapilamadi;



}
