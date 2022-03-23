import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.get("https://www.training-support.net/selenium/ajax");

        String Title = driver.getTitle();
        System.out.println("Page title is " + Title);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/button")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));

        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(ajaxText);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);


        driver.close();
    }
}
