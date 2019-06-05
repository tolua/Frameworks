package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class LoginPage {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Documents\\Frameworks\\Shell_Auto_Tests\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = ("https://www.unitestudents.com");
        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(80L, TimeUnit.SECONDS); //Todo : Driver level :Waits maximum 80 seconds but doesnt have to wait the entire duration
       // WebDriverWait = new WebDriverWait(driver, 40L);
       // wait.unt

        //Thread.sleep(7000);
        try {
            driver.findElement(By.linkText("Accept cookies")).click();
            //driver.findElement(By.cssSelector("body > div.slidemessage__container.-in > div > a")).click();
            //driver.findElement(By.xpath("/html/body/div[3]/div/a")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
            driver.findElement(By.id("myAccountLinkDesktop")).click();
            driver.findElement(By.id("txt_email1")).sendKeys("toluchud@gmail.com");
            driver.findElement(By.id("login_password")).sendKeys("Computer1");
            driver.findElement(By.id("login__submit")).click();
            driver.findElement(By.id("myAccountLinkDesktop")).click();
        //Select selectValue = new Select(driver.findElement(By.id("myAccountLinkDesktop")));//Todo: alt+enter to import a class
        //selectValue.selectByVisibleText("View account");
        driver.findElement(By.linkText("View account")).click();
        driver.findElement(By.id("myAccountLinkDesktop")).click();
        driver.findElement(By.linkText("Logout")).click();
    }
}

