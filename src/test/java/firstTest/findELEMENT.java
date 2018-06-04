package firstTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class findELEMENT {
    private final String HOME_PAGE = "http:/javaguru.lv";
    private final By ELEMENT =By.id("12345");
    private final By CLASS_NAME = By.className("logo");
 //   private final By NAME = By.name("asdda");
    

            @Test
    public void someTest () {
                WebDriver driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get(HOME_PAGE);

                WebElement classElement = driver.findElement(CLASS_NAME);

 //               List<WebElement> classElements = driver.findElements(CLASS_ELEMENTS);

                WebElement webElement = driver.findElement(ELEMENT);
                webElement.click();
                webElement.sendKeys();
            }}
