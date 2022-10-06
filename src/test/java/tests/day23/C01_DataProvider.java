package tests.day23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class C01_DataProvider {
    AmazonPage amazonPage= new AmazonPage();

    @Test(dataProvider = "aranacakKelimeler")
    public void test02(String kelimeler) throws InterruptedException {

        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //java, selenium, samsung ve iphone icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(kelimeler,Keys.ENTER);
        //sonuclarin aradigimiz kelime icerdigini test edelim
        Thread.sleep(3000);
        String actualKelime = amazonPage.aramaSonucWebElementi.getText();
        Assert.assertTrue(actualKelime.contains(kelimeler));
        //sayfayi kapatalim
        //Driver.closeDriver();
    }
    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"java"},{"selenium"},{"samsung"},{"iphone"}};
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        Driver.closeDriver();
    }
}
