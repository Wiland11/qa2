package firstTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaGuruTest {
    private final String CUORSE_NAME ="Курс PHP";
    private final String HOME_PAGE = "http://javaguru.lv";
    private final By COURSE_ITEM = By.xpath(".//*[@class = 'menuAcouse']/span");
        
    @Test
    public void checkElementInMenu () {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


    }


}
