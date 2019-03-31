package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo{

    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver",System.getProperty("C:\\Users\\HP USER\\Documents\\Frameworks\\Shell_Auto_Tests")+"\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP USER\\Documents\\Frameworks\\Shell_Auto_Tests\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseURL = ("https://www.google.com");
        driver.get(baseURL);

    }

}
