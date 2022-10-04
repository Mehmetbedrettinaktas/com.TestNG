package tests.day21_resuableMethods;


import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;
import tests.utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReuableMethod {
    @Test
    public void test01() throws IOException {
        // hepsiburada sayfasina gidiniz
Driver.getDriver().get("https://www.hepsiburada.com");
        //  ve sayfanin gruntusunu alalim
        ReusableMethods.getScreenshot("hepsiburada");
        // sayfayi kapatiniz
       Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        AmazonPage amazonPage= new AmazonPage();
        // Amazon sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // nutella aratiniz
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        // arama sonuc yazisi WebElement'inin resmini aliniz
        ReusableMethods.getScreenshotWebElement("aramaSonucuWebElementi",amazonPage.aramaSonucWebElementi);
        // sayfayi kapatiniz
        Driver.closeDriver();
    }
}