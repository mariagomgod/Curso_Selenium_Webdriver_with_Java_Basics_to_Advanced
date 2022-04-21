import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlingAssignment {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(.,'Multiple Windows')]")).click();
        driver.findElement(By.xpath("//a[@href='/windows/new'][contains(.,'Click Here')]")).click();
        Thread.sleep(1000);
        Set<String> windows = driver.getWindowHandles(); // [parentId, childId, subChildId]
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        System.out.println(driver.findElement(By.cssSelector("body:nth-child(2) div.example > h3:nth-child(1)")).getText());
        driver.switchTo().window(parentWindow);
        System.out.println(driver.findElement(By.cssSelector("body:nth-child(2) div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example > h3:nth-child(1)")).getText());
    }
}

// Ejemplo del profesor

/*import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.cssSelector("a[href*='windows']")).click();
        Set<String> abc=driver.getWindowHandles();
        Iterator<String> it=abc.iterator();
        String parentWindow=it.next();
        driver.switchTo().window(it.next());
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
        driver.switchTo().window(parentWindow);
        System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
    }

}*/
