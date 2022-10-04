package tests.practice.day06;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;
import tests.utilities.Driver;

public class P01 {
    @Test
    public void test01() {
        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        // Fill in capitals by country.
        DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(dhtmlgoodiesPage.olslo, dhtmlgoodiesPage.norway).
                dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.sweden).
                dragAndDrop(dhtmlgoodiesPage.washington ,dhtmlgoodiesPage.unitedStates).
                dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.denmark).
                dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southKorea).
                dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).
                dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).perform();

        Driver.closeDriver();
        /*
        Frameworkler buyudukce yeni classlar, yeni tes methodlar,
        yeni webelementler olusturdukca icinden cikilmaz, anlasilmaz, tekrar bakimi
        yapmaliyiz, guncelenmesi cok zor hatta imkansiz bir hal alir

        uzmanlar reusable naintainable, rahat manipule edebilir bir framwork icin bir desing
        pattern olarak POM PAGE OBJECT MODEL de karar vermisler.

        olmazsa olmazlar;
        1) driver class
        2) PAGE class
        3) tset class
        4) utilities
        Aradigimiz bir web elementi ya da bir methodu kolaylikla bulabilmek ve guncelleyebilmek icin javadan
        ogrenmis oldugumuz OOP Concept Selenium ile page object modelde birlestirilmis oluyor.
         */

    }
}
