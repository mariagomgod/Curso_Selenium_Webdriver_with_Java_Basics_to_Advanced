import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        findByName(driver, "name").sendKeys("Rahul");
        findByName(driver, "email").sendKeys("rahulsheety@gmail.com");
        findById(driver, "exampleInputPassword1").sendKeys("hello123");
        findById(driver, "exampleCheck1").click();

        WebElement staticDropdown = findById(driver, "exampleFormControlSelect1");
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText("Male");
        findById(driver, "inlineRadio1").click();

        WebElement dateBox = findByName(driver, "bday");
        dateBox.sendKeys("01081994");

        findByClassName(driver, "btn-success").click();
        Thread.sleep(100);
        WebElement successAlert = findByCssSelector(driver, "div.alert-success > strong");
        assertEquals(successAlert.getText(), "Success!");
    }

    private static WebElement findByName(WebDriver driver, String name) {
        return driver.findElement(By.name(name));
    }

    private static WebElement findById(WebDriver driver, String id) {
        return driver.findElement(By.id(id));
    }

    private static WebElement findByClassName(WebDriver driver, String className) {
        return driver.findElement(By.className(className));
    }

    private static WebElement findByCssSelector(WebDriver driver, String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));
    }
}
