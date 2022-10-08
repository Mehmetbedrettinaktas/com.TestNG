package tests.day18_pageObject;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import tests.utilities.Driver;

public class C01_PageObjects {
    FacebookPage facebookPage=new FacebookPage();
    Faker faker= new Faker();
    @Test
    public void test01() {

        // https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");

        //POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //Faker class’ini kullanarak email ve sifre degerlerini
        facebookPage.cookies.click();
        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());
        facebookPage.sifre.sendKeys(faker.internet().password());

        //yazdirip, giris butonuna basin
        facebookPage.creatNewAcount.click();

        //Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilmadiYaziElementi.isDisplayed());
        Driver.closeDriver();

    }
}
