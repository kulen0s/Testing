package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.BaseTest;
import java.time.Duration;

public class ProtisTest extends BaseTest {

    @Test
    public void testOpenProtis() {
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.protis.hr/");
        System.out.println("Protis.hr page is opened.");


        try {
            WebElement searchBox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/input[1]"));
            searchBox.sendKeys("9800 x3d");
            searchBox.sendKeys(Keys.RETURN);
            System.out.println("Search for '9800 x3d' performed.");
        } catch (Exception e) {
            System.out.println("Search bar not found.");
        }

        try {
            WebElement articleButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/table/tbody/tr[2]/td[3]/a"));
            articleButton.click();
            System.out.println("Article found.");
        } catch (Exception e) {
            System.out.println("Article not found.");
        }

    }
}
