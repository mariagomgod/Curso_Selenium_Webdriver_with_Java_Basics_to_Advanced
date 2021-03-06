import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // Sibling - Child to parent traverse
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
    }
}
