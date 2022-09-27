package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeAfterMethod {
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");

    }

    @Test
    public void bestBuyTesti() {
        driver.get("https://www.testbuy.com");
    }
    @Test
    public void techproeducationTesti() {
        driver.get("https://www.techproeducation.com");

    }
}
