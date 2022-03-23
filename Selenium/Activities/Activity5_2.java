import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        String Title = driver.getTitle();
        System.out.println("Page title is " + Title);

        WebElement checkboxInput = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));
        System.out.println("The checkbox is selected: " + checkboxInput.isSelected());

        checkboxInput.click();

        System.out.println("Is the checkbox selected: " + checkboxInput.isSelected());

        driver.close();


    }
}
