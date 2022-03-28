import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        String Title = driver.getTitle();
        System.out.println("Page title is " + Title);

        WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[1]/input"));
        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/input"));
        username.sendKeys("admin");
        password.sendKeys("password");

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/button")).click();

        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message is: " + loginMessage);

        driver.close();
    }

}
