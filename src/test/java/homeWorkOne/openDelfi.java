package homeWorkOne;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openDelfi {
    private final String ARTICLE = "Сейм окончательно отклонил идею Шадурскиса о начале учебы с 6 лет";

    @Test
    public void openDelfiSite () {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.delfi.ru/");

//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys(ARTICLE);
//        searchBox.submit();

        driver.findElement(By.name(ARTICLE));

    }
}
