package example.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class SampleTest {
    @Test
    public void test() {
        WebDriver driver;
        System.out.println("welcome");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://newerp.kluniversity.in/");
        System.out.println(driver.getTitle());
        highlight(driver,driver.findElement(By.id("circle_section")));
        driver.findElement(By.name("csrf-param"));
        highlight(driver,driver.findElement(By.name("csrf-param")));
        driver.findElement(By.className("btn-label"));
        highlight(driver,driver.findElement(By.className("btn-label")));
        driver.findElement(By.linkText("Contact Us"));
        highlight(driver,driver.findElement(By.linkText("Contact Us")));
        driver.findElement(By.partialLinkText("About"));
        highlight(driver,driver.findElement(By.partialLinkText("About")));
    }
    public static void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: lime; border: 2px solid red;');", element);
    }
}