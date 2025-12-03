import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TricentisTest {
    @Test
    public void testSubtracTwoNumbers()  {

        // skapa en driver
            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.get("https://demowebshop.tricentis.com/");
           // Thread.sleep(2000); // let the user actaually see something.

            WebElement searchBox =wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
            searchBox.sendKeys("book");


            WebElement button = driver.findElement(By.cssSelector("input.button-1.search-box-button"));
            button.click();

            WebElement firstProduct= wait.until(ExpectedConditions.elementToBeClickable(By.className("product-title")));
            firstProduct.click();

            WebElement quantity =driver.findElement(By.name("addtocart_22.EnteredQuantity"));
            quantity.clear();
            quantity.sendKeys("10");

            WebElement clickAddToCart = driver.findElement(By.id("add-to-cart-button-22"));
            clickAddToCart.click();

            WebElement shoppingCart= driver.findElement(By.className("ico-cart"));
            shoppingCart.click();



            driver.quit();
//
    }

    }
