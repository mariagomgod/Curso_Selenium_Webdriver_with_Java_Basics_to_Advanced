import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = driver.getWindowHandles(); // [parentId, childId, subChildId]
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        String subChildId = it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector(".im-para red")).getText());
    }
}
