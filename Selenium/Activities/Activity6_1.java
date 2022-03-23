import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        String Title = driver.getTitle();
        System.out.println("Page title is " + Title);

        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/label"));
        WebElement toggleCheckboxButton = driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]"));

        toggleCheckboxButton.click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        toggleCheckboxButton.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));

        checkbox.click();

        driver.close();

    }
}
