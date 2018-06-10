package firstTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class JavaGuruTest {
    private final String CUORSE_NAME ="Курс PHP";
    private final String HOME_PAGE = "http://javaguru.lv";
    private final By COURSE_ITEM = By.xpath(".//*[@class = 'menuAcourse']/span");

    @Test
    public void checkElementInMenu () {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

        List<WebElement> menuItems = new ArrayList<WebElement>();
        menuItems = driver.findElements(COURSE_ITEM);

        boolean isCourseFound = false;
        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).getText().equals(CUORSE_NAME)) {
                isCourseFound = true;
                break;
            }
        }

        Assert.assertTrue("No menu Item is found", isCourseFound);
    }


}
