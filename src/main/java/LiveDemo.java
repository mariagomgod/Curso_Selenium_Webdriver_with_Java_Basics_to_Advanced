import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class LiveDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        // Click on the column
        driver.findElement(By.xpath("//tr/th[1]")).click();

        // Capture all WebElements into list
        List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));

        // Capture the text of all WebElements into a new (original) list
        List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

        // Sort on the original list of step 3 -> sorted list
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

        // Compare the original list vs the sorted list
        Assert.assertTrue(originalList.equals(sortedList));

        // Scan the name column with getText -> Beans -> Print the price of the beans
        List<String> priceOfBeans = elementsList.stream().filter(s -> s.getText().contains("Beans"))
                .map(s -> getPriceVeggie(s)).collect(Collectors.toList());
        priceOfBeans.forEach(a -> System.out.println(a));

    }

    private static String getPriceVeggie(WebElement s) {
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }
}
