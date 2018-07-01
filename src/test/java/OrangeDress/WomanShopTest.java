package OrangeDress;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WomanShopTest {
    WebDriver driver;
    private final String HOME_PAGE = "http://automationpractice.com/index.php";
    private final By MAIN_MENU_ITEMS = By.xpath(".//ui(@class = 'sf-menu clearfix menu-content sf-js-enable sf-arrows')/li/a");
    private final By FILTER_CHECK_BOX = By.xpath(".//ul[@class = 'col-lg-12 layered_filter_ul']/li/label");
    private final By COLOR_FILTER = By.xpath(".//ui[@class = 'col-lg-12 layered_filter_ul color-group']/li/label");
    private final By LOADER = By.xpath(".//ul[@class = 'product_list qrid row']/p");
    private final By LIST_VIEW = By.xpath("");


    @Test
    public void dressestest() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

        selectMenuItem("WOMEN");
        selecrFilter("Dresses", FILTER_CHECK_BOX);
        waitLoad();
        
 //       new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(LOADER));
        selecrFilter("Orange", COLOR_FILTER);
        waitLoad();

//        new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(LOADER));


    }


    private void selectMenuItem(String menuItem) {
        List<WebElement> menuItems = driver.findElements(MAIN_MENU_ITEMS);

        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).getText().equals(menuItem)) {
                menuItems.get(i).click();
                break;
            }
        }
    }

    private void selecrFilter(String filterName) {
        List<WebElement> filterItems = driver.findElements(FILTER_CHECK_BOX);

        for (int i = 0; i < filterItems.size(); i++) {
            if (filterItems.get(i).getText().contains(filterName)) {
                filterItems.get(i).click();
                break;
            }
        }
    }


    private void waitLoad() {
        new WebDriverWait(driver, new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(LOADER));
)
    }


}
}
