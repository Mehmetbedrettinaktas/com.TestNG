package tests.Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jTest1 {
    private static Logger logger= LogManager.getLogger(Log4jTest1.class.getName());

    @Test
    public void log4jTest1(){
        // info bilgi vermek icin kullanilir

        logger.info("LOG INFO");  // ==  System.out.println("LOG INFO"); aynidir
        System.out.println("LOG INFO");
        logger.debug("LOG DEBUG");
        System.out.println("LOG DEBUG");
        logger.error("LOG ERROR");
        logger.fatal("LOG FATAL");
        logger.warn("LOG WARN");
    }
}
