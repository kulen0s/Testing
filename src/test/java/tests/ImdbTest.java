package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.BaseTest;

public class ImdbTest extends BaseTest {

    @Test
    public void testOpenImdb() {
        WebDriver driver = getDriver();

        driver.get("https://www.imdb.com/");
        System.out.println("IMDb stranica je otvorena.");

        try {
            WebElement acceptCookiesButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/button[2]"));
            acceptCookiesButton.click();
            System.out.println("Kolačići su prihvaćeni.");
        } catch (Exception e) {
            System.out.println("Dugme za kolačiće nije pronađeno ili nije potrebno.");
        }

        try {
            WebElement signin = driver.findElement(By.xpath("/html/body/div[2]/nav/div[2]/div[6]/a"));
            signin.click();
            System.out.println("Signin su prihvaćeni.");
        } catch (Exception e) {
            System.out.println("Dugme za Sign in nije pronađeno ili nije potrebno.");
        }

        try {
            WebElement signin2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[1]/a[1]"));
            signin2.click();
            System.out.println("Signin2 su prihvaćeni.");
        } catch (Exception e) {
            System.out.println("Dugme za Sign in 2 nije pronađeno ili nije potrebno.");
        }

        try {
            WebElement emailField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/form/div/div/div/div[1]/input"));
            emailField.sendKeys("emanuelberisic099@gmail.com");
            WebElement passwordField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/form/div/div/div/div[2]/input"));
            passwordField.sendKeys("abcd-1234");
            WebElement submitButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/form/div/div/div/div[3]/span/span/input"));
            submitButton.click();
            System.out.println("Logged in successfully.");
        } catch (Exception e) {
            System.out.println("Login form not found or already logged in.");
        }


    }
}

