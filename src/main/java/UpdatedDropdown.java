import io.opentelemetry.sdk.metrics.internal.state.SynchronousMetricStorage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            System.out.println("It is enabled");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        // Count the number of checkboxes
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);

        int timesClicked;
        for (timesClicked = 1; timesClicked < 5; timesClicked++) {
            driver.findElement(By.id("hrefIncAdt")).click(); // 4 times clicked (4 adults)
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
