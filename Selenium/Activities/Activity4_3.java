import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");

        String Title = driver.getTitle();
        System.out.println("Page title is "+Title);

        String thirdHeader = driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
        System.out.println("Third header is "+thirdHeader);

        String fifthHeaderColour = driver.findElement(By.xpath("//html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color");
        System.out.println("Fifth header's colour is: " + fifthHeaderColour);

        String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
        System.out.println("Violet button's classes are: " + violetButtonClasses);

        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);

        driver.close();
    }
}
