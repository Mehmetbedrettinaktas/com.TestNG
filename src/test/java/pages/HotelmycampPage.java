package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

public class HotelmycampPage {
    public HotelmycampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//a[text()='Log in']")
    public WebElement logIn;

    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement userName;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "btnSubmit")
    public WebElement btnSubmit;
    @FindBy (xpath = "//span[@class='username username-hide-on-mobile']")
    public WebElement girildiYaziElementi;

    @FindBy (xpath = "//*[text()='Username or password is incorrect, please correct them and try again']")
    public WebElement girilmediYaziElementi;
    @FindBy (xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagment;

    @FindBy (xpath = "(//i[@class='icon-calendar'])[4]")
    public WebElement roomReservation;

    @FindBy (xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoom;

    @FindBy (xpath = "//select[@id='IDUser']")
    public WebElement idUser;

    @FindBy (xpath = "//*[text()='Fill All Fields Please']")
    public WebElement roomReservationText;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement okayButton;

}
