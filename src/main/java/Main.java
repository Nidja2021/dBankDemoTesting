import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://dbankdemo.com/bank/login");
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Ajdin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password");
        WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
        button.click();
        WebElement errorMessage = driver.findElement(By.className("badge badge-pill badge-danger"));

        if (errorMessage.isDisplayed()) {
            System.out.println("Error showed!");
        } else {
            System.out.println("Error not showed");
        }

        driver.quit();
    }
}
