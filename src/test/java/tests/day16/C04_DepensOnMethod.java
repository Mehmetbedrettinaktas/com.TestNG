package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfterMethod;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class C04_DepensOnMethod extends TestBaseBeforeAfterMethod {
    @Test
    public void test1() {
        // amazon ana sayfasina gidin
        driver.get("https://www.amazon.com");
    }

    @Test(dependsOnMethods = "test1")
    public void test2() {
        // Nutella aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);

        /*
        //sonuc yazisinin nutella icerdigini test edelim
       assert !driver.findElement(By.cssSelector("div[class=\"a-section a-spacing-small a-spacing-top-small\"]")).getText().contains("amazon");
        }
         */
    }

    @Test(dependsOnMethods="test2")
    public void test3() {
        //sonuc yazisinin amazon icerdigini test edelim
      WebElement sonuc= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertFalse(sonuc.getText().contains("amazon"));


    }
}
