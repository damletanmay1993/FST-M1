import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/simple-form");

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        firstName.sendKeys("Tanmay");
        lastName.sendKeys("Damle");

        driver.findElement(By.id("email")).sendKeys("test@example.com");

       driver.findElement(By.id("number")).sendKeys("8734922319");
       driver.findElement(By.cssSelector(".ui.green.button")).click();
        driver.close();
    }
}
