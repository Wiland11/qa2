package testChromeDrv;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testChromeDrv {

    @Test
    public void testGoogleSearch () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http:/www.google.com/xhtml");
        Thread.sleep(5000);
        WebElement seachBox = driver.findElement(By.name("q"));
        seachBox.sendKeys("ChromeDriver");
        seachBox.submit();
        Thread.sleep(5000);
        driver.quit();

    }

}
