package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

public class AmazonPage {
    // this-> Driver class'indaki Driver.getDriver() 'i , Page class'indaki driver'a  esitledi/tanitti.
    public AmazonPage(){// constracter olusturup public yapmamiz gerekir
        PageFactory.initElements(Driver.getDriver(),this);
        // PageFactory page sayfasinin icine kurdugumuz zaman loceterlerimizi driver()
        // ile iliskilendiriyor.
     }

   @FindBy (id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucWebElementi;
}
