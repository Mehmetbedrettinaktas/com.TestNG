package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import tests.utilities.Driver;
import tests.utilities.TestBaseBeforeAfterMethod;

public class C03_SoftAssert extends TestBaseBeforeAfterMethod {
    @Test
    public void test01() {

        SoftAssert softAssert = new SoftAssert();

        //1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        driver.navigate().refresh();

        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"), "aradiginiz kelimeyi icermiyor");

        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled());

        //4-arama kutusuna Nuella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        //5-arama yapıldıgını test edin
        WebElement resultWE = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(resultWE.isDisplayed());

        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(resultWE.getText().contains("Nutella"), "Nutella icermiyor");
        softAssert.assertAll();
        System.out.println("Hatavarsa burasi calismaz");
        Driver.closeDriver();

         /*
 Hard Assertions : JUNit'te öğrendiğimiz assertion ile aynıdır.  Assert.assertTrue();  Assert.assertFalse();  Assert.assertEquals();
 Hard Assertions'da herhangi bir assertion failed olursa, test method'un çalışmasını durdurur ve kalan kodları yürütmez.(stop execution)
Soft Assert : Kullanabilmek için obje oluştururuz, oluşturduktan sonra obje ismi ile kullanırız, Herhangi bir hata verdiğinde test methodu
çalışmaya devam eder, en sonra rapor verir.    baslangıc  SoftAssert objeadı=new SoftAssert();  bitis objeadı.assertAll();
  */

    }
}
