package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

    public static void main(String[] args) {
       // System.setProperty("webdriver.gecko.driver", System.getProperty("C:\\Users\\HP USER\\Documents\\Frameworks\\Shell_Auto_Tests") + "\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP USER\\Documents\\Frameworks\\Shell_Auto_Tests\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseURL = ("https://www.unitestudents.com");
        driver.get(baseURL);
        driver.findElement(By.id("myAccountLinkDesktop")).click();
    }

}
