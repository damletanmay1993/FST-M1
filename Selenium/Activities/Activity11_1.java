import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity11_1 {
    public static void main(String args[]) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String Title = driver.getTitle();
        System.out.println("Page title is " + Title);
        driver.findElement(By.cssSelector("button#simple")).click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println("Alert text is: " + alertText);
        simpleAlert.accept();

        driver.close();
    }
}
