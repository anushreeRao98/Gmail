package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {
    public static WebDriver driver;
    public void launchApplication(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://google.com/");
        driver.findElement(By.xpath("//a[@aria-label='Gmail ']")).click();

    }

    public void teardownScript(){
        driver.quit();
    }
}
