package tests.day20_smokeTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class C03_E2ETest {
    @Test
    public void e2ETest() throws InterruptedException {
        // Tests packagenin altına class olusturun: CreateHotel
        //Bir metod olusturun: createHotel
        HotelmycampPage hotelmycampPage= new HotelmycampPage();
        Actions actions= new Actions(Driver.getDriver());
        Faker faker= new Faker();
        //https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));
        hotelmycampPage.logIn.click();
        //Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //Username : manager
        //Password  : Manager1!
        //Login butonuna tıklayın.
        hotelmycampPage.userName.sendKeys(ConfigReader.getProperty("hmcUserName"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcPassword"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        //Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hotelmycampPage.hotelManagment.click();
        Thread.sleep(3000);
        hotelmycampPage.roomReservation.click();
        hotelmycampPage.addRoom.click();
        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        hotelmycampPage.idUser.sendKeys("manager");
        actions.sendKeys(Keys.TAB).sendKeys("Happy Hotel")
                .sendKeys(Keys.TAB).sendKeys("2000").sendKeys(Keys.TAB)
                .sendKeys("12/12/2022").sendKeys(Keys.TAB)
                .sendKeys("12/19/2022").sendKeys(Keys.TAB)
                .sendKeys("2").sendKeys(Keys.TAB).sendKeys("3")
                .sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys("jmdjd ndhdgdj").sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        //Save butonuna tıklayın.

        //“RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Assert.assertTrue(hotelmycampPage.roomReservationText.isDisplayed());
        //OK butonuna tıklayın.
        hotelmycampPage.okayButton.click();
    }
}
