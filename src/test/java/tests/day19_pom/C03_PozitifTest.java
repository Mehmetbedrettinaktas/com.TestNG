package tests.day19_pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class C03_PozitifTest {
    @Test
    public void pozitifTest() throws InterruptedException {
        // Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        // https://www.hotelmycamp.com/ adresine git  login butonuna bas
        HotelmycampPage hotelmycampPage= new HotelmycampPage();
        /* Page class'indaki locate'lerimize ulasabilmek icin
        Page classimizdan bir obje olusturarak, olusturmus oldugumuz obje ile
        page classimizdaki locater'lerimize ulasabiliriz
         */
        Actions actions= new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));
        Thread.sleep(3000);
        hotelmycampPage.logIn.click();
        //test data username: manager ,  test data password : Manager1!
        hotelmycampPage.userName.sendKeys(ConfigReader.getProperty("hmcUserName"));

        // obje ile
        // hotelmycampPage.password.sendKeys(ConfigReader.getProperty("hmcPassword"));
        // hotelmycampPage.btnSubmit.click();

        // actions ile
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcPassword"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelmycampPage.girildiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
