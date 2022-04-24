import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        // 1.- Give me the count of links on the page.
        System.out.println(driver.findElements(By.tagName("a")).size());

        // 2.- Give me the count of links present on the footer section.

        // We create a new element for the footer (footerDriver).
        // footerDriver has the same function as "dirver" but created for the footer only.
        WebElement footeDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footeDriver.findElements(By.tagName("a")).size());

        // 3.- Give me the count of the links present in a column section of the footer.
        WebElement columnDriver = footeDriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());

        // 4.- Click on each link in the column and check if the pages are opening.
        for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {

            // Click on the links and open in separate tabs
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
            Thread.sleep(5000L);

        }

        // 5.- Getting the titles of child tabs with optimized while loop (open all the tabs).
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        while(it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

    }
}
