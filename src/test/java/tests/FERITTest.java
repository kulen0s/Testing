package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import base.BaseTest;

public class FERITTest extends BaseTest {

    @Test
    public void testGoogleAndFerit() {
        WebDriver driver = getDriver();

        // Otvaranje FERIT stranice
        driver.get("https://www.ferit.unios.hr");
        System.out.println("FERIT stranica je otvorena.");

        try {
            WebElement firstButton = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div/ul/li[3]/a"));
            firstButton.click();
            System.out.println("Prvo dugme je kliknuto.");
        } catch (Exception e) {
            System.out.println("Prvo dugme nije pronađeno.");
        }

        // Klik na drugo dugme
        try {
            WebElement secondButton = driver.findElement(By.xpath("/html/body/div[11]/div[1]/div/a[2]"));
            secondButton.click();
            System.out.println("Drugo dugme je kliknuto.");
        } catch (Exception e) {
            System.out.println("Drugo dugme nije pronađeno.");
        }

        try{
            WebElement thirdButton = driver.findElement(By.xpath("/html/body/div[13]/div/h3/div[2]/div/p[6]/a[10]"));
            thirdButton.click();
            System.out.println("Treće dugme je kliknuto.");
        } catch (Exception e) {
            System.out.println("Treće dugme nije pronađeno.");
        }



    }
}


