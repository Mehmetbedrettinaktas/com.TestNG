package tests.day16;

import org.testng.annotations.Test;
import tests.utilities.TestBaseBeforeAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeAfterMethod {
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");

    }

    @Test(groups = "group1")
    public void bestBuyTesti() {
        driver.get("https://www.testbuy.com");
    }
    @Test
    public void techproeducationTesti() {
        driver.get("https://www.techproeducation.com");

    }
}
