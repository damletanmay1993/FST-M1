import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser and go to website
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void Case4() {

        //Get the second heading on the page and assert
        WebElement header2 = driver.findElement(By.cssSelector(".entry-content > h2:nth-child(6)"));
        Assert.assertEquals(header2.getText(), "Quia quis non");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
