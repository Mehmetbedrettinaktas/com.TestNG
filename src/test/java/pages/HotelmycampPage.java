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
    @FindBy (xpath = "//span[text()='ListOfUsers']")
    public WebElement girildiYaziElementi;
}
