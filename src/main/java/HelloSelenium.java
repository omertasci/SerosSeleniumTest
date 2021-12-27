import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

    private static void setup(){
        System.setProperty("webdriver.chrome.driver","C:/Users/otasci/Downloads/chromedriver_win32_v96/chromedriver.exe");
    }

    public static void main(String[] args) {

        setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.getTitle(); // => "Google"

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");
        searchBox.sendKeys(Keys.ENTER);
//        searchButton.click();

        driver.findElement(By.name("q")).getAttribute("value"); // => "Selenium"

        driver.quit();
    }
}
