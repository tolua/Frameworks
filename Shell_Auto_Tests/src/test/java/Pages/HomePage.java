package Pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver = null;

    @Before
    public void SetUpDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Documents\\Frameworks\\Shell_Auto_Tests\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
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
    }

    @After
    public void CloseBrowser(){
        driver.close();
    }
}





