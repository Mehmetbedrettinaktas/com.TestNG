package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    private Driver(){

    }
    static WebDriver driver;

    /*
    testlerimizi calistirdigimizda her seferinde yeni driver olusturdugu icin her est methodu
    icin yeni bir pencere()driver aciliyor. Eger driver'a bir deger atanmissa yani driver==null ise
    bir kere driver'i calistir diyerek bir kere if icin calistiracak. ve driver artik bir kere
    calistigi icin ve deger atandigi icin null olmayacak ve direk return edecek ve diger
    testlerimiz ayni pencere (driver) uzerinde calisacak
     */
    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")){
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
            driver = new ChromeDriver();

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
