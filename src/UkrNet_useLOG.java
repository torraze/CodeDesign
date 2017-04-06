//For test - not worked!!!
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static sun.util.logging.LoggingSupport.log;

/**
 * Created by AsusK53sc on 30.03.2017.
 */
public class UkrNet_useLOG {
    public WebDriver driver;
    public String baseUrl = "https://www.ukr.net/";
    public String login = "guerro";
    public String pass =  "unoparole";

    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//        log(driver, "лоці","печений");
        log(driver, "мучачо","компрендо");
}
}
