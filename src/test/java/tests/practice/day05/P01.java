package tests.practice.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.utilities.TestBaseBeforeAfterMethod;

public class P01 extends TestBaseBeforeAfterMethod {
            // ...Exercise3...
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        //fill the firstname
        //fill the lastname
        //check the gender
        //check the experience
        //fill the date
        //choose your profession -> Automation Tester
        //choose your tool -> Selenium Webdriver
        //choose your continent -> Antartica
        //choose your command  -> Browser Commands
        //click submit button

    @Test
    public void test01() throws InterruptedException {
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();
        //fill the firstname
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ali");

        //fill the lastname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Can");

        //check the gender
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();

        //check the experience
        driver.findElement(By.id("exp-1")).click();
        //fill the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12.05.2022");
        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        //choose your continent -> Antartica
        //1.Yol
        WebElement dropdownContinent= driver.findElement(By.xpath("//select[@id='continents']"));
        Select select=new Select(dropdownContinent);
        select.selectByVisibleText("Antartica");

        //2. Yol
       // driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Antartica");


        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//select[@id='selenium_commands']/option[1]")).click();

        //click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();

    }
}
