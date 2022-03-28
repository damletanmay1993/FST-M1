import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser and go to website
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void Case3() {

        //Get and Print URL of the image
        WebElement image = driver.findElement(By.cssSelector(".attachment-large"));
        System.out.println("URL of header image is: "+ image.getAttribute("src"));
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
