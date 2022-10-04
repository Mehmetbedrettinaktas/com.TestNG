package tests.day16;

import org.testng.annotations.Test;
import tests.utilities.TestBaseBeforeAfterMethod;

public class C03_Priority extends TestBaseBeforeAfterMethod {
    // Testlerimizi calistirirken istedigimiz siraya gore calismasini istersek
    // priority methodunu kullaniriz.
    // (When we run our tests, if we want them to run in the order we want, we use the priority method.)
    @Test(priority = 1)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");
        driver.close();
    }

    @Test// default priority=0
    public void bestBuyTest() {
        driver.get("https://www.bestbuy.com");
        driver.close();
    }

    @Test(priority=2)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
        driver.close();
    }
    @Test(priority=-1,groups = "group1")
    public void hepsiburadaTest() {
        driver.get("https://www.hepsiburada.com");
        driver.close();
    }

}
