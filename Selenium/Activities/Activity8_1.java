import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Activity8_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");

        List<WebElement> cols = driver.findElements(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody"));
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody"));

        System.out.println("Number of columns are: " + cols.size());
        System.out.println("Number of rows are: " + rows.size());


        List<WebElement> thirdRow = driver.findElements(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody"));
        for(WebElement cellValue : thirdRow) {
            System.out.println("Cell Value: " + cellValue.getText());
        }

        WebElement cellValue2_2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody"));
        System.out.println("Second row, second column value: " + cellValue2_2.getText());

        driver.close();
    }
}
