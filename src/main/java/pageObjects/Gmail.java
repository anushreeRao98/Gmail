package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Gmail {
    public WebDriver driver;

    public Gmail() {
        this.driver = LaunchBrowser.driver;
    }

    public void clickOnSignInButton() {
        try {
            driver.findElement(By.xpath("//a[@data-action='sign in']")).click();
            // driver.findElement(By.xpath("//button//span[text()='"+button+"']")).click();
        } catch (Exception e) {
            System.out.println("Error is here");
        }
        String signInPage = driver.findElement(By.xpath("//div[@id='headingSubtext']")).getText();
        Assert.assertEquals("to continue to Gmail", signInPage);


    }

    public void clickOnButton(String button) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement buttonContent=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//button//span[text()='" + button + "']"))) ;
            buttonContent.click();
        } catch (Exception e) {
            System.out.println("Error is here");
        }


    }

    public void enterEmailId(String emailId) {
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(emailId);

    }

    public void enterPassword(String password) {

        driver.findElement(By.xpath("//div[@id='password']//input")).sendKeys(password);
    }

    public void searchForEmail(String contentToSearch) {
        driver.findElement(By.xpath("//input[@aria-label='Search mail']")).sendKeys(contentToSearch);
        driver.findElement(By.xpath("//input[@aria-label='Search mail']")).click();
    }

    public void selectTheEmail() {
        driver.findElement(By.xpath("//table//tbody[@role='listbox']/tr[@role='option']/td/div[contains(@aria-label,'Test Gmail')]")).click();
    }

    public void verifyEmail() {
        String emailHead = driver.findElement(By.xpath("//div[@class='ha']/h2")).getText();
        Assert.assertEquals("Test Gmail", emailHead,"Not matching with the expected email header");
    }

    public void readAndPrint() {
        String content = driver.findElement(By.xpath("//div/div[@dir]")).getText();
        System.out.println(content);
    }

}
