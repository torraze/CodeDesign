//ввод неправильного/правильного логіна і пароля на ukr.net (1.what about emsil ? 2.how to run two cases?)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CodeDesignedUkrNet {
    public WebDriver driver;
    public String baseUrl = "https://www.ukr.net/";
    public String login = "guerro";
    public String pass =  "unoparole";

    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        log(driver, "мучачо","компрендо");
        System.out.println("Введено неверные логин/пароль!");
        Thread.sleep(2000);
        log(driver, login, pass);
        System.out.println("Вход в почту - OK!");

     }

    public void log (WebDriver driver, String emsil, String pass){
        driver.get(baseUrl + "/");
        driver.findElement(By.name("Login")).clear();
        driver.findElement(By.name("Login")).sendKeys(emsil);
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys(pass);
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    }
}