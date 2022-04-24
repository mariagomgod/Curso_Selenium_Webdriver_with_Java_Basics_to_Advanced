import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScopeAssignment {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        // 1.- Select any checkbox of the three presents in Checkbox example section.
        driver.findElement(By.id("checkBoxOption2")).click();

        // 2.- Grab the label of the selected box. (put into variable).
        String option = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        // 3.- Select an option in the dropdown. The option to select come from step 2 (do not hardcode the text from step 2).
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select selectOption = new Select(dropdown);
        selectOption.selectByVisibleText(option);

        // 4.- Enter the step 2 grabbed label text in Editbox (do not hardcode the text from step 2).
        driver.findElement(By.name("enter-name")).sendKeys(option);

        // 5.- Click alert and then verify if the text grabbed from step 2 is present in the popup message.
        driver.findElement(By.id("alertbtn")).click();
        String text=  driver.switchTo().alert().getText();

        if (text.contains(option)) {

            System.out.println("Success");

        } else {

            System.out.println("Something is wrong with execution");
        }
    }
}
