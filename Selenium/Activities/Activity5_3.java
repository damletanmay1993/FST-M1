import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        String Title = driver.getTitle();
        System.out.println("Page title is " + Title);
        WebElement textInput = driver.findElement(By.xpath("//input[@type='text']"));

        System.out.println("The checkbox is selected: " + textInput.isEnabled());

        driver.findElement(By.id("toggleInput")).click();

        System.out.println("The checkbox is selected: " + textInput.isEnabled());

        driver.close();
    }
}
