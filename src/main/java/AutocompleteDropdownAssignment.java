import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteDropdownAssignment {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        // 1.- Autocomplete Suggestion class example section with some letters and
        // move the mouse to select the option you are looking for.
        driver.findElement(By.id("autocomplete")).sendKeys("ind");
        Thread.sleep(3000);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

        // 2.- Verify that the option selected is in the box.
        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
    }
}
