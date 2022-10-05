package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;
import tests.utilities.TestBaseRapor;

public class C01_ReportedTest extends TestBaseRapor {
    BrcPage brcPage= new BrcPage();
    Actions actions= new Actions(Driver.getDriver());
    /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */

    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("pozitive Test", "Gecerli kullanici adi ve password ile giris yapildi");

        //  -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue Rentalcars sitesine gidildi");
         // -login butonuna bas
        brcPage.login.click();
        extentTest.info("login butonuna basildi");
        Thread.sleep(3000);
        // -test data user email: customer@bluerentalcars.com ,
        brcPage.brcUserEmail.sendKeys(ConfigReader.getProperty("brcValidEmail")+ Keys.TAB);
        extentTest.info("basarili user email adresi girildi");
        // -test data password : 12345 dataları girip login e basın
        brcPage.brcPassword.sendKeys(ConfigReader.getProperty("brcValidPassword")+Keys.TAB);
        extentTest.info("basarili user password girildi");
        // -login butonuna tiklayin
        brcPage.submitLogin.click();
        extentTest.info("ikinci login buttonuna basildi");
        Thread.sleep(3000);
        // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actulUserName=brcPage.basarliGiris.getText();
        String expectedUserName="John Walker";
        Assert.assertEquals(expectedUserName,actulUserName);
        extentTest.pass("basirili bir sekilde giris yapildi");


    }
}
