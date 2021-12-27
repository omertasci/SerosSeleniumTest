package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Configuration {

    public final static String BASE_URL= "https://servis.demirdokum.com.tr";
//    public final static String BASE_URL= "https://test.demirdokum.com.tr";
    public WebDriver driver ;

    public Configuration(){
    }

    public Configuration(WebDriver driver){
        this.driver = driver;
    }

    public  void setup(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver","C:/Users/otasci/Downloads/chromedriver_win32_v96/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(Configuration.BASE_URL);
        }

    }

    public void setup(ChromeOptions options){
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/Users/otasci/Downloads/chromedriver_win32_v96/chromedriver.exe");
            driver = new ChromeDriver(options);
            driver.get(Configuration.BASE_URL);
        }
    }
}
