import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");

        String Title = driver.getTitle();
        System.out.println("Page title is "+Title);

        driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();

        String Title2 = driver.getTitle();
        System.out.println("New page title is "+Title2);

        driver.close();

    }

}
