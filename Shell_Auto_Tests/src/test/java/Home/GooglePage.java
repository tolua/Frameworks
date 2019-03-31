package Home;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GooglePage {


    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Documents\\Frameworks\\Shell_Auto_Tests\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = ("https://www.google.com");
        driver.get(baseURL);
    }
}

