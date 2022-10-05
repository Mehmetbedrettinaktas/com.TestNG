package tests.practice.day08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuTestPage;
import tests.utilities.Driver;

import java.util.List;

public class P01 {
    HerokuTestPage herokuTestPage;
    Actions actions= new Actions(Driver.getDriver());

    @Test
    public void test01() throws InterruptedException {
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        //Click all the buttons and verify they are all clicked
        herokuTestPage = new HerokuTestPage();
        //kodlarımız yazarken clean code kapsamında daha sade kod yazabilmek amacı ile her test methodu içerisinde
        //ayrı bir object create etmektense bu objecti class seviyesinde instance olarak create edip
        //test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir
        Thread.sleep(3000);
        herokuTestPage.onblur.click();
       herokuTestPage.onclick.click();
       herokuTestPage.onclick.click();
       actions.contextClick(herokuTestPage.contextmenu).
               doubleClick(herokuTestPage.doubleClick).
               click(herokuTestPage.onfocus).
               click(herokuTestPage.keydown).
               sendKeys(Keys.ENTER).
               click(herokuTestPage.keyup).
               sendKeys(Keys.ENTER).
               click(herokuTestPage.keypress).
               sendKeys(Keys.ENTER).
               moveToElement(herokuTestPage.mouseOver).   // mouseOver
               moveToElement(herokuTestPage.mouseLeave).
               moveToElement(herokuTestPage.mouseOver).
               click(herokuTestPage.mouseDown).perform();
       Thread.sleep(2000);



    }

    @Test (dependsOnMethods = "test01") // bu calistirmadan once test01'i calistir
    public void test02() {
        List <WebElement> clicked=herokuTestPage.eventTriggerd;
          Assert.assertEquals(clicked.size(),11);

    }
}
