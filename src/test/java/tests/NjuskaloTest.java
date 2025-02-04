package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.BaseTest;

public class NjuskaloTest extends BaseTest {

    @Test
    public void testOpenNjuskalo() {
        WebDriver driver = getDriver();

        // Open Njuskalo website
        driver.get("https://www.njuskalo.hr/");
        System.out.println("Njuskalo.hr page is opened.");

        // Accept cookies if the popup appears
        try {
            WebElement acceptCookiesButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[3]/button[2]"));
            acceptCookiesButton.click();
            System.out.println("Cookies accepted.");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Cookie button not found or not needed.");
        }
        try {
            WebElement acceptForm = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[1]/div[2]/button"));
            acceptForm.click();
            System.out.println("Cookies accepted.");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Cookie button not found or not needed.");
        }
        try {
            WebElement searchbarField = driver.findElement(By.xpath("/html/body/div[4]/div/div/header/div/form/div/div/div[1]/div/input"));
            searchbarField.sendKeys("samsung s24 ultra");
            Thread.sleep(2000);
            searchbarField.sendKeys(Keys.RETURN);
            Thread.sleep(2000);
            System.out.println("Logged in successfully.");
        } catch (Exception e) {
            System.out.println("Login form not found or already logged in.");
        }
        try {
            WebElement filterLocation = driver.findElement(By.xpath("/html/body/div[8]/div/div[1]/main/form/div/div[2]/div[2]/div/div/div/fieldset/div[4]/div/div/div/div/div/div/div/div/div[1]"));
            filterLocation.click();
            Thread.sleep(2000);
            WebElement filterButton = driver.findElement(By.xpath("/html/body/div[8]/div/div[1]/main/form/div/div[2]/div[2]/div/div/div/fieldset/div[4]/div/div/div/div/div/div/div/div/div[2]/ul/li[10]"));
            filterButton.click();
            Thread.sleep(2000);
            WebElement filterSubmitButton = driver.findElement(By.xpath("/html/body/div[8]/div/div[1]/main/form/div/div[2]/div[2]/div/div/div/div/button"));
            filterSubmitButton.click();
            Thread.sleep(2000);
            System.out.println("Filter accepted.");
        } catch (Exception e) {
            System.out.println("Filter button not found or not needed.");
        }
    }
}
