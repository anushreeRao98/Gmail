package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import pageObjects.LaunchBrowser;

public class Hooks {
    public WebDriver driver;
    LaunchBrowser lb=new LaunchBrowser();
    public Hooks(){
        this.driver=LaunchBrowser.driver;
    }
    @Before
    public void setUp(){
        lb.launchApplication();
        System.out.println("Browser launched with Gmail application");
    }

    @After
    public void tearDown(){
        lb.teardownScript();
        System.out.println("Application closed");
    }

}
