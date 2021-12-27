import config.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SerosLoginAction extends Configuration {

    SerosLoginAction(){
        setup();
    }

    SerosLoginAction(WebDriver driver){
        super(driver);
        setup();
    }
    /*private static void setup(){
        System.setProperty("webdriver.chrome.driver","C:/Users/otasci/Downloads/chromedriver_win32_v96/chromedriver.exe");
    }*/

    /*public static void main(String[] args) {

        setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://servis.demirdokum.com.tr/Login.html");

        driver.getTitle(); // => "Seros"

        WebElement usercode = driver.findElement(By.name("k_kodu"));
        WebElement password = driver.findElement(By.name("pass"));
        WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@class,'btn btn-primary btn-block login_btn')]"));

        usercode.sendKeys("OTASCI");
        password.sendKeys("omertasci+D6GKTA");
//        loginBtn.sendKeys(Keys.ENTER);
        loginBtn.click();

//        driver.findElement(By.name("q")).getAttribute("value"); // => "Selenium"

//        driver.quit();
    }*/

    public static void main(String[] args) {

        RecaptchaResolver rr = new RecaptchaResolver();
        rr.validateCaptcha();

        SerosLoginAction sl = new SerosLoginAction(rr.driver);
        sl.login();
    }

    public void login(){

        try {
//            Thread.sleep(5000);
            driver.switchTo().defaultContent();
//        driver.switchTo().frame("relative=top");

            WebElement usercode = driver.findElement(By.name("k_kodu"));
            WebElement password = driver.findElement(By.name("pass"));
            WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@class,'btn btn-primary btn-block login_btn')]"));

            usercode.sendKeys("OTASCI");
            password.sendKeys("your pass");
//            loginBtn.click();
            loginBtn.sendKeys(Keys.ENTER);
        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
