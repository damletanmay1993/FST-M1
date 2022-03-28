import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void Case1() {

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        //Assertion for page title
        Assert.assertEquals("Target Practice", title);
    }
    @Test
    public void Case2() {
        //Assert wrong color
        WebElement blackButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[3]"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "Green");
    }

    @Test(enabled = false)
    public void Case3() {
        //Skip test without showing
        WebElement orangeButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/button[2]"));
        Assert.assertTrue(orangeButton.isDisplayed());
        Assert.assertEquals(orangeButton.getText(), "Orange");
    }

    @Test
    public void Case4() {
        //Skip test with logs showing it
        throw new SkipException("Skipping test case");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
