import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment {

    public static void main(String[] args) throws InterruptedException {

        String text = "Rahul";

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys(text);
        Thread.sleep(200);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
    }
}
