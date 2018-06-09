package homeWorkOne;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class openDelfi {
    private final String ARTICLE = "Страны G7 объявили о создании механизма защиты от российской пропаганды";

    @Test
    public void openDelfiSite () {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.delfi.ru/");

//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys(ARTICLE);
//        searchBox.submit();
//
//        driver.findElement(By.name(ARTICLE));
//
//        Assert.assertTrue("Article find", driver.findElement(By.name(ARTICLE))= ARTICLE);
//        Assert.assertEquals( ARTICLE, driver.findElements(By.name(ARTICLE)));

        driver.findElement(By.className(ARTICLE)).click();
        Assert.assertEquals("asd", ARTICLE, driver.getTitle());

//        driver.findElement(By.)

    }
}
