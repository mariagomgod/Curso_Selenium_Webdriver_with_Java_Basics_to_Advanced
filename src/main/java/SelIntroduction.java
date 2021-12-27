
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

    public static void main(String[] args) {

        //Invoking Browser
        //Chrome - ChromeDriver -> Methods close get
        //Firefox - FirefoxDriver -> Methods close get
        //Safari SaariDrier -> Methods close get
        //WebDriver close get
        //Webdriver methods + class methods

        //webdriver.chrome.driver -> value of path
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();
    }
}
