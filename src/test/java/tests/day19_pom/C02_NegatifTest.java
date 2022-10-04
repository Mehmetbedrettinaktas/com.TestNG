package tests.day19_pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class C02_NegatifTest {
    @Test
    public void negatifTest() throws InterruptedException {
        // 1 ) Bir Class olustur : NegativeTest
        //2) Bir test method olustur NegativeLoginTest()
        // https://www.hotelmycamp.com/ adresine git
        HotelmycampPage hotelmycampPage= new HotelmycampPage();
        Actions actions= new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));
        Thread.sleep(3000);

        //login butonuna bas
        hotelmycampPage.logIn.click();
        //test data username: manager1 ,  test data password : manager1!
        hotelmycampPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUserName"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hcmWrongPassword"))
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelmycampPage.girilmediYaziElementi.isDisplayed());
        Driver.closeDriver();

    }
}
