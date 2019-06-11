package tests;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Login_test {
    WebDriver driver = null;

    @Test
    public void Login2(){

        driver.findElement(By.id("myAccountLinkDesktop")).click();
        driver.findElement(By.id("txt_email1")).sendKeys("toluchud@gmail.com");
        driver.findElement(By.id("login_password")).sendKeys("Computer1");
        driver.findElement(By.id("login__submit")).click();
        driver.findElement(By.id("myAccountLinkDesktop")).click();
        //Select selectValue = new Select(driver.findElement(By.id("myAccountLinkDesktop")));//Todo: alt+enter to import a class
        //selectValue.selectByVisibleText("View account");
        driver.findElement(By.linkText("View account")).click();
        driver.manage().timeouts().implicitlyWait(80L, TimeUnit.SECONDS);
        String expectedResult = "https://www.unitestudents.com/secure/myaccount";
        String actualResult = driver.getCurrentUrl();
        try {
            Assert.assertEquals(expectedResult, actualResult);
        } catch ( Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.id("myAccountLinkDesktop")).click();
        driver.findElement(By.linkText("Logout")).click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("This is :" + currentUrl);

    }

}
