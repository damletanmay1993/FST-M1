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

public class Activity6 {
    WebDriver driver6;
    WebDriverWait wait;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver6 = new FirefoxDriver();
        wait = new WebDriverWait(driver6, 10);

        //Open browser
        driver6.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void Case6() {

        // Click on Jobs
        WebElement job = driver6.findElement(By.cssSelector("#menu-item-24 > a:nth-child(1)"));
        job.click();
        // Assert Page Title
        String titleMessage = driver6.getTitle();
        Assert.assertEquals(titleMessage, "Jobs – Alchemy Jobs");

        //Enter Banking in the field
        WebElement searchField = driver6.findElement(By.id("search_keywords"));
        searchField.sendKeys("Banking");
        // Click on Search Jobs
        driver6.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/form/div[1]/div[4]/input")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li[1]/a/div[1]/h3")));

        //Open first job listed
        driver6.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li[1]/a/div[1]/h3")).click();
        //Apply for the job
        driver6.findElement(By.cssSelector(".application_button")).click();
        //Print email
        String email = driver6.findElement(By.cssSelector(".job_application_email")).getText();
        System.out.println("Email is :"+email);


    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver6.quit();
    }
}
