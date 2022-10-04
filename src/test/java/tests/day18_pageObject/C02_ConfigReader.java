package tests.day18_pageObject;

import org.testng.annotations.Test;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class C02_ConfigReader {
    @Test
    public void test01() {
        // amazon sayfasina  ve facebook sayfasina gidelim.
        String url=ConfigReader.getProperty("amazonUrl");
        String urlFace=ConfigReader.getProperty("facebookUrl");
        Driver.getDriver().get(url);
        Driver.getDriver().get(urlFace);
        Driver.closeDriver();


    }
}
