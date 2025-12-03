import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarshuTest {
    @Test
    public void testSubtracTwoNumbers() throws InterruptedException {

        // skapa en driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://marshu.com/articles/calculate-subtraction-calculator-subtract-substract-two-numbers.php");
        Thread.sleep(2000); // let the user actaually see something.
        WebElement first = driver.findElement(By.name("n01"));

        first.sendKeys("100");

        WebElement second = driver.findElement(By.name("n02"));
        second.sendKeys("50");

        WebElement button = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[3]/input"));
        button.click();

        WebElement answer = driver.findElement(By.name("answer"));

        String acutal = answer.getAttribute("value");


        Thread.sleep(2000);

        String expected= "50";

        assertEquals(expected, acutal);



        driver.quit();
//
    }


}
