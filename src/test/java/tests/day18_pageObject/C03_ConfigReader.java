package tests.day18_pageObject;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {
    @Test
    public void test01() {
        // Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        // https://www.hotelmycamp.com/ adresine git  login butonuna bas
        HotelmycampPage hotelmycampPage= new HotelmycampPage();
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));
        hotelmycampPage.logIn.click();
      //test data username: manager ,  test data password : Manager1!
      hotelmycampPage.userName.sendKeys(ConfigReader.getProperty("hotelmycampUsername"));
      hotelmycampPage.password.sendKeys(ConfigReader.getProperty("hotelmycampPassword"));
      hotelmycampPage.btnSubmit.click();
      //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
      Assert.assertTrue(hotelmycampPage.girildiYaziElementi.isDisplayed());
      Driver.closeDriver();

    }
}
