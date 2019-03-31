package Home;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GooglePage {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Documents\\Frameworks\\Shell_Auto_Tests\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = ("https://www.unitestudents.com");
        driver.manage().window().maximize();
        driver.get(baseURL);
        try {
            driver.findElement(By.linkText("Accept cookies")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("myAccountLinkDesktop")).click();
        driver.findElement(By.id("txt_email1")).sendKeys("toluchud@gmail.com");
        driver.findElement(By.id("login_password")).sendKeys("Chudnuvski01");
        driver.findElement(By.id("login__submit")).click();
    }
}

