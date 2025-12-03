import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MarshuTest1 {


    @Test

    public void TestSubraction() throws InterruptedException {

        WebDriver driver = new  ChromeDriver();

        driver.get("https://marshu.com/articles/calculate-subtraction-calculator-subtract-substract-two-numbers.php");

        List<WebElement>inputs = driver.findElements(By.cssSelector("input.regfont"));
        for(WebElement input : inputs){
           input.sendKeys("1");

        }

        Thread.sleep(5000);

        driver.quit();





    }
}

