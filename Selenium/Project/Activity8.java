import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @Test
    public void Case8() {

        // Enter username and password
        WebElement username = driver.findElement(By.cssSelector("#user_login"));
        WebElement password = driver.findElement(By.cssSelector("#user_pass"));
        username.sendKeys("root");
        password.sendKeys("pa$$w0rd");

        //Click on Log In
        driver.findElement(By.cssSelector("#wp-submit")).click();

        //Assert to verify log in
        String Message = driver.findElement(By.cssSelector("span.display-name:nth-child(1)")).getText();
        Assert.assertEquals(Message, "root");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
