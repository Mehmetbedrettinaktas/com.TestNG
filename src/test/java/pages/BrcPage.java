package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

public class BrcPage {
  public BrcPage(){
      PageFactory.initElements(Driver.getDriver(),this);
  }

  @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login;
  @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitLogin;

  @FindBy(xpath = "//*[.='Create new user']")
  public WebElement creatNewAcount;

  @FindBy(xpath = "//input[@id='formBasicEmail']")
  public WebElement brcUserEmail;

  @FindBy(xpath = "//input[@id='formBasicPassword']")
  public WebElement brcPassword;

  @FindBy(xpath = "//button[@id='dropdown-basic-button']")
  public WebElement basarliGiris;
}
