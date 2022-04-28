import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Broken URL
        // 1.- To get all URL's tied up to the links
        // Java methods will call URL´s and get you the status code
        // If status code >400 then that url is not working -> link tied up to url is broken
        String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
    }
}
