import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableAssignment {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        // 1.- To print the number of rows present on the table
        WebElement table = driver.findElement(By.id("product"));
        System.out.println(table.findElements(By.tagName("tr")).size());

        // 2.- To print the number of columns present on the table
        WebElement columns = driver.findElement(By.id("product"));
        System.out.println(table.findElements(By.tagName("th")).size());
        System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

        // 3.- To print the data of the second row
        List<WebElement> secondRow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        System.out.println(secondRow.get(0).getText());
        System.out.println(secondRow.get(1).getText());
        System.out.println(secondRow.get(2).getText());
    }
}
