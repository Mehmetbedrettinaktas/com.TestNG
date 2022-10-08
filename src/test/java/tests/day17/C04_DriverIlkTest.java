package tests.day17;

import org.testng.annotations.Test;
import tests.utilities.Driver;

public class C04_DriverIlkTest {
    @Test
    public void test01() {
        /*
        Tastbase class'ina extend ederek kullandigimiz driver yerine artik Driver class'indan
        kullanacacigimiz getDriver() static method'unu kullaniliriz
         */
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://www.hepsiburada.com");
        Driver.closeDriver();
    }
}
