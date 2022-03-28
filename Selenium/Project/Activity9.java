import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);

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
        // Click on Log In
        driver.findElement(By.cssSelector("#wp-submit")).click();

        //Assert to verify log in
        String Message = driver.findElement(By.cssSelector("span.display-name:nth-child(1)")).getText();
        Assert.assertEquals(Message, "root");

        // Click on Job Listings
        driver.findElement(By.cssSelector("a.menu-icon-job_listing > div:nth-child(3)")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".wp-heading-inline")));

        //Click on Add New
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/a")).click();

        //Close popup
        driver.findElement(By.cssSelector(".components-modal__header > button:nth-child(2) > svg:nth-child(1)")).click();

        //Enter fields
        WebElement compWebsite = driver.findElement(By.cssSelector("#_company_website"));
        WebElement compTwitter = driver.findElement(By.cssSelector("#_company_twitter"));
        WebElement Location = driver.findElement(By.cssSelector("#_job_location"));
        WebElement compName = driver.findElement(By.cssSelector("#_company_name"));
        WebElement compTagline = driver.findElement(By.cssSelector("#_company_tagline"));
        WebElement Title = driver.findElement(By.cssSelector("#post-title-0"));
        compWebsite.sendKeys("SDdfad");
        compTwitter.sendKeys("Uhikdak@example.com");
        Location.sendKeys("India");
        compName.sendKeys("Asjnkjand");
        compTagline.sendKeys("AUIHndks");
        Title.sendKeys("PT-3");

        // Click on Publish...
        driver.findElement(By.cssSelector("button.components-button:nth-child(3)")).click();
        // Click on Publish
        driver.findElement(By.cssSelector(".editor-post-publish-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div/div[1]/a")));
        // Open Job created
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div/div[1]/a")).click();
        //Verify job created
        WebElement job = driver.findElement(By.cssSelector(".entry-title"));
        Assert.assertEquals(job.getText(), "PT-3");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
