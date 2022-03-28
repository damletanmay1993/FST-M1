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

public class Activity7 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void Case7() {

        // Click on Jobs
        WebElement job = driver.findElement(By.cssSelector("#menu-item-24 > a:nth-child(1)"));
        job.click();
        // Assert Page Title
        String titleMessage = driver.getTitle();
        Assert.assertEquals(titleMessage, "Jobs – Alchemy Jobs");

        // Click on Post a Job
        driver.findElement(By.cssSelector("#menu-item-26 > a:nth-child(1)")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/main/article/div/form/fieldset[1]/label")));

        //Enter Fields
        WebElement email = driver.findElement(By.cssSelector("#create_account_email"));
        WebElement jobTitle = driver.findElement(By.cssSelector("#job_title"));
        WebElement description = driver.findElement(By.xpath("//*[@id=\"job_description_ifr\"]"));
        WebElement url = driver.findElement(By.cssSelector("#application"));
        WebElement company = driver.findElement(By.cssSelector("#company_name"));
        email.sendKeys("example758490@example.com");
        jobTitle.sendKeys("PT-5");
        description.sendKeys("Performance Engineering");
        url.sendKeys("example758490@example.com");
        company.sendKeys("Alchemy");

        //Click on Preview
        driver.findElement(By.cssSelector("input.button:nth-child(4)")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/main/article/div/form/div[1]/h2")));

        //Click on Submit Listing
        driver.findElement(By.cssSelector("#job_preview_submit_button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/main/article/div")));

        // Click on Jobs
        driver.findElement(By.cssSelector("#menu-item-24 > a:nth-child(1)")).click();
        // Search for Jobs
        WebElement searchField = driver.findElement(By.id("search_keywords"));
        searchField.sendKeys("PT-5");
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/form/div[1]/div[4]/input")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li[1]/a/div[1]/h3")));

        // Assert Jobs name
        WebElement jobname = driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[1]/a/div[1]/h3"));
        Assert.assertEquals(jobname.getText(), "PT-5");

    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
