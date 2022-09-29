package tests.practice.day05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfterMethod;

public class P02 extends TestBaseBeforeAfterMethod {
    @Test
    public void test01() {
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.xpath("//span[@id='button1']")).click();
        // 3. Açılır metni alın
      String actualText=  driver.switchTo().alert().getText(); // bizim aktual guncel text

        // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        String expectedTex="I am an alert box!"; // kendi beklentimiz
        Assert.assertEquals(actualText,expectedTex);
       // Assert.assertTrue(actualText.contains(expectedTex));
        // 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();

    }
}
