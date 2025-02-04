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

public class YouTubeTest extends BaseTest {

    @Test
    public void testSearchTikTokHashtag() {
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.youtube.com/");
        System.out.println("YouTube website opened.");

        try {
            WebElement acceptCookiesButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
            acceptCookiesButton.click();
            System.out.println("Cookies accepted.");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Cookie button not found or not needed.");
        }

        try {
            WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/div[1]/form/input"));
            searchBar.sendKeys("Hrvatska Mađarska rukomet");
            searchBar.sendKeys(Keys.RETURN);
            System.out.println("Search for Hrvatska Mađarska rukomet performed.");
        } catch (Exception e) {
            System.out.println("Search bar not found.");
        }
        try {
            WebElement secondVideo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ytd-video-renderer)[3]")));
            secondVideo.click();
            System.out.println("Second video clicked.");
        } catch (Exception e) {
            System.out.println("Second video not found or could not be clicked.");
        }

    }
}

