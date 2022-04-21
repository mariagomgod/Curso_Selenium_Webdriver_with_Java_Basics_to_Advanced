import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/nested_frames'][contains(.,'Nested Frames')]")).click();
        System.out.println(driver.findElements(By.tagName("frame")).size());
        driver.switchTo().frame(1);
    }
}

// Teacher´s option

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FramesAssignment {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());
    }
}*/


