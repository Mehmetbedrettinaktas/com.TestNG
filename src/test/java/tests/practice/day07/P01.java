package tests.practice.day07;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WDUniversityPage;
import tests.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {
    Actions actions= new Actions(Driver.getDriver());
    WDUniversityPage wdUniversityPage= new WDUniversityPage();
    // EXPLORATOY testing  --> kesif testing manuel olarak test yapmak demektir.
    // explorer --> exploratory (kurcalama) (edited)
    /*
    test senaryolarının önceden oluşturulmadığı, testçilerin sistemi
    test anında kontrol ettiği bir tür yazılım testidir. Herhangi bir test senaryosuna
    bağlı kalmaksızın yazılımları serbestçe keşfederek buldukları bug’ları raporlamasına dayanır.
    Test uzmanlarının minimum planlama ve maksimum test uygulamasına katıldığı uygulamalı bir yaklaşımdır.
     Testin yürütülmesinden önce neyin test edileceğine dair fikirleri not edebilirler.
    Keşif Testi (Exploratory Testing), diğer test yaklaşımlarında kolayca kapsanmayan hataları
     ve eksiklikleri keşfetmeye, ortaya çıkarmaya dayanır. Özellikle yazılım test döngüsünün
      başlarında sıkça başvurulan bir test türüdür. Test uzmanı açısından ise istediği şekilde
       son kullanıcı senaryoları oluşturma imkanı olduğu için eğlencelidir.
     */
    @Test
    public void test01() throws InterruptedException {

        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)

        // Buradaki listeyi yapilacaklar listesine tek tek manuel olarak eklemek yerine toplu olarak bir loop kullanarak
        // gonderebilme amaci ile biz olusturduk
        List<String> workList=new ArrayList<>(Arrays.asList("Kahvaltıyı hazırla","Bulaşıkları yıka","Bebekle ilgilen"
                ,"Çocuğunun ödevine yardım et","Selenyum çalış","Uyu"));
        for (String w:workList
             ) {
           actions.click(wdUniversityPage.addNewTodo).sendKeys(w).sendKeys(Keys.ENTER).perform();
        }

      //Tüm yapılacakların üzerini çiz.
     List<WebElement> todosWebElements= wdUniversityPage.todos;
      for (WebElement w:todosWebElements
           ) {
          w.click();
      }
      // 2. yol lambda
      // webUniversityPage.drawButtons.stream().forEach(t->t.click());


      //Tüm yapılacakları sil.
      List<WebElement>delete= wdUniversityPage.deleteButtonsWebelement;
      for (WebElement w:delete) {
          w.click();
      }

              // 2. yol
      // wdUniversityPage.deleteButtonsWebelement.forEach(WebElement::click);
      Thread.sleep(3000);
      //Tüm yapılacakların silindiğini doğrulayın.
      List<WebElement> newTodos=wdUniversityPage.newTodos;
      Assert.assertEquals(0,newTodos.size());



    }
}
