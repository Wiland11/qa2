package homeWorkOne;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

public class FirstHomeWorkList {

    private final String ARTICLE_NAME = "Впервые в истории: Трамп отозвал свою подпись под итоговым заявлением G7";
    private final String HOME_PAGE = "http://www.delfi.ru/";
//    private final By ARTICLE_LIST = By.ByLinkText(ARTICLE_NAME);

    @Test
    public void findArticle () {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

        List<WebElement> articleList = new ArrayList<WebElement>();
        articleList = driver.findElements(By.linkText(ARTICLE_NAME));

        boolean isArticleFound = false;
        for (int i = 0; i < articleList.size(); i++) {
            if (articleList.get(i).getText().equals(ARTICLE_NAME)) {
                isArticleFound = true;
                break;
            }
        }
        Assert.assertTrue("Article is not found!", isArticleFound);
    }
}
