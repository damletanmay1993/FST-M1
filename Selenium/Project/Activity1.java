import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser and go to website
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void Case1() {

        //Get the Title
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        //Assertion for page title
        Assert.assertEquals("Alchemy Jobs – Job Board Application", title);
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
