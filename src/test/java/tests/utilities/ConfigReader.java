package tests.utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    static {// Her method'dan once calisir
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis); // fis'in okudugu bilgileri properties'e yuklendi

        } catch (IOException e) { // execptionlarin atasi
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String key) {
        /*
        test metodundan yolladigimiz string degerini alip
        Properties class'indan getProperty() methodunu kullanarak
        bu key'e ait value'yu bize getirir
         */
        return properties.getProperty(key);
    }


}
