import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OriginalUkrNet {

    public WebDriver driver;
    public String baseUrl = "https://www.ukr.net/";

    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AsusK53sc\\IdeaProjects\\CodeDesign\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(baseUrl + "/");//begin test - correct logout ukr.net
        driver.findElement(By.name("Login")).click();
        driver.findElement(By.name("Login")).clear();
        driver.findElement(By.name("Login")).sendKeys("guerro");
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("unoparole");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        Thread.sleep(2000);//if delele this string - test is NOT working
        driver.findElement(By.linkText("Вийти")).click();
        Thread.sleep(2000);
        driver.quit();//close driver
        System.out.println("test passed");
    }
}