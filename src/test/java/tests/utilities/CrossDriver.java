package tests.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class CrossDriver {
    private CrossDriver(){

    }
    static WebDriver driver;
    public static WebDriver getDriver(String browser) {
        //Eger browser'a bir deger atanmamissa properties deki browser kullanilir.
        browser=(browser== null )? ConfigReader.getProperty("browser"):browser;
        //testlerimizi xml file'dan farkli farkli browser ile calistirabilmek icin getDriver() methoduna parametre
        // atamamiz gerekir
        if (driver == null) { // CrossDriver icin gonderdigimiz browser uzerinden calismasi icin buraya
            // parametre olarak girdigimiz degeri yazdik.
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }

            WebDriverManager.chromedriver().setup();


        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) { // drivr'a deger atanmissa
            driver.close();
            driver = null; // kapandiktan sonra sonraki  acmalari garanti altina almak icin driver'i tekrar null yaptik
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
