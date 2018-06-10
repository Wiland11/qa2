package homeWorkOne;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class openDelfi {
    private final String ARTICLE = "Впервые в истории: Трамп отозвал свою подпись под итоговым заявлением G7";

    @Test
    public void openDelfiSite () {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.delfi.ru/");

        driver.findElement(By.linkText(ARTICLE)).click();

// Почему не работает?
//        StringBuilder buffer = new StringBuilder().append(ARTICLE).append(" - DELFI");
//        StringBuilder title = new StringBuilder(driver.getTitle());
//        Assert.assertEquals("Статься найдена!", buffer,title);
//???

        StringBuilder buffer = new StringBuilder().append(ARTICLE).append(" - DELFI");
        Assert.assertEquals("Статься найдена", buffer, driver.getTitle());

    }
}
