import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity7_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        String Title = driver.getTitle();
        System.out.println("Page title is " + Title);

        WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[1]/input"));
        WebElement password1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/input"));
        WebElement password2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[3]/input"));
        WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[4]/input"));

        username.sendKeys("Tanmay");
        password1.sendKeys("password1");
        password2.sendKeys("password1");
        email.sendKeys("example@example.com");

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/button")).click();

        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Sign Up message is: " + loginMessage);

        driver.close();
    }
}
