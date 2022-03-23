import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");

        String Title = driver.getTitle();
        System.out.println("Page title is "+Title);

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        firstName.sendKeys("Tanmay");
        lastName.sendKeys("Damle");

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@example.com");

        driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("8734922319");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();

        driver.close();
    }
}
