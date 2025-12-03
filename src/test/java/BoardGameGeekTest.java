import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.Keys.ENTER;

public class BoardGameGeekTest {
    // Navigera till sidan boardgamegeek.com
    //I sökfältet sök efter Things in Rings
    //Öppna sidan för Things in Rings
    //Klicka på ”Images”
    //Verifiera titeln på sidan

    // vad kan jag lägga till mer som

    @Test

    public void thingInRing() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://boardgamegeek.com/");

        WebElement cookies = driver.findElement(By.cssSelector(".fc-button-label"));
        cookies.click();

        WebElement searchBox = driver.findElement(By.cssSelector("input[name='searchTerm']"));
        searchBox.sendKeys("Thing in Rings" + Keys.ENTER);

        driver.findElement(By.cssSelector("img[alt='Board Game: Things in Rings']")).click();

        WebElement title = driver.findElement(By.cssSelector("span[itemprop='name']")); // Css
        assertEquals("Things in Rings", title.getText()); //
        assertTrue(title.isDisplayed());

        WebElement Reviews= driver.findElement(By.cssSelector("i[title*='Not so good']"));
        Reviews.click();
        assertEquals("Not so good", Reviews.getAttribute("title"));
        assertTrue(Reviews.isDisplayed());

















        driver.quit();

    }



}
