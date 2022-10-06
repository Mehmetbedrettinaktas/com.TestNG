package tests.day23;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class C02_DataProvider {
    BrcPage brcPage= new BrcPage();
    Actions actions= new Actions(Driver.getDriver());

    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"selo@gmail.com","12345"},{"gonul@gmail.com","12365345"},{"selocan@gmail.com","123473635"}};

    }

    @Test(dataProvider = "kullanicilar")
    public void test01(String userEmail, String userPassword) {
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //login butonuna bas
        brcPage.login.click();
        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        //login butonuna tiklayin
        brcPage.brcUserEmail.sendKeys(userEmail);
        actions.sendKeys(Keys.TAB).sendKeys(userPassword).sendKeys(Keys.ENTER).perform();


        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.submitLogin.isDisplayed());
        Driver.closeDriver();
    }
}
